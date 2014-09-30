package org.gemoc.gemoc_modeling_workbench.ui.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.gemoc.gemoc_modeling_workbench.ui.launcher.tabs.LaunchConfigurationConfigurationTab;
import org.gemoc.gemoc_modeling_workbench.ui.launcher.tabs.LaunchConfigurationMainTab;
import org.gemoc.gemoc_modeling_workbench.ui.launcher.tabs.LaunchConfigurationBackendsTab;
import org.gemoc.gemoc_modeling_workbench.ui.launcher.tabs.LaunchConfigurationFrontendsTab;

public class LauncherTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public LauncherTabGroup() 
	{
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { 
				new LaunchConfigurationMainTab(),
                new LaunchConfigurationConfigurationTab(),
                new LaunchConfigurationBackendsTab(),
                new LaunchConfigurationFrontendsTab(),
                new CommonTab()
		};
		setTabs(tabs);
	}

}