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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Result Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionResultConditionImpl#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionResultConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionResultConditionImpl extends ConditionImpl implements ActionResultCondition {
	/**
	 * The default value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMPARISON_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected Object comparisonValue = COMPARISON_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.EQUALS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionResultConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeedbackPackage.Literals.ACTION_RESULT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getComparisonValue() {
		return comparisonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonValue(Object newComparisonValue) {
		Object oldComparisonValue = comparisonValue;
		comparisonValue = newComparisonValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.ACTION_RESULT_CONDITION__COMPARISON_VALUE, oldComparisonValue, comparisonValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.ACTION_RESULT_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeedbackPackage.ACTION_RESULT_CONDITION__COMPARISON_VALUE:
				return getComparisonValue();
			case FeedbackPackage.ACTION_RESULT_CONDITION__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeedbackPackage.ACTION_RESULT_CONDITION__COMPARISON_VALUE:
				setComparisonValue(newValue);
				return;
			case FeedbackPackage.ACTION_RESULT_CONDITION__OPERATOR:
				setOperator((ComparisonOperator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeedbackPackage.ACTION_RESULT_CONDITION__COMPARISON_VALUE:
				setComparisonValue(COMPARISON_VALUE_EDEFAULT);
				return;
			case FeedbackPackage.ACTION_RESULT_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeedbackPackage.ACTION_RESULT_CONDITION__COMPARISON_VALUE:
				return COMPARISON_VALUE_EDEFAULT == null ? comparisonValue != null : !COMPARISON_VALUE_EDEFAULT.equals(comparisonValue);
			case FeedbackPackage.ACTION_RESULT_CONDITION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comparisonValue: ");
		result.append(comparisonValue);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ActionResultConditionImpl
