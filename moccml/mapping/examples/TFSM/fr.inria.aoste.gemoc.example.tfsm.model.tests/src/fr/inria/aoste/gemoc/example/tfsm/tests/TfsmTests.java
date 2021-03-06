/**
 */
package fr.inria.aoste.gemoc.example.tfsm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tfsm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TfsmTests extends TestSuite {

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
		TestSuite suite = new TfsmTests("tfsm Tests");
		suite.addTestSuite(StateTest.class);
		suite.addTestSuite(TransitionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TfsmTests(String name) {
		super(name);
	}

} //TfsmTests
