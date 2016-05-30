package org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.execution.engine.mse.engine.mse.helper.StepHelper;
import org.gemoc.executionframework.engine.mse.MSE;
import org.gemoc.executionframework.engine.mse.Step;

import fr.obeo.dsl.debug.ide.DSLSourceLocator;
import fr.obeo.dsl.debug.ide.adapter.DSLStackFrameAdapter;

public class GemocSourceLocator extends DSLSourceLocator {

	@Override
	public Object getSourceElement(IStackFrame stackFrame) {
		final Object res;
		if (stackFrame instanceof DSLStackFrameAdapter) {
			final DSLStackFrameAdapter eStackFrame = (DSLStackFrameAdapter) stackFrame;
			final EObject instruction = eStackFrame.getCurrentInstruction();
			if (instruction instanceof Step) {
				res = getFirstTarget((Step) instruction);
			} else if (instruction != null) {
				res = instruction;
			} else {
				res = eStackFrame.getContext();
			}
		} else {
			res = null;
		}
		return res;
	}

	private EObject getFirstTarget(Step step) {
		EObject res = null;

		for (MSE event : StepHelper.collectAllMSEs(step)) 
		{
			res = event;
			break;
		}

		return res;
	}

}
