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
/**
 */
package org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.Condition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeedbackPackage.Literals.CONDITION;
	}

} //ConditionImpl
