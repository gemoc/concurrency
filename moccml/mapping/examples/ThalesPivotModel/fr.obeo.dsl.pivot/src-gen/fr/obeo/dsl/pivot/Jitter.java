/**
 */
package fr.obeo.dsl.pivot;

import fr.obeo.dsl.pivot.datatype.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.Jitter#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getJitter()
 * @model
 * @generated
 */
public interface Jitter extends NamedElement {
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
	 * @see fr.obeo.dsl.pivot.PivotPackage#getJitter_Duration()
	 * @model dataType="fr.obeo.dsl.pivot.Duration" required="true"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Jitter#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

} // Jitter
