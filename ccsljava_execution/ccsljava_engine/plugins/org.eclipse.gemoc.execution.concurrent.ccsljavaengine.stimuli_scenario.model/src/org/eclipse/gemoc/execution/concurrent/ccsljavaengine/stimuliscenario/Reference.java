/*******************************************************************************
 * Copyright (c) 2017 INRIA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     INRIA - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.Reference#getFragment <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.Reference#getStartStep <em>Start Step</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.ScenarioPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference.
	 * @see #setFragment(Fragment)
	 * @see org.eclipse.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.ScenarioPackage#getReference_Fragment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fragment getFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.Reference#getFragment <em>Fragment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' containment reference.
	 * @see #getFragment()
	 * @generated
	 */
	void setFragment(Fragment value);

	/**
	 * Returns the value of the '<em><b>Start Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Step</em>' attribute.
	 * @see #setStartStep(int)
	 * @see org.eclipse.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.ScenarioPackage#getReference_StartStep()
	 * @model
	 * @generated
	 */
	int getStartStep();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.execution.concurrent.ccsljavaengine.stimuliscenario.Reference#getStartStep <em>Start Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Step</em>' attribute.
	 * @see #getStartStep()
	 * @generated
	 */
	void setStartStep(int value);

} // Reference
