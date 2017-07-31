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
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.When;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhenTest extends TestCase {

	/**
	 * The fixture for this When test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected When fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhenTest.class);
	}

	/**
	 * Constructs a new When test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this When test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(When fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this When test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected When getFixture() {
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
		setFixture(FeedbackFactory.eINSTANCE.createWhen());
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

} //WhenTest
