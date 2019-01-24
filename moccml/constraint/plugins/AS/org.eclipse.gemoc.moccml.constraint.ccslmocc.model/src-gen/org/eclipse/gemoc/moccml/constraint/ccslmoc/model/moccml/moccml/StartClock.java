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
package org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.BindableEntity;

import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.AbstractAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.StartClock#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.CcslmoccPackage#getStartClock()
 * @model
 * @generated
 */
public interface StartClock extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(BindableEntity)
	 * @see org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.CcslmoccPackage#getStartClock_Clock()
	 * @model keys="name" required="true"
	 * @generated
	 */
	BindableEntity getClock();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.StartClock#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(BindableEntity value);

} // StartClock
