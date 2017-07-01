/**
 */
package fr.obeo.dsl.pivot.impl;

import fr.obeo.dsl.pivot.BusComm;
import fr.obeo.dsl.pivot.Chain;
import fr.obeo.dsl.pivot.Fragment;
import fr.obeo.dsl.pivot.HwResource;
import fr.obeo.dsl.pivot.PivotPackage;
import fr.obeo.dsl.pivot.Sink;
import fr.obeo.dsl.pivot.Source;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SystemImpl#getHwResources <em>Hw Resources</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SystemImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SystemImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SystemImpl#getSinks <em>Sinks</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SystemImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.SystemImpl#getChains <em>Chains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements fr.obeo.dsl.pivot.System {
	/**
	 * The cached value of the '{@link #getHwResources() <em>Hw Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwResources()
	 * @generated
	 * @ordered
	 */
	protected EList<HwResource> hwResources;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected EList<BusComm> bus;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> sources;

	/**
	 * The cached value of the '{@link #getSinks() <em>Sinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sink> sinks;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<Fragment> fragments;

	/**
	 * The cached value of the '{@link #getChains() <em>Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<Chain> chains;

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
		return PivotPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwResource> getHwResources() {
		if (hwResources == null) {
			hwResources = new EObjectContainmentEList<HwResource>(HwResource.class, this, PivotPackage.SYSTEM__HW_RESOURCES);
		}
		return hwResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusComm> getBus() {
		if (bus == null) {
			bus = new EObjectContainmentEList<BusComm>(BusComm.class, this, PivotPackage.SYSTEM__BUS);
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Source> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Source>(Source.class, this, PivotPackage.SYSTEM__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sink> getSinks() {
		if (sinks == null) {
			sinks = new EObjectContainmentEList<Sink>(Sink.class, this, PivotPackage.SYSTEM__SINKS);
		}
		return sinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentEList<Fragment>(Fragment.class, this, PivotPackage.SYSTEM__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chain> getChains() {
		if (chains == null) {
			chains = new EObjectContainmentEList<Chain>(Chain.class, this, PivotPackage.SYSTEM__CHAINS);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PivotPackage.SYSTEM__HW_RESOURCES:
				return ((InternalEList<?>)getHwResources()).basicRemove(otherEnd, msgs);
			case PivotPackage.SYSTEM__BUS:
				return ((InternalEList<?>)getBus()).basicRemove(otherEnd, msgs);
			case PivotPackage.SYSTEM__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case PivotPackage.SYSTEM__SINKS:
				return ((InternalEList<?>)getSinks()).basicRemove(otherEnd, msgs);
			case PivotPackage.SYSTEM__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case PivotPackage.SYSTEM__CHAINS:
				return ((InternalEList<?>)getChains()).basicRemove(otherEnd, msgs);
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
			case PivotPackage.SYSTEM__HW_RESOURCES:
				return getHwResources();
			case PivotPackage.SYSTEM__BUS:
				return getBus();
			case PivotPackage.SYSTEM__SOURCES:
				return getSources();
			case PivotPackage.SYSTEM__SINKS:
				return getSinks();
			case PivotPackage.SYSTEM__FRAGMENTS:
				return getFragments();
			case PivotPackage.SYSTEM__CHAINS:
				return getChains();
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
			case PivotPackage.SYSTEM__HW_RESOURCES:
				getHwResources().clear();
				getHwResources().addAll((Collection<? extends HwResource>)newValue);
				return;
			case PivotPackage.SYSTEM__BUS:
				getBus().clear();
				getBus().addAll((Collection<? extends BusComm>)newValue);
				return;
			case PivotPackage.SYSTEM__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
				return;
			case PivotPackage.SYSTEM__SINKS:
				getSinks().clear();
				getSinks().addAll((Collection<? extends Sink>)newValue);
				return;
			case PivotPackage.SYSTEM__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends Fragment>)newValue);
				return;
			case PivotPackage.SYSTEM__CHAINS:
				getChains().clear();
				getChains().addAll((Collection<? extends Chain>)newValue);
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
			case PivotPackage.SYSTEM__HW_RESOURCES:
				getHwResources().clear();
				return;
			case PivotPackage.SYSTEM__BUS:
				getBus().clear();
				return;
			case PivotPackage.SYSTEM__SOURCES:
				getSources().clear();
				return;
			case PivotPackage.SYSTEM__SINKS:
				getSinks().clear();
				return;
			case PivotPackage.SYSTEM__FRAGMENTS:
				getFragments().clear();
				return;
			case PivotPackage.SYSTEM__CHAINS:
				getChains().clear();
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
			case PivotPackage.SYSTEM__HW_RESOURCES:
				return hwResources != null && !hwResources.isEmpty();
			case PivotPackage.SYSTEM__BUS:
				return bus != null && !bus.isEmpty();
			case PivotPackage.SYSTEM__SOURCES:
				return sources != null && !sources.isEmpty();
			case PivotPackage.SYSTEM__SINKS:
				return sinks != null && !sinks.isEmpty();
			case PivotPackage.SYSTEM__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case PivotPackage.SYSTEM__CHAINS:
				return chains != null && !chains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
