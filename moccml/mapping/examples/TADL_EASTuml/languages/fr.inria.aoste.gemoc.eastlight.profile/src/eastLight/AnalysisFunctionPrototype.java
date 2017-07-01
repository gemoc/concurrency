/**
 */
package eastLight;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eastLight.AnalysisFunctionPrototype#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link eastLight.AnalysisFunctionPrototype#getFunctionTrigger <em>Function Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see eastLight.EastLightPackage#getAnalysisFunctionPrototype()
 * @model
 * @generated
 */
public interface AnalysisFunctionPrototype extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see eastLight.EastLightPackage#getAnalysisFunctionPrototype_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link eastLight.AnalysisFunctionPrototype#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

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
	 * @see eastLight.EastLightPackage#getAnalysisFunctionPrototype_FunctionTrigger()
	 * @model ordered="false"
	 * @generated
	 */
	FunctionTrigger getFunctionTrigger();

	/**
	 * Sets the value of the '{@link eastLight.AnalysisFunctionPrototype#getFunctionTrigger <em>Function Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Trigger</em>' reference.
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	void setFunctionTrigger(FunctionTrigger value);

} // AnalysisFunctionPrototype
