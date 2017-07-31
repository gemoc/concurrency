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

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECL Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLDocument()
 * @model
 * @generated
 */
public interface ECLDocument extends CompleteOCLDocumentCS {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getECLDocument_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportStatement> getImports();

} // ECLDocument
