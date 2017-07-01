/**
 */
package fr.obeo.dsl.pivot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an output stimuli
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.Sink#getFragment <em>Fragment</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Sink#getChain <em>Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getSink()
 * @model
 * @generated
 */
public interface Sink extends Stimuli {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Fragment#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' reference.
	 * @see #setFragment(Fragment)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSink_Fragment()
	 * @see fr.obeo.dsl.pivot.Fragment#getSink
	 * @model opposite="sink" required="true"
	 * @generated
	 */
	Fragment getFragment();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Sink#getFragment <em>Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' reference.
	 * @see #getFragment()
	 * @generated
	 */
	void setFragment(Fragment value);

	/**
	 * Returns the value of the '<em><b>Chain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Chain#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain</em>' reference.
	 * @see #setChain(Chain)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSink_Chain()
	 * @see fr.obeo.dsl.pivot.Chain#getSink
	 * @model opposite="sink" required="true"
	 * @generated
	 */
	Chain getChain();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Sink#getChain <em>Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain</em>' reference.
	 * @see #getChain()
	 * @generated
	 */
	void setChain(Chain value);

} // Sink
