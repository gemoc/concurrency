/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitrary Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getArbitraryConstraint()
 * @model
 * @generated
 */
public interface ArbitraryConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getArbitraryConstraint_Minimum()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimingExpression> getMinimum();

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getArbitraryConstraint_Maximum()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimingExpression> getMaximum();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getArbitraryConstraint_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // ArbitraryConstraint
