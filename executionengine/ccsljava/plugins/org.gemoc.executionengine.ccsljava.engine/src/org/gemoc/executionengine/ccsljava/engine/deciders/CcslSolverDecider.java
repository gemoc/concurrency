package org.gemoc.executionengine.ccsljava.engine.deciders;

import java.util.List;

import org.gemoc.execution.engine.mse.engine_mse.LogicalStep;
import org.gemoc.executionengine.ccsljava.api.core.ILogicalStepDecider;
import org.gemoc.executionengine.ccsljava.api.core.IConcurrentExecutionEngine;

/**
 * Decider that will delegate its choice to the solver
 *
 */
public class CcslSolverDecider implements ILogicalStepDecider {

	@Override
	public LogicalStep decide(IConcurrentExecutionEngine engine, List<LogicalStep> possibleLogicalSteps) {
		return engine.getSolver().proposeLogicalStep();
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	public void preempt() {
		// no
	}
}
