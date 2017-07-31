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
 * $Id: ECLPreOrderVisitor.java,v 1.11 2011/05/20 15:26:50 ewillink Exp $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot;

import java.util.ArrayList;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.DataType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.PivotFactoryImpl;
import org.eclipse.ocl.pivot.utilities.MetamodelManager;
import org.eclipse.ocl.xtext.base.cs2as.BasicContinuation;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.base.cs2as.SingleContinuation;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;

public class ECLPreOrderVisitor
	extends AbstractECLPreOrderVisitor
{

	protected final MetamodelManager metamodelManager;
	
		public ECLPreOrderVisitor(CS2ASConversion context) {
			super(context);
			metamodelManager = context.getEnvironmentFactory().getMetamodelManager();
		}


	@Override
	public Continuation<?> visitEventType(EventType object)
	{
		return new EventTypeContinuation(context, object);
	}

	protected static class EventTypeContinuation extends SingleContinuation<EventType>
	{
		public EventTypeContinuation(CS2ASConversion context, EventType csElement) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
			
		}

		@Override
		public BasicContinuation<?> execute() {
			csElement.setName("Event");
//			AnyType type=null;
//			for (Type t : context.getEnvironmentFactory().getMetamodelManager().getGlobalTypes()){
//					if (t.getName().compareTo("Event") == 0){
//						type = (AnyType) t;
//					}
//			}
//			if(type==null){
				@NonNull
				AnyType anyType = context.getEnvironmentFactory().getStandardLibrary().getOclAnyType();//new PivotFactoryImpl().createAnyType();
				@NonNull
				Comment c = PivotFactoryImpl.eINSTANCE.createComment();
				c.setBody("OCL_Any is extended here as event !");
				anyType.getAnnotatingComments().add(c);				
				csElement.setPivot(anyType);
//				@NonNull
//				AnyType eventType = PivotUtil.createAnyType("Event");
////				eventType.getSuperClasses().addAll(anyType.getSuperClasses());
////				eventType.getSuperClasses().add(anyType);
//				CompleteInheritance ci = context.getMetamodelManager().getInheritance(anyType);
//				ci.getFragments().
//				eventType.setOwningPackage(anyType.getOwningPackage());
//				eventType.setOwnedSignature(anyType.getOwnedSignature());
//				eventType.setUnspecializedElement(anyType.getUnspecializedElement());
//				eventType.setIsAbstract(anyType.isIsAbstract());
//				eventType.setIsActive(anyType.isIsActive());
//				eventType.getOwnedBehaviors().addAll(anyType.getOwnedBehaviors());
//				eventType.getOwnedOperations().addAll(anyType.getOwnedOperations());
//				eventType.getExtenders().addAll(anyType.getExtenders());
//				csElement.setPivot(eventType);


				//				//eventType.setBehavioralClass(context.getEnvironmentFactory().getStandardLibrary().getOclAnyType());
////				ArrayList<Type> types = new ArrayList<Type>();
////				types.add(eventType);
//				context.getEnvironmentFactory().getStandardLibrary().getOclAnyType().getOwningPackage().getOwnedClasses().add(eventType);
			//	context.getEnvironmentFactory().getMetamodelManager().addGlobalTypes(types);
				
				
				
			//	AnyType eventType = context.getEnvironmentFactory().getStandardLibrary().getOclAnyType();//new PivotFactoryImpl().createAnyType();
				//eventType.setName("Event");
//				csElement.setPivot(eventType);
//				context.installPivotReference(csElement, eventType, BaseCSPackage.Literals.TYPED_ELEMENT_CS__OWNED_TYPE);//PIVOTABLE_ELEMENT_CS__PIVOT);
//			}else{
//				context.installPivotReference(csElement, type, BaseCSPackage.Literals.TYPED_ELEMENT_CS__OWNED_TYPE);//PIVOTABLE_ELEMENT_CS__PIVOT);
//			}
			
			return null;
		}
	}
	
	@Override
	public Continuation<?> visitBlockType(BlockType object)
	{
		return new BlockTypeContinuation(context, object);
	}

	protected static class BlockTypeContinuation extends SingleContinuation<BlockType>
	{
		public BlockTypeContinuation(CS2ASConversion context, BlockType csElement) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
		}

		@Override
		public BasicContinuation<?> execute() {
			Type type=null;
			type = context.getEnvironmentFactory().getMetamodelManager().getOclType("Block");
			if(type==null){
				@NonNull
				DataType eventType = new PivotFactoryImpl().createDataType();
				eventType.setName("Block");
				ArrayList<Type> types = new ArrayList<Type>();
				types.add(eventType);
				context.getEnvironmentFactory().getMetamodelManager().addGlobalTypes(types);
				context.installPivotReference(csElement, eventType, BaseCSPackage.Literals.TYPED_ELEMENT_CS__OWNED_TYPE);//PIVOTABLE_ELEMENT_CS__PIVOT);
			}else{
				context.installPivotReference(csElement, type, BaseCSPackage.Literals.TYPED_ELEMENT_CS__OWNED_TYPE);//PIVOTABLE_ELEMENT_CS__PIVOT);
			}
			return null;
		}
	}
	
	@Override
	public Continuation<?> visitECLDocument(ECLDocument object) {
		
		Continuation<?> continuation = super.visitCompleteOCLDocumentCS(object);
		return continuation;
	}

	@Override
	public Continuation<?> visitECLDefCS(ECLDefCS object) {
		
//		Continuation<?> continuation = super.visitExpCS(object.getCondition());
		return null;//continuation;
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