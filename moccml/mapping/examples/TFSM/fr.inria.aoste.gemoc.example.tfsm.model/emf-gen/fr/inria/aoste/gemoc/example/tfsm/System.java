/**
 */
package fr.inria.aoste.gemoc.example.tfsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.System#getTfsms <em>Tfsms</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.System#getGlobalClocks <em>Global Clocks</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.System#getGlobalEvent <em>Global Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Tfsms</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.TFSM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tfsms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tfsms</em>' containment reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getSystem_Tfsms()
	 * @model containment="true"
	 * @generated
	 */
	EList<TFSM> getTfsms();

	/**
	 * Returns the value of the '<em><b>Global Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.FSMClock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Clocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Clocks</em>' containment reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getSystem_GlobalClocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<FSMClock> getGlobalClocks();

	/**
	 * Returns the value of the '<em><b>Global Event</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.FSMEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Event</em>' containment reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getSystem_GlobalEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<FSMEvent> getGlobalEvent();

} // System
