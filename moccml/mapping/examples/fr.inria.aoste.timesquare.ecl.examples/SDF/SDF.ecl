import 'http://www.eclipse.org/uml2/5.0.0/UML'
 
ECLimport "platform:/resource/fr.inria.aoste.timesquare.ecl.examples/SDF/SDF.ccslLib"
 
package UML
 
	
	context Action
	def : AtomicExecution: Event = self
	
	context JoinNode 
	inv ArcConstraintWithDelay:
	(self.incoming->select( e| (e).source.oclIsKindOf(InitialNode))->size() > 0) implies (
	 	let sourceActor : Event = self.incoming->select(e | (e).source.oclIsKindOf(Action))->asOrderedSet()->first().source.oclAsType(Action).AtomicExecution in
		let targetActor : Event = self.outgoing->asOrderedSet()->first().target.oclAsType(Action).AtomicExecution in
		let outWeight : Integer = self.incoming->select( e| (e).source.oclIsKindOf(Action))->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		let delay : Integer = self.incoming->select( e| (e).source.oclIsKindOf(InitialNode))->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		let inWeight : Integer = self.outgoing->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		Relation Arc(delay, sourceActor, outWeight, targetActor, inWeight)
		)
 
 inv ArcConstraintWithoutDelay:
	(self.incoming->select( e| (e).source.oclIsKindOf(InitialNode))->size() = 0) implies(
	 	let sourceActor : Event = self.incoming->select(e | (e).source.oclIsKindOf(Action))->asOrderedSet()->first().source.oclAsType(Action).AtomicExecution in
		let targetActor : Event = self.outgoing->asOrderedSet()->first().target.oclAsType(Action).AtomicExecution in
		let outWeight : Integer = self.incoming->select( e| (e).source.oclIsKindOf(Action))->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		let delay2 : Integer = 0 in
		let inWeight : Integer = self.outgoing->asOrderedSet()->first().weight.oclAsType(LiteralInteger).value in
		Relation Arc(delay2, sourceActor, outWeight, targetActor, inWeight)
		)
		
endpackage  