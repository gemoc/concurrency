/**
 */
package fr.inria.aoste.gemoc.example.tfsm.impl;

import fr.inria.aoste.gemoc.example.tfsm.FSMClock;
import fr.inria.aoste.gemoc.example.tfsm.FSMEvent;
import fr.inria.aoste.gemoc.example.tfsm.TFSM;
import fr.inria.aoste.gemoc.example.tfsm.TfsmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.impl.SystemImpl#getTfsms <em>Tfsms</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.impl.SystemImpl#getGlobalClocks <em>Global Clocks</em>}</li>
 *   <li>{@link fr.inria.aoste.gemoc.example.tfsm.impl.SystemImpl#getGlobalEvent <em>Global Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends EObjectImpl implements fr.inria.aoste.gemoc.example.tfsm.System {
	/**
	 * The cached value of the '{@link #getTfsms() <em>Tfsms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTfsms()
	 * @generated
	 * @ordered
	 */
	protected EList<TFSM> tfsms;

	/**
	 * The cached value of the '{@link #getGlobalClocks() <em>Global Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<FSMClock> globalClocks;

	/**
	 * The cached value of the '{@link #getGlobalEvent() <em>Global Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<FSMEvent> globalEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TfsmPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFSM> getTfsms() {
		if (tfsms == null) {
			tfsms = new EObjectContainmentEList<TFSM>(TFSM.class, this, TfsmPackage.SYSTEM__TFSMS);
		}
		return tfsms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSMClock> getGlobalClocks() {
		if (globalClocks == null) {
			globalClocks = new EObjectContainmentEList<FSMClock>(FSMClock.class, this, TfsmPackage.SYSTEM__GLOBAL_CLOCKS);
		}
		return globalClocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSMEvent> getGlobalEvent() {
		if (globalEvent == null) {
			globalEvent = new EObjectContainmentEList<FSMEvent>(FSMEvent.class, this, TfsmPackage.SYSTEM__GLOBAL_EVENT);
		}
		return globalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmPackage.SYSTEM__TFSMS:
				return ((InternalEList<?>)getTfsms()).basicRemove(otherEnd, msgs);
			case TfsmPackage.SYSTEM__GLOBAL_CLOCKS:
				return ((InternalEList<?>)getGlobalClocks()).basicRemove(otherEnd, msgs);
			case TfsmPackage.SYSTEM__GLOBAL_EVENT:
				return ((InternalEList<?>)getGlobalEvent()).basicRemove(otherEnd, msgs);
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
			case TfsmPackage.SYSTEM__TFSMS:
				return getTfsms();
			case TfsmPackage.SYSTEM__GLOBAL_CLOCKS:
				return getGlobalClocks();
			case TfsmPackage.SYSTEM__GLOBAL_EVENT:
				return getGlobalEvent();
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
			case TfsmPackage.SYSTEM__TFSMS:
				getTfsms().clear();
				getTfsms().addAll((Collection<? extends TFSM>)newValue);
				return;
			case TfsmPackage.SYSTEM__GLOBAL_CLOCKS:
				getGlobalClocks().clear();
				getGlobalClocks().addAll((Collection<? extends FSMClock>)newValue);
				return;
			case TfsmPackage.SYSTEM__GLOBAL_EVENT:
				getGlobalEvent().clear();
				getGlobalEvent().addAll((Collection<? extends FSMEvent>)newValue);
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
			case TfsmPackage.SYSTEM__TFSMS:
				getTfsms().clear();
				return;
			case TfsmPackage.SYSTEM__GLOBAL_CLOCKS:
				getGlobalClocks().clear();
				return;
			case TfsmPackage.SYSTEM__GLOBAL_EVENT:
				getGlobalEvent().clear();
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
			case TfsmPackage.SYSTEM__TFSMS:
				return tfsms != null && !tfsms.isEmpty();
			case TfsmPackage.SYSTEM__GLOBAL_CLOCKS:
				return globalClocks != null && !globalClocks.isEmpty();
			case TfsmPackage.SYSTEM__GLOBAL_EVENT:
				return globalEvent != null && !globalEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
