package org.gemoc.gemoc_language_workbench.api.core;

import java.util.List;

import fr.inria.aoste.trace.LogicalStep;

/**
 * allows to choose a LogicalStep among possible ones  
 * @author dvojtise
 *
 */
public interface LogicalStepDecider {
	/**
	 * 
	 * @param possibleLogicalSteps
	 * @return
	 */
	public int decide(List<LogicalStep> possibleLogicalSteps);
}
