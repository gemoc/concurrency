package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent;

public interface IFutureAction {

	ModelSpecificEvent getTriggeringMSE();

	void perform();

}
