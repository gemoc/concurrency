/**
 * Copyright (c) 2010, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingFactory;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.TimeModelPackage;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ClockExpressionAndRelationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoCCMLmappingPackageImpl extends EPackageImpl implements MoCCMLmappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsaFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventLiteralExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclRelationEClass = null;

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
	private EClass eclExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclDefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseCSVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclEventDefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclBlockDefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedBackKindEEnum = null;

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
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MoCCMLmappingPackageImpl() {
		super(eNS_URI, MoCCMLmappingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MoCCMLmappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MoCCMLmappingPackage init() {
		if (isInited)
			return (MoCCMLmappingPackage) EPackage.Registry.INSTANCE.getEPackage(MoCCMLmappingPackage.eNS_URI);

		// Obtain or create and register package
		MoCCMLmappingPackageImpl theMoCCMLmappingPackage = (MoCCMLmappingPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof MoCCMLmappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new MoCCMLmappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CompleteOCLCSPackage.eINSTANCE.eClass();
		TimeModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMoCCMLmappingPackage.createPackageContents();

		// Initialize created meta-data
		theMoCCMLmappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMoCCMLmappingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MoCCMLmappingPackage.eNS_URI, theMoCCMLmappingPackage);
		return theMoCCMLmappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventType() {
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Name() {
		return (EAttribute) eventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_ReferedElement() {
		return (EAttribute) eventTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSAFeedback() {
		return dsaFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSAFeedback_Cases() {
		return (EReference) dsaFeedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSAFeedback_Owner() {
		return (EReference) dsaFeedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Condition() {
		return (EReference) caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_EventToForce() {
		return (EReference) caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_On() {
		return (EReference) caseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase_KindOfFeedback() {
		return (EAttribute) caseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLDocument() {
		return eclDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLDocument_Imports() {
		return (EReference) eclDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventLiteralExp() {
		return eventLiteralExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventLiteralExp_Value() {
		return (EAttribute) eventLiteralExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLRelation() {
		return eclRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLRelation_Type() {
		return (EReference) eclRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLRelation_Parameters() {
		return (EReference) eclRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECLRelation_IsAnAssertion() {
		return (EAttribute) eclRelationEClass.getEStructuralFeatures().get(2);
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
		return (EAttribute) importStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLExpression() {
		return eclExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLExpression_Type() {
		return (EReference) eclExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLExpression_Parameters() {
		return (EReference) eclExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLDefCS() {
		return eclDefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLDefCS_Condition() {
		return (EReference) eclDefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECLDefCS_Visibility() {
		return (EAttribute) eclDefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseCSVisitor() {
		return baseCSVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockType() {
		return blockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockType_Name() {
		return (EAttribute) blockTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLEventDefCS() {
		return eclEventDefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLEventDefCS_Feedback() {
		return (EReference) eclEventDefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLEventDefCS_Future() {
		return (EReference) eclEventDefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECLEventDefCS_DsaResultName() {
		return (EAttribute) eclEventDefCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLBlockDefCS() {
		return eclBlockDefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLBlockDefCS_EnterWhen() {
		return (EReference) eclBlockDefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLBlockDefCS_LeaveWhen() {
		return (EReference) eclBlockDefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventKind() {
		return eventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeedBackKind() {
		return feedBackKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLmappingFactory getMoCCMLmappingFactory() {
		return (MoCCMLmappingFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eventTypeEClass = createEClass(EVENT_TYPE);
		createEAttribute(eventTypeEClass, EVENT_TYPE__NAME);
		createEAttribute(eventTypeEClass, EVENT_TYPE__REFERED_ELEMENT);

		dsaFeedbackEClass = createEClass(DSA_FEEDBACK);
		createEReference(dsaFeedbackEClass, DSA_FEEDBACK__CASES);
		createEReference(dsaFeedbackEClass, DSA_FEEDBACK__OWNER);

		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__CONDITION);
		createEReference(caseEClass, CASE__EVENT_TO_FORCE);
		createEReference(caseEClass, CASE__ON);
		createEAttribute(caseEClass, CASE__KIND_OF_FEEDBACK);

		eclDocumentEClass = createEClass(ECL_DOCUMENT);
		createEReference(eclDocumentEClass, ECL_DOCUMENT__IMPORTS);

		eventLiteralExpEClass = createEClass(EVENT_LITERAL_EXP);
		createEAttribute(eventLiteralExpEClass, EVENT_LITERAL_EXP__VALUE);

		eclRelationEClass = createEClass(ECL_RELATION);
		createEReference(eclRelationEClass, ECL_RELATION__TYPE);
		createEReference(eclRelationEClass, ECL_RELATION__PARAMETERS);
		createEAttribute(eclRelationEClass, ECL_RELATION__IS_AN_ASSERTION);

		importStatementEClass = createEClass(IMPORT_STATEMENT);
		createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORT_URI);

		eclExpressionEClass = createEClass(ECL_EXPRESSION);
		createEReference(eclExpressionEClass, ECL_EXPRESSION__TYPE);
		createEReference(eclExpressionEClass, ECL_EXPRESSION__PARAMETERS);

		eclDefCSEClass = createEClass(ECL_DEF_CS);
		createEReference(eclDefCSEClass, ECL_DEF_CS__CONDITION);
		createEAttribute(eclDefCSEClass, ECL_DEF_CS__VISIBILITY);

		baseCSVisitorEClass = createEClass(BASE_CS_VISITOR);

		blockTypeEClass = createEClass(BLOCK_TYPE);
		createEAttribute(blockTypeEClass, BLOCK_TYPE__NAME);

		eclEventDefCSEClass = createEClass(ECL_EVENT_DEF_CS);
		createEReference(eclEventDefCSEClass, ECL_EVENT_DEF_CS__FEEDBACK);
		createEReference(eclEventDefCSEClass, ECL_EVENT_DEF_CS__FUTURE);
		createEAttribute(eclEventDefCSEClass, ECL_EVENT_DEF_CS__DSA_RESULT_NAME);

		eclBlockDefCSEClass = createEClass(ECL_BLOCK_DEF_CS);
		createEReference(eclBlockDefCSEClass, ECL_BLOCK_DEF_CS__ENTER_WHEN);
		createEReference(eclBlockDefCSEClass, ECL_BLOCK_DEF_CS__LEAVE_WHEN);

		// Create enums
		eventKindEEnum = createEEnum(EVENT_KIND);
		visibilityEEnum = createEEnum(VISIBILITY);
		feedBackKindEEnum = createEEnum(FEED_BACK_KIND);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BaseCSPackage theBaseCSPackage = (BaseCSPackage) EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
		PivotPackage thePivotPackage = (PivotPackage) EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI);
		CompleteOCLCSPackage theCompleteOCLCSPackage = (CompleteOCLCSPackage) EPackage.Registry.INSTANCE
				.getEPackage(CompleteOCLCSPackage.eNS_URI);
		EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage) EPackage.Registry.INSTANCE
				.getEPackage(EssentialOCLCSPackage.eNS_URI);
		ClockExpressionAndRelationPackage theClockExpressionAndRelationPackage = (ClockExpressionAndRelationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ClockExpressionAndRelationPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(baseCSVisitorEClass, "R");

		// Set bounds for type parameters

		// Add supertypes to classes
		eventTypeEClass.getESuperTypes().add(theBaseCSPackage.getTypedRefCS());
		eventTypeEClass.getESuperTypes().add(thePivotPackage.getNameable());
		dsaFeedbackEClass.getESuperTypes().add(theCompleteOCLCSPackage.getDefPropertyCS());
		caseEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		eclDocumentEClass.getESuperTypes().add(theCompleteOCLCSPackage.getCompleteOCLDocumentCS());
		eventLiteralExpEClass.getESuperTypes().add(theEssentialOCLCSPackage.getLiteralExpCS());
		eclRelationEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		importStatementEClass.getESuperTypes().add(theBaseCSPackage.getImportCS());
		eclExpressionEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		eclDefCSEClass.getESuperTypes().add(theCompleteOCLCSPackage.getDefPropertyCS());
		blockTypeEClass.getESuperTypes().add(theBaseCSPackage.getTypedRefCS());
		blockTypeEClass.getESuperTypes().add(thePivotPackage.getNameable());
		eclEventDefCSEClass.getESuperTypes().add(this.getECLDefCS());
		eclBlockDefCSEClass.getESuperTypes().add(this.getECLDefCS());

		// Initialize classes and features; add operations and parameters
		initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventType_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventType_ReferedElement(), this.getEventKind(), "referedElement", null, 0, 1,
				EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(eventTypeEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "R");
		EGenericType g1 = createEGenericType(this.getBaseCSVisitor());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(dsaFeedbackEClass, DSAFeedback.class, "DSAFeedback", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSAFeedback_Cases(), this.getCase(), null, "cases", null, 0, -1, DSAFeedback.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSAFeedback_Owner(), this.getECLEventDefCS(), this.getECLEventDefCS_Feedback(), "owner", null,
				1, 1, DSAFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dsaFeedbackEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_Condition(), theEssentialOCLCSPackage.getExpCS(), null, "condition", null, 0, 1,
				Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_EventToForce(), theEssentialOCLCSPackage.getExpCS(), null, "eventToForce", null, 0, 1,
				Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_On(), theEssentialOCLCSPackage.getExpCS(), null, "on", null, 0, 1, Case.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase_KindOfFeedback(), this.getFeedBackKind(), "kindOfFeedback", null, 1, 1, Case.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(caseEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(eclDocumentEClass, ECLDocument.class, "ECLDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECLDocument_Imports(), this.getImportStatement(), null, "imports", null, 0, -1,
				ECLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eclDocumentEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(eventLiteralExpEClass, EventLiteralExp.class, "EventLiteralExp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventLiteralExp_Value(), this.getEventKind(), "value", null, 0, 1, EventLiteralExp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eventLiteralExpEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(eclRelationEClass, ECLRelation.class, "ECLRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECLRelation_Type(), theClockExpressionAndRelationPackage.getRelationDeclaration(), null,
				"type", null, 1, 1, ECLRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECLRelation_Parameters(), theEssentialOCLCSPackage.getExpCS(), null, "parameters", null, 1,
				-1, ECLRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECLRelation_IsAnAssertion(), ecorePackage.getEBoolean(), "isAnAssertion", "false", 0, 1,
				ECLRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(eclRelationEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1,
				ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(importStatementEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(eclExpressionEClass, ECLExpression.class, "ECLExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECLExpression_Type(), theClockExpressionAndRelationPackage.getExpressionDeclaration(), null,
				"type", null, 1, 1, ECLExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECLExpression_Parameters(), theEssentialOCLCSPackage.getExpCS(), null, "parameters", null, 1,
				-1, ECLExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eclExpressionEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(eclDefCSEClass, ECLDefCS.class, "ECLDefCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECLDefCS_Condition(), theEssentialOCLCSPackage.getExpCS(), null, "condition", null, 0, 1,
				ECLDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECLDefCS_Visibility(), this.getVisibility(), "visibility", null, 1, 1, ECLDefCS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eclDefCSEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(baseCSVisitorEClass, BaseCSVisitor.class, "BaseCSVisitor", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockTypeEClass, BlockType.class, "BlockType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockType_Name(), ecorePackage.getEString(), "name", null, 0, 1, BlockType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(blockTypeEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(eclEventDefCSEClass, ECLEventDefCS.class, "ECLEventDefCS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECLEventDefCS_Feedback(), this.getDSAFeedback(), this.getDSAFeedback_Owner(), "feedback",
				null, 0, 1, ECLEventDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECLEventDefCS_Future(), theEssentialOCLCSPackage.getExpCS(), null, "future", null, 0, 1,
				ECLEventDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECLEventDefCS_DsaResultName(), ecorePackage.getEString(), "dsaResultName", null, 0, 1,
				ECLEventDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(eclEventDefCSEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(eclBlockDefCSEClass, ECLBlockDefCS.class, "ECLBlockDefCS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECLBlockDefCS_EnterWhen(), theEssentialOCLCSPackage.getExpCS(), null, "enterWhen", null, 0, 1,
				ECLBlockDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECLBlockDefCS_LeaveWhen(), theEssentialOCLCSPackage.getExpCS(), null, "leaveWhen", null, 0, 1,
				ECLBlockDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eclBlockDefCSEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		// Initialize enums and add enum literals
		initEEnum(eventKindEEnum, EventKind.class, "EventKind");
		addEEnumLiteral(eventKindEEnum, EventKind.UNDEFINED);
		addEEnumLiteral(eventKindEEnum, EventKind.START);
		addEEnumLiteral(eventKindEEnum, EventKind.FINISH);
		addEEnumLiteral(eventKindEEnum, EventKind.SEND);
		addEEnumLiteral(eventKindEEnum, EventKind.RECEIVE);
		addEEnumLiteral(eventKindEEnum, EventKind.CONSUME);
		addEEnumLiteral(eventKindEEnum, EventKind.PRODUCE);
		addEEnumLiteral(eventKindEEnum, EventKind.CREATE);
		addEEnumLiteral(eventKindEEnum, EventKind.DESTROY);
		addEEnumLiteral(eventKindEEnum, EventKind.SUSPEND);
		addEEnumLiteral(eventKindEEnum, EventKind.RESUME);
		addEEnumLiteral(eventKindEEnum, EventKind.CALL);

		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);

		initEEnum(feedBackKindEEnum, FeedBackKind.class, "FeedBackKind");
		addEEnumLiteral(feedBackKindEEnum, FeedBackKind.FORCE);
		addEEnumLiteral(feedBackKindEEnum, FeedBackKind.FORBID);

		// Create resource
		createResource(eNS_URI);
	}

} //MoCCMLmappingPackageImpl
