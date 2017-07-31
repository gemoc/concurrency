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
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.ocl.pivot.internal.attributes.VariableAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;

public class BlockTypeAttribution extends VariableAttribution
{
	public static final BlockTypeAttribution INSTANCE = new BlockTypeAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		BlockType blockType = (BlockType)target;
		
		environmentView.addNamedElement(blockType);
		
		environmentView.addElementsOfScope(blockType.getPivot(), scopeView);
		
		ClassifierContextDeclCS context = ((DefPropertyCS)blockType.getParent()).getOwningClassifierContextDecl();
		environmentView.addNamedElement((Nameable) context.getPivot());	
		environmentView.addElementsOfScope(context.getPivot(), scopeView);
						
		return scopeView.getParent();
		}

}
