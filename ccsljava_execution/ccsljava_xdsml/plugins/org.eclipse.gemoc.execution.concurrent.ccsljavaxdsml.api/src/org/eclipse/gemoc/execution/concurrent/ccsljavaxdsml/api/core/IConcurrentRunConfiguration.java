package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core;

import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration;

public interface IConcurrentRunConfiguration extends IRunConfiguration{

	

	String getDeciderName();
	String getExecutionModelPath();
	
}
