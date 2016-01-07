package org.gemoc.execution.concurrent.ccsljavaengine.dse;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionContext;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;

public abstract class OperationExecution 
{

	private MSEOccurrence _mseOccurrence;
	private IConcurrentExecutionEngine _engine;
	private Object _result;
	
	protected OperationExecution(MSEOccurrence mseOccurrence, IConcurrentExecutionEngine engine)
	{
		_mseOccurrence = mseOccurrence;
		_engine = engine;
	}
	
	abstract public void run();
	
	protected IConcurrentExecutionContext getExecutionContext() 
	{
		return _engine.getConcurrentExecutionContext();
	}
	
	protected IConcurrentExecutionEngine getEngine()
	{
		return _engine;
	}
	
	protected MSEOccurrence getMSEOccurrence()
	{
		return _mseOccurrence;
	}

	protected void setResult(Object result)
	{
		_result = result;
	}
	
	protected Object getResult()
	{
		return _result;
	}
}