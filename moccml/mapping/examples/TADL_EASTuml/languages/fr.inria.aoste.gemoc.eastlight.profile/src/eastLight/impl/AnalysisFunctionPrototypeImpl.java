/**
 */
package eastLight.impl;

import eastLight.AnalysisFunctionPrototype;
import eastLight.EastLightPackage;
import eastLight.FunctionTrigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eastLight.impl.AnalysisFunctionPrototypeImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link eastLight.impl.AnalysisFunctionPrototypeImpl#getFunctionTrigger <em>Function Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisFunctionPrototypeImpl extends EObjectImpl implements AnalysisFunctionPrototype {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

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
	protected AnalysisFunctionPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EastLightPackage.Literals.ANALYSIS_FUNCTION_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY, oldBase_Property, base_Property));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER, oldFunctionTrigger, functionTrigger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER, oldFunctionTrigger, functionTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER:
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
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER:
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
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER:
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
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY:
				return base_Property != null;
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER:
				return functionTrigger != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalysisFunctionPrototypeImpl
