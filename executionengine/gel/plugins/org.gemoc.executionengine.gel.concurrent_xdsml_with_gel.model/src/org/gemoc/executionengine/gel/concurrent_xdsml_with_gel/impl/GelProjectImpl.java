/**
 */
package org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.Concurrent_xdsml_with_gelPackage;
import org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.GelProject;

import org.gemoc.executionframework.xdsml_base.impl.ProjectResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gel Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.GelProjectImpl#getGelSpecificationURI <em>Gel Specification URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GelProjectImpl extends ProjectResourceImpl implements GelProject {
	/**
	 * The default value of the '{@link #getGelSpecificationURI() <em>Gel Specification URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGelSpecificationURI()
	 * @generated
	 * @ordered
	 */
	protected static final String GEL_SPECIFICATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGelSpecificationURI() <em>Gel Specification URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGelSpecificationURI()
	 * @generated
	 * @ordered
	 */
	protected String gelSpecificationURI = GEL_SPECIFICATION_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GelProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Concurrent_xdsml_with_gelPackage.Literals.GEL_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGelSpecificationURI() {
		return gelSpecificationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGelSpecificationURI(String newGelSpecificationURI) {
		String oldGelSpecificationURI = gelSpecificationURI;
		gelSpecificationURI = newGelSpecificationURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Concurrent_xdsml_with_gelPackage.GEL_PROJECT__GEL_SPECIFICATION_URI, oldGelSpecificationURI, gelSpecificationURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Concurrent_xdsml_with_gelPackage.GEL_PROJECT__GEL_SPECIFICATION_URI:
				return getGelSpecificationURI();
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
			case Concurrent_xdsml_with_gelPackage.GEL_PROJECT__GEL_SPECIFICATION_URI:
				setGelSpecificationURI((String)newValue);
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
			case Concurrent_xdsml_with_gelPackage.GEL_PROJECT__GEL_SPECIFICATION_URI:
				setGelSpecificationURI(GEL_SPECIFICATION_URI_EDEFAULT);
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
			case Concurrent_xdsml_with_gelPackage.GEL_PROJECT__GEL_SPECIFICATION_URI:
				return GEL_SPECIFICATION_URI_EDEFAULT == null ? gelSpecificationURI != null : !GEL_SPECIFICATION_URI_EDEFAULT.equals(gelSpecificationURI);
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
		result.append(" (GelSpecificationURI: ");
		result.append(gelSpecificationURI);
		result.append(')');
		return result.toString();
	}

} //GelProjectImpl
