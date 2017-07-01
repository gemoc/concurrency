/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Timing Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getTimeBase <em>Time Base</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getVariableTimingExpression()
 * @model
 * @generated
 */
public interface VariableTimingExpression extends TimingExpression, NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TimingExpression)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getVariableTimingExpression_Value()
	 * @model containment="true"
	 * @generated
	 */
	TimingExpression getValue();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Time Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Base</em>' reference.
	 * @see #setTimeBase(TimeBase)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getVariableTimingExpression_TimeBase()
	 * @model required="true"
	 * @generated
	 */
	TimeBase getTimeBase();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getTimeBase <em>Time Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Base</em>' reference.
	 * @see #getTimeBase()
	 * @generated
	 */
	void setTimeBase(TimeBase value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getVariableTimingExpression_Unit()
	 * @model required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // VariableTimingExpression
