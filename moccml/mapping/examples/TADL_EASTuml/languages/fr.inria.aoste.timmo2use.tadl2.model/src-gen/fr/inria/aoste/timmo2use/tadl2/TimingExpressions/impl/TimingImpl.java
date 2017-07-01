/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.EventChain;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBaseRelation;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingConstraint;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl#getTimingExpressions <em>Timing Expressions</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl#getTimeBases <em>Time Bases</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl#getTimeBaseRelations <em>Time Base Relations</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl#getEventChains <em>Event Chains</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimingImpl#getImportStatements <em>Import Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingImpl extends NamedElementImpl implements Timing {
	/**
	 * The cached value of the '{@link #getTimingExpressions() <em>Timing Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingExpression> timingExpressions;

	/**
	 * The cached value of the '{@link #getTimeBases() <em>Time Bases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBases()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeBase> timeBases;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> dimensions;

	/**
	 * The cached value of the '{@link #getTimeBaseRelations() <em>Time Base Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBaseRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeBaseRelation> timeBaseRelations;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingConstraint> constraints;

	/**
	 * The cached value of the '{@link #getEventChains() <em>Event Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChains()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> eventChains;

	/**
	 * The cached value of the '{@link #getImportStatements() <em>Import Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportStatement> importStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingExpressionsPackage.Literals.TIMING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingExpression> getTimingExpressions() {
		if (timingExpressions == null) {
			timingExpressions = new EObjectContainmentEList<TimingExpression>(TimingExpression.class, this, TimingExpressionsPackage.TIMING__TIMING_EXPRESSIONS);
		}
		return timingExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeBase> getTimeBases() {
		if (timeBases == null) {
			timeBases = new EObjectContainmentEList<TimeBase>(TimeBase.class, this, TimingExpressionsPackage.TIMING__TIME_BASES);
		}
		return timeBases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectContainmentEList<Dimension>(Dimension.class, this, TimingExpressionsPackage.TIMING__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeBaseRelation> getTimeBaseRelations() {
		if (timeBaseRelations == null) {
			timeBaseRelations = new EObjectContainmentEList<TimeBaseRelation>(TimeBaseRelation.class, this, TimingExpressionsPackage.TIMING__TIME_BASE_RELATIONS);
		}
		return timeBaseRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, TimingExpressionsPackage.TIMING__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<TimingConstraint>(TimingConstraint.class, this, TimingExpressionsPackage.TIMING__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChain> getEventChains() {
		if (eventChains == null) {
			eventChains = new EObjectContainmentEList<EventChain>(EventChain.class, this, TimingExpressionsPackage.TIMING__EVENT_CHAINS);
		}
		return eventChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportStatement> getImportStatements() {
		if (importStatements == null) {
			importStatements = new EObjectContainmentEList<ImportStatement>(ImportStatement.class, this, TimingExpressionsPackage.TIMING__IMPORT_STATEMENTS);
		}
		return importStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingExpressionsPackage.TIMING__TIMING_EXPRESSIONS:
				return ((InternalEList<?>)getTimingExpressions()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.TIMING__TIME_BASES:
				return ((InternalEList<?>)getTimeBases()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.TIMING__DIMENSIONS:
				return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.TIMING__TIME_BASE_RELATIONS:
				return ((InternalEList<?>)getTimeBaseRelations()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.TIMING__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.TIMING__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.TIMING__EVENT_CHAINS:
				return ((InternalEList<?>)getEventChains()).basicRemove(otherEnd, msgs);
			case TimingExpressionsPackage.TIMING__IMPORT_STATEMENTS:
				return ((InternalEList<?>)getImportStatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingExpressionsPackage.TIMING__TIMING_EXPRESSIONS:
				return getTimingExpressions();
			case TimingExpressionsPackage.TIMING__TIME_BASES:
				return getTimeBases();
			case TimingExpressionsPackage.TIMING__DIMENSIONS:
				return getDimensions();
			case TimingExpressionsPackage.TIMING__TIME_BASE_RELATIONS:
				return getTimeBaseRelations();
			case TimingExpressionsPackage.TIMING__EVENTS:
				return getEvents();
			case TimingExpressionsPackage.TIMING__CONSTRAINTS:
				return getConstraints();
			case TimingExpressionsPackage.TIMING__EVENT_CHAINS:
				return getEventChains();
			case TimingExpressionsPackage.TIMING__IMPORT_STATEMENTS:
				return getImportStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingExpressionsPackage.TIMING__TIMING_EXPRESSIONS:
				getTimingExpressions().clear();
				getTimingExpressions().addAll((Collection<? extends TimingExpression>)newValue);
				return;
			case TimingExpressionsPackage.TIMING__TIME_BASES:
				getTimeBases().clear();
				getTimeBases().addAll((Collection<? extends TimeBase>)newValue);
				return;
			case TimingExpressionsPackage.TIMING__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends Dimension>)newValue);
				return;
			case TimingExpressionsPackage.TIMING__TIME_BASE_RELATIONS:
				getTimeBaseRelations().clear();
				getTimeBaseRelations().addAll((Collection<? extends TimeBaseRelation>)newValue);
				return;
			case TimingExpressionsPackage.TIMING__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case TimingExpressionsPackage.TIMING__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends TimingConstraint>)newValue);
				return;
			case TimingExpressionsPackage.TIMING__EVENT_CHAINS:
				getEventChains().clear();
				getEventChains().addAll((Collection<? extends EventChain>)newValue);
				return;
			case TimingExpressionsPackage.TIMING__IMPORT_STATEMENTS:
				getImportStatements().clear();
				getImportStatements().addAll((Collection<? extends ImportStatement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimingExpressionsPackage.TIMING__TIMING_EXPRESSIONS:
				getTimingExpressions().clear();
				return;
			case TimingExpressionsPackage.TIMING__TIME_BASES:
				getTimeBases().clear();
				return;
			case TimingExpressionsPackage.TIMING__DIMENSIONS:
				getDimensions().clear();
				return;
			case TimingExpressionsPackage.TIMING__TIME_BASE_RELATIONS:
				getTimeBaseRelations().clear();
				return;
			case TimingExpressionsPackage.TIMING__EVENTS:
				getEvents().clear();
				return;
			case TimingExpressionsPackage.TIMING__CONSTRAINTS:
				getConstraints().clear();
				return;
			case TimingExpressionsPackage.TIMING__EVENT_CHAINS:
				getEventChains().clear();
				return;
			case TimingExpressionsPackage.TIMING__IMPORT_STATEMENTS:
				getImportStatements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimingExpressionsPackage.TIMING__TIMING_EXPRESSIONS:
				return timingExpressions != null && !timingExpressions.isEmpty();
			case TimingExpressionsPackage.TIMING__TIME_BASES:
				return timeBases != null && !timeBases.isEmpty();
			case TimingExpressionsPackage.TIMING__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case TimingExpressionsPackage.TIMING__TIME_BASE_RELATIONS:
				return timeBaseRelations != null && !timeBaseRelations.isEmpty();
			case TimingExpressionsPackage.TIMING__EVENTS:
				return events != null && !events.isEmpty();
			case TimingExpressionsPackage.TIMING__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case TimingExpressionsPackage.TIMING__EVENT_CHAINS:
				return eventChains != null && !eventChains.isEmpty();
			case TimingExpressionsPackage.TIMING__IMPORT_STATEMENTS:
				return importStatements != null && !importStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimingImpl
