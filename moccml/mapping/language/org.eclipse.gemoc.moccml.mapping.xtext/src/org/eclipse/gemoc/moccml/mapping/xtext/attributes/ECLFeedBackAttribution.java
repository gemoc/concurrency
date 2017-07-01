package org.eclipse.gemoc.moccml.mapping.xtext.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;

public class ECLFeedBackAttribution  extends AbstractAttribution
{
	public static final ECLFeedBackAttribution INSTANCE = new ECLFeedBackAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		DSAFeedback feedBack = (DSAFeedback)target;
			
			environmentView.addElement(((ECLDefCS)feedBack.eContainer()).getName()+"_switch", feedBack);
			environmentView.addElementsOfScope(feedBack.getPivot(), scopeView);
			ClassifierContextDeclCS context = ((DefPropertyCS)feedBack.eContainer()).getOwningClassifierContextDecl();
			environmentView.addNamedElement((Nameable) context.getPivot());	
			environmentView.addElementsOfScope(context.getPivot(), scopeView);
			
		return scopeView.getParent();
	}
}
