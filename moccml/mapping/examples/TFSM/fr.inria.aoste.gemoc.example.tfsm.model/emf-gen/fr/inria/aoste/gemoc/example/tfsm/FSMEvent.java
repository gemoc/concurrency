/**
 */
package fr.inria.aoste.gemoc.example.tfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.FSMEvent#getSollicitingTransitions <em>Solliciting Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getFSMEvent()
 * @model
 * @generated
 */
public interface FSMEvent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Solliciting Transitions</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.gemoc.example.tfsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getGeneratedEvents <em>Generated Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solliciting Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solliciting Transitions</em>' reference list.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmPackage#getFSMEvent_SollicitingTransitions()
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#getGeneratedEvents
	 * @model opposite="generatedEvents"
	 * @generated
	 */
	EList<Transition> getSollicitingTransitions();

} // FSMEvent
