/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event;
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
 * An implementation of the model object '<em><b>Arbitrary Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ArbitraryConstraintImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ArbitraryConstraintImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ArbitraryConstraintImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArbitraryConstraintImpl extends TimingConstraintImpl implements ArbitraryConstraint {
	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingExpression> minimum;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingExpression> maximum;

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
	protected ArbitraryConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingExpressionsPackage.Literals.ARBITRARY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingExpression> getMinimum() {
		if (minimum == null) {
			minimum = new EObjectContainmentEList<TimingExpression>(TimingExpression.class, this, TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MINIMUM);
		}
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingExpression> getMaximum() {
		if (maximum == null) {
			maximum = new EObjectContainmentEList<TimingExpression>(TimingExpression.class, this, TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MAXIMUM);
		}
		return maximum;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingExpressionsPackage.ARBITRARY_CONSTRAINT__EVENT, oldEvent, event));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.ARBITRARY_CONSTRAINT__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
				return ((InternalEList<?>)getMinimum()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
				return ((InternalEList<?>)getMaximum()).basicRemove(otherEnd, msgs);
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
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
				return getMinimum();
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
				return getMaximum();
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__EVENT:
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
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
				getMinimum().clear();
				getMinimum().addAll((Collection<? extends TimingExpression>)newValue);
				return;
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
				getMaximum().clear();
				getMaximum().addAll((Collection<? extends TimingExpression>)newValue);
				return;
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__EVENT:
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
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
				getMinimum().clear();
				return;
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
				getMaximum().clear();
				return;
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__EVENT:
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
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MINIMUM:
				return minimum != null && !minimum.isEmpty();
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__MAXIMUM:
				return maximum != null && !maximum.isEmpty();
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT__EVENT:
				return event != null;
		}
		return super.eIsSet(featureID);
	}

} //ArbitraryConstraintImpl
