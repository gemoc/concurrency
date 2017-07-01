/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SynchronizationConstraintImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SynchronizationConstraintImpl#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizationConstraintImpl extends TimingConstraintImpl implements SynchronizationConstraint {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getTolerance() <em>Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression tolerance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingExpressionsPackage.Literals.SYNCHRONIZATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<Event>(Event.class, this, TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getTolerance() {
		return tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTolerance(TimingExpression newTolerance, NotificationChain msgs) {
		TimingExpression oldTolerance = tolerance;
		tolerance = newTolerance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE, oldTolerance, newTolerance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTolerance(TimingExpression newTolerance) {
		if (newTolerance != tolerance) {
			NotificationChain msgs = null;
			if (tolerance != null)
				msgs = ((InternalEObject)tolerance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE, null, msgs);
			if (newTolerance != null)
				msgs = ((InternalEObject)newTolerance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE, null, msgs);
			msgs = basicSetTolerance(newTolerance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE, newTolerance, newTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				return basicSetTolerance(null, msgs);
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
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__EVENTS:
				return getEvents();
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				return getTolerance();
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
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				setTolerance((TimingExpression)newValue);
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
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__EVENTS:
				getEvents().clear();
				return;
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				setTolerance((TimingExpression)null);
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
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__EVENTS:
				return events != null && !events.isEmpty();
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				return tolerance != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronizationConstraintImpl
