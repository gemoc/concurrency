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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getWhenStatements <em>When Statements</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getImportStatements <em>Import Statements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getActionModel()
 * @model
 * @generated
 */
public interface ActionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getActionModel_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelSpecificEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>When Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.When}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Statements</em>' containment reference list.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getActionModel_WhenStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<When> getWhenStatements();

	/**
	 * Returns the value of the '<em><b>Import Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Statements</em>' containment reference list.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#getActionModel_ImportStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportStatement> getImportStatements();

} // ActionModel
