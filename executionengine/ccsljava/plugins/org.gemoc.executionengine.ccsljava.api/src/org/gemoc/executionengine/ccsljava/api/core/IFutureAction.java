package org.gemoc.executionengine.ccsljava.api.core;

import fr.inria.aoste.timesquare.ecl.feedback.feedback.ModelSpecificEvent;

public interface IFutureAction {

	ModelSpecificEvent getTriggeringMSE();

	void perform();

}
