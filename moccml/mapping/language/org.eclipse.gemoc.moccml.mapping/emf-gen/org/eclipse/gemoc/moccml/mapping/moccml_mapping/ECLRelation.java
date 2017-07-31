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

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.RelationDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECL Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#isIsAnAssertion <em>Is An Assertion</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLRelation()
 * @model
 * @generated
 */
public interface ECLRelation extends ExpCS {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RelationDeclaration)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLRelation_Type()
	 * @model required="true"
	 * @generated
	 */
	RelationDeclaration getType();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationDeclaration value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLRelation_Parameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExpCS> getParameters();

	/**
	 * Returns the value of the '<em><b>Is An Assertion</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is An Assertion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is An Assertion</em>' attribute.
	 * @see #setIsAnAssertion(boolean)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLRelation_IsAnAssertion()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAnAssertion();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#isIsAnAssertion <em>Is An Assertion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is An Assertion</em>' attribute.
	 * @see #isIsAnAssertion()
	 * @generated
	 */
	void setIsAnAssertion(boolean value);

} // ECLRelation
