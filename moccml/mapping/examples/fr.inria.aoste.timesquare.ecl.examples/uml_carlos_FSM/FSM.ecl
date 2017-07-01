import 'http://www.eclipse.org/uml2/5.0.0/UML'
--import _'http://org.gemoc.mocc.fsmmodel/1.0'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
  
package UML
  
	context Transition  
		def if (self.guard <> null) : fireIt : Event  = self.getLabel() future ( self.fireIt )
 						 						--case self.getLabel() <> null force self.target.entering on self.target.entering ;
																			
	context Vertex 
		private def : entering : Event = self
		public def if (self.name <> 'zaza') :  leaving : Event = self

		inv enterOnceBeforeToLeave:
			Relation Alternates(self.entering, self.leaving)
		 
		inv stateEntering:
			(not (self.oclIsKindOf(Pseudostate))) implies
			let allInputTransition : Event =  Expression Union(self.container.transition->select(t | (t).target = self).fireIt) in
			let allSourceState : Event = Expression Union(self.container.transition->select(t | (t).target = self).source.leaving) in
			let theEntryInTheState : Event = Expression SampledOn(allSourceState, allInputTransition) in
			Relation Coincides (self.entering, theEntryInTheState)
		
		inv stateLeaving:
			( not (self.oclIsKindOf(Pseudostate))) implies
			let allOutputTransition : Event = Expression Union(self.container.transition->select(t | (t).source = self).fireIt) in
			Relation Alternates (self.leaving, allOutputTransition)
			--should be coincides but then a NonStrictSampledOn is needed
	
	context Region
		inv oneStateAtATime:
			(Relation Exclusion(self.subvertex.entering))
			
		inv oneTransitionAtATime:
			(Relation Exclusion(self.transition.fireIt))
		

	--just to see more easily the causalities		
		context Pseudostate
		inv runOnlyOnce:
			let firstStart : Event = Expression OneTickAndDie(self.entering) in
			Relation Coincides(self.entering, firstStart)
			
		inv InitialstateLeaving:
			Relation Alternates (self.leaving, self.container.transition->select(t | (t).source = self)->asSequence()->first().fireIt)
	
endpackage