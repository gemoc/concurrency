import 'http://www.eclipse.org/uml2/4.0.0/UML'
 
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
 
package uml 
	context Activity 
		def : referenceClock : Event(self) = GenericEvent
	
	context InputPin
		def : dataRead : Event(self) = ConsumeEvent
	
	context OutputPin
		def : dataWrite : Event(self) = produceEvent
	
	context ControlNode
		def : startIt : Event(self) =StartEvent
		def : finishIt : Event(self) =StartEvent
		
	context Activity  
		def: startActivity : Event(self) = StartEvent
		def: finishActivity: Event(self) = StopEvent
		
	context Action
		def : startIt : Event(self) = StartEvent
		def : finishIt : Event(self) = StopEvent
	
	context ObjectFlow
		inv consumeonlyIfproduced:
			(self.target.oclIsKindOf(InputPin)) implies
			(Relation Precedes(self.source.oclAsType(OutputPin).dataWrite, self.target.oclAsType(InputPin).dataRead))	
		inv consumeMeansStart:
			(self.target.oclIsKindOf(Action)) implies
			(Relation Precedes(self.source.oclAsType(OutputPin).dataWrite, self.target.oclAsType(Action).startIt))	

		inv consumeMeansControl:
			(self.target.oclIsKindOf(ControlNode)) implies
			(Relation Precedes(self.source.oclAsType(OutputPin).dataWrite, self.target.oclAsType(ControlNode).startIt))	
			
	context Action	
		inv waitControlToExecute:
		(self.incoming->size() > 0) implies
			let incomingFinished : Event = self.incoming->asSequence()->first().source.finishIt in
			(Relation Causes(incomingFinished, self.startIt))
		
		inv StartAlternatesWithFinish:
			Relation Alternates(self.startIt,self.finishIt)
	
		inv startAsSoonAsAllDataRead:
		(self.getAppliedStereotypes()->select(s | s.name = 'Select')->size() = 0 and (self.input->size() > 0)) implies
			let lastDataRead : Event = Expression Sup(self.input.dataRead) in
			Relation Causes(lastDataRead,self.startIt)
			
		inv Select_startAsSoonAsOneDataRead:
		(self.getAppliedStereotypes()->select(s | s.name = 'Select')->size() = 1 and (self.input->size() > 0)) implies
			let unionOfDataRead : Event = Expression Union(self.input.dataRead) in
			Relation Causes(unionOfDataRead,self.startIt)
	
		inv lastDataWroteCauseStop:
		(self.getAppliedStereotypes()->select(s | s.name = 'Route')->size() = 0 and (self.output->size() > 0)) implies
			let allDataWrote : Event = Expression Sup(self.output.dataWrite) in
			Relation Alternates(allDataWrote,self.finishIt)
		
		inv startBeforeWritingAndWirteOnlyOnce:
		((self.getAppliedStereotypes()->select(s | s.name = 'Route')->size() = 0) and
		(self.output->size() > 0)) implies
			let firstDataWrote : Event = Expression Inf(self.output.dataWrite) in
			Relation Alternates(self.startIt,firstDataWrote)
			
			
--Route			
		inv Route_oneDataWroteCauseStop:
		(self.getAppliedStereotypes()->select(s | s.name = 'Route')->size() = 1 and (self.output->size() > 0)) implies
			let unionOfDataWrote : Event = Expression Union(self.output.dataWrite) in
			Relation Alternates(unionOfDataWrote,self.finishIt)
			
		inv Route_startAlternesWithoneDataWrote:
		(self.getAppliedStereotypes()->select(s | s.name = 'Route')->size() = 1 and (self.output->size() > 0)) implies
			let unionOfDataWrote2 : Event = Expression Union(self.output.dataWrite) in
			Relation Alternates(self.startIt,unionOfDataWrote2)

		inv Route_onlyOneRouteSelected:
		(self.getAppliedStereotypes()->select(s | s.name = 'Route')->size() = 1 and (self.output->size() > 2)) implies
			(Relation Exclusion(self.output.dataWrite))

		inv Route_startBeforeWritingAndWriteOnlyOnce:
		((self.getAppliedStereotypes()->select(s | s.name = 'Route')->size() = 1) and
		(self.output->size() > 0)) implies
			let unionOfDataWrote3 : Event = Expression Union(self.output.dataWrite) in
			Relation Alternates(self.startIt,unionOfDataWrote3)
			
			

	context Activity  
		
		inv startCausesInit:
			Relation Causes(self.startActivity, self.node->select(n|n.oclIsKindOf(InitialNode))->asSequence()->first().oclAsType(InitialNode).startIt)
	
-- here it is difficult to have a rule.... it depends on the path and the possible fork in it
		inv lastFinalNodeStopActivity:
			let firstFinalNode = Expression Inf(self.node->select(n|n.oclIsKindOf(FinalNode)).oclAsType(FinalNode).finishIt) in
			Relation Causes(firstFinalNode,self.finishActivity)
			
		inv noReEntrance:
			Relation Alternates(self.startActivity, self.finishActivity)
	
	context DecisionNode 
		inv onlyOneDecision: 
			Relation Exclusion(self.outgoing->asSequence().target.oclAsType(Action).startIt)
			
		inv DecisionCausalities: 
			let allStartChoices : Event = Expression Union(self.outgoing->asSequence().target.oclAsType(Action).startIt) in
			Relation Alternates(self.startIt, allStartChoices)
	
	context MergeNode
		inv MergeCausalities: 
			let unionOfIncomes : Event = Expression Union(self.incoming.source.oclAsType(Action).finishIt) in
	 		(Relation Precedes(unionOfIncomes, self.startIt))
	 
	 context ControlNode
	 	inv instantaneousExecution:
			Relation Coincides(self.startIt,self.finishIt)
		
		inv waitAllInputsToStart:
		((self.incoming->size() > 0) and self.incoming->asSequence()->first().source.oclIsKindOf(Action)) implies
			let incomingFinished : Event = Expression Sup(self.incoming.source.finishIt) in
			Relation Causes(incomingFinished, self.startIt)
			
	context ForkNode
		inv allOutputsSynchronous:
			Relation Coincides(self.outgoing.target.finishIt)
	
		inv startCausesControlOnAllOutputs:
			let allOutputControl : Event = Expression Intersection(self.outgoing.target.finishIt) in
			Relation Causes(self.finishIt, allOutputControl)


	context Activity
		inv periodicExec:
		(not self.oclIsKindOf(Behavior)) implies
			let twenty : Integer = 10 in
			let one : Integer = 1 in
			let periodicClock : Event = Expression Periodic(self.referenceClock,twenty,one) in
			Relation Coincides(periodicClock, self.ownedBehavior->select(b|b.oclIsKindOf(Activity))->asSequence()->first().oclAsType(Activity).startActivity)

		
--	--just to see more easily the causalities		
--	context InitialNodend 
--		inv runOnlyOnce:
--			let firstStart : Event = Expression OneTickAndDie(self.startIt) in 
--			Relation Coincides(self.startIt, firstStart)
--	
endpackage