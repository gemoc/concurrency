import 'http://www.eclipse.org/uml2/2.0.0/UML'
import 'http://fr.inria.aoste.gemoc.eastadl' 
--import 'platform:/plugin/fr.inria.aoste.gemoc.eastadl.profile/model/eastadl.profile.uml'
 

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "platform:/resource/fr.inria.aoste.timmo2use.tadl2.examples/EAST_Semantics/EASTADL.ccslLib"

package uml 

--------------------------
-- 		Events		-- 
-----------------------Coincides---
	context Class
	def if (not self.getAppliedStereotype('eastLight::FunctionTrigger')->isEmpty()):
		activate : Event(self) = GenericEvent
 
 	context Port
 	def:-- if (self.getValue(self.getAppliedStereotype('eastLight::FlowPort'),'direction') = eastLight::PortDirection::OUT):
 		write : Event(self) = produceEvent
 	def if (self.getValue(self.getAppliedStereotype('eastLight::FlowPort'),'direction') = eastLight::PortDirection::IN):
 		read : Event(self) = ConsumeEvent

	context Property 
		def if (not self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty()):
		start : Event(self) = StartEvent
		
		def if (not self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty()):
		stop : Event(self) = StopEvent

--------------------------
-- 		Constraints		--
--------------------------
	context Property
		inv PrototypeStartsWhenTriggered: 
			(not self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty()) implies
			let functionActivator : Event = self.getValue(self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype'),'functionTrigger')
											.oclAsType(eastLight::FunctionTrigger).base_Class.activate  in
			(Relation Coincides(self.start, functionActivator))

		inv StartThenStop: 
			(not  self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty()) implies
			(Relation Alternates(self.start, self.stop))

		inv AllOutputPortWriteCoincides: 
			(not self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty()	
			) implies
			(Relation Coincides(self.type.oclAsType(Class).ownedAttribute->select(o | o.oclIsKindOf(Port)
								and o.getValue(o.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::OUT
								).oclAsType(Port).write))
		inv OutputPortWriteCoincidesWithStop: 
			(not self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty()) implies
			(Relation Coincides(self.type.oclAsType(Class).ownedAttribute->select(o | o.oclIsKindOf(Port)
								and o.getValue(o.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::OUT
								).oclAsType(Port).write->first(), self.stop))
		inv AllInputPortReadCoincides: 
			((not self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty())
				and
				(not self.type.oclAsType(Class).ownedAttribute->select(o | o.oclIsKindOf(Port)
								and o.getValue(o.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::IN
								).oclAsType(Port)->isEmpty())
			) implies
			(Relation Coincides(self.type.oclAsType(Class).ownedAttribute->select(o | o.oclIsKindOf(Port)
								and o.getValue(o.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::IN
								).oclAsType(Port).read))
		inv InputPortReadCoincidesWithStart: 
			((not self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty())
					and
				(not self.type.oclAsType(Class).ownedAttribute->select(o | o.oclIsKindOf(Port)
								and o.getValue(o.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::IN
								).oclAsType(Port)->isEmpty())
			) implies
			(Relation Coincides(self.type.oclAsType(Class).ownedAttribute->select(o | o.oclIsKindOf(Port)
								and o.getValue(o.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::IN
								).oclAsType(Port).read->first(), self.start))

		inv EventTriggerRule:
			((self.getValue(self.getAppliedStereotype('eastLight::FunctionTrigger'),'triggerPolicyKind')
				.oclAsType(eastLight::TriggerPolicyKind) = eastLight::TriggerPolicyKind::EVENT
			)		and
				(not self.getAppliedStereotype('eastLight::AnalysisFunctionPrototype')->isEmpty())
					and
				(not self.type.oclAsType(Class).ownedAttribute->select(o | o.oclIsKindOf(Port)
								and o.getValue(o.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::IN
					 ).oclAsType(Port)->isEmpty())
			) implies
			let doIt : Event = Expression ResetableSup(
				self.type.oclAsType(Class).ownedAttribute->select(o | o.oclIsKindOf(Port)
								and o.getValue(o.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::IN
								).oclAsType(Port).read
			) in
			Relation Coincides(doIt, start)

context Port
	inv portCausalities:
		(self.getValue(self.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::IN)
		implies
		(Relation Precedes(self.write, self.read))
	
	inv portMutexReadWrite:
		(self.getValue(self.getAppliedStereotype('eastLight::FlowPort'),'direction').oclAsType(eastLight::PortDirection) = eastLight::PortDirection::IN)
		implies
		(Relation Exclusion(self.write, self.read))	

context Connector
	inv instantaneousCommunication:
		Relation Coincides(self.end->at(1).role.oclAsType(Port).write, self.end->at(2).definingEnd.type.oclAsType(Port).write)

--	context Class
--		inv EventTriggerRule:
--			(self.getValue(self.getAppliedStereotype('eastLight::FunctionTrigger'),'triggerPolicyKind')
--				.oclAsType(eastLight::TriggerPolicyKind) = eastLight::TriggerPolicyKind::EVENT
--			) implies
--			let doIt : Event = Expression Sup(
--				self.getValue(self.getAppliedStereotype('eastLight::FunctionTrigger'),'port' ) . oclAsType(Port).read
--			) in
--			Relation ComponentActivation(doIt, activate, activate)
	  

--fix to the qvto

--modeltype eastadl uses 'http://fr.inria.aoste.gemoc.eastadl';

-- ->first()

--bindings += object TimeModel::CCSLModel::ClockExpressionAndRelation::Binding{
--	bindable := theMainBlock.elements[name = self.name+'_start']->first();
--	_abstract := seqOfAbstractEntity[name = 'ResetableSup_reset' and container().oclAsType(TimeModel::CCSLModel::ClockExpressionAndRelation::ExpressionDeclaration).name = 'ResetableSup']->first();
--};





endpackage