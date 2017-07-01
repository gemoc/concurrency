/**
 */
package eastLight;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eastLight.AnalysisFunctionType#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link eastLight.AnalysisFunctionType#getFunctionTrigger <em>Function Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see eastLight.EastLightPackage#getAnalysisFunctionType()
 * @model
 * @generated
 */
public interface AnalysisFunctionType extends EObject {
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
	 * @see eastLight.EastLightPackage#getAnalysisFunctionType_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link eastLight.AnalysisFunctionType#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Function Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Trigger</em>' reference.
	 * @see #setFunctionTrigger(FunctionTrigger)
	 * @see eastLight.EastLightPackage#getAnalysisFunctionType_FunctionTrigger()
	 * @model ordered="false"
	 * @generated
	 */
	FunctionTrigger getFunctionTrigger();

	/**
	 * Sets the value of the '{@link eastLight.AnalysisFunctionType#getFunctionTrigger <em>Function Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Trigger</em>' reference.
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	void setFunctionTrigger(FunctionTrigger value);

} // AnalysisFunctionType
