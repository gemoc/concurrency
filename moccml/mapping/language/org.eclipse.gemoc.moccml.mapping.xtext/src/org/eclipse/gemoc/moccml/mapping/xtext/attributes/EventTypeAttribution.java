/**
 * <copyright>
 *
 * Copyright (c) 2010,2017 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: DataTypeCSAttribution.java,v 1.3 2011/04/25 09:50:02 ewillink Exp $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.ocl.pivot.internal.attributes.DataTypeAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;

public class EventTypeAttribution extends DataTypeAttribution
{
	public static final EventTypeAttribution INSTANCE = new EventTypeAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		EventType evtType = (EventType)target;
		
		environmentView.addNamedElement(evtType);
		environmentView.addElement(evtType.getReferedElement().toString(), evtType.getReferedElement());
		
		environmentView.addElementsOfScope(evtType.getPivot(), scopeView);
	//	environmentView.addElementsOfScope(evtType.getReferedElement().getPivot(), scopeView);
		
//		environmentView.addNamedElement(pivot);
//		environmentView.addElementsOfScope(pivot, scopeView);
			
		
//		ExpressionInOCL referedExpression = PivotUtil.getPivot(ExpressionInOCL.class, evtType.getReferedElement());
//		environmentView.addNamedElement(referedExpression);
//		environmentView.addElementsOfScope(referedExpression, scopeView);
//		
//		OCLExpression ocle = referedExpression.getBodyExpression();
//		
//		if (ocle instanceof IteratorExp) {
//			Type t = ocle.getType();
//			environmentView.addElementsOfScope(t, scopeView);
//			environmentView.addNamedElement(t);
//			for (Variable iterator : ((IteratorExp)ocle).getIterator()) {
//				if (iterator.isImplicit()) {
//					environmentView.addElementsOfScope(iterator.getType(), scopeView);
//				}
//				else {
//					environmentView.addNamedElement(iterator);
//				}
////				if (environmentView.hasFinalResult()) {
////					return null;
////				}
//			}
//		}
//		
//		environmentView.addNamedElement(ocle);
//		environmentView.addElementsOfScope(ocle, scopeView);
		
//		environmentView.addNamedElement(referedExpression.getContextVariable());
//		environmentView.addElementsOfScope(referedExpression.getContextVariable(), scopeView);
//		
//		Property defProperty = PivotUtil.getPivot(Property.class, (DefPropertyCS)evtType.getLogicalParent());
//		environmentView.addNamedElement(defProperty);
//		environmentView.addElementsOfScope(defProperty, scopeView);
		
		ClassifierContextDeclCS context = ((DefPropertyCS)evtType.getParent()).getOwningClassifierContextDecl();
		environmentView.addNamedElement((Nameable) context.getPivot());	
		environmentView.addElementsOfScope(context.getPivot(), scopeView);
						
		return scopeView.getParent();
		}

}
