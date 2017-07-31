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
 * A representation of the model object '<em><b>Action Result Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getActionResultCondition()
 * @model
 * @generated
 */
public interface ActionResultCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Value</em>' attribute.
	 * @see #setComparisonValue(Object)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getActionResultCondition_ComparisonValue()
	 * @model required="true"
	 * @generated
	 */
	Object getComparisonValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition#getComparisonValue <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Value</em>' attribute.
	 * @see #getComparisonValue()
	 * @generated
	 */
	void setComparisonValue(Object value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getActionResultCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

} // ActionResultCondition
