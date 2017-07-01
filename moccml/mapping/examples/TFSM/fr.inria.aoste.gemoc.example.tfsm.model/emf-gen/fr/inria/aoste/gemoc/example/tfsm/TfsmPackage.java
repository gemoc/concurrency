/**
 */
package fr.inria.aoste.gemoc.example.tfsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.gemoc.example.tfsm.TfsmFactory
 * @model kind="package"
 * @generated
 */
public interface TfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.gemoc.example.tfsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr.inria.aoste.gemoc.example";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TfsmPackage eINSTANCE = fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.NamedElementImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.TFSMImpl <em>TFSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TFSMImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getTFSM()
	 * @generated
	 */
	int TFSM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__OWNED_STATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__INITIAL_STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__OWNED_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM__OWNED_CLOCK = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TFSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFSM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.StateImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TransitionImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_GUARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generated Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATED_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.GuardImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TemporalGuardImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getTemporalGuard()
	 * @generated
	 */
	int TEMPORAL_GUARD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>On Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__ON_CLOCK = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>After Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__AFTER_DURATION = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.EventGuardImpl <em>Event Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.EventGuardImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getEventGuard()
	 * @generated
	 */
	int EVENT_GUARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Triggering Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__TRIGGERING_EVENT = GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.FSMEventImpl <em>FSM Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.FSMEventImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getFSMEvent()
	 * @generated
	 */
	int FSM_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Solliciting Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT__SOLLICITING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FSM Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.FSMClockImpl <em>FSM Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.FSMClockImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getFSMClock()
	 * @generated
	 */
	int FSM_CLOCK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>FSM Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CLOCK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.SystemImpl
	 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Tfsms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TFSMS = 0;

	/**
	 * The feature id for the '<em><b>Global Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GLOBAL_CLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Global Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GLOBAL_EVENT = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.TFSM <em>TFSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFSM</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TFSM
	 * @generated
	 */
	EClass getTFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedState()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_OwnedState();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TFSM#getInitialState()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedEvents <em>Owned Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Events</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedEvents()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_OwnedEvents();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedClock <em>Owned Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Clock</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TFSM#getOwnedClock()
	 * @see #getTFSM()
	 * @generated
	 */
	EReference getTFSM_OwnedClock();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.aoste.gemoc.example.tfsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.gemoc.example.tfsm.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transition</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.State#getOutgoingTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransition();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.gemoc.example.tfsm.State#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.State#getIncomingTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransition();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getOwnedGuard <em>Owned Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Guard</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#getOwnedGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OwnedGuard();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getGeneratedEvents <em>Generated Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Events</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#getGeneratedEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_GeneratedEvents();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.gemoc.example.tfsm.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Action();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.gemoc.example.tfsm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.TemporalGuard <em>Temporal Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Guard</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TemporalGuard
	 * @generated
	 */
	EClass getTemporalGuard();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.gemoc.example.tfsm.TemporalGuard#getOnClock <em>On Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Clock</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TemporalGuard#getOnClock()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EReference getTemporalGuard_OnClock();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.gemoc.example.tfsm.TemporalGuard#getAfterDuration <em>After Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Duration</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.TemporalGuard#getAfterDuration()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EAttribute getTemporalGuard_AfterDuration();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.EventGuard <em>Event Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Guard</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.EventGuard
	 * @generated
	 */
	EClass getEventGuard();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.gemoc.example.tfsm.EventGuard#getTriggeringEvent <em>Triggering Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggering Event</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.EventGuard#getTriggeringEvent()
	 * @see #getEventGuard()
	 * @generated
	 */
	EReference getEventGuard_TriggeringEvent();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.FSMEvent <em>FSM Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Event</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.FSMEvent
	 * @generated
	 */
	EClass getFSMEvent();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.gemoc.example.tfsm.FSMEvent#getSollicitingTransitions <em>Solliciting Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solliciting Transitions</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.FSMEvent#getSollicitingTransitions()
	 * @see #getFSMEvent()
	 * @generated
	 */
	EReference getFSMEvent_SollicitingTransitions();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.FSMClock <em>FSM Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Clock</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.FSMClock
	 * @generated
	 */
	EClass getFSMClock();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.gemoc.example.tfsm.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.gemoc.example.tfsm.System#getTfsms <em>Tfsms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tfsms</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.System#getTfsms()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Tfsms();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.gemoc.example.tfsm.System#getGlobalClocks <em>Global Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Clocks</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.System#getGlobalClocks()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_GlobalClocks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.gemoc.example.tfsm.System#getGlobalEvent <em>Global Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Event</em>'.
	 * @see fr.inria.aoste.gemoc.example.tfsm.System#getGlobalEvent()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_GlobalEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TfsmFactory getTfsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.TFSMImpl <em>TFSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TFSMImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getTFSM()
		 * @generated
		 */
		EClass TFSM = eINSTANCE.getTFSM();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__OWNED_STATE = eINSTANCE.getTFSM_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__INITIAL_STATE = eINSTANCE.getTFSM_InitialState();

		/**
		 * The meta object literal for the '<em><b>Owned Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__OWNED_EVENTS = eINSTANCE.getTFSM_OwnedEvents();

		/**
		 * The meta object literal for the '<em><b>Owned Clock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFSM__OWNED_CLOCK = eINSTANCE.getTFSM_OwnedClock();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.StateImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITION = eINSTANCE.getState_OutgoingTransition();

		/**
		 * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITION = eINSTANCE.getState_IncomingTransition();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TransitionImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Owned Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OWNED_GUARD = eINSTANCE.getTransition_OwnedGuard();

		/**
		 * The meta object literal for the '<em><b>Generated Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GENERATED_EVENTS = eINSTANCE.getTransition_GeneratedEvents();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.NamedElementImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.GuardImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TemporalGuardImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getTemporalGuard()
		 * @generated
		 */
		EClass TEMPORAL_GUARD = eINSTANCE.getTemporalGuard();

		/**
		 * The meta object literal for the '<em><b>On Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_GUARD__ON_CLOCK = eINSTANCE.getTemporalGuard_OnClock();

		/**
		 * The meta object literal for the '<em><b>After Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_GUARD__AFTER_DURATION = eINSTANCE.getTemporalGuard_AfterDuration();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.EventGuardImpl <em>Event Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.EventGuardImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getEventGuard()
		 * @generated
		 */
		EClass EVENT_GUARD = eINSTANCE.getEventGuard();

		/**
		 * The meta object literal for the '<em><b>Triggering Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_GUARD__TRIGGERING_EVENT = eINSTANCE.getEventGuard_TriggeringEvent();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.FSMEventImpl <em>FSM Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.FSMEventImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getFSMEvent()
		 * @generated
		 */
		EClass FSM_EVENT = eINSTANCE.getFSMEvent();

		/**
		 * The meta object literal for the '<em><b>Solliciting Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM_EVENT__SOLLICITING_TRANSITIONS = eINSTANCE.getFSMEvent_SollicitingTransitions();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.FSMClockImpl <em>FSM Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.FSMClockImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getFSMClock()
		 * @generated
		 */
		EClass FSM_CLOCK = eINSTANCE.getFSMClock();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.gemoc.example.tfsm.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.SystemImpl
		 * @see fr.inria.aoste.gemoc.example.tfsm.impl.TfsmPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Tfsms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__TFSMS = eINSTANCE.getSystem_Tfsms();

		/**
		 * The meta object literal for the '<em><b>Global Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GLOBAL_CLOCKS = eINSTANCE.getSystem_GlobalClocks();

		/**
		 * The meta object literal for the '<em><b>Global Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GLOBAL_EVENT = eINSTANCE.getSystem_GlobalEvent();

	}

} //TfsmPackage
