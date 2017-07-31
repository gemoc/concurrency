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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENamedElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Specific Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ModelSpecificEventImpl#getCaller <em>Caller</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ModelSpecificEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ModelSpecificEventImpl#getSolverEvent <em>Solver Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelSpecificEventImpl extends ENamedElementImpl implements ModelSpecificEvent {
	/**
	 * The cached value of the '{@link #getCaller() <em>Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaller()
	 * @generated
	 * @ordered
	 */
	protected EObject caller;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EOperation action;

	/**
	 * The cached value of the '{@link #getSolverEvent() <em>Solver Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverEvent()
	 * @generated
	 * @ordered
	 */
	protected EObject solverEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSpecificEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeedbackPackage.Literals.MODEL_SPECIFIC_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCaller() {
		if (caller != null && caller.eIsProxy()) {
			InternalEObject oldCaller = (InternalEObject)caller;
			caller = eResolveProxy(oldCaller);
			if (caller != oldCaller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeedbackPackage.MODEL_SPECIFIC_EVENT__CALLER, oldCaller, caller));
			}
		}
		return caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetCaller() {
		return caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaller(EObject newCaller) {
		EObject oldCaller = caller;
		caller = newCaller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.MODEL_SPECIFIC_EVENT__CALLER, oldCaller, caller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (EOperation)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeedbackPackage.MODEL_SPECIFIC_EVENT__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(EOperation newAction) {
		EOperation oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.MODEL_SPECIFIC_EVENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSolverEvent() {
		if (solverEvent != null && solverEvent.eIsProxy()) {
			InternalEObject oldSolverEvent = (InternalEObject)solverEvent;
			solverEvent = eResolveProxy(oldSolverEvent);
			if (solverEvent != oldSolverEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeedbackPackage.MODEL_SPECIFIC_EVENT__SOLVER_EVENT, oldSolverEvent, solverEvent));
			}
		}
		return solverEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSolverEvent() {
		return solverEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverEvent(EObject newSolverEvent) {
		EObject oldSolverEvent = solverEvent;
		solverEvent = newSolverEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.MODEL_SPECIFIC_EVENT__SOLVER_EVENT, oldSolverEvent, solverEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__CALLER:
				if (resolve) return getCaller();
				return basicGetCaller();
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__SOLVER_EVENT:
				if (resolve) return getSolverEvent();
				return basicGetSolverEvent();
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
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__CALLER:
				setCaller((EObject)newValue);
				return;
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__ACTION:
				setAction((EOperation)newValue);
				return;
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__SOLVER_EVENT:
				setSolverEvent((EObject)newValue);
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
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__CALLER:
				setCaller((EObject)null);
				return;
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__ACTION:
				setAction((EOperation)null);
				return;
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__SOLVER_EVENT:
				setSolverEvent((EObject)null);
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
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__CALLER:
				return caller != null;
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__ACTION:
				return action != null;
			case FeedbackPackage.MODEL_SPECIFIC_EVENT__SOLVER_EVENT:
				return solverEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelSpecificEventImpl
