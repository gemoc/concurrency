/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.util;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage
 * @generated
 */
public class TimingExpressionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimingExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = TimingExpressionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TimingExpressionsPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.TIMING_EXPRESSION: {
				TimingExpression timingExpression = (TimingExpression)theEObject;
				T result = caseTimingExpression(timingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.SYMBOLIC_TIMING_EXPRESSION: {
				SymbolicTimingExpression symbolicTimingExpression = (SymbolicTimingExpression)theEObject;
				T result = caseSymbolicTimingExpression(symbolicTimingExpression);
				if (result == null) result = caseTimingExpression(symbolicTimingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.VARIABLE_TIMING_EXPRESSION: {
				VariableTimingExpression variableTimingExpression = (VariableTimingExpression)theEObject;
				T result = caseVariableTimingExpression(variableTimingExpression);
				if (result == null) result = caseTimingExpression(variableTimingExpression);
				if (result == null) result = caseNamedElement(variableTimingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseOperator(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.SUBTRACTION: {
				Subtraction subtraction = (Subtraction)theEObject;
				T result = caseSubtraction(subtraction);
				if (result == null) result = caseOperator(subtraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseOperator(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseOperator(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.VALUE_TIMING_EXPRESSION: {
				ValueTimingExpression valueTimingExpression = (ValueTimingExpression)theEObject;
				T result = caseValueTimingExpression(valueTimingExpression);
				if (result == null) result = caseTimingExpression(valueTimingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.TIME_BASE: {
				TimeBase timeBase = (TimeBase)theEObject;
				T result = caseTimeBase(timeBase);
				if (result == null) result = caseNamedElement(timeBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = caseNamedElement(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseNamedElement(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.TIME_BASE_RELATION: {
				TimeBaseRelation timeBaseRelation = (TimeBaseRelation)theEObject;
				T result = caseTimeBaseRelation(timeBaseRelation);
				if (result == null) result = caseNamedElement(timeBaseRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.TIMING: {
				Timing timing = (Timing)theEObject;
				T result = caseTiming(timing);
				if (result == null) result = caseNamedElement(timing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseOperator(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseOperator(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.GREATER_THAN_OR_EQUAL: {
				GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual)theEObject;
				T result = caseGreaterThanOrEqual(greaterThanOrEqual);
				if (result == null) result = caseOperator(greaterThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseOperator(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.LESS_THAN_OR_EQUAL: {
				LessThanOrEqual lessThanOrEqual = (LessThanOrEqual)theEObject;
				T result = caseLessThanOrEqual(lessThanOrEqual);
				if (result == null) result = caseOperator(lessThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.TIMING_CONSTRAINT: {
				TimingConstraint timingConstraint = (TimingConstraint)theEObject;
				T result = caseTimingConstraint(timingConstraint);
				if (result == null) result = caseNamedElement(timingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.DELAY_CONSTRAINT: {
				DelayConstraint delayConstraint = (DelayConstraint)theEObject;
				T result = caseDelayConstraint(delayConstraint);
				if (result == null) result = caseTimingConstraint(delayConstraint);
				if (result == null) result = caseNamedElement(delayConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.REPETITION_CONSTRAINT: {
				RepetitionConstraint repetitionConstraint = (RepetitionConstraint)theEObject;
				T result = caseRepetitionConstraint(repetitionConstraint);
				if (result == null) result = caseTimingConstraint(repetitionConstraint);
				if (result == null) result = caseNamedElement(repetitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.SYNCHRONIZATION_CONSTRAINT: {
				SynchronizationConstraint synchronizationConstraint = (SynchronizationConstraint)theEObject;
				T result = caseSynchronizationConstraint(synchronizationConstraint);
				if (result == null) result = caseTimingConstraint(synchronizationConstraint);
				if (result == null) result = caseNamedElement(synchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.ORDER_CONSTRAINT: {
				OrderConstraint orderConstraint = (OrderConstraint)theEObject;
				T result = caseOrderConstraint(orderConstraint);
				if (result == null) result = caseTimingConstraint(orderConstraint);
				if (result == null) result = caseNamedElement(orderConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.PATTERN_CONSTRAINT: {
				PatternConstraint patternConstraint = (PatternConstraint)theEObject;
				T result = casePatternConstraint(patternConstraint);
				if (result == null) result = caseTimingConstraint(patternConstraint);
				if (result == null) result = caseNamedElement(patternConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.SPORADIC_CONSTRAINT: {
				SporadicConstraint sporadicConstraint = (SporadicConstraint)theEObject;
				T result = caseSporadicConstraint(sporadicConstraint);
				if (result == null) result = caseTimingConstraint(sporadicConstraint);
				if (result == null) result = caseNamedElement(sporadicConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.PERIODIC_CONSTRAINT: {
				PeriodicConstraint periodicConstraint = (PeriodicConstraint)theEObject;
				T result = casePeriodicConstraint(periodicConstraint);
				if (result == null) result = caseTimingConstraint(periodicConstraint);
				if (result == null) result = caseNamedElement(periodicConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.ARBITRARY_CONSTRAINT: {
				ArbitraryConstraint arbitraryConstraint = (ArbitraryConstraint)theEObject;
				T result = caseArbitraryConstraint(arbitraryConstraint);
				if (result == null) result = caseTimingConstraint(arbitraryConstraint);
				if (result == null) result = caseNamedElement(arbitraryConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.BURST_CONSTRAINT: {
				BurstConstraint burstConstraint = (BurstConstraint)theEObject;
				T result = caseBurstConstraint(burstConstraint);
				if (result == null) result = caseTimingConstraint(burstConstraint);
				if (result == null) result = caseNamedElement(burstConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.REACTION_CONSTRAINT: {
				ReactionConstraint reactionConstraint = (ReactionConstraint)theEObject;
				T result = caseReactionConstraint(reactionConstraint);
				if (result == null) result = caseTimingConstraint(reactionConstraint);
				if (result == null) result = caseNamedElement(reactionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.AGE_CONSTRAINT: {
				AgeConstraint ageConstraint = (AgeConstraint)theEObject;
				T result = caseAgeConstraint(ageConstraint);
				if (result == null) result = caseTimingConstraint(ageConstraint);
				if (result == null) result = caseNamedElement(ageConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.EVENT_CHAIN: {
				EventChain eventChain = (EventChain)theEObject;
				T result = caseEventChain(eventChain);
				if (result == null) result = caseNamedElement(eventChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingExpressionsPackage.IMPORT_STATEMENT: {
				ImportStatement importStatement = (ImportStatement)theEObject;
				T result = caseImportStatement(importStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingExpression(TimingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Timing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Timing Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicTimingExpression(SymbolicTimingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Timing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Timing Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableTimingExpression(VariableTimingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtraction(Subtraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Timing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Timing Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueTimingExpression(ValueTimingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBase(TimeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Base Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Base Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBaseRelation(TimeBaseRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiming(Timing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOrEqual(GreaterThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOrEqual(LessThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingConstraint(TimingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayConstraint(DelayConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repetition Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepetitionConstraint(RepetitionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationConstraint(SynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderConstraint(OrderConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternConstraint(PatternConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicConstraint(SporadicConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicConstraint(PeriodicConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitrary Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitrary Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitraryConstraint(ArbitraryConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Burst Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Burst Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBurstConstraint(BurstConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactionConstraint(ReactionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgeConstraint(AgeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChain(EventChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportStatement(ImportStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TimingExpressionsSwitch
