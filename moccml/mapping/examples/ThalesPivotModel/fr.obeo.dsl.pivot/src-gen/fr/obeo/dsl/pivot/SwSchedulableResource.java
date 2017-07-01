/**
 */
package fr.obeo.dsl.pivot;

import fr.obeo.dsl.pivot.datatype.Duration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sw Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.SwSchedulableResource#getDelay <em>Delay</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.SwSchedulableResource#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getSwSchedulableResource()
 * @model
 * @generated
 */
public interface SwSchedulableResource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(Duration)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSwSchedulableResource_Delay()
	 * @model dataType="fr.obeo.dsl.pivot.Duration" required="true"
	 * @generated
	 */
	Duration getDelay();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.SwSchedulableResource#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Duration value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSwSchedulableResource_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

} // SwSchedulableResource
