/**
 * Copyright (c) 2012-2017 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.FSMModelFactory;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.Guard;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuardTest extends AbstractGuardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GuardTest.class);
	}

	/**
	 * Constructs a new Guard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Guard getFixture() {
		return (Guard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FSMModelFactory.eINSTANCE.createGuard());
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

} //GuardTest
