/**
 */
package fr.inria.aoste.gemoc.example.tfsm.impl;

import fr.inria.aoste.gemoc.example.tfsm.FSMClock;
import fr.inria.aoste.gemoc.example.tfsm.FSMEvent;
import fr.inria.aoste.gemoc.example.tfsm.State;
import fr.inria.aoste.gemoc.example.tfsm.TFSM;
import fr.inria.aoste.gemoc.example.tfsm.TfsmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.impl.TFSMImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.impl.TFSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.impl.TFSMImpl#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.impl.TFSMImpl#getOwnedClock <em>Owned Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TFSMImpl extends NamedElementImpl implements TFSM {
	/**
	 * The cached value of the '{@link #getOwnedState() <em>Owned State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedState;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getOwnedEvents() <em>Owned Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<FSMEvent> ownedEvents;

	/**
	 * The cached value of the '{@link #getOwnedClock() <em>Owned Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClock()
	 * @generated
	 * @ordered
	 */
	protected FSMClock ownedClock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TfsmPackage.Literals.TFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentWithInverseEList<State>(State.class, this, TfsmPackage.TFSM__OWNED_STATE, TfsmPackage.STATE__OWNING_FSM);
		}
		return ownedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TfsmPackage.TFSM__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.TFSM__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSMEvent> getOwnedEvents() {
		if (ownedEvents == null) {
			ownedEvents = new EObjectContainmentEList<FSMEvent>(FSMEvent.class, this, TfsmPackage.TFSM__OWNED_EVENTS);
		}
		return ownedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMClock getOwnedClock() {
		return ownedClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedClock(FSMClock newOwnedClock, NotificationChain msgs) {
		FSMClock oldOwnedClock = ownedClock;
		ownedClock = newOwnedClock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TfsmPackage.TFSM__OWNED_CLOCK, oldOwnedClock, newOwnedClock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedClock(FSMClock newOwnedClock) {
		if (newOwnedClock != ownedClock) {
			NotificationChain msgs = null;
			if (ownedClock != null)
				msgs = ((InternalEObject)ownedClock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TfsmPackage.TFSM__OWNED_CLOCK, null, msgs);
			if (newOwnedClock != null)
				msgs = ((InternalEObject)newOwnedClock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TfsmPackage.TFSM__OWNED_CLOCK, null, msgs);
			msgs = basicSetOwnedClock(newOwnedClock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.TFSM__OWNED_CLOCK, newOwnedClock, newOwnedClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmPackage.TFSM__OWNED_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedState()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmPackage.TFSM__OWNED_STATE:
				return ((InternalEList<?>)getOwnedState()).basicRemove(otherEnd, msgs);
			case TfsmPackage.TFSM__OWNED_EVENTS:
				return ((InternalEList<?>)getOwnedEvents()).basicRemove(otherEnd, msgs);
			case TfsmPackage.TFSM__OWNED_CLOCK:
				return basicSetOwnedClock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TfsmPackage.TFSM__OWNED_STATE:
				return getOwnedState();
			case TfsmPackage.TFSM__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case TfsmPackage.TFSM__OWNED_EVENTS:
				return getOwnedEvents();
			case TfsmPackage.TFSM__OWNED_CLOCK:
				return getOwnedClock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TfsmPackage.TFSM__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends State>)newValue);
				return;
			case TfsmPackage.TFSM__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case TfsmPackage.TFSM__OWNED_EVENTS:
				getOwnedEvents().clear();
				getOwnedEvents().addAll((Collection<? extends FSMEvent>)newValue);
				return;
			case TfsmPackage.TFSM__OWNED_CLOCK:
				setOwnedClock((FSMClock)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TfsmPackage.TFSM__OWNED_STATE:
				getOwnedState().clear();
				return;
			case TfsmPackage.TFSM__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case TfsmPackage.TFSM__OWNED_EVENTS:
				getOwnedEvents().clear();
				return;
			case TfsmPackage.TFSM__OWNED_CLOCK:
				setOwnedClock((FSMClock)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TfsmPackage.TFSM__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case TfsmPackage.TFSM__INITIAL_STATE:
				return initialState != null;
			case TfsmPackage.TFSM__OWNED_EVENTS:
				return ownedEvents != null && !ownedEvents.isEmpty();
			case TfsmPackage.TFSM__OWNED_CLOCK:
				return ownedClock != null;
		}
		return super.eIsSet(featureID);
	}

} //TFSMImpl
