/**
 */
package fr.obeo.dsl.pivot.impl;

import fr.obeo.dsl.pivot.Chain;
import fr.obeo.dsl.pivot.Fragment;
import fr.obeo.dsl.pivot.PivotPackage;
import fr.obeo.dsl.pivot.Sink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SinkImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SinkImpl#getChain <em>Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SinkImpl extends StimuliImpl implements Sink {
	/**
	 * The cached value of the '{@link #getFragment() <em>Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected Fragment fragment;

	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected Chain chain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.SINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getFragment() {
		if (fragment != null && fragment.eIsProxy()) {
			InternalEObject oldFragment = (InternalEObject)fragment;
			fragment = (Fragment)eResolveProxy(oldFragment);
			if (fragment != oldFragment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.SINK__FRAGMENT, oldFragment, fragment));
			}
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetFragment() {
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFragment(Fragment newFragment, NotificationChain msgs) {
		Fragment oldFragment = fragment;
		fragment = newFragment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.SINK__FRAGMENT, oldFragment, newFragment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragment(Fragment newFragment) {
		if (newFragment != fragment) {
			NotificationChain msgs = null;
			if (fragment != null)
				msgs = ((InternalEObject)fragment).eInverseRemove(this, PivotPackage.FRAGMENT__SINK, Fragment.class, msgs);
			if (newFragment != null)
				msgs = ((InternalEObject)newFragment).eInverseAdd(this, PivotPackage.FRAGMENT__SINK, Fragment.class, msgs);
			msgs = basicSetFragment(newFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.SINK__FRAGMENT, newFragment, newFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain getChain() {
		if (chain != null && chain.eIsProxy()) {
			InternalEObject oldChain = (InternalEObject)chain;
			chain = (Chain)eResolveProxy(oldChain);
			if (chain != oldChain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.SINK__CHAIN, oldChain, chain));
			}
		}
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain basicGetChain() {
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChain(Chain newChain, NotificationChain msgs) {
		Chain oldChain = chain;
		chain = newChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.SINK__CHAIN, oldChain, newChain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChain(Chain newChain) {
		if (newChain != chain) {
			NotificationChain msgs = null;
			if (chain != null)
				msgs = ((InternalEObject)chain).eInverseRemove(this, PivotPackage.CHAIN__SINK, Chain.class, msgs);
			if (newChain != null)
				msgs = ((InternalEObject)newChain).eInverseAdd(this, PivotPackage.CHAIN__SINK, Chain.class, msgs);
			msgs = basicSetChain(newChain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.SINK__CHAIN, newChain, newChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PivotPackage.SINK__FRAGMENT:
				if (fragment != null)
					msgs = ((InternalEObject)fragment).eInverseRemove(this, PivotPackage.FRAGMENT__SINK, Fragment.class, msgs);
				return basicSetFragment((Fragment)otherEnd, msgs);
			case PivotPackage.SINK__CHAIN:
				if (chain != null)
					msgs = ((InternalEObject)chain).eInverseRemove(this, PivotPackage.CHAIN__SINK, Chain.class, msgs);
				return basicSetChain((Chain)otherEnd, msgs);
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
			case PivotPackage.SINK__FRAGMENT:
				return basicSetFragment(null, msgs);
			case PivotPackage.SINK__CHAIN:
				return basicSetChain(null, msgs);
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
			case PivotPackage.SINK__FRAGMENT:
				if (resolve) return getFragment();
				return basicGetFragment();
			case PivotPackage.SINK__CHAIN:
				if (resolve) return getChain();
				return basicGetChain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PivotPackage.SINK__FRAGMENT:
				setFragment((Fragment)newValue);
				return;
			case PivotPackage.SINK__CHAIN:
				setChain((Chain)newValue);
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
			case PivotPackage.SINK__FRAGMENT:
				setFragment((Fragment)null);
				return;
			case PivotPackage.SINK__CHAIN:
				setChain((Chain)null);
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
			case PivotPackage.SINK__FRAGMENT:
				return fragment != null;
			case PivotPackage.SINK__CHAIN:
				return chain != null;
		}
		return super.eIsSet(featureID);
	}

} //SinkImpl
