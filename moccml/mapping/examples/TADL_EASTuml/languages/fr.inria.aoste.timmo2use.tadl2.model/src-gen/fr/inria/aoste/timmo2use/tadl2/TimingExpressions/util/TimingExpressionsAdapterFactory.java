/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.util;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage
 * @generated
 */
public class TimingExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimingExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimingExpressionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingExpressionsSwitch<Adapter> modelSwitch =
		new TimingExpressionsSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTimingExpression(TimingExpression object) {
				return createTimingExpressionAdapter();
			}
			@Override
			public Adapter caseSymbolicTimingExpression(SymbolicTimingExpression object) {
				return createSymbolicTimingExpressionAdapter();
			}
			@Override
			public Adapter caseVariableTimingExpression(VariableTimingExpression object) {
				return createVariableTimingExpressionAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseAddition(Addition object) {
				return createAdditionAdapter();
			}
			@Override
			public Adapter caseSubtraction(Subtraction object) {
				return createSubtractionAdapter();
			}
			@Override
			public Adapter caseMultiplication(Multiplication object) {
				return createMultiplicationAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter caseValueTimingExpression(ValueTimingExpression object) {
				return createValueTimingExpressionAdapter();
			}
			@Override
			public Adapter caseTimeBase(TimeBase object) {
				return createTimeBaseAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseTimeBaseRelation(TimeBaseRelation object) {
				return createTimeBaseRelationAdapter();
			}
			@Override
			public Adapter caseTiming(Timing object) {
				return createTimingAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseGreaterThan(GreaterThan object) {
				return createGreaterThanAdapter();
			}
			@Override
			public Adapter caseGreaterThanOrEqual(GreaterThanOrEqual object) {
				return createGreaterThanOrEqualAdapter();
			}
			@Override
			public Adapter caseLessThan(LessThan object) {
				return createLessThanAdapter();
			}
			@Override
			public Adapter caseLessThanOrEqual(LessThanOrEqual object) {
				return createLessThanOrEqualAdapter();
			}
			@Override
			public Adapter caseTimingConstraint(TimingConstraint object) {
				return createTimingConstraintAdapter();
			}
			@Override
			public Adapter caseDelayConstraint(DelayConstraint object) {
				return createDelayConstraintAdapter();
			}
			@Override
			public Adapter caseRepetitionConstraint(RepetitionConstraint object) {
				return createRepetitionConstraintAdapter();
			}
			@Override
			public Adapter caseSynchronizationConstraint(SynchronizationConstraint object) {
				return createSynchronizationConstraintAdapter();
			}
			@Override
			public Adapter caseOrderConstraint(OrderConstraint object) {
				return createOrderConstraintAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter casePatternConstraint(PatternConstraint object) {
				return createPatternConstraintAdapter();
			}
			@Override
			public Adapter caseSporadicConstraint(SporadicConstraint object) {
				return createSporadicConstraintAdapter();
			}
			@Override
			public Adapter casePeriodicConstraint(PeriodicConstraint object) {
				return createPeriodicConstraintAdapter();
			}
			@Override
			public Adapter caseArbitraryConstraint(ArbitraryConstraint object) {
				return createArbitraryConstraintAdapter();
			}
			@Override
			public Adapter caseBurstConstraint(BurstConstraint object) {
				return createBurstConstraintAdapter();
			}
			@Override
			public Adapter caseReactionConstraint(ReactionConstraint object) {
				return createReactionConstraintAdapter();
			}
			@Override
			public Adapter caseAgeConstraint(AgeConstraint object) {
				return createAgeConstraintAdapter();
			}
			@Override
			public Adapter caseEventChain(EventChain object) {
				return createEventChainAdapter();
			}
			@Override
			public Adapter caseImportStatement(ImportStatement object) {
				return createImportStatementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression <em>Timing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression
	 * @generated
	 */
	public Adapter createTimingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression <em>Symbolic Timing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression
	 * @generated
	 */
	public Adapter createSymbolicTimingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression <em>Variable Timing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression
	 * @generated
	 */
	public Adapter createVariableTimingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Subtraction
	 * @generated
	 */
	public Adapter createSubtractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression <em>Value Timing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression
	 * @generated
	 */
	public Adapter createValueTimingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase <em>Time Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase
	 * @generated
	 */
	public Adapter createTimeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation <em>Time Base Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation
	 * @generated
	 */
	public Adapter createTimeBaseRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing
	 * @generated
	 */
	public Adapter createTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThanOrEqual
	 * @generated
	 */
	public Adapter createGreaterThanOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThan
	 * @generated
	 */
	public Adapter createLessThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThanOrEqual
	 * @generated
	 */
	public Adapter createLessThanOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingConstraint
	 * @generated
	 */
	public Adapter createTimingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint <em>Delay Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint
	 * @generated
	 */
	public Adapter createDelayConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint <em>Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint
	 * @generated
	 */
	public Adapter createRepetitionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint <em>Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint
	 * @generated
	 */
	public Adapter createSynchronizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint <em>Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint
	 * @generated
	 */
	public Adapter createOrderConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint <em>Pattern Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint
	 * @generated
	 */
	public Adapter createPatternConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint <em>Sporadic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint
	 * @generated
	 */
	public Adapter createSporadicConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint <em>Periodic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint
	 * @generated
	 */
	public Adapter createPeriodicConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint <em>Arbitrary Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint
	 * @generated
	 */
	public Adapter createArbitraryConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint <em>Burst Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint
	 * @generated
	 */
	public Adapter createBurstConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint <em>Reaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint
	 * @generated
	 */
	public Adapter createReactionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint <em>Age Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint
	 * @generated
	 */
	public Adapter createAgeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain <em>Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain
	 * @generated
	 */
	public Adapter createEventChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement
	 * @generated
	 */
	public Adapter createImportStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TimingExpressionsAdapterFactory
