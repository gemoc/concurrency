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
 * A representation of the model object '<em><b>Pattern Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getJitter <em>Jitter</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getPatternConstraint()
 * @model
 * @generated
 */
public interface PatternConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getPatternConstraint_Offset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimingExpression> getOffset();

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(TimingExpression)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getPatternConstraint_Jitter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingExpression getJitter();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(TimingExpression value);

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
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getPatternConstraint_Minimum()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingExpression getMinimum();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getMinimum <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' containment reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Event)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getPatternConstraint_Ref()
	 * @model required="true"
	 * @generated
	 */
	Event getRef();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Event value);

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
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getPatternConstraint_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // PatternConstraint
