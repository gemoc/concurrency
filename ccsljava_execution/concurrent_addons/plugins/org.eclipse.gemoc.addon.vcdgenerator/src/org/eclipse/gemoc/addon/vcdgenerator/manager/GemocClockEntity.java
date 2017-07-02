package org.eclipse.gemoc.addon.vcdgenerator.manager;

import fr.inria.aoste.timesquare.backend.manager.visible.ClockEntity;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ConcreteEntity;
import fr.inria.aoste.trace.ModelElementReference;

public class GemocClockEntity extends ClockEntity {

	public ConcreteEntity _ce;
	public ModelElementReference _mer;
	
	public GemocClockEntity(ModelElementReference clock) {
		super(clock);
		_mer = clock;
		int size = clock.getElementRef().size();
		_ce = (ConcreteEntity) clock.getElementRef().get(size -1);
		
	}

}
