package org.gemoc.execution.concurrent.ccsljavaengine.ui.debug;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.gemoc.executionframework.engine.core.AbstractExecutionEngine;
import org.gemoc.executionframework.engine.core.EngineStoppedException;
import org.gemoc.executionframework.engine.ui.debug.AbstractGemocDebugger;
import org.gemoc.executionframework.engine.ui.debug.breakpoint.GemocBreakpoint;
import org.gemoc.executionframework.ui.utils.ViewUtils;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

import fr.inria.diverse.trace.commons.model.helper.StepHelper;
import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.MSE;
import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.obeo.dsl.debug.ide.event.IDSLDebugEventProcessor;

public class GemocModelDebugger extends AbstractGemocDebugger implements IEngineAddon {

	/**
	 * A fake instruction to prevent the stepping return to stop on each event.
	 */
	private static final EObject FAKE_INSTRUCTION = EcorePackage.eINSTANCE;

	/**
	 * Tells if the logical Step<?> level stack frame is created.
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
		} else {
			if (instruction instanceof BigStep<?, ?>) {
				boolean hasActionMSE = false;
				for (Object o : ((BigStep<?, ?>) instruction).getSubSteps()) {
					Step<?> s = (Step<?>) o;
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

	private Map<MSEOccurrence, Step<?>> occ2step = new HashMap<>();

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
			MSEOccurrence m = ((SmallStep<?>) instruction).getMseoccurrence();
			occ2step.computeIfAbsent(m, o -> (SmallStep<?>) instruction);
			pushStackFrame(threadName, StepHelper.getStepName((Step<?>) instruction), instruction, instruction);
			logicalStepFrameCreated = true;
			return;
		}
		if (instruction instanceof BigStep) {
			List<MSEOccurrence> allMSEOccs = StepHelper.collectAllMSEOccurrences((Step<?>) instruction);

			allMSEOccs.forEach(m -> occ2step.computeIfAbsent(m, o -> (BigStep<?, ?>) instruction));
			pushStackFrame(threadName, StepHelper.getStepName((Step<?>) instruction), instruction, instruction);
			logicalStepFrameCreated = true;
			return;
		}
		if (instruction instanceof MSEOccurrence) {
			final MSEOccurrence mseOcc = (MSEOccurrence) instruction;
			final Step<?> logicalStep = occ2step.get(mseOcc);
			pushStackFrame(threadName, mseOcc.getMse().getName(), logicalStep, logicalStep);
			logicalStepFrameCreated = true;
			EObject caller = instruction;
			if (mseOcc.getMse() != null && mseOcc.getMse().getCaller() != null)
				caller = mseOcc.getMse().getCaller();
			pushStackFrame(threadName, mseOccurrenceText(mseOcc), caller, instruction);
			mseFrameCreated = true;
		}
	}

	private String mseOccurrenceText(MSEOccurrence mseOcc) {
		MSE mse = mseOcc.getMse();
		if (mse != null)
			return mse.getName() + "   " + ViewUtils.eventToString(mse);
		else
			return mseOcc.toString();
	}

	@Override
	public boolean shouldBreak(EObject instruction) {
		if (instruction instanceof Step) {
			boolean res = breakNextLogicalStep || shouldBreakLogicalStep((Step<?>) instruction);
			breakNextLogicalStep = false;
			return res;
		} 
		return false;
	}

	private boolean shouldBreakLogicalStep(Step<?> logicalStep) {

		if (logicalStep.getMseoccurrence() != null) {
			return shouldBreakMSEOccurence(logicalStep.getMseoccurrence());
		}

		final boolean res;

		if ((super.shouldBreak(logicalStep) && Boolean
				.valueOf((String) getBreakpointAttributes(logicalStep, GemocBreakpoint.BREAK_ON_LOGICAL_STEP)))) {
			res = true;
		} else {
			boolean hasMSEBreak = false;
			for (MSEOccurrence mseOccurrence : StepHelper.collectAllMSEOccurrences(logicalStep)) {
				hasMSEBreak = (super.shouldBreak(mseOccurrence.getMse())
						&& Boolean.valueOf((String) getBreakpointAttributes(mseOccurrence.getMse(),
								GemocBreakpoint.BREAK_ON_LOGICAL_STEP)));
				hasMSEBreak = hasMSEBreak || (mseOccurrence.getMse().getCaller() != null
						&& super.shouldBreak(mseOccurrence.getMse().getCaller())
						&& Boolean.valueOf((String) getBreakpointAttributes(mseOccurrence.getMse().getCaller(),
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
		if (shouldBreakPredicates(engine, mseOccurrence)) {
			res = true;
		} else {
			boolean shouldBreakMSE = super.shouldBreak(mseOccurrence.getMse());
			boolean breakpointAttMSE = Boolean.valueOf(
					(String) getBreakpointAttributes(mseOccurrence.getMse(), GemocBreakpoint.BREAK_ON_MSE_OCCURRENCE));
			EObject caller = mseOccurrence.getMse().getCaller();
			boolean shouldBreakCaller = super.shouldBreak(mseOccurrence.getMse().getCaller());
			boolean breakpointAttCaller = Boolean
					.valueOf((String) getBreakpointAttributes(mseOccurrence.getMse().getCaller(),
							GemocBreakpoint.BREAK_ON_MSE_OCCURRENCE));
			if ((shouldBreakMSE && breakpointAttMSE) || (caller != null && shouldBreakCaller && breakpointAttCaller)) {
				res = true;
			} else {
				Step<?> locicalStep = occ2step.get(mseOccurrence);
				boolean shouldBreakStep = super.shouldBreak(locicalStep);
				boolean breakpointAttStep = Boolean.valueOf(
						(String) getBreakpointAttributes(locicalStep, GemocBreakpoint.BREAK_ON_MSE_OCCURRENCE));
				res = shouldBreakStep && breakpointAttStep;
			}
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
		spawnRunningThread(Thread.currentThread().getName(),
				engine.getExecutionContext().getResourceModel().getContents().get(0));
	}

	@Override
	public void engineStopped(IExecutionEngine engine) {
		if (!isTerminated(Thread.currentThread().getName())) {
			terminated(Thread.currentThread().getName());
		}
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine engine, Step<?> stepToExecute) {
		if (stepToExecute.getMseoccurrence() != null) {
			occ2step.put(stepToExecute.getMseoccurrence(), stepToExecute);
		}
		if (!control(((AbstractExecutionEngine) engine).thread.getName(), stepToExecute)) {
			throw new EngineStoppedException("Debug thread has stopped.");
		}
	}

	@Override
	public void terminate() {
		super.terminate();
		engine.stop();
	}

	@Override
	public void stepExecuted(IExecutionEngine engine, Step<?> stepExecuted) {
		// TODO Auto-generated method stub
	}

}
