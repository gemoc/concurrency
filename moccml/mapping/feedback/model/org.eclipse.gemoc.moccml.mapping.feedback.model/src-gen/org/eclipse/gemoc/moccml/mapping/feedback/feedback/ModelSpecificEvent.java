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
package org.eclipse.gemoc.moccml.mapping.feedback.feedback;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Specific Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getCaller <em>Caller</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getSolverEvent <em>Solver Event</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getModelSpecificEvent()
 * @model
 * @generated
 */
public interface ModelSpecificEvent extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller</em>' reference.
	 * @see #setCaller(EObject)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getModelSpecificEvent_Caller()
	 * @model
	 * @generated
	 */
	EObject getCaller();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getCaller <em>Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller</em>' reference.
	 * @see #getCaller()
	 * @generated
	 */
	void setCaller(EObject value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(EOperation)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getModelSpecificEvent_Action()
	 * @model
	 * @generated
	 */
	EOperation getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(EOperation value);

	/**
	 * Returns the value of the '<em><b>Solver Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Event</em>' reference.
	 * @see #setSolverEvent(EObject)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getModelSpecificEvent_SolverEvent()
	 * @model
	 * @generated
	 */
	EObject getSolverEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getSolverEvent <em>Solver Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Event</em>' reference.
	 * @see #getSolverEvent()
	 * @generated
	 */
	void setSolverEvent(EObject value);

} // ModelSpecificEvent
