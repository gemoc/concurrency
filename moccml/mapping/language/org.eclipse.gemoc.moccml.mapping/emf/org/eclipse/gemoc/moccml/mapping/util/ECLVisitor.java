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

/**
 */
public interface ECLVisitor<R> extends org.eclipse.ocl.xtext.completeoclcs.util.CompleteOCLCSVisitor<R>
{
	R visitECLDocument(ECLDocument object);
	R visitEventType(EventType object);
	R visitEventLiteralExp(EventLiteralExp startEventLiteralExp);
	R visitEventKind(EventKind eventKind);
	R visitECLRelation(ECLRelation relation);
	R visitImportStatement(ImportStatement importStatement);
	R visitECLExpression(ECLExpression eclExpression);
	R visitECLDefCS(ECLDefCS eclDefCS);
	R visitDSAFeedBack(DSAFeedback dsaFeedback);
	R visitCase(Case itsCase);
	R visitBlockType(BlockType blockType);
	R visitECLBlockDefCS(ECLBlockDefCS eclBlockDefCS);
	R visitECLEventDefCS(ECLEventDefCS eclEventDefCS);
}
