package org.gemoc.execution.concurrent.ccsljavaxdsml.api.core;

import java.util.List;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.moc.ISolver;
import org.gemoc.executionframework.engine.mse.Step;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;

public interface IConcurrentExecutionEngine extends IExecutionEngine{

	IConcurrentExecutionContext getConcurrentExecutionContext();
	
	void computePossibleLogicalSteps();
	
	void updatePossibleLogicalSteps();
	
	void recomputePossibleLogicalSteps();

	List<Step> getPossibleLogicalSteps();
	
	Step getSelectedLogicalStep();
	
	void addFutureAction(IFutureAction action);

	ILogicalStepDecider getLogicalStepDecider();

	void changeLogicalStepDecider(ILogicalStepDecider newDecider);

	ISolver getSolver();

	void setSolver(ISolver solver);

	ICodeExecutor getCodeExecutor();
	
	void executeSelectedLogicalStep();
	
	void notifyLogicalStepSelected();

	void notifyAboutToSelectLogicalStep();

	void setSelectedLogicalStep(Step selectedLogicalStep);
	
	void notifyProposedLogicalStepsChanged();
	
	void performExecutionStep() throws InterruptedException;
}
