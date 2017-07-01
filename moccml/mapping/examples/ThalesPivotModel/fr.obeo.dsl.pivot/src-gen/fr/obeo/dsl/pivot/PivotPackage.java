/**
 */
package fr.obeo.dsl.pivot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see fr.obeo.dsl.pivot.PivotFactory
 * @model kind="package"
 * @generated
 */
public interface PivotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pivot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/pivot/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pivot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PivotPackage eINSTANCE = fr.obeo.dsl.pivot.impl.PivotPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.NamedElementImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.StimuliImpl <em>Stimuli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.StimuliImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getStimuli()
	 * @generated
	 */
	int STIMULI = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI__JITTER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stimuli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.SourceImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = STIMULI__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TYPE = STIMULI__TYPE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DURATION = STIMULI__DURATION;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__JITTER = STIMULI__JITTER;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__FRAGMENT = STIMULI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = STIMULI_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.SinkImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__NAME = STIMULI__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__TYPE = STIMULI__TYPE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__DURATION = STIMULI__DURATION;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__JITTER = STIMULI__JITTER;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__FRAGMENT = STIMULI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__CHAIN = STIMULI_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = STIMULI_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.HwResourceImpl <em>Hw Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.HwResourceImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getHwResource()
	 * @generated
	 */
	int HW_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__SCHEDULING_POLICY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__FREQUENCY_FACTOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__TASKS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__DELAY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Swschedulableresources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__SWSCHEDULABLERESOURCES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hw Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.TaskImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduling Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULING_INDEX = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FRAGMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.ChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.ChainImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getChain()
	 * @generated
	 */
	int CHAIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__SINK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.FragmentImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__TIME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__INDEX = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__CRITICAL_SECTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__SINK = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Previous Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__PREVIOUS_FRAGMENT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Next Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__NEXT_FRAGMENTS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__TASK = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.BusCommImpl <em>Bus Comm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.BusCommImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getBusComm()
	 * @generated
	 */
	int BUS_COMM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_COMM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_COMM__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_COMM__DELAY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Comm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_COMM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.SystemImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hw Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__HW_RESOURCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BUS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SOURCES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SINKS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FRAGMENTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CHAINS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.JitterImpl <em>Jitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.JitterImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getJitter()
	 * @generated
	 */
	int JITTER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.impl.SwSchedulableResourceImpl <em>Sw Schedulable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.impl.SwSchedulableResourceImpl
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getSwSchedulableResource()
	 * @generated
	 */
	int SW_SCHEDULABLE_RESOURCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_SCHEDULABLE_RESOURCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_SCHEDULABLE_RESOURCE__DELAY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_SCHEDULABLE_RESOURCE__TASKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sw Schedulable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_SCHEDULABLE_RESOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.pivot.ActivationType <em>Activation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.ActivationType
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getActivationType()
	 * @generated
	 */
	int ACTIVATION_TYPE = 12;

	/**
	 * The meta object id for the '<em>Interval</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.datatype.Interval
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 13;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.pivot.datatype.Duration
	 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 14;


	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see fr.obeo.dsl.pivot.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Source#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fragment</em>'.
	 * @see fr.obeo.dsl.pivot.Source#getFragment()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Fragment();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see fr.obeo.dsl.pivot.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Sink#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fragment</em>'.
	 * @see fr.obeo.dsl.pivot.Sink#getFragment()
	 * @see #getSink()
	 * @generated
	 */
	EReference getSink_Fragment();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Sink#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chain</em>'.
	 * @see fr.obeo.dsl.pivot.Sink#getChain()
	 * @see #getSink()
	 * @generated
	 */
	EReference getSink_Chain();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.HwResource <em>Hw Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Resource</em>'.
	 * @see fr.obeo.dsl.pivot.HwResource
	 * @generated
	 */
	EClass getHwResource();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.HwResource#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Policy</em>'.
	 * @see fr.obeo.dsl.pivot.HwResource#getSchedulingPolicy()
	 * @see #getHwResource()
	 * @generated
	 */
	EAttribute getHwResource_SchedulingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.HwResource#getFrequencyFactor <em>Frequency Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Factor</em>'.
	 * @see fr.obeo.dsl.pivot.HwResource#getFrequencyFactor()
	 * @see #getHwResource()
	 * @generated
	 */
	EAttribute getHwResource_FrequencyFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.pivot.HwResource#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see fr.obeo.dsl.pivot.HwResource#getTasks()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.HwResource#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see fr.obeo.dsl.pivot.HwResource#getDelay()
	 * @see #getHwResource()
	 * @generated
	 */
	EAttribute getHwResource_Delay();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.pivot.HwResource#getSwschedulableresources <em>Swschedulableresources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swschedulableresources</em>'.
	 * @see fr.obeo.dsl.pivot.HwResource#getSwschedulableresources()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_Swschedulableresources();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.obeo.dsl.pivot.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see fr.obeo.dsl.pivot.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.Task#getSchedulingIndex <em>Scheduling Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Index</em>'.
	 * @see fr.obeo.dsl.pivot.Task#getSchedulingIndex()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_SchedulingIndex();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.pivot.Task#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fragments</em>'.
	 * @see fr.obeo.dsl.pivot.Task#getFragments()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Fragments();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.Chain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain</em>'.
	 * @see fr.obeo.dsl.pivot.Chain
	 * @generated
	 */
	EClass getChain();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Chain#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink</em>'.
	 * @see fr.obeo.dsl.pivot.Chain#getSink()
	 * @see #getChain()
	 * @generated
	 */
	EReference getChain_Sink();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Chain#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.pivot.Chain#getSource()
	 * @see #getChain()
	 * @generated
	 */
	EReference getChain_Source();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.Fragment#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment#getTime()
	 * @see #getFragment()
	 * @generated
	 */
	EAttribute getFragment_Time();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.Fragment#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment#getIndex()
	 * @see #getFragment()
	 * @generated
	 */
	EAttribute getFragment_Index();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.Fragment#isCriticalSection <em>Critical Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical Section</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment#isCriticalSection()
	 * @see #getFragment()
	 * @generated
	 */
	EAttribute getFragment_CriticalSection();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Fragment#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment#getSink()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_Sink();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Fragment#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment#getSource()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Fragment#getPreviousFragment <em>Previous Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Fragment</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment#getPreviousFragment()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_PreviousFragment();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.pivot.Fragment#getNextFragments <em>Next Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Fragments</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment#getNextFragments()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_NextFragments();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.pivot.Fragment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see fr.obeo.dsl.pivot.Fragment#getTask()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_Task();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.BusComm <em>Bus Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Comm</em>'.
	 * @see fr.obeo.dsl.pivot.BusComm
	 * @generated
	 */
	EClass getBusComm();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.pivot.BusComm#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see fr.obeo.dsl.pivot.BusComm#getTarget()
	 * @see #getBusComm()
	 * @generated
	 */
	EReference getBusComm_Target();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.BusComm#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see fr.obeo.dsl.pivot.BusComm#getDelay()
	 * @see #getBusComm()
	 * @generated
	 */
	EAttribute getBusComm_Delay();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see fr.obeo.dsl.pivot.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.pivot.System#getHwResources <em>Hw Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hw Resources</em>'.
	 * @see fr.obeo.dsl.pivot.System#getHwResources()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_HwResources();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.pivot.System#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus</em>'.
	 * @see fr.obeo.dsl.pivot.System#getBus()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Bus();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.pivot.System#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see fr.obeo.dsl.pivot.System#getSources()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.pivot.System#getSinks <em>Sinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sinks</em>'.
	 * @see fr.obeo.dsl.pivot.System#getSinks()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Sinks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.pivot.System#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see fr.obeo.dsl.pivot.System#getFragments()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Fragments();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.pivot.System#getChains <em>Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chains</em>'.
	 * @see fr.obeo.dsl.pivot.System#getChains()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Chains();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.obeo.dsl.pivot.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.pivot.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.Stimuli <em>Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimuli</em>'.
	 * @see fr.obeo.dsl.pivot.Stimuli
	 * @generated
	 */
	EClass getStimuli();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.Stimuli#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.obeo.dsl.pivot.Stimuli#getType()
	 * @see #getStimuli()
	 * @generated
	 */
	EAttribute getStimuli_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.Stimuli#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.obeo.dsl.pivot.Stimuli#getDuration()
	 * @see #getStimuli()
	 * @generated
	 */
	EAttribute getStimuli_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.dsl.pivot.Stimuli#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see fr.obeo.dsl.pivot.Stimuli#getJitter()
	 * @see #getStimuli()
	 * @generated
	 */
	EReference getStimuli_Jitter();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.Jitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jitter</em>'.
	 * @see fr.obeo.dsl.pivot.Jitter
	 * @generated
	 */
	EClass getJitter();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.Jitter#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.obeo.dsl.pivot.Jitter#getDuration()
	 * @see #getJitter()
	 * @generated
	 */
	EAttribute getJitter_Duration();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.pivot.SwSchedulableResource <em>Sw Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Schedulable Resource</em>'.
	 * @see fr.obeo.dsl.pivot.SwSchedulableResource
	 * @generated
	 */
	EClass getSwSchedulableResource();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.pivot.SwSchedulableResource#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see fr.obeo.dsl.pivot.SwSchedulableResource#getDelay()
	 * @see #getSwSchedulableResource()
	 * @generated
	 */
	EAttribute getSwSchedulableResource_Delay();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.pivot.SwSchedulableResource#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see fr.obeo.dsl.pivot.SwSchedulableResource#getTasks()
	 * @see #getSwSchedulableResource()
	 * @generated
	 */
	EReference getSwSchedulableResource_Tasks();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.pivot.ActivationType <em>Activation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activation Type</em>'.
	 * @see fr.obeo.dsl.pivot.ActivationType
	 * @generated
	 */
	EEnum getActivationType();

	/**
	 * Returns the meta object for data type '{@link fr.obeo.dsl.pivot.datatype.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interval</em>'.
	 * @see fr.obeo.dsl.pivot.datatype.Interval
	 * @model instanceClass="fr.obeo.dsl.pivot.datatype.Interval"
	 * @generated
	 */
	EDataType getInterval();

	/**
	 * Returns the meta object for data type '{@link fr.obeo.dsl.pivot.datatype.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration</em>'.
	 * @see fr.obeo.dsl.pivot.datatype.Duration
	 * @model instanceClass="fr.obeo.dsl.pivot.datatype.Duration"
	 * @generated
	 */
	EDataType getDuration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PivotFactory getPivotFactory();

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
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.SourceImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__FRAGMENT = eINSTANCE.getSource_Fragment();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.SinkImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK__FRAGMENT = eINSTANCE.getSink_Fragment();

		/**
		 * The meta object literal for the '<em><b>Chain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK__CHAIN = eINSTANCE.getSink_Chain();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.HwResourceImpl <em>Hw Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.HwResourceImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getHwResource()
		 * @generated
		 */
		EClass HW_RESOURCE = eINSTANCE.getHwResource();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_RESOURCE__SCHEDULING_POLICY = eINSTANCE.getHwResource_SchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Frequency Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_RESOURCE__FREQUENCY_FACTOR = eINSTANCE.getHwResource_FrequencyFactor();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__TASKS = eINSTANCE.getHwResource_Tasks();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_RESOURCE__DELAY = eINSTANCE.getHwResource_Delay();

		/**
		 * The meta object literal for the '<em><b>Swschedulableresources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__SWSCHEDULABLERESOURCES = eINSTANCE.getHwResource_Swschedulableresources();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.TaskImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Scheduling Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SCHEDULING_INDEX = eINSTANCE.getTask_SchedulingIndex();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FRAGMENTS = eINSTANCE.getTask_Fragments();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.ChainImpl <em>Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.ChainImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getChain()
		 * @generated
		 */
		EClass CHAIN = eINSTANCE.getChain();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN__SINK = eINSTANCE.getChain_Sink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN__SOURCE = eINSTANCE.getChain_Source();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.FragmentImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT__TIME = eINSTANCE.getFragment_Time();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT__INDEX = eINSTANCE.getFragment_Index();

		/**
		 * The meta object literal for the '<em><b>Critical Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT__CRITICAL_SECTION = eINSTANCE.getFragment_CriticalSection();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__SINK = eINSTANCE.getFragment_Sink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__SOURCE = eINSTANCE.getFragment_Source();

		/**
		 * The meta object literal for the '<em><b>Previous Fragment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__PREVIOUS_FRAGMENT = eINSTANCE.getFragment_PreviousFragment();

		/**
		 * The meta object literal for the '<em><b>Next Fragments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__NEXT_FRAGMENTS = eINSTANCE.getFragment_NextFragments();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__TASK = eINSTANCE.getFragment_Task();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.BusCommImpl <em>Bus Comm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.BusCommImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getBusComm()
		 * @generated
		 */
		EClass BUS_COMM = eINSTANCE.getBusComm();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_COMM__TARGET = eINSTANCE.getBusComm_Target();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS_COMM__DELAY = eINSTANCE.getBusComm_Delay();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.SystemImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Hw Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__HW_RESOURCES = eINSTANCE.getSystem_HwResources();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BUS = eINSTANCE.getSystem_Bus();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SOURCES = eINSTANCE.getSystem_Sources();

		/**
		 * The meta object literal for the '<em><b>Sinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SINKS = eINSTANCE.getSystem_Sinks();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__FRAGMENTS = eINSTANCE.getSystem_Fragments();

		/**
		 * The meta object literal for the '<em><b>Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CHAINS = eINSTANCE.getSystem_Chains();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.NamedElementImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.StimuliImpl <em>Stimuli</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.StimuliImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getStimuli()
		 * @generated
		 */
		EClass STIMULI = eINSTANCE.getStimuli();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULI__TYPE = eINSTANCE.getStimuli_Type();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULI__DURATION = eINSTANCE.getStimuli_Duration();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULI__JITTER = eINSTANCE.getStimuli_Jitter();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.JitterImpl <em>Jitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.JitterImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getJitter()
		 * @generated
		 */
		EClass JITTER = eINSTANCE.getJitter();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JITTER__DURATION = eINSTANCE.getJitter_Duration();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.impl.SwSchedulableResourceImpl <em>Sw Schedulable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.impl.SwSchedulableResourceImpl
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getSwSchedulableResource()
		 * @generated
		 */
		EClass SW_SCHEDULABLE_RESOURCE = eINSTANCE.getSwSchedulableResource();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_SCHEDULABLE_RESOURCE__DELAY = eINSTANCE.getSwSchedulableResource_Delay();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_SCHEDULABLE_RESOURCE__TASKS = eINSTANCE.getSwSchedulableResource_Tasks();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.pivot.ActivationType <em>Activation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.ActivationType
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getActivationType()
		 * @generated
		 */
		EEnum ACTIVATION_TYPE = eINSTANCE.getActivationType();

		/**
		 * The meta object literal for the '<em>Interval</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.datatype.Interval
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getInterval()
		 * @generated
		 */
		EDataType INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em>Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.pivot.datatype.Duration
		 * @see fr.obeo.dsl.pivot.impl.PivotPackageImpl#getDuration()
		 * @generated
		 */
		EDataType DURATION = eINSTANCE.getDuration();

	}

} //PivotPackage
