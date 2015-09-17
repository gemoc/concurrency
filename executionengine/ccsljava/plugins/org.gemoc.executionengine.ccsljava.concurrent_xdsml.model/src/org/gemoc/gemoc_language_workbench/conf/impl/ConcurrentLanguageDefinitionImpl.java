/**
 */
package org.gemoc.gemoc_language_workbench.conf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.executionframework.xdsml_base.impl.LanguageDefinitionImpl;

import org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition;
import org.gemoc.gemoc_language_workbench.conf.DSAProject;
import org.gemoc.gemoc_language_workbench.conf.DSEProject;
import org.gemoc.gemoc_language_workbench.conf.MoCCProject;
import org.gemoc.gemoc_language_workbench.conf.confPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrent Language Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gemoc_language_workbench.conf.impl.ConcurrentLanguageDefinitionImpl#getDsaProject <em>Dsa Project</em>}</li>
 *   <li>{@link org.gemoc.gemoc_language_workbench.conf.impl.ConcurrentLanguageDefinitionImpl#getMoCCProject <em>Mo CC Project</em>}</li>
 *   <li>{@link org.gemoc.gemoc_language_workbench.conf.impl.ConcurrentLanguageDefinitionImpl#getDSEProject <em>DSE Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcurrentLanguageDefinitionImpl extends LanguageDefinitionImpl implements ConcurrentLanguageDefinition {
	/**
	 * The cached value of the '{@link #getDsaProject() <em>Dsa Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsaProject()
	 * @generated
	 * @ordered
	 */
	protected DSAProject dsaProject;

	/**
	 * The cached value of the '{@link #getMoCCProject() <em>Mo CC Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoCCProject()
	 * @generated
	 * @ordered
	 */
	protected MoCCProject moCCProject;

	/**
	 * The cached value of the '{@link #getDSEProject() <em>DSE Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSEProject()
	 * @generated
	 * @ordered
	 */
	protected DSEProject dSEProject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrentLanguageDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return confPackage.Literals.CONCURRENT_LANGUAGE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAProject getDsaProject() {
		return dsaProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsaProject(DSAProject newDsaProject, NotificationChain msgs) {
		DSAProject oldDsaProject = dsaProject;
		dsaProject = newDsaProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT, oldDsaProject, newDsaProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsaProject(DSAProject newDsaProject) {
		if (newDsaProject != dsaProject) {
			NotificationChain msgs = null;
			if (dsaProject != null)
				msgs = ((InternalEObject)dsaProject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT, null, msgs);
			if (newDsaProject != null)
				msgs = ((InternalEObject)newDsaProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT, null, msgs);
			msgs = basicSetDsaProject(newDsaProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT, newDsaProject, newDsaProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCProject getMoCCProject() {
		return moCCProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMoCCProject(MoCCProject newMoCCProject, NotificationChain msgs) {
		MoCCProject oldMoCCProject = moCCProject;
		moCCProject = newMoCCProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT, oldMoCCProject, newMoCCProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoCCProject(MoCCProject newMoCCProject) {
		if (newMoCCProject != moCCProject) {
			NotificationChain msgs = null;
			if (moCCProject != null)
				msgs = ((InternalEObject)moCCProject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT, null, msgs);
			if (newMoCCProject != null)
				msgs = ((InternalEObject)newMoCCProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT, null, msgs);
			msgs = basicSetMoCCProject(newMoCCProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT, newMoCCProject, newMoCCProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSEProject getDSEProject() {
		return dSEProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSEProject(DSEProject newDSEProject, NotificationChain msgs) {
		DSEProject oldDSEProject = dSEProject;
		dSEProject = newDSEProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT, oldDSEProject, newDSEProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSEProject(DSEProject newDSEProject) {
		if (newDSEProject != dSEProject) {
			NotificationChain msgs = null;
			if (dSEProject != null)
				msgs = ((InternalEObject)dSEProject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT, null, msgs);
			if (newDSEProject != null)
				msgs = ((InternalEObject)newDSEProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT, null, msgs);
			msgs = basicSetDSEProject(newDSEProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT, newDSEProject, newDSEProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT:
				return basicSetDsaProject(null, msgs);
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT:
				return basicSetMoCCProject(null, msgs);
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT:
				return basicSetDSEProject(null, msgs);
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
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT:
				return getDsaProject();
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT:
				return getMoCCProject();
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT:
				return getDSEProject();
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
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT:
				setDsaProject((DSAProject)newValue);
				return;
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT:
				setMoCCProject((MoCCProject)newValue);
				return;
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT:
				setDSEProject((DSEProject)newValue);
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
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT:
				setDsaProject((DSAProject)null);
				return;
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT:
				setMoCCProject((MoCCProject)null);
				return;
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT:
				setDSEProject((DSEProject)null);
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
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT:
				return dsaProject != null;
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT:
				return moCCProject != null;
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT:
				return dSEProject != null;
		}
		return super.eIsSet(featureID);
	}

} //ConcurrentLanguageDefinitionImpl
