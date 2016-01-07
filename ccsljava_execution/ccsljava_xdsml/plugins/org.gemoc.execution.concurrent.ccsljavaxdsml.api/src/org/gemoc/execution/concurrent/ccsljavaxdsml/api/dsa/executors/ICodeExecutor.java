package org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors;

import java.util.List;

import org.gemoc.executionframework.engine.mse.MSEOccurrence;


/**
 * A CodeExecutor is an entity responsible for being able to invoke a method on
 * an object and parameters, based on the method's name. It must have knowledge
 * about how the code is compiled into Java Bytecode, and if any particular
 * strategy must be used to locate the correct method.
 * 
 */
public interface ICodeExecutor 
{
	
	Object execute(MSEOccurrence mseOccurrence) throws CodeExecutionException;
	Object execute(Object caller, String methodName, List<Object> parameters) throws CodeExecutionException;
	
	String getExcutorID();

}
