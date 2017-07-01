/**
 */
package eastLight.impl;

import eastLight.AnalysisFunctionPrototype;
import eastLight.AnalysisFunctionType;
import eastLight.EastLightFactory;
import eastLight.EastLightPackage;
import eastLight.FlowPort;
import eastLight.FunctionTrigger;
import eastLight.PortDirection;
import eastLight.TriggerPolicyKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EastLightPackageImpl extends EPackageImpl implements EastLightPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisFunctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisFunctionPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portDirectionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eastLight.EastLightPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EastLightPackageImpl() {
		super(eNS_URI, EastLightFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EastLightPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EastLightPackage init() {
		if (isInited) return (EastLightPackage)EPackage.Registry.INSTANCE.getEPackage(EastLightPackage.eNS_URI);

		// Obtain or create and register package
		EastLightPackageImpl theEastLightPackage = (EastLightPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EastLightPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EastLightPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEastLightPackage.createPackageContents();

		// Initialize created meta-data
		theEastLightPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEastLightPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EastLightPackage.eNS_URI, theEastLightPackage);
		return theEastLightPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisFunctionType() {
		return analysisFunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunctionType_Base_Class() {
		return (EReference)analysisFunctionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunctionType_FunctionTrigger() {
		return (EReference)analysisFunctionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionTrigger() {
		return functionTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionTrigger_Base_Class() {
		return (EReference)functionTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionTrigger_TriggerCondition() {
		return (EAttribute)functionTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionTrigger_Port() {
		return (EReference)functionTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionTrigger_TriggerPolicyKind() {
		return (EAttribute)functionTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisFunctionPrototype() {
		return analysisFunctionPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunctionPrototype_Base_Property() {
		return (EReference)analysisFunctionPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunctionPrototype_FunctionTrigger() {
		return (EReference)analysisFunctionPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowPort() {
		return flowPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowPort_Base_Port() {
		return (EReference)flowPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowPort_Direction() {
		return (EAttribute)flowPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerPolicyKind() {
		return triggerPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortDirection() {
		return portDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EastLightFactory getEastLightFactory() {
		return (EastLightFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		analysisFunctionTypeEClass = createEClass(ANALYSIS_FUNCTION_TYPE);
		createEReference(analysisFunctionTypeEClass, ANALYSIS_FUNCTION_TYPE__BASE_CLASS);
		createEReference(analysisFunctionTypeEClass, ANALYSIS_FUNCTION_TYPE__FUNCTION_TRIGGER);

		functionTriggerEClass = createEClass(FUNCTION_TRIGGER);
		createEReference(functionTriggerEClass, FUNCTION_TRIGGER__BASE_CLASS);
		createEAttribute(functionTriggerEClass, FUNCTION_TRIGGER__TRIGGER_CONDITION);
		createEReference(functionTriggerEClass, FUNCTION_TRIGGER__PORT);
		createEAttribute(functionTriggerEClass, FUNCTION_TRIGGER__TRIGGER_POLICY_KIND);

		analysisFunctionPrototypeEClass = createEClass(ANALYSIS_FUNCTION_PROTOTYPE);
		createEReference(analysisFunctionPrototypeEClass, ANALYSIS_FUNCTION_PROTOTYPE__BASE_PROPERTY);
		createEReference(analysisFunctionPrototypeEClass, ANALYSIS_FUNCTION_PROTOTYPE__FUNCTION_TRIGGER);

		flowPortEClass = createEClass(FLOW_PORT);
		createEReference(flowPortEClass, FLOW_PORT__BASE_PORT);
		createEAttribute(flowPortEClass, FLOW_PORT__DIRECTION);

		// Create enums
		triggerPolicyKindEEnum = createEEnum(TRIGGER_POLICY_KIND);
		portDirectionEEnum = createEEnum(PORT_DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(analysisFunctionTypeEClass, AnalysisFunctionType.class, "AnalysisFunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisFunctionType_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, AnalysisFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnalysisFunctionType_FunctionTrigger(), this.getFunctionTrigger(), null, "functionTrigger", null, 0, 1, AnalysisFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionTriggerEClass, FunctionTrigger.class, "FunctionTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionTrigger_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, FunctionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFunctionTrigger_TriggerCondition(), theTypesPackage.getString(), "triggerCondition", "TODO", 1, 1, FunctionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionTrigger_Port(), theUMLPackage.getPort(), null, "port", null, 0, -1, FunctionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFunctionTrigger_TriggerPolicyKind(), this.getTriggerPolicyKind(), "triggerPolicyKind", "EVENT", 1, 1, FunctionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(analysisFunctionPrototypeEClass, AnalysisFunctionPrototype.class, "AnalysisFunctionPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisFunctionPrototype_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, AnalysisFunctionPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnalysisFunctionPrototype_FunctionTrigger(), this.getFunctionTrigger(), null, "functionTrigger", null, 0, 1, AnalysisFunctionPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowPortEClass, FlowPort.class, "FlowPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFlowPort_Direction(), this.getPortDirection(), "direction", null, 1, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(triggerPolicyKindEEnum, TriggerPolicyKind.class, "TriggerPolicyKind");
		addEEnumLiteral(triggerPolicyKindEEnum, TriggerPolicyKind.EVENT);
		addEEnumLiteral(triggerPolicyKindEEnum, TriggerPolicyKind.TIME);

		initEEnum(portDirectionEEnum, PortDirection.class, "PortDirection");
		addEEnumLiteral(portDirectionEEnum, PortDirection.IN);
		addEEnumLiteral(portDirectionEEnum, PortDirection.OUT);

		// Create resource
		createResource(eNS_URI);
	}

} //EastLightPackageImpl
