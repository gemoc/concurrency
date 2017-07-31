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

import junit.textui.TestRunner;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Result Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionResultConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionResultConditionTest.class);
	}

	/**
	 * Constructs a new Action Result Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionResultConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action Result Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActionResultCondition getFixture() {
		return (ActionResultCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeedbackFactory.eINSTANCE.createActionResultCondition());
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

} //ActionResultConditionTest
