/**
 */
package eastLight.impl;

import eastLight.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EastLightFactoryImpl extends EFactoryImpl implements EastLightFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EastLightFactory init() {
		try {
			EastLightFactory theEastLightFactory = (EastLightFactory)EPackage.Registry.INSTANCE.getEFactory("http://fr.inria.aoste.gemoc.eastadl"); 
			if (theEastLightFactory != null) {
				return theEastLightFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EastLightFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EastLightFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EastLightPackage.ANALYSIS_FUNCTION_TYPE: return createAnalysisFunctionType();
			case EastLightPackage.FUNCTION_TRIGGER: return createFunctionTrigger();
			case EastLightPackage.ANALYSIS_FUNCTION_PROTOTYPE: return createAnalysisFunctionPrototype();
			case EastLightPackage.FLOW_PORT: return createFlowPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EastLightPackage.TRIGGER_POLICY_KIND:
				return createTriggerPolicyKindFromString(eDataType, initialValue);
			case EastLightPackage.PORT_DIRECTION:
				return createPortDirectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EastLightPackage.TRIGGER_POLICY_KIND:
				return convertTriggerPolicyKindToString(eDataType, instanceValue);
			case EastLightPackage.PORT_DIRECTION:
				return convertPortDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionType createAnalysisFunctionType() {
		AnalysisFunctionTypeImpl analysisFunctionType = new AnalysisFunctionTypeImpl();
		return analysisFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTrigger createFunctionTrigger() {
		FunctionTriggerImpl functionTrigger = new FunctionTriggerImpl();
		return functionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionPrototype createAnalysisFunctionPrototype() {
		AnalysisFunctionPrototypeImpl analysisFunctionPrototype = new AnalysisFunctionPrototypeImpl();
		return analysisFunctionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowPort createFlowPort() {
		FlowPortImpl flowPort = new FlowPortImpl();
		return flowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerPolicyKind createTriggerPolicyKindFromString(EDataType eDataType, String initialValue) {
		TriggerPolicyKind result = TriggerPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirection createPortDirectionFromString(EDataType eDataType, String initialValue) {
		PortDirection result = PortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EastLightPackage getEastLightPackage() {
		return (EastLightPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EastLightPackage getPackage() {
		return EastLightPackage.eINSTANCE;
	}

} //EastLightFactoryImpl
