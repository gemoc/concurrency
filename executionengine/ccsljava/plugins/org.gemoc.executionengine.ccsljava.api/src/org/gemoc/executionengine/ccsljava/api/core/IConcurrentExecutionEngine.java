package org.gemoc.executionengine.ccsljava.api.core;

import java.util.List;

import org.gemoc.execution.engine.mse.engine_mse.LogicalStep;
import org.gemoc.executionengine.ccsljava.api.dsa.executors.ICodeExecutor;
import org.gemoc.executionengine.ccsljava.api.moc.ISolver;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionEngine;

public interface IConcurrentExecutionEngine extends IExecutionEngine{

	IConcurrentExecutionContext getConcurrentExecutionContext();
	
	void computePossibleLogicalSteps();
	
	void updatePossibleLogicalSteps();
	
	void recomputePossibleLogicalSteps();

	List<LogicalStep> getPossibleLogicalSteps();
	
	LogicalStep getSelectedLogicalStep();
		
	void addFutureAction(IFutureAction action);

	ILogicalStepDecider getLogicalStepDecider();

	void changeLogicalStepDecider(ILogicalStepDecider newDecider);

	ISolver getSolver();

	void setSolver(ISolver solver);

	ICodeExecutor getCodeExecutor();
	
	void executeSelectedLogicalStep();
	
	void notifyLogicalStepSelected();

	void notifyAboutToSelectLogicalStep();

	void setSelectedLogicalStep(LogicalStep selectedLogicalStep);
	
	void notifyProposedLogicalStepsChanged();
	
	void performExecutionStep() throws InterruptedException;
}
