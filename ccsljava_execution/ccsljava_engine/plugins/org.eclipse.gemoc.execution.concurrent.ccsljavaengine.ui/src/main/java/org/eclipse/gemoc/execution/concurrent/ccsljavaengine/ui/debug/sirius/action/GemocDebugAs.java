package org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.debug.sirius.action;

import org.eclipse.gemoc.dsl.debug.ide.sirius.ui.action.AbstractDebugAsAction;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.Launcher;

public class GemocDebugAs extends AbstractDebugAsAction {

	@Override
	protected String getLaunchConfigurationTypeID() {
		return Launcher.TYPE_ID;
	}
	
}
