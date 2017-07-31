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
package org.eclipse.gemoc.moccml.mapping.feedback.feedback.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.Action;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionFinishedCondition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.Condition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackFactory;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.When;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackPackageImpl extends EPackageImpl implements FeedbackPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionFinishedConditionEClass = null;

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
	private EClass modelSpecificEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionResultConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum forceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

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
	 * @see org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeedbackPackageImpl() {
		super(eNS_URI, FeedbackFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FeedbackPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeedbackPackage init() {
		if (isInited) return (FeedbackPackage)EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI);

		// Obtain or create and register package
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FeedbackPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFeedbackPackage.createPackageContents();

		// Initialize created meta-data
		theFeedbackPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFeedbackPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeedbackPackage.eNS_URI, theFeedbackPackage);
		return theFeedbackPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Source() {
		return (EReference)whenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Condition() {
		return (EReference)whenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Action() {
		return (EReference)whenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForce() {
		return forceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForce_EventToBeForced() {
		return (EReference)forceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForce_Kind() {
		return (EAttribute)forceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForce_OnTrigger() {
		return (EReference)forceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForce_UntilTrigger() {
		return (EReference)forceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionFinishedCondition() {
		return actionFinishedConditionEClass;
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
	public EClass getModelSpecificEvent() {
		return modelSpecificEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelSpecificEvent_Caller() {
		return (EReference)modelSpecificEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelSpecificEvent_Action() {
		return (EReference)modelSpecificEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelSpecificEvent_SolverEvent() {
		return (EReference)modelSpecificEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionResultCondition() {
		return actionResultConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionResultCondition_ComparisonValue() {
		return (EAttribute)actionResultConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionResultCondition_Operator() {
		return (EAttribute)actionResultConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionModel() {
		return actionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionModel_Events() {
		return (EReference)actionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionModel_WhenStatements() {
		return (EReference)actionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionModel_ImportStatements() {
		return (EReference)actionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getForceKind() {
		return forceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackFactory getFeedbackFactory() {
		return (FeedbackFactory)getEFactoryInstance();
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
		whenEClass = createEClass(WHEN);
		createEReference(whenEClass, WHEN__SOURCE);
		createEReference(whenEClass, WHEN__CONDITION);
		createEReference(whenEClass, WHEN__ACTION);

		conditionEClass = createEClass(CONDITION);

		actionEClass = createEClass(ACTION);

		forceEClass = createEClass(FORCE);
		createEReference(forceEClass, FORCE__EVENT_TO_BE_FORCED);
		createEAttribute(forceEClass, FORCE__KIND);
		createEReference(forceEClass, FORCE__ON_TRIGGER);
		createEReference(forceEClass, FORCE__UNTIL_TRIGGER);

		actionFinishedConditionEClass = createEClass(ACTION_FINISHED_CONDITION);

		importStatementEClass = createEClass(IMPORT_STATEMENT);
		createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORT_URI);

		modelSpecificEventEClass = createEClass(MODEL_SPECIFIC_EVENT);
		createEReference(modelSpecificEventEClass, MODEL_SPECIFIC_EVENT__CALLER);
		createEReference(modelSpecificEventEClass, MODEL_SPECIFIC_EVENT__ACTION);
		createEReference(modelSpecificEventEClass, MODEL_SPECIFIC_EVENT__SOLVER_EVENT);

		actionResultConditionEClass = createEClass(ACTION_RESULT_CONDITION);
		createEAttribute(actionResultConditionEClass, ACTION_RESULT_CONDITION__COMPARISON_VALUE);
		createEAttribute(actionResultConditionEClass, ACTION_RESULT_CONDITION__OPERATOR);

		actionModelEClass = createEClass(ACTION_MODEL);
		createEReference(actionModelEClass, ACTION_MODEL__EVENTS);
		createEReference(actionModelEClass, ACTION_MODEL__WHEN_STATEMENTS);
		createEReference(actionModelEClass, ACTION_MODEL__IMPORT_STATEMENTS);

		// Create enums
		forceKindEEnum = createEEnum(FORCE_KIND);
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		forceEClass.getESuperTypes().add(this.getAction());
		actionFinishedConditionEClass.getESuperTypes().add(this.getCondition());
		modelSpecificEventEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		actionResultConditionEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(whenEClass, When.class, "When", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhen_Source(), this.getModelSpecificEvent(), null, "source", null, 1, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhen_Condition(), this.getCondition(), null, "condition", null, 1, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhen_Action(), this.getAction(), null, "action", null, 1, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceEClass, Force.class, "Force", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForce_EventToBeForced(), this.getModelSpecificEvent(), null, "eventToBeForced", null, 1, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForce_Kind(), this.getForceKind(), "kind", null, 1, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForce_OnTrigger(), this.getModelSpecificEvent(), null, "onTrigger", null, 0, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForce_UntilTrigger(), this.getModelSpecificEvent(), null, "untilTrigger", null, 0, 1, Force.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionFinishedConditionEClass, ActionFinishedCondition.class, "ActionFinishedCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportStatement_ImportURI(), theEcorePackage.getEString(), "importURI", null, 0, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelSpecificEventEClass, ModelSpecificEvent.class, "ModelSpecificEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelSpecificEvent_Caller(), theEcorePackage.getEObject(), null, "caller", null, 0, 1, ModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelSpecificEvent_Action(), theEcorePackage.getEOperation(), null, "action", null, 0, 1, ModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelSpecificEvent_SolverEvent(), theEcorePackage.getEObject(), null, "solverEvent", null, 0, 1, ModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionResultConditionEClass, ActionResultCondition.class, "ActionResultCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionResultCondition_ComparisonValue(), theEcorePackage.getEJavaObject(), "comparisonValue", null, 1, 1, ActionResultCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionResultCondition_Operator(), this.getComparisonOperator(), "operator", null, 1, 1, ActionResultCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionModelEClass, ActionModel.class, "ActionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionModel_Events(), this.getModelSpecificEvent(), null, "events", null, 0, -1, ActionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionModel_WhenStatements(), this.getWhen(), null, "whenStatements", null, 0, -1, ActionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionModel_ImportStatements(), this.getImportStatement(), null, "importStatements", null, 0, -1, ActionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(forceKindEEnum, ForceKind.class, "ForceKind");
		addEEnumLiteral(forceKindEEnum, ForceKind.PRESENCE);
		addEEnumLiteral(forceKindEEnum, ForceKind.ABSENCE);

		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.INF);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.SUP);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.DIFFERENT);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.INF_EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.SUP_EQUALS);

		// Create resource
		createResource(eNS_URI);
	}

} //FeedbackPackageImpl
