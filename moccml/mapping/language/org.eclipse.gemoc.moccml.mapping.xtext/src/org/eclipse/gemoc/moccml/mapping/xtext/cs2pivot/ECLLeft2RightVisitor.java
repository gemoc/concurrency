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
 * $Id: ECLLeft2RightVisitor.java,v 1.10 2011/05/23 05:51:25 ewillink Exp $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.StringLiteralExp;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.utilities.MetamodelManager;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.RelationDeclaration;

public class ECLLeft2RightVisitor
	extends AbstractECLLeft2RightVisitor
{
	protected final MetamodelManager metamodelManager;

	public ECLLeft2RightVisitor(CS2ASConversion context) {
		super(context);
		metamodelManager = context.getMetamodelManager();

	}


	@Override
	public Element visitEventLiteralExp(EventLiteralExp eventLiteralExp)
	{
		StringLiteralExp expression = context.refreshModelElement(StringLiteralExp.class, PivotPackage.Literals.STRING_LITERAL_EXP, eventLiteralExp);
		expression.setName(eventLiteralExp.getValue().getLiteral());
		expression.setStringSymbol(eventLiteralExp.getValue().getLiteral());
		context.installPivotUsage(eventLiteralExp, expression);
		//super.visitEventLiteralExp(eventLiteralExpImpl);
		return expression;
	}

	

	@Override
	public Element visitECLRelation(ECLRelation relation)
	{	
			ExpCS csExpression = relation;
			OperationCallExp pivotSpecification = context.refreshModelElement(OperationCallExp.class,
					PivotPackage.Literals.OPERATION_CALL_EXP, csExpression);
			
			
			Type type = context.getEnvironmentFactory().getStandardLibrary().getBooleanType();
			pivotSpecification.setType(type);
			//pivotSpecification.setBooleanSymbol(true);
			//EcoreUtil2.resolveLazyCrossReferences(relation.eResource(), null);
			RelationDeclaration rd = relation.getType();
			if(rd.eIsProxy()){
				 rd = (RelationDeclaration) EcoreUtil.resolve(relation.getType(), (ResourceSet)null);
			}
			pivotSpecification.setName("ECL_" +rd.getName());
			pivotSpecification.getOwnedArguments().clear();
			Operation rop = PivotFactory.eINSTANCE.createOperation();
			pivotSpecification.setReferredOperation(rop);
			rop.setName(pivotSpecification.getName());
			rop.setType(pivotSpecification.getType());
			((PrimitiveType) type).getOwnedOperations().add(rop);
			if (relation.getParameters().size() == 1){
				//most often a collection
				ExpCS param = relation.getParameters().get(0);
				Parameter p = PivotFactory.eINSTANCE.createParameter();
		
				ValueUtil.integerValueOf(0);
				p.setType(((TypedElement)visit(param)).getType());
				p.setName("anEventCollection");
				rop.getOwnedParameters().add(p);
				OCLExpression pivot = context.visitLeft2Right(OCLExpression.class, param);
				pivotSpecification.getOwnedArguments().add(pivot);
			}else{
				for (ExpCS param : relation.getParameters())
				{
					Parameter p = PivotFactory.eINSTANCE.createParameter();
					p.setType(((TypedElement)visit(param)).getType());
					rop.getOwnedParameters().add(p);
					
					OCLExpression pivot = context.visitLeft2Right(OCLExpression.class, param);
					pivotSpecification.getOwnedArguments().add(pivot);
					context.setType(pivot, context.getEnvironmentFactory().getStandardLibrary().getOclAnyType(), false);
					context.installPivotUsage(param, pivot);
				}
			}
		
		context.setReferredOperation(pivotSpecification,rop);
		context.installPivotUsage(relation, pivotSpecification);
		return pivotSpecification;
	}

	

	
	@Override
	public Element visitECLExpression(ECLExpression eclExpression) {
		ExpCS csExpression = eclExpression;
		OperationCallExp pivotSpecification = context.refreshModelElement(OperationCallExp.class,
				PivotPackage.Literals.OPERATION_CALL_EXP, csExpression);
		Type type = context.getEnvironmentFactory().getStandardLibrary().getOclAnyType();
		pivotSpecification.setType(type);
		//pivotSpecification.setBooleanSymbol(true);
		//EcoreUtil.resolveAll(eclExpression.eResource());
		pivotSpecification.setName("ECL_" +eclExpression.getType().getName());
		
		pivotSpecification.getOwnedArguments().clear();
		Operation rop = PivotFactory.eINSTANCE.createOperation();
		pivotSpecification.setReferredOperation(rop);
		rop.setName(pivotSpecification.getName());
		rop.setType(pivotSpecification.getType());
		((AnyType) type).getOwnedOperations().add(rop);
		if (eclExpression.getParameters().size() == 1){
			//most often a collection
			ExpCS param = eclExpression.getParameters().get(0);
			Parameter p = PivotFactory.eINSTANCE.createParameter();
			p.setType(((TypedElement)visit(param)).getType());
			rop.getOwnedParameters().add(p);
			OCLExpression pivot = context.visitLeft2Right(OCLExpression.class, param);
			pivotSpecification.getOwnedArguments().add(pivot);
		}else{
			for (ExpCS param : eclExpression.getParameters())
			{
				Parameter p = PivotFactory.eINSTANCE.createParameter();
				p.setType(((TypedElement)visit(param)).getType());
				rop.getOwnedParameters().add(p);
				OCLExpression pivot = context.visitLeft2Right(OCLExpression.class, param);
				pivotSpecification.getOwnedArguments().add(pivot);
			}
		}

	context.installPivotUsage(eclExpression, pivotSpecification);
	return pivotSpecification;
	}
	
	@Override
	public Element visitECLDefCS(ECLDefCS eclDefCS){

//		if(eclDefCS.getCondition()!=null){
//		StringLiteralExp expression = context.refreshModelElement(StringLiteralExp.class, PivotPackage.Literals.STRING_LITERAL_EXP, eclDefCS.getCondition());
//		expression.setName(eclDefCS.getName()+"_cond");
//		expression.setStringSymbol(eclDefCS.getCondition().toString());
//		context.installPivotUsage(eclDefCS, expression);
//		return expression;
//		}
	
		Element fromDefCS= PivotUtil.getPivot(OCLExpression.class, eclDefCS);
	//	OCLExpression dsaFeedBack = context.visitLeft2Right(OCLExpression.class, eclDefCS.getFeedback());
//		fromDefCS.allOwnedElements().add(condElem);
		return fromDefCS;
		
	}
	
	@Override
	public Element visitEventType(EventType object){

		return null;
	}
	
//	@Override
//	public Element visitDSAFeedBack(DSAFeedback object){
//		StringLiteralExp expression = context.refreshModelElement(StringLiteralExp.class, PivotPackage.Literals.STRING_LITERAL_EXP, object);
//		expression.setName(object.getOwner().toString()+"_switch");
//		expression.setStringSymbol(object.getOwner().toString()+"_switch");
//		context.installPivotUsage(object, expression);
//		//super.visitEventLiteralExp(eventLiteralExpImpl);
//		return expression;
//	}

}