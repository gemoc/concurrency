/**
 * <copyright>
 *
 * Copyright (c) 2012, 2017 UNS/I3S/INRIA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Julien DeAntoni
 *
 * </copyright>
 *
 * $Id: ECL2MonikerVisitor.java, 2012/01/15 19:28:59 julien deantoni $
 */

package org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.PivotFactoryImpl;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.xtext.base.cs2as.BasicContinuation;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.base.cs2as.SingleContinuation;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

public class ECLPostOrderVisitor
	extends AbstractECLPostOrderVisitor
{

	public ECLPostOrderVisitor(CS2ASConversion context) {
		super(context);
	}

	@Override
	public Continuation<?> visitEventType(EventType object)
	{
		return new EventTypeContinuation(context, object, this);
	}

	protected static class EventTypeContinuation extends SingleContinuation<EventType>
	{
		public EventTypeContinuation(CS2ASConversion context, EventType csElement, ECLPostOrderVisitor anEclPostOrderVisitor) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
		}
		
		@Override
		public BasicContinuation<?> execute() {
			
			AnyType anyType = context.getEnvironmentFactory().getStandardLibrary().getOclAnyType();//new PivotFactoryImpl().createAnyType();
			@NonNull
			Comment c = PivotFactoryImpl.eINSTANCE.createComment();
			c.setBody("OCL_Any is extended here as event !");
			anyType.getAnnotatingComments().add(c);
//			AnyType eventType = PivotUtil.createAnyType("Event");
//			eventType.getSuperClasses().addAll(anyType.getSuperClasses());
//			eventType.getSuperClasses().add(anyType);
//			eventType.setOwningPackage(anyType.getOwningPackage());
//			eventType.setOwnedSignature(anyType.getOwnedSignature());
//			eventType.setUnspecializedElement(anyType.getUnspecializedElement());
//			eventType.setIsAbstract(anyType.isIsAbstract());
//			eventType.setIsActive(anyType.isIsActive());
//			eventType.getOwnedBehaviors().addAll(anyType.getOwnedBehaviors());
//			eventType.getOwnedOperations().addAll(anyType.getOwnedOperations());
//			eventType.getExtenders().addAll(anyType.getExtenders());
			csElement.setPivot(anyType);
	
			return null;
		}
	}
	
	
	
	@Override
	public Continuation<?> visitECLDefCS(ECLDefCS object)
	{
		return new ECLDefCSContinuation(context, object);
	}

	protected static class ECLDefCSContinuation extends SingleContinuation<ECLDefCS>
	{
		public ECLDefCSContinuation(CS2ASConversion context, ECLDefCS csElement) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
		}
		
		@Override
		public BasicContinuation<?> execute() {
			
			if (csElement.getCondition() != null){
				ExpCS exp= csElement.getCondition();
		
				ClassifierContextDeclCS csContext = ((DefPropertyCS)csElement).getOwningClassifierContextDecl();
				/*ExpressionInOCL pivotExp = PivotUtil.getExpressionInOCL((NamedElement)csContext.getPivot(), csElement.getCondition().toString());
				if(pivotExp != null){
					OCLExpression ocle = pivotExp.getBodyExpression();
					pivotExp.setBodyExpression(ocle);
					context.installPivotUsage(exp, ocle);
					context.setContextVariable(pivotExp, pivotExp.getContextVariable().getName(), pivotExp.getType());
					pivotExp.getContextVariable().setInitExpression(ocle);
					context.refreshModelElement(ExpressionInOCL.class, PivotPackage.Literals.EXPRESSION_IN_OCL,exp);
					context.installPivotUsage(exp, pivotExp);
					exp.setPivot(pivotExp);
				}*/
			}
			return null;
		}
	}

	
	@Override
	public Continuation<?> visitBlockType(BlockType object)
	{
		return new BlockTypeContinuation(context, object, this);
	}

	protected static class BlockTypeContinuation extends SingleContinuation<BlockType>
	{
		public BlockTypeContinuation(CS2ASConversion context, BlockType csElement, ECLPostOrderVisitor anEclPostOrderVisitor) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
		}
		
		@Override
		public BasicContinuation<?> execute() {
			csElement.setName("Block");
			Type pivot = PivotUtil.getPivot(Type.class, csElement);

			return null;
		}
	}
	
//	@Override
//	public Continuation<?> visitECLRelation(ECLRelation relation)
//	{
//		visitExpCS(relation);
//		return new ECLRelationContinuation(context, relation);
//	}
//
//	protected static class ECLRelationContinuation extends SingleContinuation<ECLRelation>
//	{
//		public ECLRelationContinuation(CS2ASConversion context, ECLRelation csElement) {
//			
//			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
//			
//		}
//
//		@Override
//		public BasicContinuation<?> execute() {
//			Element p = csElement.getPivot();
//			if (p == null){
//				System.out.println("ouch");
//			}else{
//				System.out.println("ahhhh");
//				//p.context.getEnvironmentFactory().getStandardLibrary().getBooleanType()	
//			}
//							
//			
//
//			
//			return null;
//		}
//	}

	
	
}