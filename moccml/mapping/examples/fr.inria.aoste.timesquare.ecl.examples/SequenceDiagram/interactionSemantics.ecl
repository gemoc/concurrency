import 'http://www.eclipse.org/uml2/4.0.0/UML'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "./lib4RT.ccslLib"     


package uml 

   context Interaction
      def : interactionEvent : Event(self) = GenericEvent
   
   context OccurrenceSpecification
      def : occurrence : Event(self) = GenericEvent
      inv beforeAlternativeMessages:
          let lifeline : Lifeline = self.covered->asSequence()->first().oclAsType(Lifeline) in
       	  let fragments : OrderedSet(uml::InteractionFragment) = lifeline.interaction.fragment in
       	  let someFragments : OrderedSet(uml::InteractionFragment) = fragments->select(n|n.oclIsKindOf(InteractionFragment) and not n.oclIsKindOf(BehaviorExecutionSpecification) and n.covered->includes(lifeline)) in
          let i:Integer = someFragments->indexOf(self) in
          
          (if(not (fragments->includes(self))) then false
           	else if (someFragments->asSequence()->last() = self) then false
          	       else if (not (someFragments->at(i+1).oclIsKindOf(CombinedFragment))) then false
            	    else if (not (someFragments->at(i+1).oclAsType(CombinedFragment).interactionOperator = InteractionOperatorKind::alt)) then false
           	        else if (not (someFragments->at(i+1).oclAsType(CombinedFragment).operand->size()=2)) then false   	
           else true endif endif endif endif endif
           
           ) implies
           
           (Relation OptionalAfter(self.occurrence, 
           	                        
           	                      someFragments->at(i+1).oclAsType(CombinedFragment).operand->first().fragment->
           		                  select(n| fragments->select(m|m.oclIsKindOf(Message))->select(m|m.oclAsType(Message)._'sendEvent' = n)->size()>0 )->first().occurrence,
       		                  
           		                  someFragments->asSequence()->at(i+1).oclAsType(CombinedFragment).operand->asSequence()->last().fragment->
           		                  select(n| fragments->select(m|m.oclIsKindOf(Message))->select(m|m.oclAsType(Message)._'sendEvent' = n)->size()>0 )->first().occurrence 
           ))
       
      
      inv afterAlternativeMessages:
          let lifeline : Lifeline = self.covered->asSequence()->first().oclAsType(Lifeline) in
       	  let fragments : OrderedSet(uml::InteractionFragment) = lifeline.interaction.fragment in
       	  let someFragments : OrderedSet(uml::InteractionFragment) = fragments->select(n|n.oclIsKindOf(InteractionFragment) and not n.oclIsKindOf(BehaviorExecutionSpecification) and n.covered->includes(lifeline)) in
          let i:Integer = someFragments->indexOf(self) in

          (if(not (fragments->includes(self))) then false
               else if (someFragments->first() = self) then false
                     else if (not (someFragments->at(i-1).oclIsKindOf(CombinedFragment))) then false
                       else if (not (someFragments->at(i-1).oclAsType(CombinedFragment).interactionOperator = InteractionOperatorKind::alt)) then false
                         else if (not (someFragments->at(i-1).oclAsType(CombinedFragment).operand->size()=2)) then false    
          else true endif endif endif endif endif

          ) implies
          (Relation OptionalBefore(self.occurrence, 
           	                       
           	                      someFragments->at(i-1).oclAsType(CombinedFragment).operand->first().fragment->
           		                  select(n| fragments->select(m|m.oclIsKindOf(Message))->select(m|m.oclAsType(Message)._'receiveEvent' = n)->size()>0 )->first().occurrence,
       		                  
           		                  someFragments->at(i-1).oclAsType(CombinedFragment).operand->last().fragment->
           		                  select(n| fragments->select(m|m.oclIsKindOf(Message))->select(m|m.oclAsType(Message)._'receiveEvent' = n)->size()>0 )->first().occurrence 
           ))
      
  
endpackage   