/**
 */
package fr.obeo.dsl.pivot.tests;

import fr.obeo.dsl.pivot.BusComm;
import fr.obeo.dsl.pivot.PivotFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Comm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusCommTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusCommTest.class);
	}

	/**
	 * Constructs a new Bus Comm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusCommTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Comm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusComm getFixture() {
		return (BusComm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PivotFactory.eINSTANCE.createBusComm());
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

} //BusCommTest
