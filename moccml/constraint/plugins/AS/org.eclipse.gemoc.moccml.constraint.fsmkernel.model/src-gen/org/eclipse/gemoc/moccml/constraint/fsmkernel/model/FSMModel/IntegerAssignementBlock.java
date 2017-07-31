/**
 * Copyright (c) 2012-2017 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Assignement Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.IntegerAssignementBlock#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.FSMModelPackage#getIntegerAssignementBlock()
 * @model
 * @generated
 */
public interface IntegerAssignementBlock extends AbstractAction, NamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.IntegerAssignement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.FSMModelPackage#getIntegerAssignementBlock_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IntegerAssignement> getActions();

} // IntegerAssignementBlock
