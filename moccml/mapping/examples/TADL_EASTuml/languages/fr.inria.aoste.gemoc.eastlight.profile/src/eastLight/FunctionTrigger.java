/**
 */
package eastLight;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eastLight.FunctionTrigger#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link eastLight.FunctionTrigger#getTriggerCondition <em>Trigger Condition</em>}</li>
 *   <li>{@link eastLight.FunctionTrigger#getPort <em>Port</em>}</li>
 *   <li>{@link eastLight.FunctionTrigger#getTriggerPolicyKind <em>Trigger Policy Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see eastLight.EastLightPackage#getFunctionTrigger()
 * @model
 * @generated
 */
public interface FunctionTrigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see eastLight.EastLightPackage#getFunctionTrigger_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link eastLight.FunctionTrigger#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Trigger Condition</b></em>' attribute.
	 * The default value is <code>"TODO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Condition</em>' attribute.
	 * @see #setTriggerCondition(String)
	 * @see eastLight.EastLightPackage#getFunctionTrigger_TriggerCondition()
	 * @model default="TODO" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTriggerCondition();

	/**
	 * Sets the value of the '{@link eastLight.FunctionTrigger#getTriggerCondition <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Condition</em>' attribute.
	 * @see #getTriggerCondition()
	 * @generated
	 */
	void setTriggerCondition(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see eastLight.EastLightPackage#getFunctionTrigger_Port()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getPort()
	 * @generated
	 */
	Port getPort(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Port} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Port} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getPort()
	 * @generated
	 */
	Port getPort(String name, Type type, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Trigger Policy Kind</b></em>' attribute.
	 * The default value is <code>"EVENT"</code>.
	 * The literals are from the enumeration {@link eastLight.TriggerPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Policy Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Policy Kind</em>' attribute.
	 * @see eastLight.TriggerPolicyKind
	 * @see #setTriggerPolicyKind(TriggerPolicyKind)
	 * @see eastLight.EastLightPackage#getFunctionTrigger_TriggerPolicyKind()
	 * @model default="EVENT" required="true" ordered="false"
	 * @generated
	 */
	TriggerPolicyKind getTriggerPolicyKind();

	/**
	 * Sets the value of the '{@link eastLight.FunctionTrigger#getTriggerPolicyKind <em>Trigger Policy Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Policy Kind</em>' attribute.
	 * @see eastLight.TriggerPolicyKind
	 * @see #getTriggerPolicyKind()
	 * @generated
	 */
	void setTriggerPolicyKind(TriggerPolicyKind value);

} // FunctionTrigger
