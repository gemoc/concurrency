package org.gemoc.execution.concurrent.ccsljavaengine.deciders;

import java.util.List;
import java.util.Random;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.execution.engine.mse.engine_mse.LogicalStep;

/**
 * Decider that will choose randomly
 * 
 */
public class RandomDecider implements ILogicalStepDecider {

	private Random rand = new Random();

	public RandomDecider() {
		super();
	}

	@Override
	public LogicalStep decide(IConcurrentExecutionEngine engine, List<LogicalStep> possibleLogicalSteps) {
		int index = -1;
		if (possibleLogicalSteps.size() < 2)
		{
			index = 0;
		}
		else
		{
			index = rand.nextInt(possibleLogicalSteps.size());
		}
		return possibleLogicalSteps.get(index);
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	public void preempt() {
		// not possible
	}

}
