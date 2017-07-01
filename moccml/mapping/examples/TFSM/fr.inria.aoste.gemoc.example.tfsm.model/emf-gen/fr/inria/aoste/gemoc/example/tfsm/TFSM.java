/**
 */
package fr.inria.aoste.gemoc.example.tfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedClock <em>Owned Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTFSM()
 * @model
 * @generated
 */
public interface TFSM extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.State}.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.gemoc.example.tfsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTFSM_OwnedState()
	 * @see fr.inria.aoste.gemoc.example.tfsm.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 * @generated
	 */
	EList<State> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Owned Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.FSMEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Events</em>' containment reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTFSM_OwnedEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<FSMEvent> getOwnedEvents();

	/**
	 * Returns the value of the '<em><b>Owned Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Clock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Clock</em>' containment reference.
	 * @see #setOwnedClock(FSMClock)
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getTFSM_OwnedClock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FSMClock getOwnedClock();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedClock <em>Owned Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Clock</em>' containment reference.
	 * @see #getOwnedClock()
	 * @generated
	 */
	void setOwnedClock(FSMClock value);

} // TFSM
