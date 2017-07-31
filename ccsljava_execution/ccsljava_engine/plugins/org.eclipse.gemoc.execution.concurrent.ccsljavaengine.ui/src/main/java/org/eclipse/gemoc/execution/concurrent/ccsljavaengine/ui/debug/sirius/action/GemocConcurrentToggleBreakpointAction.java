/*******************************************************************************
 * Copyright (c) 2017 INRIA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     INRIA - initial API and implementation
 *     I3S Laboratory - API update and bug fix
 *******************************************************************************/
package org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.debug.sirius.action;

import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;
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
