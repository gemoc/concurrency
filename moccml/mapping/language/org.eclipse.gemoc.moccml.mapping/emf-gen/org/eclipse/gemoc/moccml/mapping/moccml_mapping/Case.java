/**
 * Copyright (c) 2010, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.gemoc.moccml.mapping.moccml_mapping;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getEventToForce <em>Event To Force</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getOn <em>On</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getKindOfFeedback <em>Kind Of Feedback</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends ExpCS {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ExpCS)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getCase_Condition()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Event To Force</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event To Force</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event To Force</em>' containment reference.
	 * @see #setEventToForce(ExpCS)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getCase_EventToForce()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getEventToForce();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getEventToForce <em>Event To Force</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Force</em>' containment reference.
	 * @see #getEventToForce()
	 * @generated
	 */
	void setEventToForce(ExpCS value);

	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference.
	 * @see #setOn(ExpCS)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getCase_On()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOn();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getOn <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' containment reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Kind Of Feedback</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Of Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Feedback</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind
	 * @see #setKindOfFeedback(FeedBackKind)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getCase_KindOfFeedback()
	 * @model required="true"
	 * @generated
	 */
	FeedBackKind getKindOfFeedback();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getKindOfFeedback <em>Kind Of Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Feedback</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind
	 * @see #getKindOfFeedback()
	 * @generated
	 */
	void setKindOfFeedback(FeedBackKind value);

} // Case
