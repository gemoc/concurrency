import 'http://www.eclipse.org/uml2/2.1.0/UML'
 
ECLimport "platform:/resource/fr.inria.aoste.timesquare.ecl.examples/SDF/SDF.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
 
package UML
 
	context Activity
	def : referenceClock  : Event = self

	context Action
	def : StartExecution: Event(StartEvent) = self
	def : StopExecution: Event(StopEvent) = self
--	def : itsWcet :Integer = self.name.size() -- ok that's silly but anyway this is an information in the model

	inv startBeforeStop:
		Relation Precedes(self.StartExecution, self.StopExecution)
	
		
	inv wcet:   
		let executionTime : Integer = self.name.size() in
		let r_startDelayedByOne: Event = Expression DelayFor(StartExecution, self.activity.referenceClock, executionTime) in
	 	Relation Precedes(self.StopExecution, r_startDelayedByOne)

inv tempForTests:   
		let executionTime2 : Integer = self.name.size() in
		let r_startWaitOne: Event = Expression Wait(StartExecution,  executionTime2) in
	 	Relation Precedes(self.StopExecution, r_startWaitOne)



	context JoinNode 
	inv ArcConstraintWithDelay:
	(self.incoming->select( e| (e).source.oclIsKindOf(InitialNode))->size() > 0) implies (
	 	let sourceActor : Event = self.incoming->select(e | (e).source.oclIsKindOf(Action))->asOrderedSet()->first().source.oclAsType(Action).StopExecution in
		let targetActor : Event = self.outgoing->asOrderedSet()->first().target.oclAsType(Action).StartExecution in
		let outWeight : Integer = self.incoming->select( e| (e).source.oclIsKindOf(Action))->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		let delay : Integer = self.incoming->select( e| (e).source.oclIsKindOf(InitialNode))->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		let inWeight : Integer = self.outgoing->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		Relation Arc(delay, sourceActor, outWeight, targetActor, inWeight)
		)
 
 inv ArcConstraintWithoutDelay:
	(self.incoming->select( e| (e).source.oclIsKindOf(InitialNode))->size() = 0) implies(
	 	let sourceActor : Event = self.incoming->select(e | (e).source.oclIsKindOf(Action))->asOrderedSet()->first().source.oclAsType(Action).StopExecution in
		let targetActor : Event = self.outgoing->asOrderedSet()->first().target.oclAsType(Action).StartExecution in
		let outWeight : Integer = self.incoming->select( e| (e).source.oclIsKindOf(Action))->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		let delay2 : Integer = 0 in
		let inWeight : Integer = self.outgoing->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		Relation Arc(delay2, sourceActor, outWeight, targetActor, inWeight)
		)
		
endpackage  