/**
 * <copyright>
 *
 * Copyright (c) 2012, 2017 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gemoc.moccml.mapping.xtext.scoping;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.xtext.attributes.ECLAttribution;
import org.eclipse.gemoc.moccml.mapping.xtext.attributes.ECLCaseAttribution;
import org.eclipse.gemoc.moccml.mapping.xtext.attributes.ECLDefCSAttribution;
import org.eclipse.gemoc.moccml.mapping.xtext.attributes.ECLExpressionAttribution;
import org.eclipse.gemoc.moccml.mapping.xtext.attributes.ECLFeedBackAttribution;
import org.eclipse.gemoc.moccml.mapping.xtext.attributes.EventTypeAttribution;
import org.eclipse.gemoc.moccml.mapping.xtext.attributes.ImportStatementAttribution;
//import org.eclipse.ocl.xtext.completeocl.attributes.IncludeCSAttribution;
import org.eclipse.ocl.pivot.internal.scoping.Attribution;
import org.eclipse.ocl.xtext.completeocl.attributes.ClassifierContextCSAttribution;
import org.eclipse.ocl.xtext.completeocl.attributes.CompleteOCLDocumentCSAttribution;
import org.eclipse.ocl.xtext.completeocl.attributes.OperationContextCSAttribution;
import org.eclipse.ocl.xtext.completeocl.attributes.PackageDeclarationCSAttribution;
import org.eclipse.ocl.xtext.completeocl.attributes.PropertyContextCSAttribution;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;

public class ECLScoping
{	
	public static void init() {
		Map<EClassifier, Attribution> registry = Attribution.REGISTRY;
		registry.put(MoCCMLmappingPackage.Literals.IMPORT_STATEMENT, ImportStatementAttribution.INSTANCE);	
		registry.put(MoCCMLmappingPackage.Literals.ECL_DOCUMENT, ECLAttribution.INSTANCE);
		registry.put(MoCCMLmappingPackage.Literals.EVENT_TYPE, EventTypeAttribution.INSTANCE);
		registry.put(MoCCMLmappingPackage.Literals.ECL_EXPRESSION, ECLExpressionAttribution.INSTANCE);
		registry.put(MoCCMLmappingPackage.Literals.ECL_RELATION, ECLExpressionAttribution.INSTANCE);
		registry.put(MoCCMLmappingPackage.Literals.ECL_DEF_CS, ECLDefCSAttribution.INSTANCE);
		registry.put(MoCCMLmappingPackage.Literals.CASE, ECLCaseAttribution.INSTANCE);
		registry.put(MoCCMLmappingPackage.Literals.DSA_FEEDBACK, ECLFeedBackAttribution.INSTANCE);
		registry.put(CompleteOCLCSPackage.Literals.CLASSIFIER_CONTEXT_DECL_CS, ClassifierContextCSAttribution.INSTANCE);
		registry.put(CompleteOCLCSPackage.Literals.COMPLETE_OCL_DOCUMENT_CS, CompleteOCLDocumentCSAttribution.INSTANCE);
//		registry.put(CompleteOCLCSPackage.Literals.INCLUDE_CS, IncludeCSAttribution.INSTANCE);	// new IncludeAttribution()
		registry.put(CompleteOCLCSPackage.Literals.OPERATION_CONTEXT_DECL_CS, OperationContextCSAttribution.INSTANCE);
		registry.put(CompleteOCLCSPackage.Literals.PACKAGE_DECLARATION_CS, PackageDeclarationCSAttribution.INSTANCE);
		registry.put(CompleteOCLCSPackage.Literals.PROPERTY_CONTEXT_DECL_CS, PropertyContextCSAttribution.INSTANCE);
	}
}
