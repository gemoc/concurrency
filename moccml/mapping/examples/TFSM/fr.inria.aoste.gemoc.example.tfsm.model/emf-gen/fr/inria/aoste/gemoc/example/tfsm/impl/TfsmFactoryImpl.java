/**
 */
package fr.inria.aoste.gemoc.example.tfsm.impl;

import fr.inria.aoste.gemoc.example.tfsm.EventGuard;
import fr.inria.aoste.gemoc.example.tfsm.FSMClock;
import fr.inria.aoste.gemoc.example.tfsm.FSMEvent;
import fr.inria.aoste.gemoc.example.tfsm.NamedElement;
import fr.inria.aoste.gemoc.example.tfsm.State;
import fr.inria.aoste.gemoc.example.tfsm.TFSM;
import fr.inria.aoste.gemoc.example.tfsm.TemporalGuard;
import fr.inria.aoste.gemoc.example.tfsm.TfsmFactory;
import fr.inria.aoste.gemoc.example.tfsm.TfsmPackage;
import fr.inria.aoste.gemoc.example.tfsm.Transition;
import fr.inria.aoste.gemoc.example.tfsm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TfsmFactoryImpl extends EFactoryImpl implements TfsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TfsmFactory init() {
		try {
			TfsmFactory theTfsmFactory = (TfsmFactory)EPackage.Registry.INSTANCE.getEFactory("http://fr.inria.aoste.gemoc.example.tfsm"); 
			if (theTfsmFactory != null) {
				return theTfsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TfsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TfsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TfsmPackage.TFSM: return createTFSM();
			case TfsmPackage.STATE: return createState();
			case TfsmPackage.TRANSITION: return createTransition();
			case TfsmPackage.NAMED_ELEMENT: return createNamedElement();
			case TfsmPackage.TEMPORAL_GUARD: return createTemporalGuard();
			case TfsmPackage.EVENT_GUARD: return createEventGuard();
			case TfsmPackage.FSM_EVENT: return createFSMEvent();
			case TfsmPackage.FSM_CLOCK: return createFSMClock();
			case TfsmPackage.SYSTEM: return createSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFSM createTFSM() {
		TFSMImpl tfsm = new TFSMImpl();
		return tfsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalGuard createTemporalGuard() {
		TemporalGuardImpl temporalGuard = new TemporalGuardImpl();
		return temporalGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventGuard createEventGuard() {
		EventGuardImpl eventGuard = new EventGuardImpl();
		return eventGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMEvent createFSMEvent() {
		FSMEventImpl fsmEvent = new FSMEventImpl();
		return fsmEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMClock createFSMClock() {
		FSMClockImpl fsmClock = new FSMClockImpl();
		return fsmClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.aoste.gemoc.example.tfsm.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TfsmPackage getTfsmPackage() {
		return (TfsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TfsmPackage getPackage() {
		return TfsmPackage.eINSTANCE;
	}

} //TfsmFactoryImpl
