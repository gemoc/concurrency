package org.gemoc.executionengine.ccsljava.engine.dse;

import org.gemoc.execution.engine.trace.gemoc_execution_trace.MSEOccurrence;
import org.gemoc.executionengine.ccsljava.api.core.IConcurrentExecutionContext;
import org.gemoc.executionengine.ccsljava.api.core.IConcurrentExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionContext;

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
