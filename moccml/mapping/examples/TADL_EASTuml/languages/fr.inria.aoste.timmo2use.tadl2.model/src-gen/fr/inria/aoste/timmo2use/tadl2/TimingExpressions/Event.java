/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Event#getTriggerableElements <em>Triggerable Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Triggerable Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggerable Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggerable Elements</em>' reference list.
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getEvent_TriggerableElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getTriggerableElements();
} // Event
