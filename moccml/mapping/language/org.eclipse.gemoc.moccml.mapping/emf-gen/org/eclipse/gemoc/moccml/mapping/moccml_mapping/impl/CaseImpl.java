/**
 * Copyright (c) 2010, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.util.ECLVisitor;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.impl.ExpCSImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl#getEventToForce <em>Event To Force</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl#getOn <em>On</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl#getKindOfFeedback <em>Kind Of Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseImpl extends ExpCSImpl implements Case {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ExpCS condition;

	/**
	 * The cached value of the '{@link #getEventToForce() <em>Event To Force</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventToForce()
	 * @generated
	 * @ordered
	 */
	protected ExpCS eventToForce;

	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected ExpCS on;

	/**
	 * The default value of the '{@link #getKindOfFeedback() <em>Kind Of Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final FeedBackKind KIND_OF_FEEDBACK_EDEFAULT = FeedBackKind.FORCE;

	/**
	 * The cached value of the '{@link #getKindOfFeedback() <em>Kind Of Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfFeedback()
	 * @generated
	 * @ordered
	 */
	protected FeedBackKind kindOfFeedback = KIND_OF_FEEDBACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoCCMLmappingPackage.Literals.CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ExpCS newCondition, NotificationChain msgs) {
		ExpCS oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MoCCMLmappingPackage.CASE__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ExpCS newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.CASE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.CASE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.CASE__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getEventToForce() {
		return eventToForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventToForce(ExpCS newEventToForce, NotificationChain msgs) {
		ExpCS oldEventToForce = eventToForce;
		eventToForce = newEventToForce;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MoCCMLmappingPackage.CASE__EVENT_TO_FORCE, oldEventToForce, newEventToForce);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventToForce(ExpCS newEventToForce) {
		if (newEventToForce != eventToForce) {
			NotificationChain msgs = null;
			if (eventToForce != null)
				msgs = ((InternalEObject) eventToForce).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.CASE__EVENT_TO_FORCE, null, msgs);
			if (newEventToForce != null)
				msgs = ((InternalEObject) newEventToForce).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.CASE__EVENT_TO_FORCE, null, msgs);
			msgs = basicSetEventToForce(newEventToForce, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.CASE__EVENT_TO_FORCE,
					newEventToForce, newEventToForce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOn() {
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOn(ExpCS newOn, NotificationChain msgs) {
		ExpCS oldOn = on;
		on = newOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MoCCMLmappingPackage.CASE__ON, oldOn, newOn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn(ExpCS newOn) {
		if (newOn != on) {
			NotificationChain msgs = null;
			if (on != null)
				msgs = ((InternalEObject) on).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.CASE__ON, null, msgs);
			if (newOn != null)
				msgs = ((InternalEObject) newOn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.CASE__ON, null, msgs);
			msgs = basicSetOn(newOn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.CASE__ON, newOn, newOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedBackKind getKindOfFeedback() {
		return kindOfFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfFeedback(FeedBackKind newKindOfFeedback) {
		FeedBackKind oldKindOfFeedback = kindOfFeedback;
		kindOfFeedback = newKindOfFeedback == null ? KIND_OF_FEEDBACK_EDEFAULT : newKindOfFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.CASE__KIND_OF_FEEDBACK,
					oldKindOfFeedback, kindOfFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final BaseCSVisitor<R> visitor) {
		return (R) visitor.getAdapter(ECLVisitor.class).visitCase(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MoCCMLmappingPackage.CASE__CONDITION:
			return basicSetCondition(null, msgs);
		case MoCCMLmappingPackage.CASE__EVENT_TO_FORCE:
			return basicSetEventToForce(null, msgs);
		case MoCCMLmappingPackage.CASE__ON:
			return basicSetOn(null, msgs);
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
		case MoCCMLmappingPackage.CASE__CONDITION:
			return getCondition();
		case MoCCMLmappingPackage.CASE__EVENT_TO_FORCE:
			return getEventToForce();
		case MoCCMLmappingPackage.CASE__ON:
			return getOn();
		case MoCCMLmappingPackage.CASE__KIND_OF_FEEDBACK:
			return getKindOfFeedback();
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
		case MoCCMLmappingPackage.CASE__CONDITION:
			setCondition((ExpCS) newValue);
			return;
		case MoCCMLmappingPackage.CASE__EVENT_TO_FORCE:
			setEventToForce((ExpCS) newValue);
			return;
		case MoCCMLmappingPackage.CASE__ON:
			setOn((ExpCS) newValue);
			return;
		case MoCCMLmappingPackage.CASE__KIND_OF_FEEDBACK:
			setKindOfFeedback((FeedBackKind) newValue);
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
		case MoCCMLmappingPackage.CASE__CONDITION:
			setCondition((ExpCS) null);
			return;
		case MoCCMLmappingPackage.CASE__EVENT_TO_FORCE:
			setEventToForce((ExpCS) null);
			return;
		case MoCCMLmappingPackage.CASE__ON:
			setOn((ExpCS) null);
			return;
		case MoCCMLmappingPackage.CASE__KIND_OF_FEEDBACK:
			setKindOfFeedback(KIND_OF_FEEDBACK_EDEFAULT);
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
		case MoCCMLmappingPackage.CASE__CONDITION:
			return condition != null;
		case MoCCMLmappingPackage.CASE__EVENT_TO_FORCE:
			return eventToForce != null;
		case MoCCMLmappingPackage.CASE__ON:
			return on != null;
		case MoCCMLmappingPackage.CASE__KIND_OF_FEEDBACK:
			return kindOfFeedback != KIND_OF_FEEDBACK_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kindOfFeedback: ");
		result.append(kindOfFeedback);
		result.append(')');
		return result.toString();
	}

} //CaseImpl
