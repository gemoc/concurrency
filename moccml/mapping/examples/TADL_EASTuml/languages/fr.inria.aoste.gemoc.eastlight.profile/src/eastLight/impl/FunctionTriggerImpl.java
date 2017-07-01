/**
 */
package eastLight.impl;

import eastLight.EastLightPackage;
import eastLight.FunctionTrigger;
import eastLight.TriggerPolicyKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eastLight.impl.FunctionTriggerImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link eastLight.impl.FunctionTriggerImpl#getTriggerCondition <em>Trigger Condition</em>}</li>
 *   <li>{@link eastLight.impl.FunctionTriggerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link eastLight.impl.FunctionTriggerImpl#getTriggerPolicyKind <em>Trigger Policy Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionTriggerImpl extends EObjectImpl implements FunctionTrigger {
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
	 * The default value of the '{@link #getTriggerCondition() <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_CONDITION_EDEFAULT = "TODO";

	/**
	 * The cached value of the '{@link #getTriggerCondition() <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCondition()
	 * @generated
	 * @ordered
	 */
	protected String triggerCondition = TRIGGER_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The default value of the '{@link #getTriggerPolicyKind() <em>Trigger Policy Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPolicyKind()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerPolicyKind TRIGGER_POLICY_KIND_EDEFAULT = TriggerPolicyKind.EVENT;

	/**
	 * The cached value of the '{@link #getTriggerPolicyKind() <em>Trigger Policy Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPolicyKind()
	 * @generated
	 * @ordered
	 */
	protected TriggerPolicyKind triggerPolicyKind = TRIGGER_POLICY_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EastLightPackage.Literals.FUNCTION_TRIGGER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EastLightPackage.FUNCTION_TRIGGER__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EastLightPackage.FUNCTION_TRIGGER__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerCondition() {
		return triggerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerCondition(String newTriggerCondition) {
		String oldTriggerCondition = triggerCondition;
		triggerCondition = newTriggerCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EastLightPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION, oldTriggerCondition, triggerCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectResolvingEList<Port>(Port.class, this, EastLightPackage.FUNCTION_TRIGGER__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort(String name, Type type) {
		return getPort(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort(String name, Type type, boolean ignoreCase) {
		portLoop: for (Port port : getPort()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(port.getName()) : name.equals(port.getName())))
				continue portLoop;
			if (type != null && !type.equals(port.getType()))
				continue portLoop;
			return port;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerPolicyKind getTriggerPolicyKind() {
		return triggerPolicyKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerPolicyKind(TriggerPolicyKind newTriggerPolicyKind) {
		TriggerPolicyKind oldTriggerPolicyKind = triggerPolicyKind;
		triggerPolicyKind = newTriggerPolicyKind == null ? TRIGGER_POLICY_KIND_EDEFAULT : newTriggerPolicyKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EastLightPackage.FUNCTION_TRIGGER__TRIGGER_POLICY_KIND, oldTriggerPolicyKind, triggerPolicyKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EastLightPackage.FUNCTION_TRIGGER__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case EastLightPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION:
				return getTriggerCondition();
			case EastLightPackage.FUNCTION_TRIGGER__PORT:
				return getPort();
			case EastLightPackage.FUNCTION_TRIGGER__TRIGGER_POLICY_KIND:
				return getTriggerPolicyKind();
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
			case EastLightPackage.FUNCTION_TRIGGER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case EastLightPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION:
				setTriggerCondition((String)newValue);
				return;
			case EastLightPackage.FUNCTION_TRIGGER__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case EastLightPackage.FUNCTION_TRIGGER__TRIGGER_POLICY_KIND:
				setTriggerPolicyKind((TriggerPolicyKind)newValue);
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
			case EastLightPackage.FUNCTION_TRIGGER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case EastLightPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION:
				setTriggerCondition(TRIGGER_CONDITION_EDEFAULT);
				return;
			case EastLightPackage.FUNCTION_TRIGGER__PORT:
				getPort().clear();
				return;
			case EastLightPackage.FUNCTION_TRIGGER__TRIGGER_POLICY_KIND:
				setTriggerPolicyKind(TRIGGER_POLICY_KIND_EDEFAULT);
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
			case EastLightPackage.FUNCTION_TRIGGER__BASE_CLASS:
				return base_Class != null;
			case EastLightPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION:
				return TRIGGER_CONDITION_EDEFAULT == null ? triggerCondition != null : !TRIGGER_CONDITION_EDEFAULT.equals(triggerCondition);
			case EastLightPackage.FUNCTION_TRIGGER__PORT:
				return port != null && !port.isEmpty();
			case EastLightPackage.FUNCTION_TRIGGER__TRIGGER_POLICY_KIND:
				return triggerPolicyKind != TRIGGER_POLICY_KIND_EDEFAULT;
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
		result.append(" (triggerCondition: ");
		result.append(triggerCondition);
		result.append(", triggerPolicyKind: ");
		result.append(triggerPolicyKind);
		result.append(')');
		return result.toString();
	}

} //FunctionTriggerImpl
