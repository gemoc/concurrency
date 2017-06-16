package org.gemoc.execution.concurrent.ccsljavaengine.ui.debug.sirius.action;

import org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;
import org.eclipse.gemoc.executionframework.debugger.ui.breakpoints.GemocToggleBreakpointAction;

/**
 * commons class for all Gemoc based models
 * @author dvojtise
 *
 */
public class GemocConcurrentToggleBreakpointAction extends GemocToggleBreakpointAction {

	@Override
	protected String getModelIdentifier() {
		//return org.eclipse.gemoc.executionframework.engine.ui.launcher.AbstractGemocLauncher.MODEL_ID;
		return Activator.PLUGIN_ID+".debugModel";
	}

	
	
}
