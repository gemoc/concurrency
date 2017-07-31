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

import org.eclipse.ocl.xtext.basecs.ImportCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getImportStatement()
 * @model
 * @generated
 */
public interface ImportStatement extends ImportCS {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getImportStatement_ImportURI()
	 * @model required="true"
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

} // ImportStatement
