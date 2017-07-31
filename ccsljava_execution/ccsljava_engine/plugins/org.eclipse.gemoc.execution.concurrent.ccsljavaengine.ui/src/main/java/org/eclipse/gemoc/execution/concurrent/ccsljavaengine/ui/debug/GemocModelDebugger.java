/*******************************************************************************
 * Copyright (c) 2017 INRIA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     INRIA - initial API and implementation
 *     I3S Laboratory - API update and bug fix
 *******************************************************************************/
package org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.debug;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gemoc.dsl.debug.ide.event.IDSLDebugEventProcessor;
import org.eclipse.gemoc.executionframework.debugger.AbstractGemocDebugger;
import org.eclipse.gemoc.executionframework.debugger.GemocBreakpoint;
import org.eclipse.gemoc.executionframework.engine.core.AbstractExecutionEngine;
import org.eclipse.gemoc.executionframework.engine.core.EngineStoppedException;
import org.eclipse.gemoc.executionframework.ui.utils.ViewUtils;
import org.eclipse.gemoc.trace.commons.model.helper.StepHelper;
import org.eclipse.gemoc.trace.commons.model.trace.BigStep;
import org.eclipse.gemoc.trace.commons.model.trace.MSE;
import org.eclipse.gemoc.trace.commons.model.trace.MSEOccurrence;
import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

public class GemocModelDebugger extends AbstractGemocDebugger implements IEngineAddon {

	/**
	 * A fake instruction to prevent the stepping return to stop on each event.
	 */
	private static final EObject FAKE_INSTRUCTION = EcorePackage.eINSTANCE;

	/**
	 * Tells if the logical step level stack frame is created.
	 */
	private boolean logicalStepFrameCreated;

	/**
	 * Tells if the event level stack frame is created.
	 */
	private boolean mseFrameCreated;

	/**
	 * Tells if we should break at the next {@link LogicalStep}.
	 */
	private boolean breakNextLogicalStep;

	public GemocModelDebugger(IDSLDebugEventProcessor target, IExecutionEngine engine) {
		super(target, engine);
	}

	@Override
	public void start() {
		engine.start();
	}

	@Override
	public void disconnect() {
		return;
	}

	@Override
	public boolean canStepInto(String threadName, EObject instruction) {
		final boolean res;

		if (instruction instanceof SmallStep) {
			return false;
		}else{
			if (instruction instanceof BigStep<?,?>) {
			  boolean hasActionMSE = false;
				for (Object o : ((BigStep<?,?>) instruction).getSubSteps()) {
					Step s = (Step) o;
					if (s.getMseoccurrence().getMse().getAction() != null) {
						hasActionMSE = true;
						break;
					}
				}
			  res = hasActionMSE;
			} else {
				res = false;
			}
		}

		return res;
	}
	
	private Map<MSEOccurrence,Step> occ2step = new HashMap<>();

	@Override
	protected void updateStack(String threadName, EObject instruction) {
		if (mseFrameCreated) {
			popStackFrame(threadName);
			mseFrameCreated = false;
		}
		if (logicalStepFrameCreated) {
			popStackFrame(threadName);
			logicalStepFrameCreated = false;
		}
		if (instruction instanceof SmallStep) {
			MSEOccurrence m = ((SmallStep)instruction).getMseoccurrence();
			occ2step.computeIfAbsent(m, o->(SmallStep)instruction);
			pushStackFrame(threadName, StepHelper.getStepName((Step) instruction), instruction, instruction);
			logicalStepFrameCreated = true;
			return;
		} 
		if (instruction instanceof BigStep) {
			@SuppressWarnings("unchecked")
			List<MSEOccurrence> allMSEOccs = StepHelper.collectAllMSEOccurrences((Step)instruction);
			
			allMSEOccs.forEach(m->occ2step.computeIfAbsent(m, o->(BigStep<?,?>)instruction));
			pushStackFrame(threadName, StepHelper.getStepName((Step) instruction), instruction, instruction);
			logicalStepFrameCreated = true;
			return;
		} 
		if (instruction instanceof MSEOccurrence) {
			final MSEOccurrence mseOcc = (MSEOccurrence) instruction;
			final Step logicalStep = occ2step.get(mseOcc);
			pushStackFrame(threadName, mseOcc.getMse().getName(), logicalStep, logicalStep);
			logicalStepFrameCreated = true;
			EObject caller = instruction;
			if(mseOcc.getMse() != null && mseOcc.getMse().getCaller() != null) caller = mseOcc.getMse().getCaller();
			pushStackFrame(threadName, mseOccurrenceText(mseOcc), caller, instruction);
			mseFrameCreated = true;
		}
	}

	private String mseOccurrenceText(MSEOccurrence mseOcc){
		MSE mse = mseOcc.getMse();
		if (mse != null)
			return mse.getName() +"   " + ViewUtils.eventToString(mse);
		else
			return mseOcc.toString();
	}
	
