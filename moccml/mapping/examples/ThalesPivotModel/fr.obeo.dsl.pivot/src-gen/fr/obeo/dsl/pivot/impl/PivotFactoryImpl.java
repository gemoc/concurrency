/**
 */
package fr.obeo.dsl.pivot.impl;

import fr.obeo.dsl.pivot.ActivationType;
import fr.obeo.dsl.pivot.BusComm;
import fr.obeo.dsl.pivot.Chain;
import fr.obeo.dsl.pivot.Fragment;
import fr.obeo.dsl.pivot.HwResource;
import fr.obeo.dsl.pivot.Jitter;
import fr.obeo.dsl.pivot.PivotFactory;
import fr.obeo.dsl.pivot.PivotPackage;
import fr.obeo.dsl.pivot.Sink;
import fr.obeo.dsl.pivot.Source;
import fr.obeo.dsl.pivot.SwSchedulableResource;
import fr.obeo.dsl.pivot.Task;

import fr.obeo.dsl.pivot.datatype.Duration;
import fr.obeo.dsl.pivot.datatype.Interval;

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
public class PivotFactoryImpl extends EFactoryImpl implements PivotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PivotFactory init() {
		try {
			PivotFactory thePivotFactory = (PivotFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeo.fr/dsl/pivot/1.0.0"); 
			if (thePivotFactory != null) {
				return thePivotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PivotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotFactoryImpl() {
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
			case PivotPackage.SOURCE: return createSource();
			case PivotPackage.SINK: return createSink();
			case PivotPackage.HW_RESOURCE: return createHwResource();
			case PivotPackage.TASK: return createTask();
			case PivotPackage.CHAIN: return createChain();
			case PivotPackage.FRAGMENT: return createFragment();
			case PivotPackage.BUS_COMM: return createBusComm();
			case PivotPackage.SYSTEM: return createSystem();
			case PivotPackage.JITTER: return createJitter();
			case PivotPackage.SW_SCHEDULABLE_RESOURCE: return createSwSchedulableResource();
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
			case PivotPackage.ACTIVATION_TYPE:
				return createActivationTypeFromString(eDataType, initialValue);
			case PivotPackage.INTERVAL:
				return createIntervalFromString(eDataType, initialValue);
			case PivotPackage.DURATION:
				return createDurationFromString(eDataType, initialValue);
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
			case PivotPackage.ACTIVATION_TYPE:
				return convertActivationTypeToString(eDataType, instanceValue);
			case PivotPackage.INTERVAL:
				return convertIntervalToString(eDataType, instanceValue);
			case PivotPackage.DURATION:
				return convertDurationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink createSink() {
		SinkImpl sink = new SinkImpl();
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwResource createHwResource() {
		HwResourceImpl hwResource = new HwResourceImpl();
		return hwResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain createChain() {
		ChainImpl chain = new ChainImpl();
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment createFragment() {
		FragmentImpl fragment = new FragmentImpl();
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusComm createBusComm() {
		BusCommImpl busComm = new BusCommImpl();
		return busComm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.pivot.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jitter createJitter() {
		JitterImpl jitter = new JitterImpl();
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwSchedulableResource createSwSchedulableResource() {
		SwSchedulableResourceImpl swSchedulableResource = new SwSchedulableResourceImpl();
		return swSchedulableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType createActivationTypeFromString(EDataType eDataType, String initialValue) {
		ActivationType result = ActivationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createIntervalFromString(EDataType eDataType, String initialValue) {
		return (Interval)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntervalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDurationFromString(EDataType eDataType, String initialValue) {
		return (Duration)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotPackage getPivotPackage() {
		return (PivotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PivotPackage getPackage() {
		return PivotPackage.eINSTANCE;
	}

} //PivotFactoryImpl
