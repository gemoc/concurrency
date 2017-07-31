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

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionFinishedCondition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Finished Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionFinishedConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionFinishedConditionTest.class);
	}

	/**
	 * Constructs a new Action Finished Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionFinishedConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action Finished Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActionFinishedCondition getFixture() {
		return (ActionFinishedCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeedbackFactory.eINSTANCE.createActionFinishedCondition());
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

} //ActionFinishedConditionTest
