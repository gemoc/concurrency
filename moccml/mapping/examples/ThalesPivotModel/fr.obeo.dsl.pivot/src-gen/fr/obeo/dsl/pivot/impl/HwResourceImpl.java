/**
 */
package fr.obeo.dsl.pivot.impl;

import fr.obeo.dsl.pivot.HwResource;
import fr.obeo.dsl.pivot.PivotPackage;
import fr.obeo.dsl.pivot.SwSchedulableResource;
import fr.obeo.dsl.pivot.Task;

import fr.obeo.dsl.pivot.datatype.Duration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.impl.HwResourceImpl#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.HwResourceImpl#getFrequencyFactor <em>Frequency Factor</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.HwResourceImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.HwResourceImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.HwResourceImpl#getSwschedulableresources <em>Swschedulableresources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HwResourceImpl extends NamedElementImpl implements HwResource {
	/**
	 * The default value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULING_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected String schedulingPolicy = SCHEDULING_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequencyFactor() <em>Frequency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequencyFactor() <em>Frequency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyFactor()
	 * @generated
	 * @ordered
	 */
	protected String frequencyFactor = FREQUENCY_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected Duration delay = DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwschedulableresources() <em>Swschedulableresources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwschedulableresources()
	 * @generated
	 * @ordered
	 */
	protected EList<SwSchedulableResource> swschedulableresources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.HW_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedulingPolicy() {
		return schedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingPolicy(String newSchedulingPolicy) {
		String oldSchedulingPolicy = schedulingPolicy;
		schedulingPolicy = newSchedulingPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.HW_RESOURCE__SCHEDULING_POLICY, oldSchedulingPolicy, schedulingPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequencyFactor() {
		return frequencyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyFactor(String newFrequencyFactor) {
		String oldFrequencyFactor = frequencyFactor;
		frequencyFactor = newFrequencyFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.HW_RESOURCE__FREQUENCY_FACTOR, oldFrequencyFactor, frequencyFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, PivotPackage.HW_RESOURCE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(Duration newDelay) {
		Duration oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.HW_RESOURCE__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwSchedulableResource> getSwschedulableresources() {
		if (swschedulableresources == null) {
			swschedulableresources = new EObjectContainmentEList<SwSchedulableResource>(SwSchedulableResource.class, this, PivotPackage.HW_RESOURCE__SWSCHEDULABLERESOURCES);
		}
		return swschedulableresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PivotPackage.HW_RESOURCE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case PivotPackage.HW_RESOURCE__SWSCHEDULABLERESOURCES:
				return ((InternalEList<?>)getSwschedulableresources()).basicRemove(otherEnd, msgs);
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
			case PivotPackage.HW_RESOURCE__SCHEDULING_POLICY:
				return getSchedulingPolicy();
			case PivotPackage.HW_RESOURCE__FREQUENCY_FACTOR:
				return getFrequencyFactor();
			case PivotPackage.HW_RESOURCE__TASKS:
				return getTasks();
			case PivotPackage.HW_RESOURCE__DELAY:
				return getDelay();
			case PivotPackage.HW_RESOURCE__SWSCHEDULABLERESOURCES:
				return getSwschedulableresources();
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
			case PivotPackage.HW_RESOURCE__SCHEDULING_POLICY:
				setSchedulingPolicy((String)newValue);
				return;
			case PivotPackage.HW_RESOURCE__FREQUENCY_FACTOR:
				setFrequencyFactor((String)newValue);
				return;
			case PivotPackage.HW_RESOURCE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case PivotPackage.HW_RESOURCE__DELAY:
				setDelay((Duration)newValue);
				return;
			case PivotPackage.HW_RESOURCE__SWSCHEDULABLERESOURCES:
				getSwschedulableresources().clear();
				getSwschedulableresources().addAll((Collection<? extends SwSchedulableResource>)newValue);
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
			case PivotPackage.HW_RESOURCE__SCHEDULING_POLICY:
				setSchedulingPolicy(SCHEDULING_POLICY_EDEFAULT);
				return;
			case PivotPackage.HW_RESOURCE__FREQUENCY_FACTOR:
				setFrequencyFactor(FREQUENCY_FACTOR_EDEFAULT);
				return;
			case PivotPackage.HW_RESOURCE__TASKS:
				getTasks().clear();
				return;
			case PivotPackage.HW_RESOURCE__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case PivotPackage.HW_RESOURCE__SWSCHEDULABLERESOURCES:
				getSwschedulableresources().clear();
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
			case PivotPackage.HW_RESOURCE__SCHEDULING_POLICY:
				return SCHEDULING_POLICY_EDEFAULT == null ? schedulingPolicy != null : !SCHEDULING_POLICY_EDEFAULT.equals(schedulingPolicy);
			case PivotPackage.HW_RESOURCE__FREQUENCY_FACTOR:
				return FREQUENCY_FACTOR_EDEFAULT == null ? frequencyFactor != null : !FREQUENCY_FACTOR_EDEFAULT.equals(frequencyFactor);
			case PivotPackage.HW_RESOURCE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case PivotPackage.HW_RESOURCE__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case PivotPackage.HW_RESOURCE__SWSCHEDULABLERESOURCES:
				return swschedulableresources != null && !swschedulableresources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (schedulingPolicy: ");
		result.append(schedulingPolicy);
		result.append(", frequencyFactor: ");
		result.append(frequencyFactor);
		result.append(", delay: ");
		result.append(delay);
		result.append(')');
		return result.toString();
	}

} //HwResourceImpl
