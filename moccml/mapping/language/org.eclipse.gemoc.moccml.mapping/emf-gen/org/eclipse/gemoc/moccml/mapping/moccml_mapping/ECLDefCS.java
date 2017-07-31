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

import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECL Def CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLDefCS()
 * @model abstract="true"
 * @generated
 */
public interface ECLDefCS extends DefPropertyCS {
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
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLDefCS_Condition()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLDefCS_Visibility()
	 * @model required="true"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // ECLDefCS
