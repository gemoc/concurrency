import '../ecore/fsm.ecore' 

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport "./FSM.ccslLib"

package fsm
	--removed state and co constraints application	
	
	context Transition 
		def: fire : Event  = self.fire() [itsRes] switch case self.itsRes = null force self.evaluateGuard on self.action; 
		def: evaluateGuard : Event = self.evaluateGuard() 
		def: action : Event = self.callEffect()
		
		inv fireIfEvaluationTrue:
			Relation TransitionRule(self.evaluateGuard, self.fire, self.action) 
		
	context State
		def : entering : Event = self
		def : leaving : Event = self
		
		inv enterOnceBeforeToLeave:
			Relation Alternates(self.entering, self.leaving) 
		
		inv stateEntering:
			(not (self = self.owningFSM.initialState)) implies
			let allInputTransition : Event = Expression Union(self.incomingTransition.fire) in
			let allSourceState : Event = Expression Union(self.incomingTransition.source.leaving) in
			let theEntryInTheState : Event = Expression SampledOn(allSourceState, allInputTransition) in
			Relation Coincides (self.entering, theEntryInTheState)
		
		inv stateLeaving:
			let allOutputTransition : Event = Expression Union(self.outgoingTransition.fire) in
			Relation Alternates (self.leaving, allOutputTransition)
			--should be coincides but then a NonStrictSampledOn is needed 
		
	context FSM
		def: start : Event = self
		
		inv oneStateAtATime:
			Relation Exclusion(self.ownedState.entering)
			
		inv oneTransitionAtATime:
			Relation Exclusion(self.ownedState.outgoingTransition.fire)
			
		inv firstIsInitialState:
			Relation Coincides(self.start, self.initialState.entering)
			
		inv FSMstartCausesOtherThings:
			let allEntering : Event = Expression Union(self.ownedState.entering) in
			Relation Causes(self.start,allEntering)
endpackage