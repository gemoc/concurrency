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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage
 * @generated
 */
public interface FeedbackFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeedbackFactory eINSTANCE = org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When</em>'.
	 * @generated
	 */
	When createWhen();

	/**
	 * Returns a new object of class '<em>Force</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force</em>'.
	 * @generated
	 */
	Force createForce();

	/**
	 * Returns a new object of class '<em>Action Finished Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Finished Condition</em>'.
	 * @generated
	 */
	ActionFinishedCondition createActionFinishedCondition();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns a new object of class '<em>Model Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Specific Event</em>'.
	 * @generated
	 */
	ModelSpecificEvent createModelSpecificEvent();

	/**
	 * Returns a new object of class '<em>Action Result Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Result Condition</em>'.
	 * @generated
	 */
	ActionResultCondition createActionResultCondition();

	/**
	 * Returns a new object of class '<em>Action Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Model</em>'.
	 * @generated
	 */
	ActionModel createActionModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeedbackPackage getFeedbackPackage();

} //FeedbackFactory
