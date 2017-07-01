/**
 */
package eastLight;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eastLight.EastLightFactory
 * @model kind="package"
 * @generated
 */
public interface EastLightPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eastLight";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.gemoc.eastadl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eastLight";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EastLightPackage eINSTANCE = eastLight.impl.EastLightPackageImpl.init();

	/**
	 * The meta object id for the '{@link eastLight.impl.AnalysisFunctionTypeImpl <em>Analysis Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eastLight.impl.AnalysisFunctionTypeImpl
	 * @see eastLight.impl.EastLightPackageImpl#getAnalysisFunctionType()
	 * @generated
	 */
	int ANALYSIS_FUNCTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Function Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER = 1;

	/**
	 * The number of structural features of the '<em>Analysis Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link eastLight.impl.FunctionTriggerImpl <em>Function Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eastLight.impl.FunctionTriggerImpl
	 * @see eastLight.impl.EastLightPackageImpl#getFunctionTrigger()
	 * @generated
	 */
	int FUNCTION_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Trigger Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__TRIGGER_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__PORT = 2;

	/**
	 * The feature id for the '<em><b>Trigger Policy Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__TRIGGER_POLICY_KIND = 3;

	/**
	 * The number of structural features of the '<em>Function Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link eastLight.impl.AnalysisFunctionPrototypeImpl <em>Analysis Function Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eastLight.impl.AnalysisFunctionPrototypeImpl
	 * @see eastLight.impl.EastLightPackageImpl#getAnalysisFunctionPrototype()
	 * @generated
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE = 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Function Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER = 1;

	/**
	 * The number of structural features of the '<em>Analysis Function Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link eastLight.impl.FlowPortImpl <em>Flow Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eastLight.impl.FlowPortImpl
	 * @see eastLight.impl.EastLightPackageImpl#getFlowPort()
	 * @generated
	 */
	int FLOW_PORT = 3;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link eastLight.TriggerPolicyKind <em>Trigger Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eastLight.TriggerPolicyKind
	 * @see eastLight.impl.EastLightPackageImpl#getTriggerPolicyKind()
	 * @generated
	 */
	int TRIGGER_POLICY_KIND = 4;


	/**
	 * The meta object id for the '{@link eastLight.PortDirection <em>Port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eastLight.PortDirection
	 * @see eastLight.impl.EastLightPackageImpl#getPortDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 5;


	/**
	 * Returns the meta object for class '{@link eastLight.AnalysisFunctionType <em>Analysis Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Function Type</em>'.
	 * @see eastLight.AnalysisFunctionType
	 * @generated
	 */
	EClass getAnalysisFunctionType();

	/**
	 * Returns the meta object for the reference '{@link eastLight.AnalysisFunctionType#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see eastLight.AnalysisFunctionType#getBase_Class()
	 * @see #getAnalysisFunctionType()
	 * @generated
	 */
	EReference getAnalysisFunctionType_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link eastLight.AnalysisFunctionType#getFunctionTrigger <em>Function Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Trigger</em>'.
	 * @see eastLight.AnalysisFunctionType#getFunctionTrigger()
	 * @see #getAnalysisFunctionType()
	 * @generated
	 */
	EReference getAnalysisFunctionType_FunctionTrigger();

	/**
	 * Returns the meta object for class '{@link eastLight.FunctionTrigger <em>Function Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Trigger</em>'.
	 * @see eastLight.FunctionTrigger
	 * @generated
	 */
	EClass getFunctionTrigger();

	/**
	 * Returns the meta object for the reference '{@link eastLight.FunctionTrigger#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see eastLight.FunctionTrigger#getBase_Class()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EReference getFunctionTrigger_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link eastLight.FunctionTrigger#getTriggerCondition <em>Trigger Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Condition</em>'.
	 * @see eastLight.FunctionTrigger#getTriggerCondition()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EAttribute getFunctionTrigger_TriggerCondition();

	/**
	 * Returns the meta object for the reference list '{@link eastLight.FunctionTrigger#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see eastLight.FunctionTrigger#getPort()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EReference getFunctionTrigger_Port();

	/**
	 * Returns the meta object for the attribute '{@link eastLight.FunctionTrigger#getTriggerPolicyKind <em>Trigger Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Policy Kind</em>'.
	 * @see eastLight.FunctionTrigger#getTriggerPolicyKind()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EAttribute getFunctionTrigger_TriggerPolicyKind();

	/**
	 * Returns the meta object for class '{@link eastLight.AnalysisFunctionPrototype <em>Analysis Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Function Prototype</em>'.
	 * @see eastLight.AnalysisFunctionPrototype
	 * @generated
	 */
	EClass getAnalysisFunctionPrototype();

	/**
	 * Returns the meta object for the reference '{@link eastLight.AnalysisFunctionPrototype#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see eastLight.AnalysisFunctionPrototype#getBase_Property()
	 * @see #getAnalysisFunctionPrototype()
	 * @generated
	 */
	EReference getAnalysisFunctionPrototype_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link eastLight.AnalysisFunctionPrototype#getFunctionTrigger <em>Function Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Trigger</em>'.
	 * @see eastLight.AnalysisFunctionPrototype#getFunctionTrigger()
	 * @see #getAnalysisFunctionPrototype()
	 * @generated
	 */
	EReference getAnalysisFunctionPrototype_FunctionTrigger();

	/**
	 * Returns the meta object for class '{@link eastLight.FlowPort <em>Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Port</em>'.
	 * @see eastLight.FlowPort
	 * @generated
	 */
	EClass getFlowPort();

	/**
	 * Returns the meta object for the reference '{@link eastLight.FlowPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see eastLight.FlowPort#getBase_Port()
	 * @see #getFlowPort()
	 * @generated
	 */
	EReference getFlowPort_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link eastLight.FlowPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see eastLight.FlowPort#getDirection()
	 * @see #getFlowPort()
	 * @generated
	 */
	EAttribute getFlowPort_Direction();

	/**
	 * Returns the meta object for enum '{@link eastLight.TriggerPolicyKind <em>Trigger Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Policy Kind</em>'.
	 * @see eastLight.TriggerPolicyKind
	 * @generated
	 */
	EEnum getTriggerPolicyKind();

	/**
	 * Returns the meta object for enum '{@link eastLight.PortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction</em>'.
	 * @see eastLight.PortDirection
	 * @generated
	 */
	EEnum getPortDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EastLightFactory getEastLightFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eastLight.impl.AnalysisFunctionTypeImpl <em>Analysis Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eastLight.impl.AnalysisFunctionTypeImpl
		 * @see eastLight.impl.EastLightPackageImpl#getAnalysisFunctionType()
		 * @generated
		 */
		EClass ANALYSIS_FUNCTION_TYPE = eINSTANCE.getAnalysisFunctionType();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION_TYPE__BASE_CLASS = eINSTANCE.getAnalysisFunctionType_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Function Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER = eINSTANCE.getAnalysisFunctionType_FunctionTrigger();

		/**
		 * The meta object literal for the '{@link eastLight.impl.FunctionTriggerImpl <em>Function Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eastLight.impl.FunctionTriggerImpl
		 * @see eastLight.impl.EastLightPackageImpl#getFunctionTrigger()
		 * @generated
		 */
		EClass FUNCTION_TRIGGER = eINSTANCE.getFunctionTrigger();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TRIGGER__BASE_CLASS = eINSTANCE.getFunctionTrigger_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Trigger Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TRIGGER__TRIGGER_CONDITION = eINSTANCE.getFunctionTrigger_TriggerCondition();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TRIGGER__PORT = eINSTANCE.getFunctionTrigger_Port();

		/**
		 * The meta object literal for the '<em><b>Trigger Policy Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TRIGGER__TRIGGER_POLICY_KIND = eINSTANCE.getFunctionTrigger_TriggerPolicyKind();

		/**
		 * The meta object literal for the '{@link eastLight.impl.AnalysisFunctionPrototypeImpl <em>Analysis Function Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eastLight.impl.AnalysisFunctionPrototypeImpl
		 * @see eastLight.impl.EastLightPackageImpl#getAnalysisFunctionPrototype()
		 * @generated
		 */
		EClass ANALYSIS_FUNCTION_PROTOTYPE = eINSTANCE.getAnalysisFunctionPrototype();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY = eINSTANCE.getAnalysisFunctionPrototype_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Function Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER = eINSTANCE.getAnalysisFunctionPrototype_FunctionTrigger();

		/**
		 * The meta object literal for the '{@link eastLight.impl.FlowPortImpl <em>Flow Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eastLight.impl.FlowPortImpl
		 * @see eastLight.impl.EastLightPackageImpl#getFlowPort()
		 * @generated
		 */
		EClass FLOW_PORT = eINSTANCE.getFlowPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_PORT__BASE_PORT = eINSTANCE.getFlowPort_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PORT__DIRECTION = eINSTANCE.getFlowPort_Direction();

		/**
		 * The meta object literal for the '{@link eastLight.TriggerPolicyKind <em>Trigger Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eastLight.TriggerPolicyKind
		 * @see eastLight.impl.EastLightPackageImpl#getTriggerPolicyKind()
		 * @generated
		 */
		EEnum TRIGGER_POLICY_KIND = eINSTANCE.getTriggerPolicyKind();

		/**
		 * The meta object literal for the '{@link eastLight.PortDirection <em>Port Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eastLight.PortDirection
		 * @see eastLight.impl.EastLightPackageImpl#getPortDirection()
		 * @generated
		 */
		EEnum PORT_DIRECTION = eINSTANCE.getPortDirection();

	}

} //EastLightPackage
