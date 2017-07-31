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
 * A representation of the model object '<em><b>ECL Block Def CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS#getEnterWhen <em>Enter When</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS#getLeaveWhen <em>Leave When</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLBlockDefCS()
 * @model
 * @generated
 */
public interface ECLBlockDefCS extends ECLDefCS {
	/**
	 * Returns the value of the '<em><b>Enter When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enter When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enter When</em>' containment reference.
	 * @see #setEnterWhen(ExpCS)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLBlockDefCS_EnterWhen()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getEnterWhen();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS#getEnterWhen <em>Enter When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enter When</em>' containment reference.
	 * @see #getEnterWhen()
	 * @generated
	 */
	void setEnterWhen(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Leave When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leave When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leave When</em>' containment reference.
	 * @see #setLeaveWhen(ExpCS)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLBlockDefCS_LeaveWhen()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getLeaveWhen();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS#getLeaveWhen <em>Leave When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leave When</em>' containment reference.
	 * @see #getLeaveWhen()
	 * @generated
	 */
	void setLeaveWhen(ExpCS value);

} // ECLBlockDefCS
