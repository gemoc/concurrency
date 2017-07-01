import 'http://fr.inria.aoste.gemoc.example.tfsm'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport "platform:/resource/fr.inria.aoste.gemoc.example.tfsm.eclmoc/MocAndApplication/TFSMMoC.ccslLib"


package tfsm
	
	context FSMEvent
		def: occurs : Event = self
	
	context FSMClock
		def: ticks : Event = self
		 
	context Transition
		def: fire : Event = self.fire()
	
	context State
		def : entering : Event(self.onEnter()) = StartEvent
		def : leaving : Event(self.onLeave()) = StartEvent
	
	context TFSM
		def: start : Event(self) = StartEvent
		def: stall : Event = GenericEvent
	context FSMEvent
		inv occursWhenSolicitate:
			(self.sollicitingTransitions->size() >0) implies  
			let AllTriggeringOccurrences : Event = Expression Union(self.sollicitingTransitions.fire) in
			Relation Coincides(AllTriggeringOccurrences, self.occurs)
	
	
	context Transition
	
		
		inv fireWhenEventOccursOneTransition:
			(self.ownedGuard.oclIsKindOf(EventGuard) and self.source.outgoingTransition->select(t|t <> self)->size() = 0) implies
			let eventOccursAfterOrWhileStateEntering :Event = Expression SampledOn(self.source.entering,self.ownedGuard.oclAsType(EventGuard).triggeringEvent.occurs) in
			Relation Coincides(eventOccursAfterOrWhileStateEntering, self.fire) 
		
		inv fireWhenEventOccursVariousTransition:
			(self.ownedGuard.oclIsKindOf(EventGuard) and self.source.outgoingTransition->select(t|t <> self)->size() > 0) implies
			let otherFireFromTheSameState2: Event = Expression Union (self.source.outgoingTransition->select(t|t <> self).fire) in
		 	Relation EventTransition(self.source.entering,
		 							self.ownedGuard.oclAsType(EventGuard).triggeringEvent.occurs,
		 							otherFireFromTheSameState2,
		 							self.fire
		 	) 
		
		inv fireWhenTemporalGuardHoldsVariousTransition:
			(self.ownedGuard.oclIsKindOf(TemporalGuard) and self.source.outgoingTransition->select(t|t <> self)->size() > 0) implies
			let guardDelay : Integer = self.ownedGuard.oclAsType(TemporalGuard).afterDuration in
			let otherFireFromTheSameState: Event = Expression Union (self.source.outgoingTransition->select(t|t <> self).fire) in
			Relation TemporalTransition(self.source.entering,
									   self.ownedGuard.oclAsType(TemporalGuard).onClock.ticks,
									   otherFireFromTheSameState,
									   guardDelay,
									   self.fire
			) 
		

		
		inv fireWhenTemporalGuardHoldsOneTransition:
			(self.ownedGuard.oclIsKindOf(TemporalGuard) and self.source.outgoingTransition->select(t|t <> self)->size() = 0) implies
			let delay : Integer = self.ownedGuard.oclAsType(TemporalGuard).afterDuration in
			let delayIsExpired_wrt_StateEntering :Event = Expression DelayFor(
															self.source.entering,
															self.ownedGuard.oclAsType(TemporalGuard).onClock.ticks,
															delay
			) in
			Relation Coincides(delayIsExpired_wrt_StateEntering, self.fire) 
		
		
	context State
		inv enterOnceBeforeToLeave:
			Relation Alternates(self.entering, self.leaving) 
		
		inv firingATransitionAlternatesWithLeavingState:
			let allFiredoutgoingTransition : Event = Expression Union(self.outgoingTransition.fire) in
			Relation Coincides(allFiredoutgoingTransition, self.leaving)
		
		inv stateEntering:
			(not (self = self.owningFSM.initialState)) implies
			let allInputTransition : Event = Expression Union(self.incomingTransition.fire) in
--			let allSourceState : Event = Expression Union(self.incomingTransition.source.leaving) in
--			let theEntryInTheState : Event = Expression NonStrictSampledOn(allSourceState, allInputTransition) in
			Relation Causes(allInputTransition,self.entering)
		
		
	context TFSM
		inv oneStateAtATime:
			Relation Exclusion(self.ownedState.entering)
			
		inv oneTransitionAtATime:
			Relation Exclusion(self.ownedState.outgoingTransition.fire)
			
		inv firstIsInitialState:
			Relation Coincides(self.start, self.initialState.entering)
			
		inv firstOnlyOnce:
			let onlyOneFirst : Event = Expression OneTickAndNoMore(self.start) in
			Relation Coincides(self.start,onlyOneFirst)
			
			
endpackage