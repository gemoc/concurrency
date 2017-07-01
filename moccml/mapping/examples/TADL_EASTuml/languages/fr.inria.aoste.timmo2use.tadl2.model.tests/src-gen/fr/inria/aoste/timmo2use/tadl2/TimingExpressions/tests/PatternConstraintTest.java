/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.tests;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pattern Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternConstraintTest extends TimingConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PatternConstraintTest.class);
	}

	/**
	 * Constructs a new Pattern Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pattern Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PatternConstraint getFixture() {
		return (PatternConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingExpressionsFactory.eINSTANCE.createPatternConstraint());
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

} //PatternConstraintTest
