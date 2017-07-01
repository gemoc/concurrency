import 'http://fr.inria.aoste.timesquare.ecl.example.simplecomponent/1.0'
 
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
  
package simplecomponentmodel
	 
	context Behavior
		def : start : Event(self) = StartEvent
		def : finish : Event(self) = StopEvent
		
		inv startPrecedesStop:
			Relation Precedes(self.start, self.finish)
	 
	context Component		
		inv notSimultaneousStarts:
			Relation Exclusion(self.behaviors.start)
	
		inv noMultipleCallOfInternalBehavior:
		let allStart : Event = Expression Union(self.behaviors.start) in
		let allStop : Event = Expression Union(self.behaviors.finish) in
			Relation Alternates(allStart,allStop)
		
endpackage