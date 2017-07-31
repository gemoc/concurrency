/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ForceImpl#getEventToBeForced <em>Event To Be Forced</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ForceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ForceImpl#getOnTrigger <em>On Trigger</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ForceImpl#getUntilTrigger <em>Until Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForceImpl extends ActionImpl implements Force {
	/**
	 * The cached value of the '{@link #getEventToBeForced() <em>Event To Be Forced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventToBeForced()
	 * @generated
	 * @ordered
	 */
	protected ModelSpecificEvent eventToBeForced;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ForceKind KIND_EDEFAULT = ForceKind.PRESENCE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ForceKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnTrigger() <em>On Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTrigger()
	 * @generated
	 * @ordered
	 */
	protected ModelSpecificEvent onTrigger;

	/**
	 * The cached value of the '{@link #getUntilTrigger() <em>Until Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilTrigger()
	 * @generated
	 * @ordered
	 */
	protected ModelSpecificEvent untilTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeedbackPackage.Literals.FORCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent getEventToBeForced() {
		if (eventToBeForced != null && eventToBeForced.eIsProxy()) {
			InternalEObject oldEventToBeForced = (InternalEObject)eventToBeForced;
			eventToBeForced = (ModelSpecificEvent)eResolveProxy(oldEventToBeForced);
			if (eventToBeForced != oldEventToBeForced) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeedbackPackage.FORCE__EVENT_TO_BE_FORCED, oldEventToBeForced, eventToBeForced));
			}
		}
		return eventToBeForced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent basicGetEventToBeForced() {
		return eventToBeForced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventToBeForced(ModelSpecificEvent newEventToBeForced) {
		ModelSpecificEvent oldEventToBeForced = eventToBeForced;
		eventToBeForced = newEventToBeForced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.FORCE__EVENT_TO_BE_FORCED, oldEventToBeForced, eventToBeForced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForceKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ForceKind newKind) {
		ForceKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.FORCE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent getOnTrigger() {
		if (onTrigger != null && onTrigger.eIsProxy()) {
			InternalEObject oldOnTrigger = (InternalEObject)onTrigger;
			onTrigger = (ModelSpecificEvent)eResolveProxy(oldOnTrigger);
			if (onTrigger != oldOnTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeedbackPackage.FORCE__ON_TRIGGER, oldOnTrigger, onTrigger));
			}
		}
		return onTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent basicGetOnTrigger() {
		return onTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTrigger(ModelSpecificEvent newOnTrigger) {
		ModelSpecificEvent oldOnTrigger = onTrigger;
		onTrigger = newOnTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.FORCE__ON_TRIGGER, oldOnTrigger, onTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent getUntilTrigger() {
		if (untilTrigger != null && untilTrigger.eIsProxy()) {
			InternalEObject oldUntilTrigger = (InternalEObject)untilTrigger;
			untilTrigger = (ModelSpecificEvent)eResolveProxy(oldUntilTrigger);
			if (untilTrigger != oldUntilTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeedbackPackage.FORCE__UNTIL_TRIGGER, oldUntilTrigger, untilTrigger));
			}
		}
		return untilTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent basicGetUntilTrigger() {
		return untilTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilTrigger(ModelSpecificEvent newUntilTrigger) {
		ModelSpecificEvent oldUntilTrigger = untilTrigger;
		untilTrigger = newUntilTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.FORCE__UNTIL_TRIGGER, oldUntilTrigger, untilTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeedbackPackage.FORCE__EVENT_TO_BE_FORCED:
				if (resolve) return getEventToBeForced();
				return basicGetEventToBeForced();
			case FeedbackPackage.FORCE__KIND:
				return getKind();
			case FeedbackPackage.FORCE__ON_TRIGGER:
				if (resolve) return getOnTrigger();
				return basicGetOnTrigger();
			case FeedbackPackage.FORCE__UNTIL_TRIGGER:
				if (resolve) return getUntilTrigger();
				return basicGetUntilTrigger();
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
			case FeedbackPackage.FORCE__EVENT_TO_BE_FORCED:
				setEventToBeForced((ModelSpecificEvent)newValue);
				return;
			case FeedbackPackage.FORCE__KIND:
				setKind((ForceKind)newValue);
				return;
			case FeedbackPackage.FORCE__ON_TRIGGER:
				setOnTrigger((ModelSpecificEvent)newValue);
				return;
			case FeedbackPackage.FORCE__UNTIL_TRIGGER:
				setUntilTrigger((ModelSpecificEvent)newValue);
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
			case FeedbackPackage.FORCE__EVENT_TO_BE_FORCED:
				setEventToBeForced((ModelSpecificEvent)null);
				return;
			case FeedbackPackage.FORCE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case FeedbackPackage.FORCE__ON_TRIGGER:
				setOnTrigger((ModelSpecificEvent)null);
				return;
			case FeedbackPackage.FORCE__UNTIL_TRIGGER:
				setUntilTrigger((ModelSpecificEvent)null);
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
			case FeedbackPackage.FORCE__EVENT_TO_BE_FORCED:
				return eventToBeForced != null;
			case FeedbackPackage.FORCE__KIND:
				return kind != KIND_EDEFAULT;
			case FeedbackPackage.FORCE__ON_TRIGGER:
				return onTrigger != null;
			case FeedbackPackage.FORCE__UNTIL_TRIGGER:
				return untilTrigger != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ForceImpl
