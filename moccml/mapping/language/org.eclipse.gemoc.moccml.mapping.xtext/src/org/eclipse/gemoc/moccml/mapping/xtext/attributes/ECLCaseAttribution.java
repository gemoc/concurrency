package org.eclipse.gemoc.moccml.mapping.xtext.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;

public class ECLCaseAttribution  extends AbstractAttribution
{
	public static final ECLCaseAttribution INSTANCE = new ECLCaseAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
//			Case aCase = (Case) target;
						
//			environmentView.addElement(aCase.getCondition().toString(), aCase.getCondition());
//			environmentView.addElementsOfScope(aCase.getCondition().getPivot(), scopeView);
//			environmentView.addElement(aCase.getEventToForce().toString(), aCase.getEventToForce());
//			environmentView.addElementsOfScope(aCase.getEventToForce().getPivot(), scopeView);
//			environmentView.addElement(aCase.getOn().toString(), aCase.getOn());
//			environmentView.addElementsOfScope(aCase.getOn().getPivot(), scopeView);
				
		return scopeView.getParent();
	}
}
