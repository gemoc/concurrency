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
package org.eclipse.gemoc.moccml.mapping.moccml_mapping.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.*;

import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.Pivotable;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ElementRefCS;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.NamespaceCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.RootCS;
import org.eclipse.ocl.xtext.basecs.TypeRefCS;
import org.eclipse.ocl.xtext.basecs.TypedElementCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.basecs.util.VisitableCS;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;
import org.eclipse.ocl.xtext.completeoclcs.DefCS;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LiteralExpCS;

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
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage
 * @generated
 */
public class MoCCMLmappingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MoCCMLmappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLmappingSwitch() {
		if (modelPackage == null) {
			modelPackage = MoCCMLmappingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
		case MoCCMLmappingPackage.EVENT_TYPE: {
			EventType eventType = (EventType) theEObject;
			T result = caseEventType(eventType);
			if (result == null)
				result = caseTypedRefCS(eventType);
			if (result == null)
				result = caseNameable(eventType);
			if (result == null)
				result = caseTypeRefCS(eventType);
			if (result == null)
				result = caseElementRefCS(eventType);
			if (result == null)
				result = casePivotableElementCS(eventType);
			if (result == null)
				result = caseElementCS(eventType);
			if (result == null)
				result = casePivotable(eventType);
			if (result == null)
				result = caseVisitableCS(eventType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.DSA_FEEDBACK: {
			DSAFeedback dsaFeedback = (DSAFeedback) theEObject;
			T result = caseDSAFeedback(dsaFeedback);
			if (result == null)
				result = caseDefPropertyCS(dsaFeedback);
			if (result == null)
				result = caseDefCS(dsaFeedback);
			if (result == null)
				result = caseTypedElementCS(dsaFeedback);
			if (result == null)
				result = caseNamedElementCS(dsaFeedback);
			if (result == null)
				result = caseModelElementCS(dsaFeedback);
			if (result == null)
				result = caseNameable(dsaFeedback);
			if (result == null)
				result = casePivotableElementCS(dsaFeedback);
			if (result == null)
				result = caseElementCS(dsaFeedback);
			if (result == null)
				result = casePivotable(dsaFeedback);
			if (result == null)
				result = caseVisitableCS(dsaFeedback);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.CASE: {
			Case case_ = (Case) theEObject;
			T result = caseCase(case_);
			if (result == null)
				result = caseExpCS(case_);
			if (result == null)
				result = caseModelElementCS(case_);
			if (result == null)
				result = casePivotableElementCS(case_);
			if (result == null)
				result = caseElementCS(case_);
			if (result == null)
				result = casePivotable(case_);
			if (result == null)
				result = caseVisitableCS(case_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.ECL_DOCUMENT: {
			ECLDocument eclDocument = (ECLDocument) theEObject;
			T result = caseECLDocument(eclDocument);
			if (result == null)
				result = caseCompleteOCLDocumentCS(eclDocument);
			if (result == null)
				result = caseNamespaceCS(eclDocument);
			if (result == null)
				result = caseRootCS(eclDocument);
			if (result == null)
				result = caseNamedElementCS(eclDocument);
			if (result == null)
				result = caseModelElementCS(eclDocument);
			if (result == null)
				result = caseNameable(eclDocument);
			if (result == null)
				result = casePivotableElementCS(eclDocument);
			if (result == null)
				result = caseElementCS(eclDocument);
			if (result == null)
				result = casePivotable(eclDocument);
			if (result == null)
				result = caseVisitableCS(eclDocument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.EVENT_LITERAL_EXP: {
			EventLiteralExp eventLiteralExp = (EventLiteralExp) theEObject;
			T result = caseEventLiteralExp(eventLiteralExp);
			if (result == null)
				result = caseLiteralExpCS(eventLiteralExp);
			if (result == null)
				result = caseExpCS(eventLiteralExp);
			if (result == null)
				result = caseModelElementCS(eventLiteralExp);
			if (result == null)
				result = casePivotableElementCS(eventLiteralExp);
			if (result == null)
				result = caseElementCS(eventLiteralExp);
			if (result == null)
				result = casePivotable(eventLiteralExp);
			if (result == null)
				result = caseVisitableCS(eventLiteralExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.ECL_RELATION: {
			ECLRelation eclRelation = (ECLRelation) theEObject;
			T result = caseECLRelation(eclRelation);
			if (result == null)
				result = caseExpCS(eclRelation);
			if (result == null)
				result = caseModelElementCS(eclRelation);
			if (result == null)
				result = casePivotableElementCS(eclRelation);
			if (result == null)
				result = caseElementCS(eclRelation);
			if (result == null)
				result = casePivotable(eclRelation);
			if (result == null)
				result = caseVisitableCS(eclRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.IMPORT_STATEMENT: {
			ImportStatement importStatement = (ImportStatement) theEObject;
			T result = caseImportStatement(importStatement);
			if (result == null)
				result = caseImportCS(importStatement);
			if (result == null)
				result = caseNamespaceCS(importStatement);
			if (result == null)
				result = caseNamedElementCS(importStatement);
			if (result == null)
				result = caseModelElementCS(importStatement);
			if (result == null)
				result = caseNameable(importStatement);
			if (result == null)
				result = casePivotableElementCS(importStatement);
			if (result == null)
				result = caseElementCS(importStatement);
			if (result == null)
				result = casePivotable(importStatement);
			if (result == null)
				result = caseVisitableCS(importStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.ECL_EXPRESSION: {
			ECLExpression eclExpression = (ECLExpression) theEObject;
			T result = caseECLExpression(eclExpression);
			if (result == null)
				result = caseExpCS(eclExpression);
			if (result == null)
				result = caseModelElementCS(eclExpression);
			if (result == null)
				result = casePivotableElementCS(eclExpression);
			if (result == null)
				result = caseElementCS(eclExpression);
			if (result == null)
				result = casePivotable(eclExpression);
			if (result == null)
				result = caseVisitableCS(eclExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.ECL_DEF_CS: {
			ECLDefCS eclDefCS = (ECLDefCS) theEObject;
			T result = caseECLDefCS(eclDefCS);
			if (result == null)
				result = caseDefPropertyCS(eclDefCS);
			if (result == null)
				result = caseDefCS(eclDefCS);
			if (result == null)
				result = caseTypedElementCS(eclDefCS);
			if (result == null)
				result = caseNamedElementCS(eclDefCS);
			if (result == null)
				result = caseModelElementCS(eclDefCS);
			if (result == null)
				result = caseNameable(eclDefCS);
			if (result == null)
				result = casePivotableElementCS(eclDefCS);
			if (result == null)
				result = caseElementCS(eclDefCS);
			if (result == null)
				result = casePivotable(eclDefCS);
			if (result == null)
				result = caseVisitableCS(eclDefCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.BASE_CS_VISITOR: {
			BaseCSVisitor<?> baseCSVisitor = (BaseCSVisitor<?>) theEObject;
			T result = caseBaseCSVisitor(baseCSVisitor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.BLOCK_TYPE: {
			BlockType blockType = (BlockType) theEObject;
			T result = caseBlockType(blockType);
			if (result == null)
				result = caseTypedRefCS(blockType);
			if (result == null)
				result = caseNameable(blockType);
			if (result == null)
				result = caseTypeRefCS(blockType);
			if (result == null)
				result = caseElementRefCS(blockType);
			if (result == null)
				result = casePivotableElementCS(blockType);
			if (result == null)
				result = caseElementCS(blockType);
			if (result == null)
				result = casePivotable(blockType);
			if (result == null)
				result = caseVisitableCS(blockType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.ECL_EVENT_DEF_CS: {
			ECLEventDefCS eclEventDefCS = (ECLEventDefCS) theEObject;
			T result = caseECLEventDefCS(eclEventDefCS);
			if (result == null)
				result = caseECLDefCS(eclEventDefCS);
			if (result == null)
				result = caseDefPropertyCS(eclEventDefCS);
			if (result == null)
				result = caseDefCS(eclEventDefCS);
			if (result == null)
				result = caseTypedElementCS(eclEventDefCS);
			if (result == null)
				result = caseNamedElementCS(eclEventDefCS);
			if (result == null)
				result = caseModelElementCS(eclEventDefCS);
			if (result == null)
				result = caseNameable(eclEventDefCS);
			if (result == null)
				result = casePivotableElementCS(eclEventDefCS);
			if (result == null)
				result = caseElementCS(eclEventDefCS);
			if (result == null)
				result = casePivotable(eclEventDefCS);
			if (result == null)
				result = caseVisitableCS(eclEventDefCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.ECL_BLOCK_DEF_CS: {
			ECLBlockDefCS eclBlockDefCS = (ECLBlockDefCS) theEObject;
			T result = caseECLBlockDefCS(eclBlockDefCS);
			if (result == null)
				result = caseECLDefCS(eclBlockDefCS);
			if (result == null)
				result = caseDefPropertyCS(eclBlockDefCS);
			if (result == null)
				result = caseDefCS(eclBlockDefCS);
			if (result == null)
				result = caseTypedElementCS(eclBlockDefCS);
			if (result == null)
				result = caseNamedElementCS(eclBlockDefCS);
			if (result == null)
				result = caseModelElementCS(eclBlockDefCS);
			if (result == null)
				result = caseNameable(eclBlockDefCS);
			if (result == null)
				result = casePivotableElementCS(eclBlockDefCS);
			if (result == null)
				result = caseElementCS(eclBlockDefCS);
			if (result == null)
				result = casePivotable(eclBlockDefCS);
			if (result == null)
				result = caseVisitableCS(eclBlockDefCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSA Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSA Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSAFeedback(DSAFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECL Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECL Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECLDocument(ECLDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Literal Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLiteralExp(EventLiteralExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECL Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECL Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECLRelation(ECLRelation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ECL Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECL Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECLExpression(ECLExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECL Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECL Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECLDefCS(ECLDefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base CS Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base CS Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <R> T caseBaseCSVisitor(BaseCSVisitor<R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockType(BlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECL Event Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECL Event Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECLEventDefCS(ECLEventDefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECL Block Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECL Block Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECLBlockDefCS(ECLBlockDefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitableCS(VisitableCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementCS(ElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotable(Pivotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotableElementCS(PivotableElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRefCS(ElementRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRefCS(TypeRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedRefCS(TypedRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementCS(ModelElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElementCS(NamedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElementCS(TypedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefCS(DefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Property CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Property CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefPropertyCS(DefPropertyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpCS(ExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceCS(NamespaceCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootCS(RootCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete OCL Document CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete OCL Document CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteOCLDocumentCS(CompleteOCLDocumentCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExpCS(LiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportCS(ImportCS object) {
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

} //MoCCMLmappingSwitch
