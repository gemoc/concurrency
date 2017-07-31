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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoCCMLmappingFactoryImpl extends EFactoryImpl implements MoCCMLmappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoCCMLmappingFactory init() {
		try {
			MoCCMLmappingFactory theMoCCMLmappingFactory = (MoCCMLmappingFactory) EPackage.Registry.INSTANCE
					.getEFactory(MoCCMLmappingPackage.eNS_URI);
			if (theMoCCMLmappingFactory != null) {
				return theMoCCMLmappingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MoCCMLmappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLmappingFactoryImpl() {
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
		case MoCCMLmappingPackage.EVENT_TYPE:
			return createEventType();
		case MoCCMLmappingPackage.DSA_FEEDBACK:
			return createDSAFeedback();
		case MoCCMLmappingPackage.CASE:
			return createCase();
		case MoCCMLmappingPackage.ECL_DOCUMENT:
			return createECLDocument();
		case MoCCMLmappingPackage.EVENT_LITERAL_EXP:
			return createEventLiteralExp();
		case MoCCMLmappingPackage.ECL_RELATION:
			return createECLRelation();
		case MoCCMLmappingPackage.IMPORT_STATEMENT:
			return createImportStatement();
		case MoCCMLmappingPackage.ECL_EXPRESSION:
			return createECLExpression();
		case MoCCMLmappingPackage.BLOCK_TYPE:
			return createBlockType();
		case MoCCMLmappingPackage.ECL_EVENT_DEF_CS:
			return createECLEventDefCS();
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS:
			return createECLBlockDefCS();
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
		case MoCCMLmappingPackage.EVENT_KIND:
			return createEventKindFromString(eDataType, initialValue);
		case MoCCMLmappingPackage.VISIBILITY:
			return createVisibilityFromString(eDataType, initialValue);
		case MoCCMLmappingPackage.FEED_BACK_KIND:
			return createFeedBackKindFromString(eDataType, initialValue);
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
		case MoCCMLmappingPackage.EVENT_KIND:
			return convertEventKindToString(eDataType, instanceValue);
		case MoCCMLmappingPackage.VISIBILITY:
			return convertVisibilityToString(eDataType, instanceValue);
		case MoCCMLmappingPackage.FEED_BACK_KIND:
			return convertFeedBackKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAFeedback createDSAFeedback() {
		DSAFeedbackImpl dsaFeedback = new DSAFeedbackImpl();
		return dsaFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECLDocument createECLDocument() {
		ECLDocumentImpl eclDocument = new ECLDocumentImpl();
		return eclDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventLiteralExp createEventLiteralExp() {
		EventLiteralExpImpl eventLiteralExp = new EventLiteralExpImpl();
		return eventLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECLRelation createECLRelation() {
		ECLRelationImpl eclRelation = new ECLRelationImpl();
		return eclRelation;
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
	public ECLExpression createECLExpression() {
		ECLExpressionImpl eclExpression = new ECLExpressionImpl();
		return eclExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockType createBlockType() {
		BlockTypeImpl blockType = new BlockTypeImpl();
		return blockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECLEventDefCS createECLEventDefCS() {
		ECLEventDefCSImpl eclEventDefCS = new ECLEventDefCSImpl();
		return eclEventDefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECLBlockDefCS createECLBlockDefCS() {
		ECLBlockDefCSImpl eclBlockDefCS = new ECLBlockDefCSImpl();
		return eclBlockDefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind createEventKindFromString(EDataType eDataType, String initialValue) {
		EventKind result = EventKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedBackKind createFeedBackKindFromString(EDataType eDataType, String initialValue) {
		FeedBackKind result = FeedBackKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedBackKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLmappingPackage getMoCCMLmappingPackage() {
		return (MoCCMLmappingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MoCCMLmappingPackage getPackage() {
		return MoCCMLmappingPackage.eINSTANCE;
	}

} //MoCCMLmappingFactoryImpl
