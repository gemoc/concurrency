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
