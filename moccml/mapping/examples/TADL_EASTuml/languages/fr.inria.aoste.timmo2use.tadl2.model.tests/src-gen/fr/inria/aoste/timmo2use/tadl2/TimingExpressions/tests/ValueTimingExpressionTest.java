/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.tests;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsFactory;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Timing Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueTimingExpressionTest extends TimingExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueTimingExpressionTest.class);
	}

	/**
	 * Constructs a new Value Timing Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTimingExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Timing Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueTimingExpression getFixture() {
		return (ValueTimingExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingExpressionsFactory.eINSTANCE.createValueTimingExpression());
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

} //ValueTimingExpressionTest
