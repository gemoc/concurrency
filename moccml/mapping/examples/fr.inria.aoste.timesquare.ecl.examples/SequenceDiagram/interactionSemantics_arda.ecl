import 'http://www.eclipse.org/uml2/4.0.0/UML'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "./lib4RT.ccslLib"     


package uml 
	-- wsdfsdf

	
  context Interaction
      def : interactionEvent : Event(self) = GenericEvent

   
  context OccurrenceSpecification
       def : occurrence : Event(self) = GenericEvent
       inv notInCombinedFragment:
       		let lifeline : Lifeline = self.covered->asSequence()->first().oclAsType(Lifeline) in
       		let fragments : OrderedSet(uml::InteractionFragment) = lifeline.interaction.fragment in
       		let someFragments : OrderedSet(uml::InteractionFragment) = fragments->select(n|n.oclIsKindOf(InteractionFragment) and not n.oclIsKindOf(BehaviorExecutionSpecification) and n.covered->includes(self.covered->asSequence()->first().oclAsType(Lifeline))) in
       		(
       			(fragments->includes(self)) 
           and
           		(not (fragments->select(n|n.oclIsKindOf(OccurrenceSpecification) and n.covered->asSequence()->first() = self.covered->asSequence()->first().oclAsType(Lifeline))->asSequence()->last() = self))
	       and
	       		(someFragments->at(fragments->select(n|n.oclIsKindOf(InteractionFragment) and not n.oclIsKindOf(BehaviorExecutionSpecification) and n.covered->includes(lifeline))->asSequence()->indexOf(self)+1).oclIsKindOf(OccurrenceSpecification))
          ) implies 
          let i:Integer = fragments->select(n|n.oclIsKindOf(InteractionFragment) and not n.oclIsKindOf(BehaviorExecutionSpecification) and n.covered->asSequence()->first() = lifeline)->asSequence()->indexOf(self) in 
           Relation Precedes(self.occurrence,someFragments->at(i+1).oclAsType(OccurrenceSpecification).occurrence)
             
       inv inNegCombinedFragment:
       	let lifeline : uml::Lifeline = self.covered->asSequence()->first() in
       	let someFragments : OrderedSet(uml::InteractionFragment) = lifeline.interaction.fragment->
                       select(n|n.oclIsKindOf(InteractionFragment) 
                 	          and not n.oclIsKindOf(BehaviorExecutionSpecification) 
                 	          and n.covered->includes(lifeline)
                       ) in
        let someOtherFragments : OrderedSet(uml::InteractionFragment)= lifeline.coveredBy->select(cf|cf.oclIsKindOf(CombinedFragment))->
          	              select(cf|(cf.oclAsType(CombinedFragment).interactionOperator = InteractionOperatorKind::neg) 
          		                 and cf.oclAsType(CombinedFragment).operand->asSequence()->first().fragment->includes(self)
          		       )->asOrderedSet() in
         ( 
         	(lifeline.coveredBy->select(cf|cf.oclIsKindOf(CombinedFragment))->select(cf|(cf.oclAsType(CombinedFragment).interactionOperator = InteractionOperatorKind::neg) 
             							and 
             							cf.oclAsType(CombinedFragment).operand->asSequence()->first().fragment->includes(self)
             							)->size() = 1)
            and
               not (someFragments->first() = someOtherFragments->first())
		    and
		  	   not (someFragments->last() = someOtherFragments->first())
		    and
               (someFragments->at(lifeline.interaction.fragment->indexOf(someOtherFragments->first())-1).oclIsKindOf(OccurrenceSpecification))                                  
          ) implies
          (Relation Precedes(self.occurrence, self.occurrence))             



   context Message
       inv sendReceiveCause:
           Relation Causes(self._'sendEvent'.oclAsType(MessageOccurrenceSpecification).occurrence, self._'receiveEvent'.oclAsType(MessageOccurrenceSpecification).occurrence)
 
   context GeneralOrdering
       inv beforeAfterCause:
          Relation Causes(self.before.occurrence, self.after.occurrence)

    context Lifeline
       inv firstLastAlternate:
          ((not (self.interaction.fragment->select(n|n.oclIsKindOf(OccurrenceSpecification) and n.covered->includes(self))->size() < 2))
          and
          (self.interaction.fragment->select(n|n.oclIsKindOf(InteractionFragment) and n.covered->asSequence()->select(lf| lf=self)->size()>0)->asSequence()->first().oclIsKindOf(OccurrenceSpecification))
          and
          (self.interaction.fragment->select(n|n.oclIsKindOf(InteractionFragment) and n.covered->asSequence()->select(lf| lf=self)->size()>0)->asSequence()->last().oclIsKindOf(OccurrenceSpecification)) 
          ) implies
          (Relation Alternates(self.interaction.fragment->select(n|n.oclIsKindOf(OccurrenceSpecification) and n.covered->includes(self))->asSequence()->first().oclAsType(OccurrenceSpecification).occurrence,
                                self.interaction.fragment->select(n|n.oclIsKindOf(OccurrenceSpecification) and n.covered->includes(self))->asSequence()->last().oclAsType(OccurrenceSpecification).occurrence))   
      inv lifelineordering :
         Relation Precedes (self.interaction.fragment->select(n|n.oclIsKindOf(OccurrenceSpecification) and n.covered->asSequence()->first() = self).oclAsType(OccurrenceSpecification).occurrence)
 
--   context CombinedFragment
--      inv negMessageOccurrence: 
--         ((self.interactionOperator = 8) 
--	   and
--         (self.operand->asSequence()->first().fragment->select(n|n.oclIsKindOf(MessageOccurrenceSpecification))->size()=1)
--	   and
--         (not (self.covered->select(ll|ll.oclIsKindOf(InteractionFragment))->asSequence()->first()=self))
--	   and
--         (not (self.covered->select(n|n.oclIsKindOf(InteractionFragment))->asSequence()->last()=self))
--	   and
--         (self.covered->asSequence()->at(self.covered->asSequence()->indexOf(self)+1).oclIsKindOf(OccurrenceSpecification)) 
--	   and
--         (self.covered->asSequence()->at(self.covered->asSequence()->indexOf(self)-1).oclIsKindOf(OccurrenceSpecification))
--	    ) implies
--         
--         	 (Relation Negation(self.covered->asSequence()->at(self.covered->asSequence()->indexOf(self)-1).oclAsType(OccurrenceSpecification).occurrence,
--         	 	self.operand->asSequence()->first().fragment->asSequence()->select(n|n.oclIsKindOf(MessageOccurrenceSpecification))->first().oclAsType(MessageOccurrenceSpecification).occurrence,
--         	 	self.covered->asSequence()->at(self.covered->asSequence()->indexOf(self)+1).oclAsType(OccurrenceSpecification).occurrence)
--         	 )
         
 
 
   context DurationConstraint
      inv durationCns:
         let baseClk : Event = self.owner.oclAsType(Interaction).interactionEvent in
         let strtClk : Event = self.constrainedElement->asSequence()->first().oclAsType(OccurrenceSpecification).occurrence in
         let endClk : Event = self.constrainedElement->asSequence()->last().oclAsType(OccurrenceSpecification).occurrence in
         let minValue : Integer = self.specification.oclAsType(DurationInterval).min.oclAsType(Duration).expr->asSequence()->first().oclAsType(LiteralInteger).value in
         let maxValue : Integer = self.specification.oclAsType(DurationInterval).max.oclAsType(Duration).expr->asSequence()->first().oclAsType(LiteralInteger).value in
             Relation Duration(strtClk, endClk, baseClk, minValue, maxValue)

endpackage