import 'http://www.eclipse.org/uml2/5.0.0/UML'
 
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib" 
 
package UML

	context Activity
		def : referenceClock : Event = self 
--		inv testForEach:
--			self.ownedNode->forAll(n1, n2 | if n1 <> n2 then ( Relation Exclusion(n1.startIt, n2.startIt) ) else true endif)
----			self.ownedNode->forAll(n1, n2 | n1 <> n2 implies (Relation Exclusion(n1.startIt, n2.startIt)))

	context ActivityNode 
		def : startIt : Event(StartEvent) = self 
		def : finishIt : Event(StopEvent) = self 
 
		inv waitControlToExecute:
			(self.incoming->size() > 0) implies  
			let incomingFinished : Event = self.incoming->asSequence()->first().source.finishIt in
			(Relation Causes(incomingFinished, self.startIt))
		   
	context DecisionNode
		inv ForkCausalities:
			let startChoice1 : Event = self.outgoing->asSequence()->first().target.startIt in
			let startChoice2 : Event = self.outgoing->asSequence()->last().target.startIt in
			let unionOfChoices : Event = Expression Union(startChoice1, startChoice2) in
			Relation Precedes(startIt, unionOfChoices)
			
	
endpackage   