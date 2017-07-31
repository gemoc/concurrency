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
package org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

public class ECLContainmentVisitor extends AbstractECLContainmentVisitor
{


	public ECLContainmentVisitor(CS2ASConversion context) {
		super(context);
	}


	
	
	@Override
	public Continuation<?> visitECLDocument(ECLDocument object) {
		Continuation<?> cont = visitCompleteOCLDocumentCS((CompleteOCLDocumentCS)object);
		return cont;
	}
	
	@Override
	public Continuation<?> visitDSAFeedBack(DSAFeedback dsaFeedback) {
	
		return null;
	}

	@Override
	public Continuation<?> visitCase(Case itsCase) {

		return null;
	}	
	@Override
	public Continuation<?> visitECLEventDefCS(ECLEventDefCS object) {
		@NonNull Property contextProperty = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, object);
		contextProperty.setIsDerived(true);
		contextProperty.setIsReadOnly(true);
		contextProperty.setIsTransient(true);
		contextProperty.setIsVolatile(true);
		contextProperty.setIsResolveProxies(false);
		ExpressionInOCL pivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getOwnedSpecification());
		contextProperty.setOwnedExpression(pivotSpecification);
		
		
		
//		Property contextProperty = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, object);
//		ClassifierContextDeclCS csClassifierContextDecl = object.getOwningClassifierContextDecl();
//		Type modelClassifier = csClassifierContextDecl.getReferredClass();
//		if (modelClassifier != null) {
//			context.refreshList(csClassifierContextDecl.getOwnedProperties(), contextProperties);
//			registerProperty(modelClassifier, contextProperty);
//		}
//		contextProperty.setIsDerived(true);
//		contextProperty.setIsReadOnly(true);
//		contextProperty.setIsTransient(true);
//		contextProperty.setIsVolatile(true);
//		contextProperty.setIsResolveProxies(false);
//		ExpressionInOCL pivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getSpecification());
//		contextProperty.setDefaultExpression(pivotSpecification);		
		
		if (object instanceof ECLEventDefCS){
			visitECLEventContainment((ECLEventDefCS) object);
		}
//		if (object instanceof ECLBlockDefCS){
//			visitECLBlockContainment((ECLBlockDefCS) object);
//		}
		
		return null;
	}

	@Override
	public Continuation<?> visitECLBlockDefCS(ECLBlockDefCS object) {
		@NonNull Property contextProperty = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, object);
		contextProperty.setIsDerived(true);
		contextProperty.setIsReadOnly(true);
		contextProperty.setIsTransient(true);
		contextProperty.setIsVolatile(true);
		contextProperty.setIsResolveProxies(false);
		ExpressionInOCL pivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getOwnedSpecification());
		contextProperty.setOwnedExpression(pivotSpecification);
		
		
		if (object instanceof ECLBlockDefCS){
			visitECLBlockContainment((ECLBlockDefCS) object);
		}
		
		return null;
	}


	private void visitECLEventContainment(ECLEventDefCS object) {
		if (object.getDsaResultName() != null && object.getFeedback() != null){
			
			Property resultProperty = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, object.getFeedback());
			resultProperty.setIsDerived(true);
			resultProperty.setIsReadOnly(true);
			resultProperty.setIsTransient(true);
			resultProperty.setIsVolatile(true);
			resultProperty.setIsResolveProxies(false);
			resultProperty.setName(object.getDsaResultName());

//			ClassifierContextDeclCS cs_resultClassifierContextDecl = object.getOwningClassifierContextDecl();
//			Type resultModelClassifier = cs_resultClassifierContextDecl.getClassifier();
//			if (resultModelClassifier != null) {
//				registerProperty(resultModelClassifier, resultProperty);
//			}
			
			context.refreshName(resultProperty, object.getDsaResultName());
			context.installPivotUsage(object.getFeedback(), resultProperty);
			
//			ExpressionInOCL resultPivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getDsaResultName());
//
//			resultProperty.setDefaultExpression(pivotSpecification);	
		}
	}
	
	private void visitECLBlockContainment(ECLBlockDefCS object) {
//		if (object.getEnterWhen() != null){
//			ExpressionInOCL enterWhenpivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getEnterWhen());
//			context.installPivotUsage(object.getEnterWhen(), enterWhenpivotSpecification);
//			context.refreshName(enterWhenpivotSpecification, object.getName()+"enterWhen");
//			context.installPivotUsage(object.getEnterWhen(), enterWhenpivotSpecification);		
//		}
//		if (object.getLeaveWhen() != null){
//			ExpressionInOCL leaveWhenpivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getLeaveWhen());
//			context.installPivotUsage(object.getEnterWhen(), leaveWhenpivotSpecification);
//			context.refreshName(leaveWhenpivotSpecification, object.getName()+"enterWhen");
//			context.installPivotUsage(object.getEnterWhen(), leaveWhenpivotSpecification);		
//		}
	}
	
	@Override
	public Continuation<?> visitEventType(EventType csElement) {

		return null;
		
	}
	

}