	@Override
	public boolean shouldBreak(EObject instruction) {
		boolean res = false;

		if (instruction instanceof Step) {
			res = breakNextLogicalStep || shouldBreakLogicalStep((Step) instruction);
			breakNextLogicalStep = false;
		} else if (instruction instanceof MSEOccurrence) {
			res = shouldBreakMSEOccurence((MSEOccurrence) instruction);
		}

		return res;
	}

	private boolean shouldBreakLogicalStep(Step logicalStep) {

		final boolean res;

		if ((super.shouldBreak(logicalStep) && Boolean.valueOf((String) getBreakpointAttributes(logicalStep,
				GemocBreakpoint.BREAK_ON_LOGICAL_STEP)))) {
			res = true;
		} else {
			boolean hasMSEBreak = false;
			for (MSEOccurrence mseOccurrence : StepHelper.collectAllMSEOccurrences(logicalStep)) {
				hasMSEBreak = (super.shouldBreak(mseOccurrence.getMse()) && Boolean
						.valueOf((String) getBreakpointAttributes(mseOccurrence.getMse(),
								GemocBreakpoint.BREAK_ON_LOGICAL_STEP)));
				hasMSEBreak = hasMSEBreak
						|| (mseOccurrence.getMse().getCaller() != null
								&& super.shouldBreak(mseOccurrence.getMse().getCaller()) && Boolean
									.valueOf((String) getBreakpointAttributes(mseOccurrence.getMse().getCaller(),
											GemocBreakpoint.BREAK_ON_LOGICAL_STEP)));
				hasMSEBreak = hasMSEBreak || shouldBreakPredicates(engine, mseOccurrence);
				if (hasMSEBreak) {
					break;
				}
			}
			res = hasMSEBreak;
		}

		return res;
	}

	private boolean shouldBreakMSEOccurence(MSEOccurrence mseOccurrence) {
		final boolean res;

		if (shouldBreakPredicates(engine, mseOccurrence))
			res = true;
		else if ((super.shouldBreak(mseOccurrence.getMse()) && Boolean.valueOf((String) getBreakpointAttributes(
				mseOccurrence.getMse(), GemocBreakpoint.BREAK_ON_MSE_OCCURRENCE)))
				|| (mseOccurrence.getMse().getCaller() != null && super.shouldBreak(mseOccurrence.getMse().getCaller()) && Boolean
						.valueOf((String) getBreakpointAttributes(mseOccurrence.getMse().getCaller(),
								GemocBreakpoint.BREAK_ON_MSE_OCCURRENCE)))) {
			res = true;
		} else {
			Step locicalStep = occ2step.get(mseOccurrence);
			res = super.shouldBreak(locicalStep)
					&& Boolean.valueOf((String) getBreakpointAttributes(locicalStep,
							GemocBreakpoint.BREAK_ON_MSE_OCCURRENCE));
		}

		return res;
	}

	@Override
	public EObject getNextInstruction(String threadName, EObject currentInstruction, Stepping stepping) {
		final EObject res;
		if (stepping == Stepping.STEP_RETURN && currentInstruction instanceof MSEOccurrence) {
			res = FAKE_INSTRUCTION;
			breakNextLogicalStep = true;
		} else if (stepping == Stepping.STEP_OVER && currentInstruction instanceof Step) {
			res = FAKE_INSTRUCTION;
			breakNextLogicalStep = true;
		} else {
			res = super.getNextInstruction(threadName, currentInstruction, stepping);
		}
		return res;
	}

	@Override
	public void engineStarted(IExecutionEngine executionEngine) {
		spawnRunningThread(Thread.currentThread().getName(), engine.getExecutionContext().getResourceModel()
				.getContents().get(0));
	}

	@Override
	public void engineStopped(IExecutionEngine engine) {
		if (!isTerminated(Thread.currentThread().getName())) {
			terminated(Thread.currentThread().getName());
		}
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine engine,Step stepToExecute) {
		if (!control(((AbstractExecutionEngine) engine).thread.getName(), stepToExecute)) {
			throw new EngineStoppedException("Debug thread has stopped.");
		}
	}

//	@Override
//	public void aboutToExecuteMSEOccurrence(IExecutionEngine executionEngine, MSEOccurrence mseOccurrence) {
//		if (!control(((AbstractExecutionEngine) executionEngine).thread.getName(), mseOccurrence)) {
//			throw new EngineStoppedException("Debug thread has stopped.");
//		}
//	}

	@Override
	public void terminate() {
		super.terminate();
		engine.stop();
	}


	@Override
	public void stepExecuted(IExecutionEngine engine, Step stepExecuted) {
		// TODO Auto-generated method stub	
	}

}
