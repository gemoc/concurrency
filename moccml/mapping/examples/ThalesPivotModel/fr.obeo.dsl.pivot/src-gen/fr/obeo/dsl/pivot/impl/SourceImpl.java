/**
 */
package fr.obeo.dsl.pivot.impl;

import fr.obeo.dsl.pivot.Fragment;
import fr.obeo.dsl.pivot.PivotPackage;
import fr.obeo.dsl.pivot.Source;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SourceImpl#getFragment <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends StimuliImpl implements Source {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.SOURCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.SOURCE__FRAGMENT, oldFragment, fragment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.SOURCE__FRAGMENT, oldFragment, newFragment);
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
				msgs = ((InternalEObject)fragment).eInverseRemove(this, PivotPackage.FRAGMENT__SOURCE, Fragment.class, msgs);
			if (newFragment != null)
				msgs = ((InternalEObject)newFragment).eInverseAdd(this, PivotPackage.FRAGMENT__SOURCE, Fragment.class, msgs);
			msgs = basicSetFragment(newFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.SOURCE__FRAGMENT, newFragment, newFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PivotPackage.SOURCE__FRAGMENT:
				if (fragment != null)
					msgs = ((InternalEObject)fragment).eInverseRemove(this, PivotPackage.FRAGMENT__SOURCE, Fragment.class, msgs);
				return basicSetFragment((Fragment)otherEnd, msgs);
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
			case PivotPackage.SOURCE__FRAGMENT:
				return basicSetFragment(null, msgs);
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
			case PivotPackage.SOURCE__FRAGMENT:
				if (resolve) return getFragment();
				return basicGetFragment();
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
			case PivotPackage.SOURCE__FRAGMENT:
				setFragment((Fragment)newValue);
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
			case PivotPackage.SOURCE__FRAGMENT:
				setFragment((Fragment)null);
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
			case PivotPackage.SOURCE__FRAGMENT:
				return fragment != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
