/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * This code is auto-generated
 * from: /org.eclipse.ocl.examples.xtext.completeocl/model/CompleteOCLCST.ecore
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateVisitor
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateVisitors.mtl
 * invoked by: org.eclipse.ocl.examples.build.utilities.*
 * from: org.eclipse.ocl.examples.build.*.mwe2
 *
 * Do not edit it.
 *
 * $Id$
 */
package	org.eclipse.gemoc.moccml.mapping.util;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement;
import org.eclipse.ocl.xtext.completeoclcs.util.AbstractDelegatingCompleteOCLCSVisitor;
import org.eclipse.ocl.xtext.completeoclcs.util.CompleteOCLCSVisitor;



/**
 * An AbstractExtendingDelegatingECLVisitor delegates all visits.
 */
public abstract class AbstractExtendingDelegatingECLVisitor<R, C, D extends CompleteOCLCSVisitor<R>>
	extends AbstractDelegatingCompleteOCLCSVisitor<R, C, D>
	implements ECLVisitor<R>
{
    protected AbstractExtendingDelegatingECLVisitor(D delegate, C context) {
        super(delegate, context);
    }

	@Override
	public R visitEventType(EventType object) {
		return null;//visitExpCS(object.getReferedElement());
	}

	@Override
	public R visitECLDocument(ECLDocument object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R visitEventLiteralExp(EventLiteralExp eventLiteralExp)
	{
		return null;
	}

	@Override
	public R visitEventKind(EventKind eventKind) {
		return null;
	}

	@Override
	public R visitECLRelation(ECLRelation relation)
	{
		return null;
	}

	@Override
	public R visitImportStatement(ImportStatement importStatement)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R visitECLExpression(ECLExpression eclExpression) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public R visitECLDefCS(ECLDefCS eclDefCS) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public R visitECLEventDefCS(ECLEventDefCS eclDefCS) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public R visitECLBlockDefCS(ECLBlockDefCS eclDefCS) {
		// TODO Auto-generated method stub
		return null;
	}
}