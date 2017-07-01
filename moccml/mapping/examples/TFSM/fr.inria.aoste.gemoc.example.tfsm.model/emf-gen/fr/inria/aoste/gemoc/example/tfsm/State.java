/**
 */
package fr.inria.aoste.gemoc.example.tfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.State#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(TFSM)
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getState_OwningFSM()
	 * @see fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedState
	 * @model opposite="ownedState" required="true" transient="false"
	 * @generated
	 */
	TFSM getOwningFSM();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.gemoc.example.tfsm.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(TFSM value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getState_OutgoingTransition()
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getState_IncomingTransition()
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String onEnter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String onLeave();

} // State
