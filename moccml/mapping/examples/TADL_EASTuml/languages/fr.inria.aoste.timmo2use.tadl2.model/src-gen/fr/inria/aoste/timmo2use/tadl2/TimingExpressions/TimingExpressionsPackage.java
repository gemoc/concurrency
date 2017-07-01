/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions;

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
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface TimingExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TimingExpressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.timmo2use.tadl2.TimingExpressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr.inria.aoste.timmo2use.tadl2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingExpressionsPackage eINSTANCE = fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.NamedElementImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

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
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionImpl <em>Timing Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTimingExpression()
	 * @generated
	 */
	int TIMING_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Timing Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SymbolicTimingExpressionImpl <em>Symbolic Timing Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SymbolicTimingExpressionImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getSymbolicTimingExpression()
	 * @generated
	 */
	int SYMBOLIC_TIMING_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_TIMING_EXPRESSION__OPERATOR = TIMING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_TIMING_EXPRESSION__VARIABLE = TIMING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Symbolic Timing Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_TIMING_EXPRESSION_FEATURE_COUNT = TIMING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.VariableTimingExpressionImpl <em>Variable Timing Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.VariableTimingExpressionImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getVariableTimingExpression()
	 * @generated
	 */
	int VARIABLE_TIMING_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TIMING_EXPRESSION__NAME = TIMING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TIMING_EXPRESSION__VALUE = TIMING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TIMING_EXPRESSION__TIME_BASE = TIMING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TIMING_EXPRESSION__UNIT = TIMING_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Timing Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TIMING_EXPRESSION_FEATURE_COUNT = TIMING_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.OperatorImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__LEFT_OPERAND = 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__RIGHT_OPERAND = 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AdditionImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 5;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SubtractionImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getSubtraction()
	 * @generated
	 */
	int SUBTRACTION = 6;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.MultiplicationImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 7;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DivisionImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 8;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ValueTimingExpressionImpl <em>Value Timing Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ValueTimingExpressionImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getValueTimingExpression()
	 * @generated
	 */
	int VALUE_TIMING_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Time Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TIMING_EXPRESSION__TIME_BASE = TIMING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TIMING_EXPRESSION__UNIT = TIMING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TIMING_EXPRESSION__VALUE = TIMING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Timing Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TIMING_EXPRESSION_FEATURE_COUNT = TIMING_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseImpl <em>Time Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTimeBase()
	 * @generated
	 */
	int TIME_BASE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE__PRECISION_UNIT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE__PRECISION_FACTOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DimensionImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__UNITS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__KIND = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.UnitImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__REFERENCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__FACTOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__OFFSET = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseRelationImpl <em>Time Base Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseRelationImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTimeBaseRelation()
	 * @generated
	 */
	int TIME_BASE_RELATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_RELATION__LEFT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_RELATION__RIGHT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Base Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Timing Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TIMING_EXPRESSIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Bases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TIME_BASES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__DIMENSIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Base Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TIME_BASE_RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Event Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EVENT_CHAINS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Import Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__IMPORT_STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AssignmentImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 15;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.GreaterThanImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 16;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.GreaterThanOrEqualImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getGreaterThanOrEqual()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL = 17;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.LessThanImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 18;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.LessThanOrEqualImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getLessThanOrEqual()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL = 19;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__LEFT_OPERAND = OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__RIGHT_OPERAND = OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTimingConstraint()
	 * @generated
	 */
	int TIMING_CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DelayConstraintImpl <em>Delay Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DelayConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getDelayConstraint()
	 * @generated
	 */
	int DELAY_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__SOURCE = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__TARGET = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__LOWER = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__UPPER = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl <em>Repetition Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getRepetitionConstraint()
	 * @generated
	 */
	int REPETITION_CONSTRAINT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__EVENT = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__SPAN = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__LOWER = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__UPPER = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__JITTER = TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SynchronizationConstraintImpl <em>Synchronization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SynchronizationConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getSynchronizationConstraint()
	 * @generated
	 */
	int SYNCHRONIZATION_CONSTRAINT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__EVENTS = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__TOLERANCE = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.OrderConstraintImpl <em>Order Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.OrderConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getOrderConstraint()
	 * @generated
	 */
	int ORDER_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__LEFT = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__RIGHT = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.EventImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Triggerable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TRIGGERABLE_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl <em>Pattern Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getPatternConstraint()
	 * @generated
	 */
	int PATTERN_CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__OFFSET = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__JITTER = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__REF = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__EVENT = TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pattern Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SporadicConstraintImpl <em>Sporadic Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SporadicConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getSporadicConstraint()
	 * @generated
	 */
	int SPORADIC_CONSTRAINT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__LOWER = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__UPPER = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__JITTER = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__EVENT = TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sporadic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PeriodicConstraintImpl <em>Periodic Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PeriodicConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getPeriodicConstraint()
	 * @generated
	 */
	int PERIODIC_CONSTRAINT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__PERIOD = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__JITTER = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__EVENT = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Periodic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ArbitraryConstraintImpl <em>Arbitrary Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ArbitraryConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getArbitraryConstraint()
	 * @generated
	 */
	int ARBITRARY_CONSTRAINT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__MAXIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__EVENT = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arbitrary Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.BurstConstraintImpl <em>Burst Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.BurstConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getBurstConstraint()
	 * @generated
	 */
	int BURST_CONSTRAINT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Max Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__MAX_OCCURRENCE = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__LENGTH = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__EVENT = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Burst Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ReactionConstraintImpl <em>Reaction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ReactionConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getReactionConstraint()
	 * @generated
	 */
	int REACTION_CONSTRAINT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MAXIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__SCOPE = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AgeConstraintImpl <em>Age Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AgeConstraintImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getAgeConstraint()
	 * @generated
	 */
	int AGE_CONSTRAINT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__MAXIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__SCOPE = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Age Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.EventChainImpl <em>Event Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.EventChainImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getEventChain()
	 * @generated
	 */
	int EVENT_CHAIN = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__STIMULUS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__RESPONSE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__SEGMENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ImportStatementImpl <em>Import Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ImportStatementImpl
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getImportStatement()
	 * @generated
	 */
	int IMPORT_STATEMENT = 34;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__IMPORT_URI = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DimensionKind <em>Dimension Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DimensionKind
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getDimensionKind()
	 * @generated
	 */
	int DIMENSION_KIND = 35;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression <em>Timing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Expression</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression
	 * @generated
	 */
	EClass getTimingExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression <em>Symbolic Timing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Timing Expression</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression
	 * @generated
	 */
	EClass getSymbolicTimingExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression#getOperator()
	 * @see #getSymbolicTimingExpression()
	 * @generated
	 */
	EReference getSymbolicTimingExpression_Operator();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression#getVariable()
	 * @see #getSymbolicTimingExpression()
	 * @generated
	 */
	EReference getSymbolicTimingExpression_Variable();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression <em>Variable Timing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Timing Expression</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression
	 * @generated
	 */
	EClass getVariableTimingExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getValue()
	 * @see #getVariableTimingExpression()
	 * @generated
	 */
	EReference getVariableTimingExpression_Value();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getTimeBase <em>Time Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Base</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getTimeBase()
	 * @see #getVariableTimingExpression()
	 * @generated
	 */
	EReference getVariableTimingExpression_TimeBase();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression#getUnit()
	 * @see #getVariableTimingExpression()
	 * @generated
	 */
	EReference getVariableTimingExpression_Unit();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator#getLeftOperand()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator#getRightOperand()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_RightOperand();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Subtraction
	 * @generated
	 */
	EClass getSubtraction();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression <em>Value Timing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Timing Expression</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression
	 * @generated
	 */
	EClass getValueTimingExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression#getTimeBase <em>Time Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Base</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression#getTimeBase()
	 * @see #getValueTimingExpression()
	 * @generated
	 */
	EReference getValueTimingExpression_TimeBase();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression#getUnit()
	 * @see #getValueTimingExpression()
	 * @generated
	 */
	EReference getValueTimingExpression_Unit();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression#getValue()
	 * @see #getValueTimingExpression()
	 * @generated
	 */
	EAttribute getValueTimingExpression_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase <em>Time Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Base</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase
	 * @generated
	 */
	EClass getTimeBase();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getType()
	 * @see #getTimeBase()
	 * @generated
	 */
	EReference getTimeBase_Type();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getPrecisionUnit <em>Precision Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precision Unit</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getPrecisionUnit()
	 * @see #getTimeBase()
	 * @generated
	 */
	EReference getTimeBase_PrecisionUnit();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getPrecisionFactor <em>Precision Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision Factor</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getPrecisionFactor()
	 * @see #getTimeBase()
	 * @generated
	 */
	EAttribute getTimeBase_PrecisionFactor();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension#getUnits()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Units();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension#getKind()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Kind();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit#getReference()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Reference();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit#getFactor()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Factor();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit#getOffset()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Offset();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation <em>Time Base Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Base Relation</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation
	 * @generated
	 */
	EClass getTimeBaseRelation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation#getLeft()
	 * @see #getTimeBaseRelation()
	 * @generated
	 */
	EReference getTimeBaseRelation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation#getRight()
	 * @see #getTimeBaseRelation()
	 * @generated
	 */
	EReference getTimeBaseRelation_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimingExpressions <em>Timing Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing Expressions</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimingExpressions()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_TimingExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimeBases <em>Time Bases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Bases</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimeBases()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_TimeBases();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getDimensions()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Dimensions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimeBaseRelations <em>Time Base Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Base Relations</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getTimeBaseRelations()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_TimeBaseRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getEvents()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getConstraints()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getEventChains <em>Event Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Chains</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getEventChains()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_EventChains();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getImportStatements <em>Import Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Statements</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing#getImportStatements()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_ImportStatements();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThanOrEqual
	 * @generated
	 */
	EClass getGreaterThanOrEqual();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThanOrEqual
	 * @generated
	 */
	EClass getLessThanOrEqual();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingConstraint
	 * @generated
	 */
	EClass getTimingConstraint();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint <em>Delay Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint
	 * @generated
	 */
	EClass getDelayConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint#getSource()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint#getTarget()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Target();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint#getLower()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint#getUpper()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Upper();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint <em>Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repetition Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint
	 * @generated
	 */
	EClass getRepetitionConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getEvent()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Event();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getSpan()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EAttribute getRepetitionConstraint_Span();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getLower()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getUpper()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint#getJitter()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Jitter();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint <em>Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint
	 * @generated
	 */
	EClass getSynchronizationConstraint();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint#getEvents()
	 * @see #getSynchronizationConstraint()
	 * @generated
	 */
	EReference getSynchronizationConstraint_Events();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tolerance</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint#getTolerance()
	 * @see #getSynchronizationConstraint()
	 * @generated
	 */
	EReference getSynchronizationConstraint_Tolerance();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint <em>Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint
	 * @generated
	 */
	EClass getOrderConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint#getLeft()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EReference getOrderConstraint_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint#getRight()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EReference getOrderConstraint_Right();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event#getTriggerableElements <em>Triggerable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggerable Elements</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event#getTriggerableElements()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_TriggerableElements();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint <em>Pattern Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint
	 * @generated
	 */
	EClass getPatternConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offset</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getOffset()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getJitter()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Jitter();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getMinimum()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Minimum();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getRef()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Ref();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint#getEvent()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Event();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint <em>Sporadic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint
	 * @generated
	 */
	EClass getSporadicConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getLower()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getUpper()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getJitter()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Jitter();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getMinimum()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Minimum();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint#getEvent()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Event();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint <em>Periodic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint
	 * @generated
	 */
	EClass getPeriodicConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint#getPeriod()
	 * @see #getPeriodicConstraint()
	 * @generated
	 */
	EReference getPeriodicConstraint_Period();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint#getJitter()
	 * @see #getPeriodicConstraint()
	 * @generated
	 */
	EReference getPeriodicConstraint_Jitter();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint#getMinimum()
	 * @see #getPeriodicConstraint()
	 * @generated
	 */
	EReference getPeriodicConstraint_Minimum();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint#getEvent()
	 * @see #getPeriodicConstraint()
	 * @generated
	 */
	EReference getPeriodicConstraint_Event();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint <em>Arbitrary Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint
	 * @generated
	 */
	EClass getArbitraryConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minimum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getMinimum()
	 * @see #getArbitraryConstraint()
	 * @generated
	 */
	EReference getArbitraryConstraint_Minimum();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maximum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getMaximum()
	 * @see #getArbitraryConstraint()
	 * @generated
	 */
	EReference getArbitraryConstraint_Maximum();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint#getEvent()
	 * @see #getArbitraryConstraint()
	 * @generated
	 */
	EReference getArbitraryConstraint_Event();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint <em>Burst Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Burst Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint
	 * @generated
	 */
	EClass getBurstConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint#getMaxOccurrence <em>Max Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurrence</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint#getMaxOccurrence()
	 * @see #getBurstConstraint()
	 * @generated
	 */
	EAttribute getBurstConstraint_MaxOccurrence();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint#getLength()
	 * @see #getBurstConstraint()
	 * @generated
	 */
	EReference getBurstConstraint_Length();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint#getMinimum()
	 * @see #getBurstConstraint()
	 * @generated
	 */
	EReference getBurstConstraint_Minimum();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint#getEvent()
	 * @see #getBurstConstraint()
	 * @generated
	 */
	EReference getBurstConstraint_Event();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint <em>Reaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint
	 * @generated
	 */
	EClass getReactionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint#getMinimum()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Minimum();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint#getMaximum()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Maximum();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint#getScope()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Scope();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint <em>Age Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age Constraint</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint
	 * @generated
	 */
	EClass getAgeConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getMinimum()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Minimum();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getMaximum()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Maximum();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint#getScope()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Scope();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain <em>Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Chain</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain
	 * @generated
	 */
	EClass getEventChain();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stimulus</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain#getStimulus()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Stimulus();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain#getResponse()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Response();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segment</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain#getSegment()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Segment();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statement</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement#getImportURI()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_ImportURI();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement#getAlias()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_Alias();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DimensionKind <em>Dimension Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension Kind</em>'.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DimensionKind
	 * @generated
	 */
	EEnum getDimensionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimingExpressionsFactory getTimingExpressionsFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.NamedElementImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionImpl <em>Timing Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTimingExpression()
		 * @generated
		 */
		EClass TIMING_EXPRESSION = eINSTANCE.getTimingExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SymbolicTimingExpressionImpl <em>Symbolic Timing Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SymbolicTimingExpressionImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getSymbolicTimingExpression()
		 * @generated
		 */
		EClass SYMBOLIC_TIMING_EXPRESSION = eINSTANCE.getSymbolicTimingExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_TIMING_EXPRESSION__OPERATOR = eINSTANCE.getSymbolicTimingExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_TIMING_EXPRESSION__VARIABLE = eINSTANCE.getSymbolicTimingExpression_Variable();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.VariableTimingExpressionImpl <em>Variable Timing Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.VariableTimingExpressionImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getVariableTimingExpression()
		 * @generated
		 */
		EClass VARIABLE_TIMING_EXPRESSION = eINSTANCE.getVariableTimingExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_TIMING_EXPRESSION__VALUE = eINSTANCE.getVariableTimingExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Time Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_TIMING_EXPRESSION__TIME_BASE = eINSTANCE.getVariableTimingExpression_TimeBase();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_TIMING_EXPRESSION__UNIT = eINSTANCE.getVariableTimingExpression_Unit();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.OperatorImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__LEFT_OPERAND = eINSTANCE.getOperator_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__RIGHT_OPERAND = eINSTANCE.getOperator_RightOperand();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AdditionImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SubtractionImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getSubtraction()
		 * @generated
		 */
		EClass SUBTRACTION = eINSTANCE.getSubtraction();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.MultiplicationImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DivisionImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ValueTimingExpressionImpl <em>Value Timing Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ValueTimingExpressionImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getValueTimingExpression()
		 * @generated
		 */
		EClass VALUE_TIMING_EXPRESSION = eINSTANCE.getValueTimingExpression();

		/**
		 * The meta object literal for the '<em><b>Time Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TIMING_EXPRESSION__TIME_BASE = eINSTANCE.getValueTimingExpression_TimeBase();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TIMING_EXPRESSION__UNIT = eINSTANCE.getValueTimingExpression_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TIMING_EXPRESSION__VALUE = eINSTANCE.getValueTimingExpression_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseImpl <em>Time Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTimeBase()
		 * @generated
		 */
		EClass TIME_BASE = eINSTANCE.getTimeBase();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BASE__TYPE = eINSTANCE.getTimeBase_Type();

		/**
		 * The meta object literal for the '<em><b>Precision Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BASE__PRECISION_UNIT = eINSTANCE.getTimeBase_PrecisionUnit();

		/**
		 * The meta object literal for the '<em><b>Precision Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BASE__PRECISION_FACTOR = eINSTANCE.getTimeBase_PrecisionFactor();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DimensionImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__UNITS = eINSTANCE.getDimension_Units();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__KIND = eINSTANCE.getDimension_Kind();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.UnitImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__REFERENCE = eINSTANCE.getUnit_Reference();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__FACTOR = eINSTANCE.getUnit_Factor();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__OFFSET = eINSTANCE.getUnit_Offset();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseRelationImpl <em>Time Base Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseRelationImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTimeBaseRelation()
		 * @generated
		 */
		EClass TIME_BASE_RELATION = eINSTANCE.getTimeBaseRelation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BASE_RELATION__LEFT = eINSTANCE.getTimeBaseRelation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BASE_RELATION__RIGHT = eINSTANCE.getTimeBaseRelation_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Timing Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__TIMING_EXPRESSIONS = eINSTANCE.getTiming_TimingExpressions();

		/**
		 * The meta object literal for the '<em><b>Time Bases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__TIME_BASES = eINSTANCE.getTiming_TimeBases();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__DIMENSIONS = eINSTANCE.getTiming_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Time Base Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__TIME_BASE_RELATIONS = eINSTANCE.getTiming_TimeBaseRelations();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__EVENTS = eINSTANCE.getTiming_Events();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__CONSTRAINTS = eINSTANCE.getTiming_Constraints();

		/**
		 * The meta object literal for the '<em><b>Event Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__EVENT_CHAINS = eINSTANCE.getTiming_EventChains();

		/**
		 * The meta object literal for the '<em><b>Import Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__IMPORT_STATEMENTS = eINSTANCE.getTiming_ImportStatements();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AssignmentImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.GreaterThanImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.GreaterThanOrEqualImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getGreaterThanOrEqual()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.LessThanImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.LessThanOrEqualImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getLessThanOrEqual()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getTimingConstraint()
		 * @generated
		 */
		EClass TIMING_CONSTRAINT = eINSTANCE.getTimingConstraint();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DelayConstraintImpl <em>Delay Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.DelayConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getDelayConstraint()
		 * @generated
		 */
		EClass DELAY_CONSTRAINT = eINSTANCE.getDelayConstraint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__SOURCE = eINSTANCE.getDelayConstraint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__TARGET = eINSTANCE.getDelayConstraint_Target();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__LOWER = eINSTANCE.getDelayConstraint_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__UPPER = eINSTANCE.getDelayConstraint_Upper();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl <em>Repetition Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.RepetitionConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getRepetitionConstraint()
		 * @generated
		 */
		EClass REPETITION_CONSTRAINT = eINSTANCE.getRepetitionConstraint();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPETITION_CONSTRAINT__EVENT = eINSTANCE.getRepetitionConstraint_Event();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPETITION_CONSTRAINT__SPAN = eINSTANCE.getRepetitionConstraint_Span();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPETITION_CONSTRAINT__LOWER = eINSTANCE.getRepetitionConstraint_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPETITION_CONSTRAINT__UPPER = eINSTANCE.getRepetitionConstraint_Upper();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPETITION_CONSTRAINT__JITTER = eINSTANCE.getRepetitionConstraint_Jitter();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SynchronizationConstraintImpl <em>Synchronization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SynchronizationConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getSynchronizationConstraint()
		 * @generated
		 */
		EClass SYNCHRONIZATION_CONSTRAINT = eINSTANCE.getSynchronizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_CONSTRAINT__EVENTS = eINSTANCE.getSynchronizationConstraint_Events();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_CONSTRAINT__TOLERANCE = eINSTANCE.getSynchronizationConstraint_Tolerance();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.OrderConstraintImpl <em>Order Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.OrderConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getOrderConstraint()
		 * @generated
		 */
		EClass ORDER_CONSTRAINT = eINSTANCE.getOrderConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONSTRAINT__LEFT = eINSTANCE.getOrderConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONSTRAINT__RIGHT = eINSTANCE.getOrderConstraint_Right();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.EventImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Triggerable Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TRIGGERABLE_ELEMENTS = eINSTANCE.getEvent_TriggerableElements();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl <em>Pattern Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PatternConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getPatternConstraint()
		 * @generated
		 */
		EClass PATTERN_CONSTRAINT = eINSTANCE.getPatternConstraint();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__OFFSET = eINSTANCE.getPatternConstraint_Offset();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__JITTER = eINSTANCE.getPatternConstraint_Jitter();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__MINIMUM = eINSTANCE.getPatternConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__REF = eINSTANCE.getPatternConstraint_Ref();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__EVENT = eINSTANCE.getPatternConstraint_Event();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SporadicConstraintImpl <em>Sporadic Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.SporadicConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getSporadicConstraint()
		 * @generated
		 */
		EClass SPORADIC_CONSTRAINT = eINSTANCE.getSporadicConstraint();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__LOWER = eINSTANCE.getSporadicConstraint_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__UPPER = eINSTANCE.getSporadicConstraint_Upper();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__JITTER = eINSTANCE.getSporadicConstraint_Jitter();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__MINIMUM = eINSTANCE.getSporadicConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__EVENT = eINSTANCE.getSporadicConstraint_Event();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PeriodicConstraintImpl <em>Periodic Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.PeriodicConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getPeriodicConstraint()
		 * @generated
		 */
		EClass PERIODIC_CONSTRAINT = eINSTANCE.getPeriodicConstraint();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_CONSTRAINT__PERIOD = eINSTANCE.getPeriodicConstraint_Period();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_CONSTRAINT__JITTER = eINSTANCE.getPeriodicConstraint_Jitter();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_CONSTRAINT__MINIMUM = eINSTANCE.getPeriodicConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_CONSTRAINT__EVENT = eINSTANCE.getPeriodicConstraint_Event();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ArbitraryConstraintImpl <em>Arbitrary Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ArbitraryConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getArbitraryConstraint()
		 * @generated
		 */
		EClass ARBITRARY_CONSTRAINT = eINSTANCE.getArbitraryConstraint();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_CONSTRAINT__MINIMUM = eINSTANCE.getArbitraryConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_CONSTRAINT__MAXIMUM = eINSTANCE.getArbitraryConstraint_Maximum();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_CONSTRAINT__EVENT = eINSTANCE.getArbitraryConstraint_Event();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.BurstConstraintImpl <em>Burst Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.BurstConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getBurstConstraint()
		 * @generated
		 */
		EClass BURST_CONSTRAINT = eINSTANCE.getBurstConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Occurrence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST_CONSTRAINT__MAX_OCCURRENCE = eINSTANCE.getBurstConstraint_MaxOccurrence();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BURST_CONSTRAINT__LENGTH = eINSTANCE.getBurstConstraint_Length();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BURST_CONSTRAINT__MINIMUM = eINSTANCE.getBurstConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BURST_CONSTRAINT__EVENT = eINSTANCE.getBurstConstraint_Event();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ReactionConstraintImpl <em>Reaction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ReactionConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getReactionConstraint()
		 * @generated
		 */
		EClass REACTION_CONSTRAINT = eINSTANCE.getReactionConstraint();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION_CONSTRAINT__MINIMUM = eINSTANCE.getReactionConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION_CONSTRAINT__MAXIMUM = eINSTANCE.getReactionConstraint_Maximum();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION_CONSTRAINT__SCOPE = eINSTANCE.getReactionConstraint_Scope();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AgeConstraintImpl <em>Age Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.AgeConstraintImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getAgeConstraint()
		 * @generated
		 */
		EClass AGE_CONSTRAINT = eINSTANCE.getAgeConstraint();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGE_CONSTRAINT__MINIMUM = eINSTANCE.getAgeConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGE_CONSTRAINT__MAXIMUM = eINSTANCE.getAgeConstraint_Maximum();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGE_CONSTRAINT__SCOPE = eINSTANCE.getAgeConstraint_Scope();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.EventChainImpl <em>Event Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.EventChainImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getEventChain()
		 * @generated
		 */
		EClass EVENT_CHAIN = eINSTANCE.getEventChain();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN__STIMULUS = eINSTANCE.getEventChain_Stimulus();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN__RESPONSE = eINSTANCE.getEventChain_Response();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN__SEGMENT = eINSTANCE.getEventChain_Segment();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ImportStatementImpl <em>Import Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.ImportStatementImpl
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getImportStatement()
		 * @generated
		 */
		EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__IMPORT_URI = eINSTANCE.getImportStatement_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__ALIAS = eINSTANCE.getImportStatement_Alias();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DimensionKind <em>Dimension Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DimensionKind
		 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsPackageImpl#getDimensionKind()
		 * @generated
		 */
		EEnum DIMENSION_KIND = eINSTANCE.getDimensionKind();

	}

} //TimingExpressionsPackage
