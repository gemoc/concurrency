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
 * A representation of the model object '<em><b>ECL Event Def CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getFuture <em>Future</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getDsaResultName <em>Dsa Result Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLEventDefCS()
 * @model
 * @generated
 */
public interface ECLEventDefCS extends ECLDefCS {
	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' containment reference.
	 * @see #setFeedback(DSAFeedback)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLEventDefCS_Feedback()
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	DSAFeedback getFeedback();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getFeedback <em>Feedback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' containment reference.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(DSAFeedback value);

	/**
	 * Returns the value of the '<em><b>Future</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Future</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Future</em>' containment reference.
	 * @see #setFuture(ExpCS)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLEventDefCS_Future()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getFuture();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getFuture <em>Future</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Future</em>' containment reference.
	 * @see #getFuture()
	 * @generated
	 */
	void setFuture(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Dsa Result Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsa Result Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsa Result Name</em>' attribute.
	 * @see #setDsaResultName(String)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLEventDefCS_DsaResultName()
	 * @model
	 * @generated
	 */
	String getDsaResultName();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getDsaResultName <em>Dsa Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsa Result Name</em>' attribute.
	 * @see #getDsaResultName()
	 * @generated
	 */
	void setDsaResultName(String value);

} // ECLEventDefCS
