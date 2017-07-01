/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage;

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
 * An implementation of the model object '<em><b>Pattern Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternConstraintImpl extends TimingConstraintImpl implements PatternConstraint {
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingExpression> offset;

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
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Event ref;

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
	protected PatternConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingExpression> getOffset() {
		if (offset == null) {
			offset = new EObjectContainmentEList<TimingExpression>(TimingExpression.class, this, TimingExpressionsPackage.PATTERN_CONSTRAINT__OFFSET);
		}
		return offset;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER, oldJitter, newJitter);
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
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER, newJitter, newJitter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM, oldMinimum, newMinimum);
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
				msgs = ((InternalEObject)minimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM, null, msgs);
			if (newMinimum != null)
				msgs = ((InternalEObject)newMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM, null, msgs);
			msgs = basicSetMinimum(newMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM, newMinimum, newMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Event)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingExpressionsPackage.PATTERN_CONSTRAINT__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(Event newRef) {
		Event oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PATTERN_CONSTRAINT__REF, oldRef, ref));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingExpressionsPackage.PATTERN_CONSTRAINT__EVENT, oldEvent, event));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.PATTERN_CONSTRAINT__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__OFFSET:
				return ((InternalEList<?>)getOffset()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER:
				return basicSetJitter(null, msgs);
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM:
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
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__OFFSET:
				return getOffset();
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER:
				return getJitter();
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM:
				return getMinimum();
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__EVENT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__OFFSET:
				getOffset().clear();
				getOffset().addAll((Collection<? extends TimingExpression>)newValue);
				return;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER:
				setJitter((TimingExpression)newValue);
				return;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM:
				setMinimum((TimingExpression)newValue);
				return;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__REF:
				setRef((Event)newValue);
				return;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__EVENT:
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
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__OFFSET:
				getOffset().clear();
				return;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER:
				setJitter((TimingExpression)null);
				return;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM:
				setMinimum((TimingExpression)null);
				return;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__REF:
				setRef((Event)null);
				return;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__EVENT:
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
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__OFFSET:
				return offset != null && !offset.isEmpty();
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER:
				return jitter != null;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM:
				return minimum != null;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__REF:
				return ref != null;
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__EVENT:
				return event != null;
		}
		return super.eIsSet(featureID);
	}

} //PatternConstraintImpl
