/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *     ENSTA Bretagne - API update, feature enhancement and bug fix
 *******************************************************************************/
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.impl;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClassicalExpression.impl.BinaryIntegerExpressionImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.EditionExtensionPackage;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfMinusAssignement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Self Minus Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntSelfMinusAssignementImpl extends BinaryIntegerExpressionImpl implements IntSelfMinusAssignement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSelfMinusAssignementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditionExtensionPackage.Literals.INT_SELF_MINUS_ASSIGNEMENT;
	}

} //IntSelfMinusAssignementImpl
