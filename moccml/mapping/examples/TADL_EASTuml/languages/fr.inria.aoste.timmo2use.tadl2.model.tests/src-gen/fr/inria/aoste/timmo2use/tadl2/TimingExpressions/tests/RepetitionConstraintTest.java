/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.tests;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Repetition Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepetitionConstraintTest extends TimingConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RepetitionConstraintTest.class);
	}

	/**
	 * Constructs a new Repetition Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepetitionConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Repetition Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RepetitionConstraint getFixture() {
		return (RepetitionConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingExpressionsFactory.eINSTANCE.createRepetitionConstraint());
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

} //RepetitionConstraintTest
