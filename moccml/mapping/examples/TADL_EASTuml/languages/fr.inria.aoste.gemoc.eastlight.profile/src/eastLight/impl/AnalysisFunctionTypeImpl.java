/**
 */
package eastLight.impl;

import eastLight.AnalysisFunctionType;
import eastLight.EastLightPackage;
import eastLight.FunctionTrigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eastLight.impl.AnalysisFunctionTypeImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link eastLight.impl.AnalysisFunctionTypeImpl#getFunctionTrigger <em>Function Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisFunctionTypeImpl extends EObjectImpl implements AnalysisFunctionType {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getFunctionTrigger() <em>Function Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionTrigger()
	 * @generated
	 * @ordered
	 */
	protected FunctionTrigger functionTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisFunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EastLightPackage.Literals.ANALYSIS_FUNCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EastLightPackage.ANALYSIS_FUNCTION_TYPE__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EastLightPackage.ANALYSIS_FUNCTION_TYPE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTrigger getFunctionTrigger() {
		if (functionTrigger != null && functionTrigger.eIsProxy()) {
			InternalEObject oldFunctionTrigger = (InternalEObject)functionTrigger;
			functionTrigger = (FunctionTrigger)eResolveProxy(oldFunctionTrigger);
			if (functionTrigger != oldFunctionTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EastLightPackage.ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER, oldFunctionTrigger, functionTrigger));
			}
		}
		return functionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTrigger basicGetFunctionTrigger() {
		return functionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionTrigger(FunctionTrigger newFunctionTrigger) {
		FunctionTrigger oldFunctionTrigger = functionTrigger;
		functionTrigger = newFunctionTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EastLightPackage.ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER, oldFunctionTrigger, functionTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER:
				if (resolve) return getFunctionTrigger();
				return basicGetFunctionTrigger();
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
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER:
				setFunctionTrigger((FunctionTrigger)newValue);
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
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER:
				setFunctionTrigger((FunctionTrigger)null);
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
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE__BASE_CLASS:
				return base_Class != null;
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER:
				return functionTrigger != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalysisFunctionTypeImpl
