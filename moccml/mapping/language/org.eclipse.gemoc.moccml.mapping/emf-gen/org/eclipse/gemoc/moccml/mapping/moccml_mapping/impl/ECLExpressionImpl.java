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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.util.ECLVisitor;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.impl.ExpCSImpl;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ExpressionDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECL Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLExpressionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECLExpressionImpl extends ExpCSImpl implements ECLExpression {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExpressionDeclaration type;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpCS> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECLExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoCCMLmappingPackage.Literals.ECL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionDeclaration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (ExpressionDeclaration) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoCCMLmappingPackage.ECL_EXPRESSION__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionDeclaration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExpressionDeclaration newType) {
		ExpressionDeclaration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.ECL_EXPRESSION__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpCS> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ExpCS>(ExpCS.class, this,
					MoCCMLmappingPackage.ECL_EXPRESSION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final BaseCSVisitor<R> visitor) {
		return (R) visitor.getAdapter(ECLVisitor.class).visitECLExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MoCCMLmappingPackage.ECL_EXPRESSION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case MoCCMLmappingPackage.ECL_EXPRESSION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case MoCCMLmappingPackage.ECL_EXPRESSION__PARAMETERS:
			return getParameters();
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
		case MoCCMLmappingPackage.ECL_EXPRESSION__TYPE:
			setType((ExpressionDeclaration) newValue);
			return;
		case MoCCMLmappingPackage.ECL_EXPRESSION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends ExpCS>) newValue);
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
		case MoCCMLmappingPackage.ECL_EXPRESSION__TYPE:
			setType((ExpressionDeclaration) null);
			return;
		case MoCCMLmappingPackage.ECL_EXPRESSION__PARAMETERS:
			getParameters().clear();
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
		case MoCCMLmappingPackage.ECL_EXPRESSION__TYPE:
			return type != null;
		case MoCCMLmappingPackage.ECL_EXPRESSION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ECLExpressionImpl
