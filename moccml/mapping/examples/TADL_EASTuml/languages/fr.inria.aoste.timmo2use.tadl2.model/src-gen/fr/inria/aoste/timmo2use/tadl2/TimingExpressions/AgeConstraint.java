/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Age Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getAgeConstraint()
 * @model
 * @generated
 */
public interface AgeConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' containment reference.
	 * @see #setMinimum(TimingExpression)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getAgeConstraint_Minimum()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingExpression getMinimum();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getMinimum <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' containment reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' containment reference.
	 * @see #setMaximum(TimingExpression)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getAgeConstraint_Maximum()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingExpression getMaximum();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getMaximum <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' containment reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(EventChain)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getAgeConstraint_Scope()
	 * @model required="true"
	 * @generated
	 */
	EventChain getScope();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EventChain value);

} // AgeConstraint
