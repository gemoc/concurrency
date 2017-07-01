import 'http://www.eclipse.org/uml2/5.0.0/UML' 
 
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib" 
    
package UML 
 
	context ActivityNode
		def : startIt : Event = self
		def : finishIt : Event = self
		
	context ActivityEdge
		def : read : Event = self
		def : write : Event = self 
	
		inv writeBeforeRead: 
			Relation Precedes(write,read)   
			
		inv writeWhenFinish: 
		(not (self.source.oclIsKindOf(DecisionNode))) implies
			(Relation Coincides(self.source.finishIt, self.write))
			
	context ActivityNode
		
		inv waitControlToExecute:
		((not ((self).oclIsKindOf(MergeNode)))
		and
		(self.incoming->size() > 0)
		)implies
			let incomingFinished : Event = Expression Sup(self.incoming.read) in
			(Relation Precedes(incomingFinished, self.startIt)) 
		
	
	context ExecutableNode
		inv startBeforeFinish4ExecutableNode:
			(Relation Precedes(startIt,finishIt)) 
	 
	context ControlNode	
		inv startBeforeFinish4nonExecutableNode:
			(Relation Precedes(startIt,finishIt))
		
--	context Activity
--		--def : referenceClock : Event = undefined
--		inv testForEach:
--			self.ownedNode->forAll(n1, n2 | if n1 <> n2 then ( Relation Exclusion(n1.startIt, n2.startIt) ) else true endif)
--	
	context DecisionNode
		inv DecisionCausalities:
			let startChoice1 : Event = self.outgoing->asSequence()->first().write in
			let startChoice2 : Event = self.outgoing->asSequence()->last().write in
			let unionOfChoices : Event = Expression Union(startChoice1, startChoice2) in
			(Relation Precedes(finishIt, unionOfChoices))
		inv DecisionExclusion:
			let startChoice11 : Event = self.outgoing->asSequence()->first().write in
			let startChoice22 : Event = self.outgoing->asSequence()->last().write in
			(Relation Exclusion(startChoice11, startChoice22)) 
	
	context MergeNode
		inv MergeCausalities:
			let unionOfIncomes : Event = Expression Union(self.incoming.read) in
			(Relation Precedes(unionOfIncomes, startIt))
	
	--just to see more easily the causalities		
--	context InitialNode
--		inv runOnlyOnce:
--			let firstStart : Event = Expression OneTickAndDie(self.startIt) in
--			Relation Coincides(self.startIt, firstStart)
	
endpackage