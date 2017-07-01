/**
 */
package fr.obeo.dsl.pivot;

import fr.obeo.dsl.pivot.datatype.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stimuli</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the input/outpu stimuli of the system. A stimuli can reference one other stimuli of type jitter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.Stimuli#getType <em>Type</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Stimuli#getDuration <em>Duration</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Stimuli#getJitter <em>Jitter</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getStimuli()
 * @model abstract="true"
 * @generated
 */
public interface Stimuli extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.pivot.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.obeo.dsl.pivot.ActivationType
	 * @see #setType(ActivationType)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getStimuli_Type()
	 * @model required="true"
	 * @generated
	 */
	ActivationType getType();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Stimuli#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.obeo.dsl.pivot.ActivationType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getStimuli_Duration()
	 * @model dataType="fr.obeo.dsl.pivot.Duration" required="true"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Stimuli#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(Jitter)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getStimuli_Jitter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Jitter getJitter();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Stimuli#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(Jitter value);

} // Stimuli
