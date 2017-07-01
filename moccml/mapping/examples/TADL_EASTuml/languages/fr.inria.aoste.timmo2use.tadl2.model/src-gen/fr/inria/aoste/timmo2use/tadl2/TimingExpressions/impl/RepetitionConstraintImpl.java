/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repetition Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl#getJitter <em>Jitter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepetitionConstraintImpl extends TimingConstraintImpl implements RepetitionConstraint {
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
	 * The default value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int SPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected int span = SPAN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression upper;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepetitionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingExpressionsPackage.Literals.REPETITION_CONSTRAINT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingExpressionsPackage.REPETITION_CONSTRAINT__EVENT, oldEvent, event));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.REPETITION_CONSTRAINT__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpan() {
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(int newSpan) {
		int oldSpan = span;
		span = newSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.REPETITION_CONSTRAINT__SPAN, oldSpan, span));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(TimingExpression newLower, NotificationChain msgs) {
		TimingExpression oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER, oldLower, newLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(TimingExpression newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER, newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper(TimingExpression newUpper, NotificationChain msgs) {
		TimingExpression oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER, oldUpper, newUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(TimingExpression newUpper) {
		if (newUpper != upper) {
			NotificationChain msgs = null;
			if (upper != null)
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER, newUpper, newUpper));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER, oldJitter, newJitter);
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
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER:
				return basicSetLower(null, msgs);
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER:
				return basicSetUpper(null, msgs);
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER:
				return basicSetJitter(null, msgs);
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
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__SPAN:
				return getSpan();
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER:
				return getLower();
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER:
				return getUpper();
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER:
				return getJitter();
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
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__EVENT:
				setEvent((Event)newValue);
				return;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__SPAN:
				setSpan((Integer)newValue);
				return;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER:
				setLower((TimingExpression)newValue);
				return;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER:
				setUpper((TimingExpression)newValue);
				return;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER:
				setJitter((TimingExpression)newValue);
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
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__EVENT:
				setEvent((Event)null);
				return;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__SPAN:
				setSpan(SPAN_EDEFAULT);
				return;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER:
				setLower((TimingExpression)null);
				return;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER:
				setUpper((TimingExpression)null);
				return;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER:
				setJitter((TimingExpression)null);
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
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__EVENT:
				return event != null;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__SPAN:
				return span != SPAN_EDEFAULT;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__LOWER:
				return lower != null;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__UPPER:
				return upper != null;
			case TimingExpressionsPackage.REPETITION_CONSTRAINT__JITTER:
				return jitter != null;
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
		result.append(" (span: ");
		result.append(span);
		result.append(')');
		return result.toString();
	}

} //RepetitionConstraintImpl
