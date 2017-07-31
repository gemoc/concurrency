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

import org.eclipse.ocl.xtext.essentialoclcs.LiteralExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getEventLiteralExp()
 * @model
 * @generated
 */
public interface EventLiteralExp extends LiteralExpCS {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind
	 * @see #setValue(EventKind)
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getEventLiteralExp_Value()
	 * @model
	 * @generated
	 */
	EventKind getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EventKind value);

} // EventLiteralExp
