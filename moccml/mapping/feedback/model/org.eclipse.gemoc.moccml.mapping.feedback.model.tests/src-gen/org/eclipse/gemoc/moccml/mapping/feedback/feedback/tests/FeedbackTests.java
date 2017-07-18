/**
 */
package org.eclipse.gemoc.moccml.mapping.feedback.feedback.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>feedback</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new FeedbackTests("feedback Tests");
		suite.addTestSuite(ModelSpecificEventTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackTests(String name) {
		super(name);
	}

} //FeedbackTests