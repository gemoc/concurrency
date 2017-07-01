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
 * A representation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimingExpressions <em>Timing Expressions</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimeBases <em>Time Bases</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimeBaseRelations <em>Time Base Relations</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getEventChains <em>Event Chains</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getImportStatements <em>Import Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming()
 * @model
 * @generated
 */
public interface Timing extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Timing Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Expressions</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming_TimingExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingExpression> getTimingExpressions();

	/**
	 * Returns the value of the '<em><b>Time Bases</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Bases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Bases</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming_TimeBases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeBase> getTimeBases();

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dimension> getDimensions();

	/**
	 * Returns the value of the '<em><b>Time Base Relations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Base Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Base Relations</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming_TimeBaseRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeBaseRelation> getTimeBaseRelations();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Event Chains</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Chains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Chains</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming_EventChains()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventChain> getEventChains();

	/**
	 * Returns the value of the '<em><b>Import Statements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Statements</em>' containment reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTiming_ImportStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportStatement> getImportStatements();

} // Timing
