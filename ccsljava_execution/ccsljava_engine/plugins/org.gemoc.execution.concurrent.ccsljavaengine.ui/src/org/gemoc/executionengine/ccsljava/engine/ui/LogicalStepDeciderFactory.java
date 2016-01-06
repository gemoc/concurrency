package org.gemoc.executionengine.ccsljava.engine.ui;

import org.eclipse.core.runtime.CoreException;
import org.gemoc.executionengine.ccsljava.api.core.ILogicalStepDecider;
import org.gemoc.executionengine.ccsljava.api.extensions.deciders.DeciderSpecificationExtension;
import org.gemoc.executionengine.ccsljava.api.extensions.deciders.DeciderSpecificationExtensionPoint;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;

public class LogicalStepDeciderFactory {

	public static ILogicalStepDecider createDecider(String deciderKind, ExecutionMode executionMode) throws CoreException 
	{
		ILogicalStepDecider decider = null;
		if (executionMode.equals(ExecutionMode.Run))
		{
			DeciderSpecificationExtension extension = DeciderSpecificationExtensionPoint.findDefinition(ConcurrentRunConfiguration.DECIDER_SOLVER);
			decider = extension.instanciateDecider();
		}
		else 
		{
			DeciderSpecificationExtension extension = DeciderSpecificationExtensionPoint.findDefinition(deciderKind);
			decider = extension.instanciateDecider();
		}		
		return decider;
	}
	
}
