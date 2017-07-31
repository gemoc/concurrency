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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.When;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionModelImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionModelImpl#getWhenStatements <em>When Statements</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionModelImpl#getImportStatements <em>Import Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionModelImpl extends MinimalEObjectImpl.Container implements ActionModel {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelSpecificEvent> events;

	/**
	 * The cached value of the '{@link #getWhenStatements() <em>When Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<When> whenStatements;

	/**
	 * The cached value of the '{@link #getImportStatements() <em>Import Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportStatement> importStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeedbackPackage.Literals.ACTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelSpecificEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<ModelSpecificEvent>(ModelSpecificEvent.class, this, FeedbackPackage.ACTION_MODEL__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<When> getWhenStatements() {
		if (whenStatements == null) {
			whenStatements = new EObjectContainmentEList<When>(When.class, this, FeedbackPackage.ACTION_MODEL__WHEN_STATEMENTS);
		}
		return whenStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportStatement> getImportStatements() {
		if (importStatements == null) {
			importStatements = new EObjectContainmentEList<ImportStatement>(ImportStatement.class, this, FeedbackPackage.ACTION_MODEL__IMPORT_STATEMENTS);
		}
		return importStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeedbackPackage.ACTION_MODEL__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case FeedbackPackage.ACTION_MODEL__WHEN_STATEMENTS:
				return ((InternalEList<?>)getWhenStatements()).basicRemove(otherEnd, msgs);
			case FeedbackPackage.ACTION_MODEL__IMPORT_STATEMENTS:
				return ((InternalEList<?>)getImportStatements()).basicRemove(otherEnd, msgs);
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
			case FeedbackPackage.ACTION_MODEL__EVENTS:
				return getEvents();
			case FeedbackPackage.ACTION_MODEL__WHEN_STATEMENTS:
				return getWhenStatements();
			case FeedbackPackage.ACTION_MODEL__IMPORT_STATEMENTS:
				return getImportStatements();
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
			case FeedbackPackage.ACTION_MODEL__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends ModelSpecificEvent>)newValue);
				return;
			case FeedbackPackage.ACTION_MODEL__WHEN_STATEMENTS:
				getWhenStatements().clear();
				getWhenStatements().addAll((Collection<? extends When>)newValue);
				return;
			case FeedbackPackage.ACTION_MODEL__IMPORT_STATEMENTS:
				getImportStatements().clear();
				getImportStatements().addAll((Collection<? extends ImportStatement>)newValue);
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
			case FeedbackPackage.ACTION_MODEL__EVENTS:
				getEvents().clear();
				return;
			case FeedbackPackage.ACTION_MODEL__WHEN_STATEMENTS:
				getWhenStatements().clear();
				return;
			case FeedbackPackage.ACTION_MODEL__IMPORT_STATEMENTS:
				getImportStatements().clear();
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
			case FeedbackPackage.ACTION_MODEL__EVENTS:
				return events != null && !events.isEmpty();
			case FeedbackPackage.ACTION_MODEL__WHEN_STATEMENTS:
				return whenStatements != null && !whenStatements.isEmpty();
			case FeedbackPackage.ACTION_MODEL__IMPORT_STATEMENTS:
				return importStatements != null && !importStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionModelImpl
