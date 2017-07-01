/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.*;

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
public class TimingExpressionsFactoryImpl extends EFactoryImpl implements TimingExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingExpressionsFactory init() {
		try {
			TimingExpressionsFactory theTimingExpressionsFactory = (TimingExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://fr.inria.aoste.timmo2use.tadl2.TimingExpressions"); 
			if (theTimingExpressionsFactory != null) {
				return theTimingExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimingExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpressionsFactoryImpl() {
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
			case TimingExpressionsPackage.SYMBOLIC_TIMING_EXPRESSION: return createSymbolicTimingExpression();
			case TimingExpressionsPackage.VARIABLE_TIMING_EXPRESSION: return createVariableTimingExpression();
			case TimingExpressionsPackage.ADDITION: return createAddition();
			case TimingExpressionsPackage.SUBTRACTION: return createSubtraction();
			case TimingExpressionsPackage.MULTIPLICATION: return createMultiplication();
			case TimingExpressionsPackage.DIVISION: return createDivision();
			case TimingExpressionsPackage.VALUE_TIMING_EXPRESSION: return createValueTimingExpression();
			case TimingExpressionsPackage.TIME_BASE: return createTimeBase();
			case TimingExpressionsPackage.DIMENSION: return createDimension();
			case TimingExpressionsPackage.UNIT: return createUnit();
			case TimingExpressionsPackage.TIME_BASE_RELATION: return createTimeBaseRelation();
			case TimingExpressionsPackage.TIMING: return createTiming();
			case TimingExpressionsPackage.ASSIGNMENT: return createAssignment();
			case TimingExpressionsPackage.GREATER_THAN: return createGreaterThan();
			case TimingExpressionsPackage.GREATER_THAN_OR_EQUAL: return createGreaterThanOrEqual();
			case TimingExpressionsPackage.LESS_THAN: return createLessThan();
			case TimingExpressionsPackage.LESS_THAN_OR_EQUAL: return createLessThanOrEqual();
			case TimingExpressionsPackage.DELAY_CONSTRAINT: return createDelayConstraint();
			case TimingExpressionsPackage.REPETITION_CONSTRAINT: return createRepetitionConstraint();
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT: return createSynchronizationConstraint();
			case TimingExpressionsPackage.ORDER_CONSTRAINT: return createOrderConstraint();
			case TimingExpressionsPackage.EVENT: return createEvent();
			case TimingExpressionsPackage.PATTERN_CONSTRAINT: return createPatternConstraint();
			case TimingExpressionsPackage.SPORADIC_CONSTRAINT: return createSporadicConstraint();
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT: return createPeriodicConstraint();
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT: return createArbitraryConstraint();
			case TimingExpressionsPackage.BURST_CONSTRAINT: return createBurstConstraint();
			case TimingExpressionsPackage.REACTION_CONSTRAINT: return createReactionConstraint();
			case TimingExpressionsPackage.AGE_CONSTRAINT: return createAgeConstraint();
			case TimingExpressionsPackage.EVENT_CHAIN: return createEventChain();
			case TimingExpressionsPackage.IMPORT_STATEMENT: return createImportStatement();
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
			case TimingExpressionsPackage.DIMENSION_KIND:
				return createDimensionKindFromString(eDataType, initialValue);
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
			case TimingExpressionsPackage.DIMENSION_KIND:
				return convertDimensionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicTimingExpression createSymbolicTimingExpression() {
		SymbolicTimingExpressionImpl symbolicTimingExpression = new SymbolicTimingExpressionImpl();
		return symbolicTimingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTimingExpression createVariableTimingExpression() {
		VariableTimingExpressionImpl variableTimingExpression = new VariableTimingExpressionImpl();
		return variableTimingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtraction createSubtraction() {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTimingExpression createValueTimingExpression() {
		ValueTimingExpressionImpl valueTimingExpression = new ValueTimingExpressionImpl();
		return valueTimingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBase createTimeBase() {
		TimeBaseImpl timeBase = new TimeBaseImpl();
		return timeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBaseRelation createTimeBaseRelation() {
		TimeBaseRelationImpl timeBaseRelation = new TimeBaseRelationImpl();
		return timeBaseRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanOrEqual createGreaterThanOrEqual() {
		GreaterThanOrEqualImpl greaterThanOrEqual = new GreaterThanOrEqualImpl();
		return greaterThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanOrEqual createLessThanOrEqual() {
		LessThanOrEqualImpl lessThanOrEqual = new LessThanOrEqualImpl();
		return lessThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayConstraint createDelayConstraint() {
		DelayConstraintImpl delayConstraint = new DelayConstraintImpl();
		return delayConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepetitionConstraint createRepetitionConstraint() {
		RepetitionConstraintImpl repetitionConstraint = new RepetitionConstraintImpl();
		return repetitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationConstraint createSynchronizationConstraint() {
		SynchronizationConstraintImpl synchronizationConstraint = new SynchronizationConstraintImpl();
		return synchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderConstraint createOrderConstraint() {
		OrderConstraintImpl orderConstraint = new OrderConstraintImpl();
		return orderConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternConstraint createPatternConstraint() {
		PatternConstraintImpl patternConstraint = new PatternConstraintImpl();
		return patternConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicConstraint createSporadicConstraint() {
		SporadicConstraintImpl sporadicConstraint = new SporadicConstraintImpl();
		return sporadicConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicConstraint createPeriodicConstraint() {
		PeriodicConstraintImpl periodicConstraint = new PeriodicConstraintImpl();
		return periodicConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitraryConstraint createArbitraryConstraint() {
		ArbitraryConstraintImpl arbitraryConstraint = new ArbitraryConstraintImpl();
		return arbitraryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BurstConstraint createBurstConstraint() {
		BurstConstraintImpl burstConstraint = new BurstConstraintImpl();
		return burstConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionConstraint createReactionConstraint() {
		ReactionConstraintImpl reactionConstraint = new ReactionConstraintImpl();
		return reactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeConstraint createAgeConstraint() {
		AgeConstraintImpl ageConstraint = new AgeConstraintImpl();
		return ageConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChain createEventChain() {
		EventChainImpl eventChain = new EventChainImpl();
		return eventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportStatement createImportStatement() {
		ImportStatementImpl importStatement = new ImportStatementImpl();
		return importStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionKind createDimensionKindFromString(EDataType eDataType, String initialValue) {
		DimensionKind result = DimensionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpressionsPackage getTimingExpressionsPackage() {
		return (TimingExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimingExpressionsPackage getPackage() {
		return TimingExpressionsPackage.eINSTANCE;
	}

} //TimingExpressionsFactoryImpl
