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
package	org.eclipse.gemoc.moccml.mapping.util;

/**
 * An AbstractNullECLVisitor provides a default implementation for each
 * visitXxx method that returns null.
 */
public abstract class AbstractNullECLVisitor<R, C>
	extends AbstractECLVisitor<R, C>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractNullECLVisitor(C context) {
	    super(context);
	}	

//	public R visitBodyCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.BodyCS object) {
//		return null;
//	}
//
//	public R visitClassifierContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS object) {
//		return null;
//	}
//
//	public R visitCompleteOCLDocumentCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS object) {
//		return null;
//	}
//
//	public R visitContextConstraintCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS object) {
//		return null;
//	}
//
//	public R visitContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS object) {
//		return null;
//	}
//
//	public R visitContextSpecificationCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextSpecificationCS object) {
//		return null;
//	}
//
//	public R visitDefCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS object) {
//		return null;
//	}
//
//	public R visitDerCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DerCS object) {
//		return null;
//	}
//
//	public R visitFeatureContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.FeatureContextDeclCS object) {
//		return null;
//	}
//
//	public R visitIncludeCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS object) {
//		return null;
//	}
//
//	public R visitInitCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InitCS object) {
//		return null;
//	}
//
//	public R visitInvCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InvCS object) {
//		return null;
//	}
//
//	public R visitOclMessageArgCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OclMessageArgCS object) {
//		return null;
//	}
//
//	public R visitOperationContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS object) {
//		return null;
//	}
//
//	public R visitPackageDeclarationCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS object) {
//		return null;
//	}
//
//	public R visitPostCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS object) {
//		return null;
//	}
//
//	public R visitPreCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreCS object) {
//		return null;
//	}
//
//	public R visitPreExpCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreExpCS object) {
//		return null;
//	}
//
//	public R visitPropertyContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS object) {
//		return null;
//	}
}
