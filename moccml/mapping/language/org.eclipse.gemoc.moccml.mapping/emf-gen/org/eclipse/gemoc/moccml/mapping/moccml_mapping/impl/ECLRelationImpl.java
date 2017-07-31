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
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.util.ECLVisitor;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.impl.ExpCSImpl;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.RelationDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECL Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLRelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLRelationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLRelationImpl#isIsAnAssertion <em>Is An Assertion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECLRelationImpl extends ExpCSImpl implements ECLRelation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelationDeclaration type;

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
	 * The default value of the '{@link #isIsAnAssertion() <em>Is An Assertion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAnAssertion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AN_ASSERTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAnAssertion() <em>Is An Assertion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAnAssertion()
	 * @generated
	 * @ordered
	 */
	protected boolean isAnAssertion = IS_AN_ASSERTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECLRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoCCMLmappingPackage.Literals.ECL_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDeclaration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (RelationDeclaration) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoCCMLmappingPackage.ECL_RELATION__TYPE,
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
	public RelationDeclaration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelationDeclaration newType) {
		RelationDeclaration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.ECL_RELATION__TYPE, oldType,
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
					MoCCMLmappingPackage.ECL_RELATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAnAssertion() {
		return isAnAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAnAssertion(boolean newIsAnAssertion) {
		boolean oldIsAnAssertion = isAnAssertion;
		isAnAssertion = newIsAnAssertion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.ECL_RELATION__IS_AN_ASSERTION,
					oldIsAnAssertion, isAnAssertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final BaseCSVisitor<R> visitor) {
		return (R) visitor.getAdapter(ECLVisitor.class).visitECLRelation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MoCCMLmappingPackage.ECL_RELATION__PARAMETERS:
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
		case MoCCMLmappingPackage.ECL_RELATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case MoCCMLmappingPackage.ECL_RELATION__PARAMETERS:
			return getParameters();
		case MoCCMLmappingPackage.ECL_RELATION__IS_AN_ASSERTION:
			return isIsAnAssertion();
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
		case MoCCMLmappingPackage.ECL_RELATION__TYPE:
			setType((RelationDeclaration) newValue);
			return;
		case MoCCMLmappingPackage.ECL_RELATION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends ExpCS>) newValue);
			return;
		case MoCCMLmappingPackage.ECL_RELATION__IS_AN_ASSERTION:
			setIsAnAssertion((Boolean) newValue);
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
		case MoCCMLmappingPackage.ECL_RELATION__TYPE:
			setType((RelationDeclaration) null);
			return;
		case MoCCMLmappingPackage.ECL_RELATION__PARAMETERS:
			getParameters().clear();
			return;
		case MoCCMLmappingPackage.ECL_RELATION__IS_AN_ASSERTION:
			setIsAnAssertion(IS_AN_ASSERTION_EDEFAULT);
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
		case MoCCMLmappingPackage.ECL_RELATION__TYPE:
			return type != null;
		case MoCCMLmappingPackage.ECL_RELATION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case MoCCMLmappingPackage.ECL_RELATION__IS_AN_ASSERTION:
			return isAnAssertion != IS_AN_ASSERTION_EDEFAULT;
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
		result.append(" (isAnAssertion: ");
		result.append(isAnAssertion);
		result.append(')');
		return result.toString();
	}

} //ECLRelationImpl
