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
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.util.ECLVisitor;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECL Block Def CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLBlockDefCSImpl#getEnterWhen <em>Enter When</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLBlockDefCSImpl#getLeaveWhen <em>Leave When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECLBlockDefCSImpl extends ECLDefCSImpl implements ECLBlockDefCS {
	/**
	 * The cached value of the '{@link #getEnterWhen() <em>Enter When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterWhen()
	 * @generated
	 * @ordered
	 */
	protected ExpCS enterWhen;

	/**
	 * The cached value of the '{@link #getLeaveWhen() <em>Leave When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaveWhen()
	 * @generated
	 * @ordered
	 */
	protected ExpCS leaveWhen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECLBlockDefCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoCCMLmappingPackage.Literals.ECL_BLOCK_DEF_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getEnterWhen() {
		return enterWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterWhen(ExpCS newEnterWhen, NotificationChain msgs) {
		ExpCS oldEnterWhen = enterWhen;
		enterWhen = newEnterWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN, oldEnterWhen, newEnterWhen);
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
	public void setEnterWhen(ExpCS newEnterWhen) {
		if (newEnterWhen != enterWhen) {
			NotificationChain msgs = null;
			if (enterWhen != null)
				msgs = ((InternalEObject) enterWhen).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN, null, msgs);
			if (newEnterWhen != null)
				msgs = ((InternalEObject) newEnterWhen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN, null, msgs);
			msgs = basicSetEnterWhen(newEnterWhen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN,
					newEnterWhen, newEnterWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getLeaveWhen() {
		return leaveWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeaveWhen(ExpCS newLeaveWhen, NotificationChain msgs) {
		ExpCS oldLeaveWhen = leaveWhen;
		leaveWhen = newLeaveWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN, oldLeaveWhen, newLeaveWhen);
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
	public void setLeaveWhen(ExpCS newLeaveWhen) {
		if (newLeaveWhen != leaveWhen) {
			NotificationChain msgs = null;
			if (leaveWhen != null)
				msgs = ((InternalEObject) leaveWhen).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN, null, msgs);
			if (newLeaveWhen != null)
				msgs = ((InternalEObject) newLeaveWhen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN, null, msgs);
			msgs = basicSetLeaveWhen(newLeaveWhen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN,
					newLeaveWhen, newLeaveWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final BaseCSVisitor<R> visitor) {
		return (R) visitor.getAdapter(ECLVisitor.class).visitECLBlockDefCS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN:
			return basicSetEnterWhen(null, msgs);
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN:
			return basicSetLeaveWhen(null, msgs);
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
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN:
			return getEnterWhen();
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN:
			return getLeaveWhen();
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
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN:
			setEnterWhen((ExpCS) newValue);
			return;
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN:
			setLeaveWhen((ExpCS) newValue);
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
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN:
			setEnterWhen((ExpCS) null);
			return;
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN:
			setLeaveWhen((ExpCS) null);
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
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__ENTER_WHEN:
			return enterWhen != null;
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS__LEAVE_WHEN:
			return leaveWhen != null;
		}
		return super.eIsSet(featureID);
	}

} //ECLBlockDefCSImpl
