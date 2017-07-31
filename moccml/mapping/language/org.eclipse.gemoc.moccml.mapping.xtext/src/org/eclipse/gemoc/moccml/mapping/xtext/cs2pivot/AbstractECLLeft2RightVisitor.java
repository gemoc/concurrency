/**
wçyumuù$ * <copyright>
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
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSLeft2RightVisitor;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

public class AbstractECLLeft2RightVisitor
	extends CompleteOCLCSLeft2RightVisitor implements ECLVisitor<Element>
{	
	//
	//	This file is maintained by copying from AbstractExtendingCompleteOCLCSVisitor and changing R to Element.
	//
	protected AbstractECLLeft2RightVisitor(CS2ASConversion context) {
        super(context);
    }

	public Element visitEventType(EventType object) {
		return super.visitTypedRefCS(object);
	}

	public Element visitECLDocument(ECLDocument object) {
		return visitCompleteOCLDocumentCS((CompleteOCLDocumentCS)object);
	}

	public Element visitEventLiteralExp(EventLiteralExp eventLiteralExp)
	{
		return visitLiteralExpCS(eventLiteralExp);
	}

	public Element visitEventKind(EventKind eventKind) {
		return null;
	}

	public Element visitECLRelation(ECLRelation relation)
	{
		return visitExpCS(relation);
	}

	public Element visitImportStatement(ImportStatement importStatement)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Element visitECLExpression(ECLExpression eclExpression) {
		return visitExpCS(eclExpression);
	}

	public Element visitECLDefCS(ECLDefCS eclDefCS) {
		return visitECLDefCS(eclDefCS);
	}

	
	public Element visitDSAFeedBack(DSAFeedback dsaFeedback) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Element visitCase(Case itsCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element visitBlockType(BlockType blockType) {
		return super.visitTypedRefCS(blockType);
	}

	@Override
	public Element visitECLBlockDefCS(ECLBlockDefCS eclBlockDefCS) {
		return visitECLDefCS(eclBlockDefCS);
	}

	@Override
	public Element visitECLEventDefCS(ECLEventDefCS eclEventDefCS) {
		return visitECLDefCS(eclEventDefCS);
	}

}