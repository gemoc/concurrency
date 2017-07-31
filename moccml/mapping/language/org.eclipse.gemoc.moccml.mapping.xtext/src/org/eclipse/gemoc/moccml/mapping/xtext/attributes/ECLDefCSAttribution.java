/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.moccml.mapping.xtext.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;

public class ECLDefCSAttribution  extends AbstractAttribution
{
	public static final ECLDefCSAttribution INSTANCE = new ECLDefCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
			ECLDefCS def = (ECLDefCS)target;
			if(def instanceof ECLEventDefCS){
				return attributeECLEventDef(environmentView, scopeView, (ECLEventDefCS) def);
			}
			if (def instanceof ECLBlockDefCS){
				return attributeECLBlockDef(environmentView, scopeView, (ECLBlockDefCS) def);
			}
		return null;
	}


	private ScopeView attributeECLEventDef(EnvironmentView environmentView,
			ScopeView scopeView, ECLEventDefCS def) {
		environmentView.addNamedElement(def);
		if(def.getOwnedSpecification() != null)
		{
			environmentView.addElement(def.getOwnedSpecification().toString(), def.getOwnedSpecification());
			environmentView.addElementsOfScope(def.getOwnedSpecification().getPivot(), scopeView);
		}
		
		if(def.getCondition() != null)
		{
			environmentView.addElement(def.getCondition().toString(), def.getCondition());
			environmentView.addElementsOfScope(def.getCondition().getPivot(), scopeView);
		}
		
		if(def.getFuture() != null)
		{
			environmentView.addElement(def.getFuture().toString(), def.getFuture());
			environmentView.addElementsOfScope(def.getFuture().getPivot(), scopeView);
		}
		
//			if(def.getFeedback() != null)
//			{
//				environmentView.addElementsOfScope(def.getFeedback().getPivot(), scopeView);
//				ClassifierContextDeclCS feedBackcontext = ((DefPropertyCS)def).getClassifierContextDecl();
//				environmentView.addNamedElement((Nameable) feedBackcontext .getPivot());	
//				environmentView.addElementsOfScope(feedBackcontext .getPivot(), scopeView);
//				environmentView.addElement(def.getDsaResultName(), def.getFeedback());
//				environmentView.addElementsOfScope(def.getFeedback().getPivot(), scopeView);
//				
//			}
		environmentView.addElementsOfScope(def.getPivot(), scopeView);
		ClassifierContextDeclCS context = ((DefPropertyCS)def).getOwningClassifierContextDecl();
		environmentView.addNamedElement((Nameable) context.getPivot());	
		environmentView.addElementsOfScope(context.getPivot(), scopeView);
		
		
		
		/**
		 * TODO add all feedback related stuff here
		 */
		
		return scopeView.getParent();
	}
	
	private ScopeView attributeECLBlockDef(EnvironmentView environmentView,
			ScopeView scopeView, ECLBlockDefCS def) {
		environmentView.addNamedElement(def);
		if(def.getCondition() != null)
		{
			environmentView.addElement(def.getCondition().toString(), def.getCondition());
			environmentView.addElementsOfScope(def.getCondition().getPivot(), scopeView);
		}
		
		if(def.getEnterWhen() != null)
		{
			environmentView.addElement(def.getEnterWhen().toString(), def.getEnterWhen());
			environmentView.addElementsOfScope(def.getEnterWhen().getPivot(), scopeView);
		}
		
		if(def.getLeaveWhen() != null)
		{
			environmentView.addElement(def.getLeaveWhen().toString(), def.getLeaveWhen());
			environmentView.addElementsOfScope(def.getLeaveWhen().getPivot(), scopeView);
		}
		
		environmentView.addElementsOfScope(def.getPivot(), scopeView);
		ClassifierContextDeclCS context = ((DefPropertyCS)def).getOwningClassifierContextDecl();
		environmentView.addNamedElement((Nameable) context.getPivot());	
		environmentView.addElementsOfScope(context.getPivot(), scopeView);
		
		return scopeView.getParent();
	}
	
}