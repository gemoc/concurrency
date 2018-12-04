//package org.eclipse.gemoc.execution.concurrent.ccsljavaengine.dsa.executors.explorer;
//
//import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.ecore.EObject;
//
//import fr.inria.aoste.trace.EventOccurrence;
//import fr.inria.aoste.trace.ModelElementReference;
//import fr.inria.aoste.trace.impl.LogicalStepImpl;
//
//public class CCSLStateSpaceTransition extends LogicalStepImpl {
//
//	public CCSLStateSpaceTransition() {
//		super();
//	}
//
//	@Override
//	public String toString() {
//		String res = "";
//		for(EventOccurrence occ : this.getEventOccurrences()){
//			EList<EObject> instantiationPath = ((ModelElementReference)occ.getReferedElement()).getElementRef();
//			res += instantiationPath.get(instantiationPath.size()-1).toString();
//		}
//		return res;
//	}
//}
