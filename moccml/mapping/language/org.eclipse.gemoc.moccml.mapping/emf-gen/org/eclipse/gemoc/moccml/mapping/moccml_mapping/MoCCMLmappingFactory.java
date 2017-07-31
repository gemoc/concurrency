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
package org.eclipse.gemoc.moccml.mapping.moccml_mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage
 * @generated
 */
public interface MoCCMLmappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoCCMLmappingFactory eINSTANCE = org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Type</em>'.
	 * @generated
	 */
	EventType createEventType();

	/**
	 * Returns a new object of class '<em>DSA Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSA Feedback</em>'.
	 * @generated
	 */
	DSAFeedback createDSAFeedback();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

	/**
	 * Returns a new object of class '<em>ECL Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECL Document</em>'.
	 * @generated
	 */
	ECLDocument createECLDocument();

	/**
	 * Returns a new object of class '<em>Event Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Literal Exp</em>'.
	 * @generated
	 */
	EventLiteralExp createEventLiteralExp();

	/**
	 * Returns a new object of class '<em>ECL Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECL Relation</em>'.
	 * @generated
	 */
	ECLRelation createECLRelation();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns a new object of class '<em>ECL Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECL Expression</em>'.
	 * @generated
	 */
	ECLExpression createECLExpression();

	/**
	 * Returns a new object of class '<em>Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Type</em>'.
	 * @generated
	 */
	BlockType createBlockType();

	/**
	 * Returns a new object of class '<em>ECL Event Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECL Event Def CS</em>'.
	 * @generated
	 */
	ECLEventDefCS createECLEventDefCS();

	/**
	 * Returns a new object of class '<em>ECL Block Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECL Block Def CS</em>'.
	 * @generated
	 */
	ECLBlockDefCS createECLBlockDefCS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MoCCMLmappingPackage getMoCCMLmappingPackage();

} //MoCCMLmappingFactory
