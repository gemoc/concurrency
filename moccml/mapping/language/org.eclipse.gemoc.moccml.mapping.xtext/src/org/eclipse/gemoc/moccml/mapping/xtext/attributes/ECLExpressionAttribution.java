/*******************************************************************************
 * Copyright (c) 2012, 2019 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *     ENSTA Bretagne - API update, feature enhancement and bug fix
 *******************************************************************************/
package org.eclipse.gemoc.moccml.mapping.xtext.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation;
import org.eclipse.ocl.pivot.IteratorExp;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.utilities.PivotUtil;


public class ECLExpressionAttribution extends AbstractAttribution
{
	public static final ECLExpressionAttribution INSTANCE = new ECLExpressionAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		if(target instanceof ECLRelation){
			ECLRelation r = (ECLRelation)target;
			
			OperationCallExp pivot = PivotUtil.getPivot(OperationCallExp.class, r);
			if (pivot != null) {
				
				for(OCLExpression paramPivot : pivot.getOwnedArguments()){
					if (paramPivot instanceof IteratorExp) {
						Type t = paramPivot.getType();
						environmentView.addElementsOfScope(t, scopeView);
						environmentView.addNamedElement(t);
						for (Variable iterator : ((IteratorExp)paramPivot).getOwnedIterators()) {
							if (iterator.isIsImplicit()) {
								environmentView.addElementsOfScope(iterator.getType(), scopeView);
							}
							else {
								environmentView.addNamedElement(iterator);
							}
//							if (environmentView.hasFinalResult()) {
//								return null;
//							}
						}
					}
				}
			}
		}
		else //instance of eclExpression
			{
			ECLExpression eclExpr = (ECLExpression)target;
				OperationCallExp pivot = PivotUtil.getPivot(OperationCallExp.class, eclExpr);
				if (pivot != null) {
					for(OCLExpression paramPivot : pivot.getOwnedArguments()){
						if (paramPivot instanceof IteratorExp) {
							Type t = paramPivot.getType();
							environmentView.addElementsOfScope(t, scopeView);
							environmentView.addNamedElement(t);
							for (Variable iterator : ((IteratorExp)paramPivot).getOwnedIterators()) {
								if (iterator.isIsImplicit()) {
									environmentView.addElementsOfScope(iterator.getType(), scopeView);
								}
								else {
									environmentView.addNamedElement(iterator);
								}
//								if (environmentView.hasFinalResult()) {
//									return null;
//								}
							}
						}
					}
				}
			}
		return scopeView.getParent();
	}
}
