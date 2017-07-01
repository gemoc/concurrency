/**
 */
package fr.inria.aoste.gemoc.example.tfsm.tests;

import fr.inria.aoste.gemoc.example.tfsm.TfsmFactory;
import fr.inria.aoste.gemoc.example.tfsm.Transition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.Transition#fire() <em>Fire</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TransitionTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransitionTest.class);
	}

	/**
	 * Constructs a new Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Transition getFixture() {
		return (Transition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TfsmFactory.eINSTANCE.createTransition());
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

	/**
	 * Tests the '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#fire() <em>Fire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#fire()
	 * @generated
	 */
	public void testFire() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TransitionTest
