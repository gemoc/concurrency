/**
 */
package fr.obeo.dsl.pivot;

import fr.obeo.dsl.pivot.datatype.Duration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents Computing resources (CPU) in the system
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.HwResource#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.HwResource#getFrequencyFactor <em>Frequency Factor</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.HwResource#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.HwResource#getDelay <em>Delay</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.HwResource#getSwschedulableresources <em>Swschedulableresources</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getHwResource()
 * @model
 * @generated
 */
public interface HwResource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' attribute.
	 * @see #setSchedulingPolicy(String)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getHwResource_SchedulingPolicy()
	 * @model required="true"
	 * @generated
	 */
	String getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.HwResource#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' attribute.
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Frequency Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Factor</em>' attribute.
	 * @see #setFrequencyFactor(String)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getHwResource_FrequencyFactor()
	 * @model required="true"
	 * @generated
	 */
	String getFrequencyFactor();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.HwResource#getFrequencyFactor <em>Frequency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Factor</em>' attribute.
	 * @see #getFrequencyFactor()
	 * @generated
	 */
	void setFrequencyFactor(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getHwResource_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

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
	 * @see fr.obeo.dsl.pivot.PivotPackage#getHwResource_Delay()
	 * @model dataType="fr.obeo.dsl.pivot.Duration" required="true"
	 * @generated
	 */
	Duration getDelay();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.HwResource#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Duration value);

	/**
	 * Returns the value of the '<em><b>Swschedulableresources</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.SwSchedulableResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swschedulableresources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swschedulableresources</em>' containment reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getHwResource_Swschedulableresources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwSchedulableResource> getSwschedulableresources();

} // HwResource
