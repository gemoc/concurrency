/**
 */
package fr.obeo.dsl.pivot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an input stimuli
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.Source#getFragment <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends Stimuli {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Fragment#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' reference.
	 * @see #setFragment(Fragment)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSource_Fragment()
	 * @see fr.obeo.dsl.pivot.Fragment#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	Fragment getFragment();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Source#getFragment <em>Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' reference.
	 * @see #getFragment()
	 * @generated
	 */
	void setFragment(Fragment value);

} // Source
