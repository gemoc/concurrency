/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Addition;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Assignment;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DimensionKind;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Division;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThan;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThanOrEqual;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThan;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThanOrEqual;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Multiplication;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.NamedElement;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Operator;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Subtraction;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsFactory;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingExpressionsPackageImpl extends EPackageImpl implements TimingExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolicTimingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTimingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTimingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBaseRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repetitionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitraryConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass burstConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dimensionKindEEnum = null;

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
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimingExpressionsPackageImpl() {
		super(eNS_URI, TimingExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimingExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimingExpressionsPackage init() {
		if (isInited) return (TimingExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(TimingExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		TimingExpressionsPackageImpl theTimingExpressionsPackage = (TimingExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimingExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimingExpressionsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTimingExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theTimingExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimingExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimingExpressionsPackage.eNS_URI, theTimingExpressionsPackage);
		return theTimingExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingExpression() {
		return timingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolicTimingExpression() {
		return symbolicTimingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolicTimingExpression_Operator() {
		return (EReference)symbolicTimingExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolicTimingExpression_Variable() {
		return (EReference)symbolicTimingExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableTimingExpression() {
		return variableTimingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTimingExpression_Value() {
		return (EReference)variableTimingExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTimingExpression_TimeBase() {
		return (EReference)variableTimingExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableTimingExpression_Unit() {
		return (EReference)variableTimingExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_LeftOperand() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_RightOperand() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtraction() {
		return subtractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTimingExpression() {
		return valueTimingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTimingExpression_TimeBase() {
		return (EReference)valueTimingExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTimingExpression_Unit() {
		return (EReference)valueTimingExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueTimingExpression_Value() {
		return (EAttribute)valueTimingExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBase() {
		return timeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBase_Type() {
		return (EReference)timeBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBase_PrecisionUnit() {
		return (EReference)timeBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBase_PrecisionFactor() {
		return (EAttribute)timeBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_Units() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Kind() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Reference() {
		return (EReference)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Factor() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Offset() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBaseRelation() {
		return timeBaseRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBaseRelation_Left() {
		return (EReference)timeBaseRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBaseRelation_Right() {
		return (EReference)timeBaseRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTiming() {
		return timingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_TimingExpressions() {
		return (EReference)timingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_TimeBases() {
		return (EReference)timingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Dimensions() {
		return (EReference)timingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_TimeBaseRelations() {
		return (EReference)timingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Events() {
		return (EReference)timingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Constraints() {
		return (EReference)timingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_EventChains() {
		return (EReference)timingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_ImportStatements() {
		return (EReference)timingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThanOrEqual() {
		return greaterThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThanOrEqual() {
		return lessThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingConstraint() {
		return timingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayConstraint() {
		return delayConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Source() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Target() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Lower() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Upper() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepetitionConstraint() {
		return repetitionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Event() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepetitionConstraint_Span() {
		return (EAttribute)repetitionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Lower() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Upper() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Jitter() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationConstraint() {
		return synchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationConstraint_Events() {
		return (EReference)synchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationConstraint_Tolerance() {
		return (EReference)synchronizationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderConstraint() {
		return orderConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderConstraint_Left() {
		return (EReference)orderConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderConstraint_Right() {
		return (EReference)orderConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_TriggerableElements() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternConstraint() {
		return patternConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternConstraint_Offset() {
		return (EReference)patternConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternConstraint_Jitter() {
		return (EReference)patternConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternConstraint_Minimum() {
		return (EReference)patternConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternConstraint_Ref() {
		return (EReference)patternConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternConstraint_Event() {
		return (EReference)patternConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicConstraint() {
		return sporadicConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicConstraint_Lower() {
		return (EReference)sporadicConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicConstraint_Upper() {
		return (EReference)sporadicConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicConstraint_Jitter() {
		return (EReference)sporadicConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicConstraint_Minimum() {
		return (EReference)sporadicConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicConstraint_Event() {
		return (EReference)sporadicConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicConstraint() {
		return periodicConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicConstraint_Period() {
		return (EReference)periodicConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicConstraint_Jitter() {
		return (EReference)periodicConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicConstraint_Minimum() {
		return (EReference)periodicConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicConstraint_Event() {
		return (EReference)periodicConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitraryConstraint() {
		return arbitraryConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryConstraint_Minimum() {
		return (EReference)arbitraryConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryConstraint_Maximum() {
		return (EReference)arbitraryConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryConstraint_Event() {
		return (EReference)arbitraryConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBurstConstraint() {
		return burstConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstConstraint_MaxOccurrence() {
		return (EAttribute)burstConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBurstConstraint_Length() {
		return (EReference)burstConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBurstConstraint_Minimum() {
		return (EReference)burstConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBurstConstraint_Event() {
		return (EReference)burstConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionConstraint() {
		return reactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactionConstraint_Minimum() {
		return (EReference)reactionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactionConstraint_Maximum() {
		return (EReference)reactionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactionConstraint_Scope() {
		return (EReference)reactionConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeConstraint() {
		return ageConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgeConstraint_Minimum() {
		return (EReference)ageConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgeConstraint_Maximum() {
		return (EReference)ageConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgeConstraint_Scope() {
		return (EReference)ageConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChain() {
		return eventChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChain_Stimulus() {
		return (EReference)eventChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChain_Response() {
		return (EReference)eventChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChain_Segment() {
		return (EReference)eventChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportStatement() {
		return importStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportStatement_ImportURI() {
		return (EAttribute)importStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportStatement_Alias() {
		return (EAttribute)importStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDimensionKind() {
		return dimensionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpressionsFactory getTimingExpressionsFactory() {
		return (TimingExpressionsFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		timingExpressionEClass = createEClass(TIMING_EXPRESSION);

		symbolicTimingExpressionEClass = createEClass(SYMBOLIC_TIMING_EXPRESSION);
		createEReference(symbolicTimingExpressionEClass, SYMBOLIC_TIMING_EXPRESSION__OPERATOR);
		createEReference(symbolicTimingExpressionEClass, SYMBOLIC_TIMING_EXPRESSION__VARIABLE);

		variableTimingExpressionEClass = createEClass(VARIABLE_TIMING_EXPRESSION);
		createEReference(variableTimingExpressionEClass, VARIABLE_TIMING_EXPRESSION__VALUE);
		createEReference(variableTimingExpressionEClass, VARIABLE_TIMING_EXPRESSION__TIME_BASE);
		createEReference(variableTimingExpressionEClass, VARIABLE_TIMING_EXPRESSION__UNIT);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__LEFT_OPERAND);
		createEReference(operatorEClass, OPERATOR__RIGHT_OPERAND);

		additionEClass = createEClass(ADDITION);

		subtractionEClass = createEClass(SUBTRACTION);

		multiplicationEClass = createEClass(MULTIPLICATION);

		divisionEClass = createEClass(DIVISION);

		valueTimingExpressionEClass = createEClass(VALUE_TIMING_EXPRESSION);
		createEReference(valueTimingExpressionEClass, VALUE_TIMING_EXPRESSION__TIME_BASE);
		createEReference(valueTimingExpressionEClass, VALUE_TIMING_EXPRESSION__UNIT);
		createEAttribute(valueTimingExpressionEClass, VALUE_TIMING_EXPRESSION__VALUE);

		timeBaseEClass = createEClass(TIME_BASE);
		createEReference(timeBaseEClass, TIME_BASE__TYPE);
		createEReference(timeBaseEClass, TIME_BASE__PRECISION_UNIT);
		createEAttribute(timeBaseEClass, TIME_BASE__PRECISION_FACTOR);

		dimensionEClass = createEClass(DIMENSION);
		createEReference(dimensionEClass, DIMENSION__UNITS);
		createEAttribute(dimensionEClass, DIMENSION__KIND);

		unitEClass = createEClass(UNIT);
		createEReference(unitEClass, UNIT__REFERENCE);
		createEAttribute(unitEClass, UNIT__FACTOR);
		createEAttribute(unitEClass, UNIT__OFFSET);

		timeBaseRelationEClass = createEClass(TIME_BASE_RELATION);
		createEReference(timeBaseRelationEClass, TIME_BASE_RELATION__LEFT);
		createEReference(timeBaseRelationEClass, TIME_BASE_RELATION__RIGHT);

		timingEClass = createEClass(TIMING);
		createEReference(timingEClass, TIMING__TIMING_EXPRESSIONS);
		createEReference(timingEClass, TIMING__TIME_BASES);
		createEReference(timingEClass, TIMING__DIMENSIONS);
		createEReference(timingEClass, TIMING__TIME_BASE_RELATIONS);
		createEReference(timingEClass, TIMING__EVENTS);
		createEReference(timingEClass, TIMING__CONSTRAINTS);
		createEReference(timingEClass, TIMING__EVENT_CHAINS);
		createEReference(timingEClass, TIMING__IMPORT_STATEMENTS);

		assignmentEClass = createEClass(ASSIGNMENT);

		greaterThanEClass = createEClass(GREATER_THAN);

		greaterThanOrEqualEClass = createEClass(GREATER_THAN_OR_EQUAL);

		lessThanEClass = createEClass(LESS_THAN);

		lessThanOrEqualEClass = createEClass(LESS_THAN_OR_EQUAL);

		timingConstraintEClass = createEClass(TIMING_CONSTRAINT);

		delayConstraintEClass = createEClass(DELAY_CONSTRAINT);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__SOURCE);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__TARGET);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__LOWER);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__UPPER);

		repetitionConstraintEClass = createEClass(REPETITION_CONSTRAINT);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__EVENT);
		createEAttribute(repetitionConstraintEClass, REPETITION_CONSTRAINT__SPAN);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__LOWER);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__UPPER);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__JITTER);

		synchronizationConstraintEClass = createEClass(SYNCHRONIZATION_CONSTRAINT);
		createEReference(synchronizationConstraintEClass, SYNCHRONIZATION_CONSTRAINT__EVENTS);
		createEReference(synchronizationConstraintEClass, SYNCHRONIZATION_CONSTRAINT__TOLERANCE);

		orderConstraintEClass = createEClass(ORDER_CONSTRAINT);
		createEReference(orderConstraintEClass, ORDER_CONSTRAINT__LEFT);
		createEReference(orderConstraintEClass, ORDER_CONSTRAINT__RIGHT);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__TRIGGERABLE_ELEMENTS);

		patternConstraintEClass = createEClass(PATTERN_CONSTRAINT);
		createEReference(patternConstraintEClass, PATTERN_CONSTRAINT__OFFSET);
		createEReference(patternConstraintEClass, PATTERN_CONSTRAINT__JITTER);
		createEReference(patternConstraintEClass, PATTERN_CONSTRAINT__MINIMUM);
		createEReference(patternConstraintEClass, PATTERN_CONSTRAINT__REF);
		createEReference(patternConstraintEClass, PATTERN_CONSTRAINT__EVENT);

		sporadicConstraintEClass = createEClass(SPORADIC_CONSTRAINT);
		createEReference(sporadicConstraintEClass, SPORADIC_CONSTRAINT__LOWER);
		createEReference(sporadicConstraintEClass, SPORADIC_CONSTRAINT__UPPER);
		createEReference(sporadicConstraintEClass, SPORADIC_CONSTRAINT__JITTER);
		createEReference(sporadicConstraintEClass, SPORADIC_CONSTRAINT__MINIMUM);
		createEReference(sporadicConstraintEClass, SPORADIC_CONSTRAINT__EVENT);

		periodicConstraintEClass = createEClass(PERIODIC_CONSTRAINT);
		createEReference(periodicConstraintEClass, PERIODIC_CONSTRAINT__PERIOD);
		createEReference(periodicConstraintEClass, PERIODIC_CONSTRAINT__JITTER);
		createEReference(periodicConstraintEClass, PERIODIC_CONSTRAINT__MINIMUM);
		createEReference(periodicConstraintEClass, PERIODIC_CONSTRAINT__EVENT);

		arbitraryConstraintEClass = createEClass(ARBITRARY_CONSTRAINT);
		createEReference(arbitraryConstraintEClass, ARBITRARY_CONSTRAINT__MINIMUM);
		createEReference(arbitraryConstraintEClass, ARBITRARY_CONSTRAINT__MAXIMUM);
		createEReference(arbitraryConstraintEClass, ARBITRARY_CONSTRAINT__EVENT);

		burstConstraintEClass = createEClass(BURST_CONSTRAINT);
		createEAttribute(burstConstraintEClass, BURST_CONSTRAINT__MAX_OCCURRENCE);
		createEReference(burstConstraintEClass, BURST_CONSTRAINT__LENGTH);
		createEReference(burstConstraintEClass, BURST_CONSTRAINT__MINIMUM);
		createEReference(burstConstraintEClass, BURST_CONSTRAINT__EVENT);

		reactionConstraintEClass = createEClass(REACTION_CONSTRAINT);
		createEReference(reactionConstraintEClass, REACTION_CONSTRAINT__MINIMUM);
		createEReference(reactionConstraintEClass, REACTION_CONSTRAINT__MAXIMUM);
		createEReference(reactionConstraintEClass, REACTION_CONSTRAINT__SCOPE);

		ageConstraintEClass = createEClass(AGE_CONSTRAINT);
		createEReference(ageConstraintEClass, AGE_CONSTRAINT__MINIMUM);
		createEReference(ageConstraintEClass, AGE_CONSTRAINT__MAXIMUM);
		createEReference(ageConstraintEClass, AGE_CONSTRAINT__SCOPE);

		eventChainEClass = createEClass(EVENT_CHAIN);
		createEReference(eventChainEClass, EVENT_CHAIN__STIMULUS);
		createEReference(eventChainEClass, EVENT_CHAIN__RESPONSE);
		createEReference(eventChainEClass, EVENT_CHAIN__SEGMENT);

		importStatementEClass = createEClass(IMPORT_STATEMENT);
		createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORT_URI);
		createEAttribute(importStatementEClass, IMPORT_STATEMENT__ALIAS);

		// Create enums
		dimensionKindEEnum = createEEnum(DIMENSION_KIND);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		symbolicTimingExpressionEClass.getESuperTypes().add(this.getTimingExpression());
		variableTimingExpressionEClass.getESuperTypes().add(this.getTimingExpression());
		variableTimingExpressionEClass.getESuperTypes().add(this.getNamedElement());
		additionEClass.getESuperTypes().add(this.getOperator());
		subtractionEClass.getESuperTypes().add(this.getOperator());
		multiplicationEClass.getESuperTypes().add(this.getOperator());
		divisionEClass.getESuperTypes().add(this.getOperator());
		valueTimingExpressionEClass.getESuperTypes().add(this.getTimingExpression());
		timeBaseEClass.getESuperTypes().add(this.getNamedElement());
		dimensionEClass.getESuperTypes().add(this.getNamedElement());
		unitEClass.getESuperTypes().add(this.getNamedElement());
		timeBaseRelationEClass.getESuperTypes().add(this.getNamedElement());
		timingEClass.getESuperTypes().add(this.getNamedElement());
		assignmentEClass.getESuperTypes().add(this.getOperator());
		greaterThanEClass.getESuperTypes().add(this.getOperator());
		greaterThanOrEqualEClass.getESuperTypes().add(this.getOperator());
		lessThanEClass.getESuperTypes().add(this.getOperator());
		lessThanOrEqualEClass.getESuperTypes().add(this.getOperator());
		timingConstraintEClass.getESuperTypes().add(this.getNamedElement());
		delayConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		repetitionConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		synchronizationConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		orderConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		eventEClass.getESuperTypes().add(this.getNamedElement());
		patternConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		sporadicConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		periodicConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		arbitraryConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		burstConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		reactionConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		ageConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		eventChainEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingExpressionEClass, TimingExpression.class, "TimingExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(symbolicTimingExpressionEClass, SymbolicTimingExpression.class, "SymbolicTimingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolicTimingExpression_Operator(), this.getOperator(), null, "operator", null, 0, 1, SymbolicTimingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolicTimingExpression_Variable(), this.getVariableTimingExpression(), null, "variable", null, 0, 1, SymbolicTimingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableTimingExpressionEClass, VariableTimingExpression.class, "VariableTimingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableTimingExpression_Value(), this.getTimingExpression(), null, "value", null, 0, 1, VariableTimingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableTimingExpression_TimeBase(), this.getTimeBase(), null, "timeBase", null, 1, 1, VariableTimingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableTimingExpression_Unit(), this.getUnit(), null, "unit", null, 1, 1, VariableTimingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_LeftOperand(), this.getTimingExpression(), null, "leftOperand", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_RightOperand(), this.getTimingExpression(), null, "rightOperand", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractionEClass, Subtraction.class, "Subtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueTimingExpressionEClass, ValueTimingExpression.class, "ValueTimingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueTimingExpression_TimeBase(), this.getTimeBase(), null, "timeBase", null, 0, 1, ValueTimingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueTimingExpression_Unit(), this.getUnit(), null, "unit", null, 0, 1, ValueTimingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueTimingExpression_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, ValueTimingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeBaseEClass, TimeBase.class, "TimeBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeBase_Type(), this.getDimension(), null, "type", null, 1, 1, TimeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBase_PrecisionUnit(), this.getUnit(), null, "precisionUnit", null, 0, 1, TimeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBase_PrecisionFactor(), ecorePackage.getEDouble(), "precisionFactor", null, 0, 1, TimeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimension_Units(), this.getUnit(), null, "units", null, 1, -1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_Kind(), this.getDimensionKind(), "kind", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Reference(), this.getUnit(), null, "reference", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Factor(), ecorePackage.getEDouble(), "factor", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Offset(), ecorePackage.getEDouble(), "offset", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeBaseRelationEClass, TimeBaseRelation.class, "TimeBaseRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeBaseRelation_Left(), this.getTimingExpression(), null, "left", null, 1, 1, TimeBaseRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBaseRelation_Right(), this.getTimingExpression(), null, "right", null, 1, 1, TimeBaseRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingEClass, Timing.class, "Timing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTiming_TimingExpressions(), this.getTimingExpression(), null, "timingExpressions", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_TimeBases(), this.getTimeBase(), null, "timeBases", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_Dimensions(), this.getDimension(), null, "dimensions", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_TimeBaseRelations(), this.getTimeBaseRelation(), null, "timeBaseRelations", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_Events(), this.getEvent(), null, "events", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_Constraints(), this.getTimingConstraint(), null, "constraints", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_EventChains(), this.getEventChain(), null, "eventChains", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_ImportStatements(), this.getImportStatement(), null, "importStatements", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanOrEqualEClass, GreaterThanOrEqual.class, "GreaterThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanOrEqualEClass, LessThanOrEqual.class, "LessThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timingConstraintEClass, TimingConstraint.class, "TimingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayConstraintEClass, DelayConstraint.class, "DelayConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelayConstraint_Source(), this.getEvent(), null, "source", null, 1, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Target(), this.getEvent(), null, "target", null, 1, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Lower(), this.getTimingExpression(), null, "lower", null, 1, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Upper(), this.getTimingExpression(), null, "upper", null, 1, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repetitionConstraintEClass, RepetitionConstraint.class, "RepetitionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepetitionConstraint_Event(), this.getEvent(), null, "event", null, 1, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepetitionConstraint_Span(), ecorePackage.getEInt(), "span", null, 1, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepetitionConstraint_Lower(), this.getTimingExpression(), null, "lower", null, 1, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepetitionConstraint_Upper(), this.getTimingExpression(), null, "upper", null, 1, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepetitionConstraint_Jitter(), this.getTimingExpression(), null, "jitter", null, 1, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationConstraintEClass, SynchronizationConstraint.class, "SynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizationConstraint_Events(), this.getEvent(), null, "events", null, 2, -1, SynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronizationConstraint_Tolerance(), this.getTimingExpression(), null, "tolerance", null, 1, 1, SynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderConstraintEClass, OrderConstraint.class, "OrderConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderConstraint_Left(), this.getTimingExpression(), null, "left", null, 1, 1, OrderConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderConstraint_Right(), this.getTimingExpression(), null, "right", null, 1, 1, OrderConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_TriggerableElements(), ecorePackage.getEObject(), null, "triggerableElements", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternConstraintEClass, PatternConstraint.class, "PatternConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternConstraint_Offset(), this.getTimingExpression(), null, "offset", null, 1, -1, PatternConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternConstraint_Jitter(), this.getTimingExpression(), null, "jitter", null, 1, 1, PatternConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternConstraint_Minimum(), this.getTimingExpression(), null, "minimum", null, 1, 1, PatternConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternConstraint_Ref(), this.getEvent(), null, "ref", null, 1, 1, PatternConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternConstraint_Event(), this.getEvent(), null, "event", null, 1, 1, PatternConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicConstraintEClass, SporadicConstraint.class, "SporadicConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSporadicConstraint_Lower(), this.getTimingExpression(), null, "lower", null, 1, 1, SporadicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicConstraint_Upper(), this.getTimingExpression(), null, "upper", null, 1, 1, SporadicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicConstraint_Jitter(), this.getTimingExpression(), null, "jitter", null, 1, 1, SporadicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicConstraint_Minimum(), this.getTimingExpression(), null, "minimum", null, 1, 1, SporadicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicConstraint_Event(), this.getEvent(), null, "event", null, 1, 1, SporadicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicConstraintEClass, PeriodicConstraint.class, "PeriodicConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicConstraint_Period(), this.getTimingExpression(), null, "period", null, 1, 1, PeriodicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicConstraint_Jitter(), this.getTimingExpression(), null, "jitter", null, 1, 1, PeriodicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicConstraint_Minimum(), this.getTimingExpression(), null, "minimum", null, 1, 1, PeriodicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicConstraint_Event(), this.getEvent(), null, "event", null, 1, 1, PeriodicConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arbitraryConstraintEClass, ArbitraryConstraint.class, "ArbitraryConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArbitraryConstraint_Minimum(), this.getTimingExpression(), null, "minimum", null, 1, -1, ArbitraryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArbitraryConstraint_Maximum(), this.getTimingExpression(), null, "maximum", null, 1, -1, ArbitraryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArbitraryConstraint_Event(), this.getEvent(), null, "event", null, 1, 1, ArbitraryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(burstConstraintEClass, BurstConstraint.class, "BurstConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBurstConstraint_MaxOccurrence(), ecorePackage.getEInt(), "maxOccurrence", null, 1, 1, BurstConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBurstConstraint_Length(), this.getTimingExpression(), null, "length", null, 1, 1, BurstConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBurstConstraint_Minimum(), this.getTimingExpression(), null, "minimum", null, 1, 1, BurstConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBurstConstraint_Event(), this.getEvent(), null, "event", null, 1, 1, BurstConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactionConstraintEClass, ReactionConstraint.class, "ReactionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReactionConstraint_Minimum(), this.getTimingExpression(), null, "minimum", null, 1, 1, ReactionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactionConstraint_Maximum(), this.getTimingExpression(), null, "maximum", null, 1, 1, ReactionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactionConstraint_Scope(), this.getEventChain(), null, "scope", null, 1, 1, ReactionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ageConstraintEClass, AgeConstraint.class, "AgeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgeConstraint_Minimum(), this.getTimingExpression(), null, "minimum", null, 1, 1, AgeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgeConstraint_Maximum(), this.getTimingExpression(), null, "maximum", null, 1, 1, AgeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgeConstraint_Scope(), this.getEventChain(), null, "scope", null, 1, 1, AgeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainEClass, EventChain.class, "EventChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChain_Stimulus(), this.getEvent(), null, "stimulus", null, 1, 1, EventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChain_Response(), this.getEvent(), null, "response", null, 1, 1, EventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChain_Segment(), this.getEvent(), null, "segment", null, 0, -1, EventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportStatement_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dimensionKindEEnum, DimensionKind.class, "DimensionKind");
		addEEnumLiteral(dimensionKindEEnum, DimensionKind.OTHER);
		addEEnumLiteral(dimensionKindEEnum, DimensionKind.TIME);
		addEEnumLiteral(dimensionKindEEnum, DimensionKind.ANGLE);
		addEEnumLiteral(dimensionKindEEnum, DimensionKind.DISTANCE);
		addEEnumLiteral(dimensionKindEEnum, DimensionKind.LOGICAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (timeBaseEClass, 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (getTimeBase_Type(), 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (getTimeBase_PrecisionUnit(), 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (getTimeBase_PrecisionFactor(), 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (dimensionEClass, 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (getDimension_Kind(), 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (unitEClass, 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (getUnit_Reference(), 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (getUnit_Factor(), 
		   source, 
		   new String[] {
			 "name", "units"
		   });		
		addAnnotation
		  (getUnit_Offset(), 
		   source, 
		   new String[] {
			 "name", "units"
		   });
	}

} //TimingExpressionsPackageImpl
