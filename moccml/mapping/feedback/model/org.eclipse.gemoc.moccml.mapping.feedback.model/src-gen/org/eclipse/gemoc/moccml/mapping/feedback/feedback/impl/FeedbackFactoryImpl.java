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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionFinishedCondition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ComparisonOperator;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackFactory;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackPackage;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ForceKind;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.When;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackFactoryImpl extends EFactoryImpl implements FeedbackFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeedbackFactory init() {
		try {
			FeedbackFactory theFeedbackFactory = (FeedbackFactory)EPackage.Registry.INSTANCE.getEFactory(FeedbackPackage.eNS_URI);
			if (theFeedbackFactory != null) {
				return theFeedbackFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeedbackFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackFactoryImpl() {
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
			case FeedbackPackage.WHEN: return createWhen();
			case FeedbackPackage.FORCE: return createForce();
			case FeedbackPackage.ACTION_FINISHED_CONDITION: return createActionFinishedCondition();
			case FeedbackPackage.IMPORT_STATEMENT: return createImportStatement();
			case FeedbackPackage.MODEL_SPECIFIC_EVENT: return createModelSpecificEvent();
			case FeedbackPackage.ACTION_RESULT_CONDITION: return createActionResultCondition();
			case FeedbackPackage.ACTION_MODEL: return createActionModel();
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
			case FeedbackPackage.FORCE_KIND:
				return createForceKindFromString(eDataType, initialValue);
			case FeedbackPackage.COMPARISON_OPERATOR:
				return createComparisonOperatorFromString(eDataType, initialValue);
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
			case FeedbackPackage.FORCE_KIND:
				return convertForceKindToString(eDataType, instanceValue);
			case FeedbackPackage.COMPARISON_OPERATOR:
				return convertComparisonOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Force createForce() {
		ForceImpl force = new ForceImpl();
		return force;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionFinishedCondition createActionFinishedCondition() {
		ActionFinishedConditionImpl actionFinishedCondition = new ActionFinishedConditionImpl();
		return actionFinishedCondition;
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
	public ModelSpecificEvent createModelSpecificEvent() {
		ModelSpecificEventImpl modelSpecificEvent = new ModelSpecificEventImpl();
		return modelSpecificEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionResultCondition createActionResultCondition() {
		ActionResultConditionImpl actionResultCondition = new ActionResultConditionImpl();
		return actionResultCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionModel createActionModel() {
		ActionModelImpl actionModel = new ActionModelImpl();
		return actionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForceKind createForceKindFromString(EDataType eDataType, String initialValue) {
		ForceKind result = ForceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertForceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisonOperator result = ComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackPackage getFeedbackPackage() {
		return (FeedbackPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeedbackPackage getPackage() {
		return FeedbackPackage.eINSTANCE;
	}

} //FeedbackFactoryImpl
