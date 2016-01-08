package org.gemoc.execution.concurrent.ccsljavaengine.ui.debug;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.gemoc.execution.engine.core.AbstractExecutionEngine;
import org.gemoc.execution.engine.core.EngineStoppedException;
import org.gemoc.execution.engine.debug.AbstractGemocDebugger;
import org.gemoc.execution.engine.debug.AnnotationMutableFieldExtractor;
import org.gemoc.execution.engine.debug.IMutableFieldExtractor;
import org.gemoc.execution.engine.debug.ui.breakpoint.GemocBreakpoint;
import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.mse.helper.LogicalStepHelper;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

import fr.obeo.dsl.debug.ide.event.IDSLDebugEventProcessor;

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

	public GemocModelDebugger(IDSLDebugEventProcessor target, IBasicExecutionEngine engine) {
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

		if (instruction instanceof LogicalStep) {
			boolean hasActionMSE = false;
			for (MSEOccurrence mseOccurence : ((LogicalStep) instruction).getMseOccurrences()) {
				if (mseOccurence.getMse().getAction() != null) {
					hasActionMSE = true;
					break;
				}
			}
			res = hasActionMSE;
		} else {
			res = false;
		}

		return res;
	}

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
		if (instruction instanceof LogicalStep) {
			pushStackFrame(threadName, LogicalStepHelper.getLogicalStepName((LogicalStep) instruction), instruction,
					instruction);
			logicalStepFrameCreated = true;
		} else if (instruction instanceof MSEOccurrence) {
			final LogicalStep logicalStep = ((MSEOccurrence) instruction).getLogicalStep();
			pushStackFrame(threadName, LogicalStepHelper.getLogicalStepName(logicalStep), logicalStep, logicalStep);
			logicalStepFrameCreated = true;
			pushStackFrame(threadName, instruction.toString(), instruction, instruction);
			mseFrameCreated = true;
		}
	}

	@Override
	public boolean shouldBreak(EObject instruction) {
		boolean res = false;

		if (instruction instanceof LogicalStep) {
			res = breakNextLogicalStep || shouldBreakLogicalStep((LogicalStep) instruction);
			breakNextLogicalStep = false;
		} else if (instruction instanceof MSEOccurrence) {
			res = shouldBreakMSEOccurence((MSEOccurrence) instruction);
		}

		return res;
	}

	private boolean shouldBreakLogicalStep(LogicalStep logicalStep) {

		final boolean res;

		if ((super.shouldBreak(logicalStep) && Boolean.valueOf((String) getBreakpointAttributes(logicalStep,
				GemocBreakpoint.BREAK_ON_LOGICAL_STEP)))) {
			res = true;
		} else {
			boolean hasMSEBreak = false;
			for (MSEOccurrence mseOccurrence : logicalStep.getMseOccurrences()) {
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
			LogicalStep locicalStep = mseOccurrence.getLogicalStep();
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
		} else if (stepping == Stepping.STEP_OVER && currentInstruction instanceof LogicalStep) {
			res = FAKE_INSTRUCTION;
			breakNextLogicalStep = true;
		} else {
			res = super.getNextInstruction(threadName, currentInstruction, stepping);
		}
		return res;
	}

	@Override
	public void engineStarted(IBasicExecutionEngine executionEngine) {
		spawnRunningThread(Thread.currentThread().getName(), engine.getExecutionContext().getResourceModel()
				.getContents().get(0));
	}

	@Override
	public void engineStopped(IBasicExecutionEngine engine) {
		if (!isTerminated(Thread.currentThread().getName())) {
			terminated(Thread.currentThread().getName());
		}
	}

	@Override
	public void aboutToExecuteLogicalStep(IBasicExecutionEngine executionEngine, LogicalStep logicalStepToApply) {
		if (!control(((AbstractExecutionEngine) executionEngine).thread.getName(), logicalStepToApply)) {
			throw new EngineStoppedException("Debug thread has stopped.");
		}
	}

	@Override
	public void aboutToExecuteMSEOccurrence(IBasicExecutionEngine executionEngine, MSEOccurrence mseOccurrence) {
		if (!control(((AbstractExecutionEngine) executionEngine).thread.getName(), mseOccurrence)) {
			throw new EngineStoppedException("Debug thread has stopped.");
		}
	}

	@Override
	public void terminate() {
		super.terminate();
		engine.stop();
	}

	@Override
	protected List<IMutableFieldExtractor> getMutableFieldExtractors() {
		List<IMutableFieldExtractor> extractors = new ArrayList<IMutableFieldExtractor>();
		extractors.add(new AnnotationMutableFieldExtractor());
		return extractors;
	}

}
