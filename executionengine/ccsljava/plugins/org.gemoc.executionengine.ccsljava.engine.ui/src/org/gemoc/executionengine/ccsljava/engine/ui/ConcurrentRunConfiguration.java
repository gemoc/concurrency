package org.gemoc.executionengine.ccsljava.engine.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.gemoc.execution.engine.ui.commons.RunConfiguration;

public class ConcurrentRunConfiguration extends RunConfiguration{


	public static final String DECIDER_SOLVER = "Solver decider";
	public static final String DECIDER_ASKUSER_STEP_BY_STEP = "Step by step user decider";
	
	public ConcurrentRunConfiguration(ILaunchConfiguration launchConfiguration)
			throws CoreException {
		super(launchConfiguration);
		// TODO Auto-generated constructor stub
	}

}
