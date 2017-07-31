/**
 * <copyright>
 *
 * Copyright (c) 2010, 2017 E.D.Willink and others.
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
 * $Id: CompleteOCLPreOrderVisitor.java,v 1.11 2011/05/20 15:26:50 ewillink Exp $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
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
import org.eclipse.gemoc.moccml.mapping.util.ECLVisitor;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSContainmentVisitor;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

public class AbstractECLContainmentVisitor
	extends CompleteOCLCSContainmentVisitor implements ECLVisitor<Continuation<?>>
{	
	//
	//	This file is maintained by copying from AbstractExtendingCompleteOCLCSVisitor and changing R to Continuation<?>.
	//
	protected AbstractECLContainmentVisitor(CS2ASConversion context) {
	    super(context);
	}

	public Continuation<?> visitECLDocument(ECLDocument object) {
		return visitCompleteOCLDocumentCS((CompleteOCLDocumentCS)object);
	}

	public Continuation<?> visitEventType(EventType object) {
		return visitTypedRefCS(object);
	}

	public Continuation<?> visitEventLiteralExp(EventLiteralExp object) {
		return visitLiteralExpCS(object);
	}

	public Continuation<?> visitEventKind(EventKind eventKind) {
		// TODO Auto-generated method stub
		return null;
	}

	public Continuation<?> visitECLRelation(ECLRelation relation) {
		// TODO Auto-generated method stub
		return visitExpCS(relation);
	}

	public Continuation<?> visitImportStatement(ImportStatement importStatement) {
	//	return visitImportStatement(importStatement);
		return null;
	}

	public Continuation<?> visitECLExpression(ECLExpression eclExpression) {
		// TODO Auto-generated method stub
		return visitExpCS(eclExpression);
	}

	public Continuation<?> visitECLDefCS(
			ECLDefCS eclDefCS) {
		return visitDefCS(eclDefCS);
	}

	
	public Continuation<?> visitDSAFeedBack(DSAFeedback dsaFeedback) {
		return visitModelElementCS(dsaFeedback);
	}

	
	public Continuation<?> visitCase(Case itsCase) {
		// TODO Auto-generated method stub
		return visitModelElementCS(itsCase);
	}

	@Override
	public Continuation<?> visitBlockType(BlockType blockType) {
		return visitTypedRefCS(blockType);

	}

	@Override
	public Continuation<?> visitECLBlockDefCS(ECLBlockDefCS eclBlockDefCS) {
		return visitDefCS(eclBlockDefCS);

	}

	@Override
	public Continuation<?> visitECLEventDefCS(ECLEventDefCS eclEventDefCS) {
		return visitDefCS(eclEventDefCS);

	}	
}