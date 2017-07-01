/**
 */
package fr.obeo.dsl.pivot;

import fr.obeo.dsl.pivot.datatype.Duration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Comm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the communication delay betwenn two hardware resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.BusComm#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.BusComm#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getBusComm()
 * @model
 * @generated
 */
public interface BusComm extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.HwResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getBusComm_Target()
	 * @model lower="2"
	 * @generated
	 */
	EList<HwResource> getTarget();

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
	 * @see fr.obeo.dsl.pivot.PivotPackage#getBusComm_Delay()
	 * @model dataType="fr.obeo.dsl.pivot.Duration" required="true"
	 * @generated
	 */
	Duration getDelay();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.BusComm#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Duration value);

} // BusComm
