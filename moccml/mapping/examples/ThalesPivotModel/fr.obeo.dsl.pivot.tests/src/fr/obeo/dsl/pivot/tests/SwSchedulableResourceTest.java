/**
 */
package fr.obeo.dsl.pivot.tests;

import fr.obeo.dsl.pivot.PivotFactory;
import fr.obeo.dsl.pivot.SwSchedulableResource;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sw Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwSchedulableResourceTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwSchedulableResourceTest.class);
	}

	/**
	 * Constructs a new Sw Schedulable Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwSchedulableResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sw Schedulable Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SwSchedulableResource getFixture() {
		return (SwSchedulableResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PivotFactory.eINSTANCE.createSwSchedulableResource());
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

} //SwSchedulableResourceTest
