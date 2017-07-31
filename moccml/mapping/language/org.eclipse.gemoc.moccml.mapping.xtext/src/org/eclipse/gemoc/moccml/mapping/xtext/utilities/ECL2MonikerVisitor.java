/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.moccml.mapping.xtext.utilities;
///**
// * <copyright>
// *
// * Copyright (c) 2012 UNS/I3S/INRIA
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     Julien DeAntoni
// *
// * </copyright>
// *
// * $Id: ECL2MonikerVisitor.java, 2012/01/15 19:28:59 julien deantoni $
// */
//package org.eclipse.gemoc.moccml.mapping.xtext.utilities;
//
//import org.eclipse.ocl.examples.pivot.PivotConstants;
//import org.eclipse.ocl.examples.xtext.base.basecs.util.BaseCSVisitor;
//import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
//import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
//import org.eclipse.ocl.examples.xtext.completeocl.util.CompleteOCLCSVisitor;
//import org.eclipse.ocl.examples.xtext.completeocl.utilities.CompleteOCLCS2MonikerVisitor;
//import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
//
//import org.eclipse.gemoc.moccml.mapping.ECLExpression;
//import org.eclipse.gemoc.moccml.mapping.ECLPackage;
//import org.eclipse.gemoc.moccml.mapping.ImportStatement;
//import org.eclipse.gemoc.moccml.mapping.ECLRelation;
//import org.eclipse.gemoc.moccml.mapping.util.AbstractExtendingDelegatingECLVisitor;
//
//public class ECL2MonikerVisitor
//	extends AbstractExtendingDelegatingECLVisitor<Boolean, CS2Moniker, CompleteOCLCSVisitor<Boolean>>
//	implements PivotConstants
//{	
//	private static final class Factory implements CS2Moniker.Factory
//	{
//		private Factory() {
//			CompleteOCLCS2MonikerVisitor.FACTORY.getClass();
//			CS2Moniker.addFactory(ECLPackage.eINSTANCE, this);
//			//roleNames.put(EclPackage.Literals.RELATION__TYPE, "CCSLRelation");
//		}
//		
//		public BaseCSVisitor<?> create(CS2Moniker context) {
//			return new ECL2MonikerVisitor(context);
//		}
//
//	}
//
//	public static CS2Moniker.Factory FACTORY = new Factory();
//
//	@SuppressWarnings("unchecked")
//	public ECL2MonikerVisitor(CS2Moniker context) {
//		super((CompleteOCLCSVisitor<Boolean>) context.getVisitor(CompleteOCLCSTPackage.eINSTANCE), context);
//	}
//
//
//	@Override
//	public Boolean visitECLRelation(ECLRelation relation)
//	{
//			for (ExpCS param : relation.getParameters())
//			{
//				context.appendElementCS(param);	
//			}
//			return null;
//		
//	}
//
//	@Override
//	public Boolean visitImportStatement(ImportStatement importStatement)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Boolean visitECLExpression(ECLExpression eclExpression) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
