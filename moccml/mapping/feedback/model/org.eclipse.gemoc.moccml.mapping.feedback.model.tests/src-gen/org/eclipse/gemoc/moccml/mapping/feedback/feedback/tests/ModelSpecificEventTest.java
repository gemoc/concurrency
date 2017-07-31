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
package org.eclipse.gemoc.moccml.mapping.feedback.feedback.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackFactory;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Specific Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelSpecificEventTest extends TestCase {

	/**
	 * The fixture for this Model Specific Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSpecificEvent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelSpecificEventTest.class);
	}

	/**
	 * Constructs a new Model Specific Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEventTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Specific Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelSpecificEvent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Specific Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSpecificEvent getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeedbackFactory.eINSTANCE.createModelSpecificEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ModelSpecificEventTest
