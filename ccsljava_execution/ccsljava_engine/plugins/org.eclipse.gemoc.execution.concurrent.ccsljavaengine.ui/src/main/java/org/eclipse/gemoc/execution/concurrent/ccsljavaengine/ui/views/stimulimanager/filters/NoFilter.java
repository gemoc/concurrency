package org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.views.stimulimanager.filters;

import java.util.Collection;

import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.views.stimulimanager.ModelSpecificEventWrapper;

public class NoFilter extends Filter {

	@Override
	public Collection<ModelSpecificEventWrapper> applyFilter() {
		addFutureTickingClocks();
		return wrapperList;
	}
}
