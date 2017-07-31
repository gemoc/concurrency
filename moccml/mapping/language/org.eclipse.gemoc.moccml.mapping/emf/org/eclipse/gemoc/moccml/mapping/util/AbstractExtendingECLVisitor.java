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

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
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

/**
 * An AbstractExtendingECLVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingECLVisitor<R, C>
	extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractExtendingCompleteOCLCSVisitor<R, C>
	implements ECLVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractExtendingECLVisitor(C context) {
	    super(context);
	}
	
	@Override
	public R visitEventType(EventType object) {
		return null;//visitExpCS(object.getReferedElement());
	}

	@Override
	public R visitBlockType(BlockType object) {
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
