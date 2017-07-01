import 'http://fr.inria.aoste.gemoc.hierarchicalcomponent'
import 'http://fr.inria.aoste.gemoc.example.tfsm'


ECLimport "platform:/resource/fr.inria.aoste.timesquare.ecl.examples/SDF/SDF.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package HierarchicalComponentModel

	
	context Connector	
		inv allCoincindesAndThatsIt:
			Relation Coincides(self.ports.oclAsType(InteractionPort).exposedEvent)		
endpackage