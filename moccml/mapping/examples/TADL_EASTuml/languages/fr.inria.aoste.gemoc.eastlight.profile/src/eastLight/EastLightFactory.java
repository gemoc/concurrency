/**
 */
package eastLight;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eastLight.EastLightPackage
 * @generated
 */
public interface EastLightFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EastLightFactory eINSTANCE = eastLight.impl.EastLightFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analysis Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Function Type</em>'.
	 * @generated
	 */
	AnalysisFunctionType createAnalysisFunctionType();

	/**
	 * Returns a new object of class '<em>Function Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Trigger</em>'.
	 * @generated
	 */
	FunctionTrigger createFunctionTrigger();

	/**
	 * Returns a new object of class '<em>Analysis Function Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Function Prototype</em>'.
	 * @generated
	 */
	AnalysisFunctionPrototype createAnalysisFunctionPrototype();

	/**
	 * Returns a new object of class '<em>Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Port</em>'.
	 * @generated
	 */
	FlowPort createFlowPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EastLightPackage getEastLightPackage();

} //EastLightFactory
