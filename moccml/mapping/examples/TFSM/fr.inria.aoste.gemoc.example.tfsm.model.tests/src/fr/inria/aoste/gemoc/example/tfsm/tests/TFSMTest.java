/**
 */
package fr.inria.aoste.gemoc.example.tfsm.tests;

import fr.inria.aoste.gemoc.example.tfsm.TFSM;
import fr.inria.aoste.gemoc.example.tfsm.TfsmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TFSM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TFSMTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TFSMTest.class);
	}

	/**
	 * Constructs a new TFSM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFSMTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TFSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TFSM getFixture() {
		return (TFSM)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TfsmFactory.eINSTANCE.createTFSM());
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

} //TFSMTest
