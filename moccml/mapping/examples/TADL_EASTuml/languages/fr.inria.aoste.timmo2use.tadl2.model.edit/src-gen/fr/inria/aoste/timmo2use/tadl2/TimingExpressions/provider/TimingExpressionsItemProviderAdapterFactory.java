/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.provider;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.util.TimingExpressionsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingExpressionsItemProviderAdapterFactory extends TimingExpressionsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpressionsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolicTimingExpressionItemProvider symbolicTimingExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolicTimingExpressionAdapter() {
		if (symbolicTimingExpressionItemProvider == null) {
			symbolicTimingExpressionItemProvider = new SymbolicTimingExpressionItemProvider(this);
		}

		return symbolicTimingExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableTimingExpressionItemProvider variableTimingExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.VariableTimingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableTimingExpressionAdapter() {
		if (variableTimingExpressionItemProvider == null) {
			variableTimingExpressionItemProvider = new VariableTimingExpressionItemProvider(this);
		}

		return variableTimingExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Addition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionItemProvider additionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Addition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdditionAdapter() {
		if (additionItemProvider == null) {
			additionItemProvider = new AdditionItemProvider(this);
		}

		return additionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Subtraction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtractionItemProvider subtractionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Subtraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubtractionAdapter() {
		if (subtractionItemProvider == null) {
			subtractionItemProvider = new SubtractionItemProvider(this);
		}

		return subtractionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Multiplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicationItemProvider multiplicationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Multiplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicationAdapter() {
		if (multiplicationItemProvider == null) {
			multiplicationItemProvider = new MultiplicationItemProvider(this);
		}

		return multiplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Division} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivisionItemProvider divisionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivisionAdapter() {
		if (divisionItemProvider == null) {
			divisionItemProvider = new DivisionItemProvider(this);
		}

		return divisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTimingExpressionItemProvider valueTimingExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ValueTimingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueTimingExpressionAdapter() {
		if (valueTimingExpressionItemProvider == null) {
			valueTimingExpressionItemProvider = new ValueTimingExpressionItemProvider(this);
		}

		return valueTimingExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBaseItemProvider timeBaseItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeBaseAdapter() {
		if (timeBaseItemProvider == null) {
			timeBaseItemProvider = new TimeBaseItemProvider(this);
		}

		return timeBaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionItemProvider dimensionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDimensionAdapter() {
		if (dimensionItemProvider == null) {
			dimensionItemProvider = new DimensionItemProvider(this);
		}

		return dimensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitItemProvider unitItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitAdapter() {
		if (unitItemProvider == null) {
			unitItemProvider = new UnitItemProvider(this);
		}

		return unitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBaseRelationItemProvider timeBaseRelationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeBaseRelationAdapter() {
		if (timeBaseRelationItemProvider == null) {
			timeBaseRelationItemProvider = new TimeBaseRelationItemProvider(this);
		}

		return timeBaseRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingItemProvider timingItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimingAdapter() {
		if (timingItemProvider == null) {
			timingItemProvider = new TimingItemProvider(this);
		}

		return timingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Assignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentItemProvider assignmentItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentAdapter() {
		if (assignmentItemProvider == null) {
			assignmentItemProvider = new AssignmentItemProvider(this);
		}

		return assignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterThanItemProvider greaterThanItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterThanAdapter() {
		if (greaterThanItemProvider == null) {
			greaterThanItemProvider = new GreaterThanItemProvider(this);
		}

		return greaterThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThanOrEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterThanOrEqualItemProvider greaterThanOrEqualItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.GreaterThanOrEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterThanOrEqualAdapter() {
		if (greaterThanOrEqualItemProvider == null) {
			greaterThanOrEqualItemProvider = new GreaterThanOrEqualItemProvider(this);
		}

		return greaterThanOrEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanItemProvider lessThanItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLessThanAdapter() {
		if (lessThanItemProvider == null) {
			lessThanItemProvider = new LessThanItemProvider(this);
		}

		return lessThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThanOrEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanOrEqualItemProvider lessThanOrEqualItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.LessThanOrEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLessThanOrEqualAdapter() {
		if (lessThanOrEqualItemProvider == null) {
			lessThanOrEqualItemProvider = new LessThanOrEqualItemProvider(this);
		}

		return lessThanOrEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayConstraintItemProvider delayConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.DelayConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelayConstraintAdapter() {
		if (delayConstraintItemProvider == null) {
			delayConstraintItemProvider = new DelayConstraintItemProvider(this);
		}

		return delayConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepetitionConstraintItemProvider repetitionConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.RepetitionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepetitionConstraintAdapter() {
		if (repetitionConstraintItemProvider == null) {
			repetitionConstraintItemProvider = new RepetitionConstraintItemProvider(this);
		}

		return repetitionConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationConstraintItemProvider synchronizationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SynchronizationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchronizationConstraintAdapter() {
		if (synchronizationConstraintItemProvider == null) {
			synchronizationConstraintItemProvider = new SynchronizationConstraintItemProvider(this);
		}

		return synchronizationConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderConstraintItemProvider orderConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.OrderConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderConstraintAdapter() {
		if (orderConstraintItemProvider == null) {
			orderConstraintItemProvider = new OrderConstraintItemProvider(this);
		}

		return orderConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternConstraintItemProvider patternConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternConstraintAdapter() {
		if (patternConstraintItemProvider == null) {
			patternConstraintItemProvider = new PatternConstraintItemProvider(this);
		}

		return patternConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicConstraintItemProvider sporadicConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SporadicConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSporadicConstraintAdapter() {
		if (sporadicConstraintItemProvider == null) {
			sporadicConstraintItemProvider = new SporadicConstraintItemProvider(this);
		}

		return sporadicConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicConstraintItemProvider periodicConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PeriodicConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPeriodicConstraintAdapter() {
		if (periodicConstraintItemProvider == null) {
			periodicConstraintItemProvider = new PeriodicConstraintItemProvider(this);
		}

		return periodicConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArbitraryConstraintItemProvider arbitraryConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ArbitraryConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArbitraryConstraintAdapter() {
		if (arbitraryConstraintItemProvider == null) {
			arbitraryConstraintItemProvider = new ArbitraryConstraintItemProvider(this);
		}

		return arbitraryConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BurstConstraintItemProvider burstConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.BurstConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBurstConstraintAdapter() {
		if (burstConstraintItemProvider == null) {
			burstConstraintItemProvider = new BurstConstraintItemProvider(this);
		}

		return burstConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionConstraintItemProvider reactionConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ReactionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReactionConstraintAdapter() {
		if (reactionConstraintItemProvider == null) {
			reactionConstraintItemProvider = new ReactionConstraintItemProvider(this);
		}

		return reactionConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgeConstraintItemProvider ageConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.AgeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgeConstraintAdapter() {
		if (ageConstraintItemProvider == null) {
			ageConstraintItemProvider = new AgeConstraintItemProvider(this);
		}

		return ageConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainItemProvider eventChainItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventChainAdapter() {
		if (eventChainItemProvider == null) {
			eventChainItemProvider = new EventChainItemProvider(this);
		}

		return eventChainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportStatementItemProvider importStatementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportStatementAdapter() {
		if (importStatementItemProvider == null) {
			importStatementItemProvider = new ImportStatementItemProvider(this);
		}

		return importStatementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (symbolicTimingExpressionItemProvider != null) symbolicTimingExpressionItemProvider.dispose();
		if (variableTimingExpressionItemProvider != null) variableTimingExpressionItemProvider.dispose();
		if (additionItemProvider != null) additionItemProvider.dispose();
		if (subtractionItemProvider != null) subtractionItemProvider.dispose();
		if (multiplicationItemProvider != null) multiplicationItemProvider.dispose();
		if (divisionItemProvider != null) divisionItemProvider.dispose();
		if (valueTimingExpressionItemProvider != null) valueTimingExpressionItemProvider.dispose();
		if (timeBaseItemProvider != null) timeBaseItemProvider.dispose();
		if (dimensionItemProvider != null) dimensionItemProvider.dispose();
		if (unitItemProvider != null) unitItemProvider.dispose();
		if (timeBaseRelationItemProvider != null) timeBaseRelationItemProvider.dispose();
		if (timingItemProvider != null) timingItemProvider.dispose();
		if (assignmentItemProvider != null) assignmentItemProvider.dispose();
		if (greaterThanItemProvider != null) greaterThanItemProvider.dispose();
		if (greaterThanOrEqualItemProvider != null) greaterThanOrEqualItemProvider.dispose();
		if (lessThanItemProvider != null) lessThanItemProvider.dispose();
		if (lessThanOrEqualItemProvider != null) lessThanOrEqualItemProvider.dispose();
		if (delayConstraintItemProvider != null) delayConstraintItemProvider.dispose();
		if (repetitionConstraintItemProvider != null) repetitionConstraintItemProvider.dispose();
		if (synchronizationConstraintItemProvider != null) synchronizationConstraintItemProvider.dispose();
		if (orderConstraintItemProvider != null) orderConstraintItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (patternConstraintItemProvider != null) patternConstraintItemProvider.dispose();
		if (sporadicConstraintItemProvider != null) sporadicConstraintItemProvider.dispose();
		if (periodicConstraintItemProvider != null) periodicConstraintItemProvider.dispose();
		if (arbitraryConstraintItemProvider != null) arbitraryConstraintItemProvider.dispose();
		if (burstConstraintItemProvider != null) burstConstraintItemProvider.dispose();
		if (reactionConstraintItemProvider != null) reactionConstraintItemProvider.dispose();
		if (ageConstraintItemProvider != null) ageConstraintItemProvider.dispose();
		if (eventChainItemProvider != null) eventChainItemProvider.dispose();
		if (importStatementItemProvider != null) importStatementItemProvider.dispose();
	}

}