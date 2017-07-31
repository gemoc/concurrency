/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.gemoc.moccml.mapping.feedback.feedback;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackFactory
 * @model kind="package"
 * @generated
 */
public interface FeedbackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "feedback";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://timesquare.inria.fr/feedback";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "feedback";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeedbackPackage eINSTANCE = org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.WhenImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ACTION = 2;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ConditionImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ForceImpl <em>Force</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ForceImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getForce()
	 * @generated
	 */
	int FORCE = 3;

	/**
	 * The feature id for the '<em><b>Event To Be Forced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__EVENT_TO_BE_FORCED = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__KIND = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__ON_TRIGGER = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Until Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE__UNTIL_TRIGGER = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Force</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Force</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionFinishedConditionImpl <em>Action Finished Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionFinishedConditionImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getActionFinishedCondition()
	 * @generated
	 */
	int ACTION_FINISHED_CONDITION = 4;

	/**
	 * The number of structural features of the '<em>Action Finished Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FINISHED_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Finished Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FINISHED_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ImportStatementImpl <em>Import Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ImportStatementImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getImportStatement()
	 * @generated
	 */
	int IMPORT_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ModelSpecificEventImpl <em>Model Specific Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ModelSpecificEventImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getModelSpecificEvent()
	 * @generated
	 */
	int MODEL_SPECIFIC_EVENT = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT__CALLER = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT__ACTION = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Solver Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT__SOLVER_EVENT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT___GET_EANNOTATION__STRING = EcorePackage.ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Model Specific Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SPECIFIC_EVENT_OPERATION_COUNT = EcorePackage.ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionResultConditionImpl <em>Action Result Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionResultConditionImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getActionResultCondition()
	 * @generated
	 */
	int ACTION_RESULT_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT_CONDITION__COMPARISON_VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Result Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Result Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionModelImpl <em>Action Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionModelImpl
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getActionModel()
	 * @generated
	 */
	int ACTION_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MODEL__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>When Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MODEL__WHEN_STATEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Import Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MODEL__IMPORT_STATEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Action Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind <em>Force Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getForceKind()
	 * @generated
	 */
	int FORCE_KIND = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.When#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.When#getSource()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.When#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.When#getCondition()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.When#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.When#getAction()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Action();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force
	 * @generated
	 */
	EClass getForce();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getEventToBeForced <em>Event To Be Forced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event To Be Forced</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getEventToBeForced()
	 * @see #getForce()
	 * @generated
	 */
	EReference getForce_EventToBeForced();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getKind()
	 * @see #getForce()
	 * @generated
	 */
	EAttribute getForce_Kind();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getOnTrigger <em>On Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Trigger</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getOnTrigger()
	 * @see #getForce()
	 * @generated
	 */
	EReference getForce_OnTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getUntilTrigger <em>Until Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Until Trigger</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force#getUntilTrigger()
	 * @see #getForce()
	 * @generated
	 */
	EReference getForce_UntilTrigger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionFinishedCondition <em>Action Finished Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Finished Condition</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionFinishedCondition
	 * @generated
	 */
	EClass getActionFinishedCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statement</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement#getImportURI()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent <em>Model Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Specific Event</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent
	 * @generated
	 */
	EClass getModelSpecificEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caller</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getCaller()
	 * @see #getModelSpecificEvent()
	 * @generated
	 */
	EReference getModelSpecificEvent_Caller();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getAction()
	 * @see #getModelSpecificEvent()
	 * @generated
	 */
	EReference getModelSpecificEvent_Action();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getSolverEvent <em>Solver Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solver Event</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent#getSolverEvent()
	 * @see #getModelSpecificEvent()
	 * @generated
	 */
	EReference getModelSpecificEvent_SolverEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition <em>Action Result Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Result Condition</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition
	 * @generated
	 */
	EClass getActionResultCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition#getComparisonValue <em>Comparison Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Value</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition#getComparisonValue()
	 * @see #getActionResultCondition()
	 * @generated
	 */
	EAttribute getActionResultCondition_ComparisonValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition#getOperator()
	 * @see #getActionResultCondition()
	 * @generated
	 */
	EAttribute getActionResultCondition_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel <em>Action Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Model</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel
	 * @generated
	 */
	EClass getActionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getEvents()
	 * @see #getActionModel()
	 * @generated
	 */
	EReference getActionModel_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getWhenStatements <em>When Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When Statements</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getWhenStatements()
	 * @see #getActionModel()
	 * @generated
	 */
	EReference getActionModel_WhenStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getImportStatements <em>Import Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Statements</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel#getImportStatements()
	 * @see #getActionModel()
	 * @generated
	 */
	EReference getActionModel_ImportStatements();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind <em>Force Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Force Kind</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind
	 * @generated
	 */
	EEnum getForceKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeedbackFactory getFeedbackFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.WhenImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__SOURCE = eINSTANCE.getWhen_Source();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__CONDITION = eINSTANCE.getWhen_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__ACTION = eINSTANCE.getWhen_Action();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ConditionImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ForceImpl <em>Force</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ForceImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getForce()
		 * @generated
		 */
		EClass FORCE = eINSTANCE.getForce();

		/**
		 * The meta object literal for the '<em><b>Event To Be Forced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE__EVENT_TO_BE_FORCED = eINSTANCE.getForce_EventToBeForced();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCE__KIND = eINSTANCE.getForce_Kind();

		/**
		 * The meta object literal for the '<em><b>On Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE__ON_TRIGGER = eINSTANCE.getForce_OnTrigger();

		/**
		 * The meta object literal for the '<em><b>Until Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE__UNTIL_TRIGGER = eINSTANCE.getForce_UntilTrigger();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionFinishedConditionImpl <em>Action Finished Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionFinishedConditionImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getActionFinishedCondition()
		 * @generated
		 */
		EClass ACTION_FINISHED_CONDITION = eINSTANCE.getActionFinishedCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ImportStatementImpl <em>Import Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ImportStatementImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getImportStatement()
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
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ModelSpecificEventImpl <em>Model Specific Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ModelSpecificEventImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getModelSpecificEvent()
		 * @generated
		 */
		EClass MODEL_SPECIFIC_EVENT = eINSTANCE.getModelSpecificEvent();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SPECIFIC_EVENT__CALLER = eINSTANCE.getModelSpecificEvent_Caller();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SPECIFIC_EVENT__ACTION = eINSTANCE.getModelSpecificEvent_Action();

		/**
		 * The meta object literal for the '<em><b>Solver Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SPECIFIC_EVENT__SOLVER_EVENT = eINSTANCE.getModelSpecificEvent_SolverEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionResultConditionImpl <em>Action Result Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionResultConditionImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getActionResultCondition()
		 * @generated
		 */
		EClass ACTION_RESULT_CONDITION = eINSTANCE.getActionResultCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_RESULT_CONDITION__COMPARISON_VALUE = eINSTANCE.getActionResultCondition_ComparisonValue();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_RESULT_CONDITION__OPERATOR = eINSTANCE.getActionResultCondition_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionModelImpl <em>Action Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.ActionModelImpl
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getActionModel()
		 * @generated
		 */
		EClass ACTION_MODEL = eINSTANCE.getActionModel();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MODEL__EVENTS = eINSTANCE.getActionModel_Events();

		/**
		 * The meta object literal for the '<em><b>When Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MODEL__WHEN_STATEMENTS = eINSTANCE.getActionModel_WhenStatements();

		/**
		 * The meta object literal for the '<em><b>Import Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MODEL__IMPORT_STATEMENTS = eINSTANCE.getActionModel_ImportStatements();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind <em>Force Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getForceKind()
		 * @generated
		 */
		EEnum FORCE_KIND = eINSTANCE.getForceKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator
		 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl.FeedbackPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

	}

} //FeedbackPackage
