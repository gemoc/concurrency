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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getEventToBeForced <em>Event To Be Forced</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getOnTrigger <em>On Trigger</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getUntilTrigger <em>Until Trigger</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getForce()
 * @model
 * @generated
 */
public interface Force extends Action {
	/**
	 * Returns the value of the '<em><b>Event To Be Forced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event To Be Forced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event To Be Forced</em>' reference.
	 * @see #setEventToBeForced(ModelSpecificEvent)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getForce_EventToBeForced()
	 * @model required="true"
	 * @generated
	 */
	ModelSpecificEvent getEventToBeForced();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getEventToBeForced <em>Event To Be Forced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Be Forced</em>' reference.
	 * @see #getEventToBeForced()
	 * @generated
	 */
	void setEventToBeForced(ModelSpecificEvent value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind
	 * @see #setKind(ForceKind)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getForce_Kind()
	 * @model required="true"
	 * @generated
	 */
	ForceKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ForceKind value);

	/**
	 * Returns the value of the '<em><b>On Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Trigger</em>' reference.
	 * @see #setOnTrigger(ModelSpecificEvent)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getForce_OnTrigger()
	 * @model
	 * @generated
	 */
	ModelSpecificEvent getOnTrigger();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getOnTrigger <em>On Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Trigger</em>' reference.
	 * @see #getOnTrigger()
	 * @generated
	 */
	void setOnTrigger(ModelSpecificEvent value);

	/**
	 * Returns the value of the '<em><b>Until Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Trigger</em>' reference.
	 * @see #setUntilTrigger(ModelSpecificEvent)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getForce_UntilTrigger()
	 * @model
	 * @generated
	 */
	ModelSpecificEvent getUntilTrigger();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getUntilTrigger <em>Until Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Trigger</em>' reference.
	 * @see #getUntilTrigger()
	 * @generated
	 */
	void setUntilTrigger(ModelSpecificEvent value);

} // Force
