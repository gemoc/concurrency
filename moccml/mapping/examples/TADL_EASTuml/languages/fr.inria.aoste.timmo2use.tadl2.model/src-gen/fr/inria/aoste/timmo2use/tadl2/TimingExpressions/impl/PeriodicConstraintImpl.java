/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PeriodicConstraintImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PeriodicConstraintImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PeriodicConstraintImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PeriodicConstraintImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodicConstraintImpl extends TimingConstraintImpl implements PeriodicConstraint {
	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression period;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression jitter;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression minimum;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingExpressionsPackage.Literals.PERIODIC_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(TimingExpression newPeriod, NotificationChain msgs) {
		TimingExpression oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(TimingExpression newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitter(TimingExpression newJitter, NotificationChain msgs) {
		TimingExpression oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER, oldJitter, newJitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(TimingExpression newJitter) {
		if (newJitter != jitter) {
			NotificationChain msgs = null;
			if (jitter != null)
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimum(TimingExpression newMinimum, NotificationChain msgs) {
		TimingExpression oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM, oldMinimum, newMinimum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(TimingExpression newMinimum) {
		if (newMinimum != minimum) {
			NotificationChain msgs = null;
			if (minimum != null)
				msgs = ((InternalEObject)minimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM, null, msgs);
			if (newMinimum != null)
				msgs = ((InternalEObject)newMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM, null, msgs);
			msgs = basicSetMinimum(newMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM, newMinimum, newMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (Event)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingExpressionsPackage.PERIODIC_CONSTRAINT__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PERIODIC_CONSTRAINT__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD:
				return basicSetPeriod(null, msgs);
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER:
				return basicSetJitter(null, msgs);
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM:
				return basicSetMinimum(null, msgs);
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
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD:
				return getPeriod();
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER:
				return getJitter();
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM:
				return getMinimum();
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
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
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD:
				setPeriod((TimingExpression)newValue);
				return;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER:
				setJitter((TimingExpression)newValue);
				return;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM:
				setMinimum((TimingExpression)newValue);
				return;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__EVENT:
				setEvent((Event)newValue);
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
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD:
				setPeriod((TimingExpression)null);
				return;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER:
				setJitter((TimingExpression)null);
				return;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM:
				setMinimum((TimingExpression)null);
				return;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__EVENT:
				setEvent((Event)null);
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
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__PERIOD:
				return period != null;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__JITTER:
				return jitter != null;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__MINIMUM:
				return minimum != null;
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT__EVENT:
				return event != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriodicConstraintImpl
