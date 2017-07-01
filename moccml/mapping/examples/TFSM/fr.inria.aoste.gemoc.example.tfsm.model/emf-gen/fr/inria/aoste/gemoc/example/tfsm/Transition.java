/**
 */
package fr.inria.aoste.gemoc.example.tfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getOwnedGuard <em>Owned Guard</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getGeneratedEvents <em>Generated Events</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.gemoc.example.tfsm.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTransition_Source()
	 * @see fr.inria.aoste.gemoc.example.tfsm.State#getOutgoingTransition
	 * @model opposite="outgoingTransition" required="true" transient="false"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.gemoc.example.tfsm.State#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTransition_Target()
	 * @see fr.inria.aoste.gemoc.example.tfsm.State#getIncomingTransition
	 * @model opposite="incomingTransition" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Owned Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Guard</em>' containment reference.
	 * @see #setOwnedGuard(Guard)
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTransition_OwnedGuard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Guard getOwnedGuard();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getOwnedGuard <em>Owned Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Guard</em>' containment reference.
	 * @see #getOwnedGuard()
	 * @generated
	 */
	void setOwnedGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Generated Events</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.FSMEvent}.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.gemoc.example.tfsm.FSMEvent#getSollicitingTransitions <em>Solliciting Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Events</em>' reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTransition_GeneratedEvents()
	 * @see fr.inria.aoste.gemoc.example.tfsm.FSMEvent#getSollicitingTransitions
	 * @model opposite="sollicitingTransitions"
	 * @generated
	 */
	EList<FSMEvent> getGeneratedEvents();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTransition_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String fire();

} // Transition
