package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core;

import java.util.Collection;

import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.dse.IMSEStateController;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionPlatform;

public interface IConcurrentExecutionPlatform extends IExecutionPlatform
{

	/**
	 * @return The code executor to use for the model execution.
	 */
	ICodeExecutor getCodeExecutor();
	
	/**
	 * return this if this is an IConcurrentExecutionPlatform, null otherwise 
	 * @return
	 */
	IConcurrentExecutionPlatform asConcurrentExecutionPlatform();
	
	Collection<IMSEStateController> getMSEStateControllers();

}