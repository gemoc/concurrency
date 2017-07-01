import 'http://fr.inria.aoste.timmo2use.tadl2.TimingExpressions'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "platform:/resource/fr.inria.aoste.timmo2use.tadl2.examples/BrakeByWireOneWheel/tadl2.ccslLib"


package TimingExpressions 
  
   context _'Event'
      def : tadlEvent : Event(self.triggerableElements->first()) = GenericEvent

   context TimeBase
   	  def : ref : Event = GenericEvent

   context Dimension
   	  def : discretized : Event = GenericEvent
   	  
   context ReactionConstraint
   		inv reactionConstraintMax:
   			let chain :Event = Expression SampledOn(self.scope.segment.tadlEvent) in
   			let delay : Integer = self.maximum.oclAsType(SymbolicTimingExpression).variable.value.oclAsType(ValueTimingExpression).value in --.oclAsType(Integer) * self.maximum.oclAsType(VariableTimingExpression).timeBase.precisionUnit.factor
   			let deadline : Event = Expression DelayFor(self.scope.stimulus.tadlEvent,
   								                       self.maximum.oclAsType(SymbolicTimingExpression).variable.timeBase.ref,
   								                       delay
   			) in
   			Relation Precedes(chain, deadline)
   			 
   	   inv reactionConstraintMin:
   			let chainMin :Event = Expression SampledOn(self.scope.segment.tadlEvent) in
   			let delayMin : Integer = self.minimum.oclAsType(SymbolicTimingExpression).variable.value.oclAsType(ValueTimingExpression).value in --.oclAsType(Integer) * self.maximum.oclAsType(VariableTimingExpression).timeBase.precisionUnit.factor
   			let minTime : Event = Expression DelayFor(self.scope.stimulus.tadlEvent,
   								                       self.minimum.oclAsType(SymbolicTimingExpression).variable.timeBase.ref,
   								                       delayMin
   			) in
   			Relation Precedes(minTime, chainMin)
   		
   context AgeConstraint
    inv AgeConstraintSemanticsMax:
   			let chain :Event = Expression SampledOn(self.scope.segment.tadlEvent) in
   			let overriding : Event = Expression AgeEventChainOverride(self.scope.segment.tadlEvent) in
   			let chainOrOverride : Event = Expression Union(chain, overriding) in
   			let delay : Integer = self.maximum.oclAsType(SymbolicTimingExpression).variable.value.oclAsType(ValueTimingExpression).value in --.oclAsType(Integer) * self.maximum.oclAsType(VariableTimingExpression).timeBase.precisionUnit.factor
   			let deadline : Event = Expression DelayFor(self.scope.stimulus.tadlEvent,
   								                       self.maximum.oclAsType(SymbolicTimingExpression).variable.timeBase.ref,
   								                       delay
   			) in
   			Relation Precedes(chainOrOverride, deadline)
   			 
   context TimeBase
   	inv periodicTB:
   		let periodTB : Integer = (self.precisionFactor * self.precisionUnit.factor) in
   		let offsetTB : Integer = 0 in
   		let periodicClockTB : Event = Expression Periodic(self.type.discretized, periodTB, offsetTB) in
   		Relation Coincides(self.ref, periodicClockTB)
   

   context TimeBaseRelation
   	inv TBRrelation:
   		let periodLeft : Integer = self.left.oclAsType(ValueTimingExpression).value in
   		let offsetLeftRight : Integer = 0 in
   		let leftRef : Event = Expression Periodic(self.left.oclAsType(ValueTimingExpression).timeBase.ref,
   											     periodLeft,
										     	 offsetLeftRight
   		) in
   		let periodRight : Integer = self.right.oclAsType(ValueTimingExpression).value in
   		let rightRef : Event = Expression Periodic(self.right.oclAsType(VariableTimingExpression).timeBase.ref,
   											     periodRight,
										     	 offsetLeftRight
   		) in
   		Relation Coincides(leftRef,rightRef)
   		
   	 

   context SynchronizationConstraint
   	inv synchronisation:
   		let infSync : Event = Expression Inf(self.events.tadlEvent) in
   		let supSync : Event = Expression Sup(self.events.tadlEvent) in
   		let tolerance : Integer = self.tolerance.oclAsType(SymbolicTimingExpression).variable.value.oclAsType(ValueTimingExpression).value in --.oclAsType(Integer) * self.maximum.oclAsType(VariableTimingExpression).timeBase.precisionUnit.factor
   		let delayedInf : Event = Expression DelayFor(infSync, self.tolerance.oclAsType(SymbolicTimingExpression).variable.timeBase.ref, tolerance) in
   		Relation Precedes(supSync, delayedInf) 

   context EventChain
      inv eventChainCausality: --if not used in a reaction constraint 
         ((not self.oclContainer().oclAsType(Timing).constraints->select(te | te.oclIsKindOf(ReactionConstraint))
         .oclAsType(ReactionConstraint)->exists(rc | rc.scope = self))
          and  
          (not self.oclContainer().oclAsType(Timing).constraints->select(te | te.oclIsKindOf(AgeConstraint))
         .oclAsType(AgeConstraint)->exists(rc | rc.scope = self))
         ) implies
         (Relation Causes(self.segment.tadlEvent))


context SporadicConstraint
   	inv sporadicConstraintRelation:
   		let period : Integer = self.lower.oclAsType(SymbolicTimingExpression).variable.value.oclAsType(ValueTimingExpression).value in
   		let offset : Integer = 0 in
   		let sporadicMin : Event = Expression Periodic(self.lower.oclAsType(SymbolicTimingExpression).variable.oclAsType(VariableTimingExpression).timeBase.ref,
   											     period,
										     	 offset
   		) in
   		Relation Precedes(sporadicMin,self.event.tadlEvent)

context PeriodicConstraint
   	inv periodicConstraintRelation:
   		let period : Integer = self.period.oclAsType(SymbolicTimingExpression).variable.value.oclAsType(ValueTimingExpression).value in
   		let offset : Integer = 0 in
   		let periodicClock : Event = Expression Periodic(self.period.oclAsType(SymbolicTimingExpression).variable.oclAsType(VariableTimingExpression).timeBase.ref,
   											     period,
										     	 offset
   		) in
   		Relation Coincides(periodicClock,self.event.tadlEvent)

context DelayConstraint
   	inv delayConstraintRelation:
   		let delay : Integer = self.upper.oclAsType(SymbolicTimingExpression).variable.value.oclAsType(ValueTimingExpression).value in
   		let delayedClock : Event = Expression DelayFor(self.source.tadlEvent,
   													   self.upper.oclAsType(SymbolicTimingExpression).variable.oclAsType(VariableTimingExpression).timeBase.ref,
   											           delay
   		) in
   		Relation Coincides(delayedClock,self.target.tadlEvent)

endpackage

