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
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;


/**
 * An AbstractDelegatingECLVisitor delegates all visits.
 */
public abstract class AbstractDelegatingECLVisitor<R, C, D extends ECLVisitor<R>>
	extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractDelegatingCompleteOCLCSVisitor<R, C, D >
	implements ECLVisitor<R>
{
	protected AbstractDelegatingECLVisitor( D delegate,  C context) {
        super(delegate, context);
    }

	@Override
	public  R visiting( org.eclipse.ocl.xtext.basecs.util.VisitableCS visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public  R visitClassifierContextDeclCS( org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS object) {
		return delegate.visitClassifierContextDeclCS(object);
	}

	public  R visitCompleteOCLDocumentCS( org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS object) {
		return delegate.visitCompleteOCLDocumentCS(object);
	}

	public  R visitContextDeclCS( org.eclipse.ocl.xtext.completeoclcs.ContextDeclCS object) {
		return delegate.visitContextDeclCS(object);
	}
/**
 * new
 */
	public R visitContextSpecificationCS(org.eclipse.ocl.xtext.completeoclcs.PropertyContextDeclCS object) {
			return delegate.visitPropertyContextDeclCS(object);
	}
	
	public R visitEventType(EventType object) {
		return delegate.visitTypedRefCS(object);
	}
	
	public R visitBlockType(BlockType object) {
		return delegate.visitTypedRefCS(object);
	}
	
	public  R visitDefCS( org.eclipse.ocl.xtext.completeoclcs.DefCS object) {
		return delegate.visitDefCS(object);
	}

	public  R visitECLDefCS( ECLDefCS object) {
		return delegate.visitDefCS(object);
	}
	
	public  R visitECLEventDefCS( ECLEventDefCS object) {
		return delegate.visitDefCS(object);
	}
	
	public  R visitECLBlockDefCS( ECLBlockDefCS object) {
		return delegate.visitDefCS(object);
	}
	
	public  R visitDefOperationCS( org.eclipse.ocl.xtext.completeoclcs.DefOperationCS object) {
		return delegate.visitDefOperationCS(object);
	}

	public  R visitDefPropertyCS( org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS object) {
		return delegate.visitDefPropertyCS(object);
	}

	public  R visitFeatureContextDeclCS( org.eclipse.ocl.xtext.completeoclcs.FeatureContextDeclCS object) {
		return delegate.visitFeatureContextDeclCS(object);
	}

//	public  R visitIncludeCS( org.eclipse.ocl.xtext.completeoclcs.IncludeCS object) {
//		return delegate.visitIncludeCS(object);
//	}

	public  R visitOCLMessageArgCS( org.eclipse.ocl.xtext.completeoclcs.OCLMessageArgCS object) {
		return delegate.visitOCLMessageArgCS(object);
	}

	public  R visitOperationContextDeclCS( org.eclipse.ocl.xtext.completeoclcs.OperationContextDeclCS object) {
		return delegate.visitOperationContextDeclCS(object);
	}

	public  R visitPackageDeclarationCS( org.eclipse.ocl.xtext.completeoclcs.PackageDeclarationCS object) {
		return delegate.visitPackageDeclarationCS(object);
	}

	public  R visitPathNameDeclCS( org.eclipse.ocl.xtext.completeoclcs.PathNameDeclCS object) {
		return delegate.visitPathNameDeclCS(object);
	}

	public  R visitPropertyContextDeclCS( org.eclipse.ocl.xtext.completeoclcs.PropertyContextDeclCS object) {
		return delegate.visitPropertyContextDeclCS(object);
	}
}