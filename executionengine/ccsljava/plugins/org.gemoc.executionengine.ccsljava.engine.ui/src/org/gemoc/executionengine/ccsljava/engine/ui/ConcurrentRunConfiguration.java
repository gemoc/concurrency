package org.gemoc.executionengine.ccsljava.engine.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.gemoc.execution.engine.ui.commons.RunConfiguration;
import org.gemoc.executionengine.ccsljava.api.core.IConcurrentRunConfiguration;

public class ConcurrentRunConfiguration extends RunConfiguration implements IConcurrentRunConfiguration{


	public static final String LAUNCH_SELECTED_DECIDER = "GEMOC_LAUNCH_SELECTED_DECIDER";
	public static final String DECIDER_SOLVER = "Solver decider";
	public static final String DECIDER_ASKUSER_STEP_BY_STEP = "Step by step user decider";
	
	public ConcurrentRunConfiguration(ILaunchConfiguration launchConfiguration)
			throws CoreException {
		super(launchConfiguration);
		// TODO Auto-generated constructor stub
	}
	
	protected void extractInformation() throws CoreException {
		super.extractInformation();
		
		_deciderName = getAttribute(LAUNCH_SELECTED_DECIDER, "");

	}
	
	protected String _deciderName;

	@Override
	public String getDeciderName() {
		return _deciderName;
	}

}
