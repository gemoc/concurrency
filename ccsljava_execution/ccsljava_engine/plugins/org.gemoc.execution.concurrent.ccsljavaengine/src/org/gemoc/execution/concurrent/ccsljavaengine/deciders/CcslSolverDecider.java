package org.gemoc.execution.concurrent.ccsljavaengine.deciders;

import java.util.List;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.executionframework.engine.mse.Step;

/**
 * Decider that will delegate its choice to the solver
 *
 */
public class CcslSolverDecider implements ILogicalStepDecider {

	@Override
	public Step decide(IConcurrentExecutionEngine engine, List<Step> possibleLogicalSteps) {
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
