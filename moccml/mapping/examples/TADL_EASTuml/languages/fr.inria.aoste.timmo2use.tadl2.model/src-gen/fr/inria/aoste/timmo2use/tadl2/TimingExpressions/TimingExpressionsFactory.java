/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage
 * @generated
 */
public interface TimingExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingExpressionsFactory eINSTANCE = fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Symbolic Timing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbolic Timing Expression</em>'.
	 * @generated
	 */
	SymbolicTimingExpression createSymbolicTimingExpression();

	/**
	 * Returns a new object of class '<em>Variable Timing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Timing Expression</em>'.
	 * @generated
	 */
	VariableTimingExpression createVariableTimingExpression();

	/**
	 * Returns a new object of class '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition</em>'.
	 * @generated
	 */
	Addition createAddition();

	/**
	 * Returns a new object of class '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtraction</em>'.
	 * @generated
	 */
	Subtraction createSubtraction();

	/**
	 * Returns a new object of class '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication</em>'.
	 * @generated
	 */
	Multiplication createMultiplication();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Value Timing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Timing Expression</em>'.
	 * @generated
	 */
	ValueTimingExpression createValueTimingExpression();

	/**
	 * Returns a new object of class '<em>Time Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Base</em>'.
	 * @generated
	 */
	TimeBase createTimeBase();

	/**
	 * Returns a new object of class '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension</em>'.
	 * @generated
	 */
	Dimension createDimension();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Time Base Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Base Relation</em>'.
	 * @generated
	 */
	TimeBaseRelation createTimeBaseRelation();

	/**
	 * Returns a new object of class '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing</em>'.
	 * @generated
	 */
	Timing createTiming();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than</em>'.
	 * @generated
	 */
	GreaterThan createGreaterThan();

	/**
	 * Returns a new object of class '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Or Equal</em>'.
	 * @generated
	 */
	GreaterThanOrEqual createGreaterThanOrEqual();

	/**
	 * Returns a new object of class '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than</em>'.
	 * @generated
	 */
	LessThan createLessThan();

	/**
	 * Returns a new object of class '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Or Equal</em>'.
	 * @generated
	 */
	LessThanOrEqual createLessThanOrEqual();

	/**
	 * Returns a new object of class '<em>Delay Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Constraint</em>'.
	 * @generated
	 */
	DelayConstraint createDelayConstraint();

	/**
	 * Returns a new object of class '<em>Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repetition Constraint</em>'.
	 * @generated
	 */
	RepetitionConstraint createRepetitionConstraint();

	/**
	 * Returns a new object of class '<em>Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization Constraint</em>'.
	 * @generated
	 */
	SynchronizationConstraint createSynchronizationConstraint();

	/**
	 * Returns a new object of class '<em>Order Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Constraint</em>'.
	 * @generated
	 */
	OrderConstraint createOrderConstraint();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Pattern Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Constraint</em>'.
	 * @generated
	 */
	PatternConstraint createPatternConstraint();

	/**
	 * Returns a new object of class '<em>Sporadic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic Constraint</em>'.
	 * @generated
	 */
	SporadicConstraint createSporadicConstraint();

	/**
	 * Returns a new object of class '<em>Periodic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Constraint</em>'.
	 * @generated
	 */
	PeriodicConstraint createPeriodicConstraint();

	/**
	 * Returns a new object of class '<em>Arbitrary Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitrary Constraint</em>'.
	 * @generated
	 */
	ArbitraryConstraint createArbitraryConstraint();

	/**
	 * Returns a new object of class '<em>Burst Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Burst Constraint</em>'.
	 * @generated
	 */
	BurstConstraint createBurstConstraint();

	/**
	 * Returns a new object of class '<em>Reaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Constraint</em>'.
	 * @generated
	 */
	ReactionConstraint createReactionConstraint();

	/**
	 * Returns a new object of class '<em>Age Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Constraint</em>'.
	 * @generated
	 */
	AgeConstraint createAgeConstraint();

	/**
	 * Returns a new object of class '<em>Event Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Chain</em>'.
	 * @generated
	 */
	EventChain createEventChain();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimingExpressionsPackage getTimingExpressionsPackage();

} //TimingExpressionsFactory
