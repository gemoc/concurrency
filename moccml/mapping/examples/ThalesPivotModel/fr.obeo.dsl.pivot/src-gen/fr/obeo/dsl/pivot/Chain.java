/**
 */
package fr.obeo.dsl.pivot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a list of chained fragment from a source (input stilmuli) to a sink (output stimuli)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.Chain#getSink <em>Sink</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Chain#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getChain()
 * @model
 * @generated
 */
public interface Chain extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sink</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Sink#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' reference.
	 * @see #setSink(Sink)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getChain_Sink()
	 * @see fr.obeo.dsl.pivot.Sink#getChain
	 * @model opposite="chain" required="true"
	 * @generated
	 */
	Sink getSink();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Chain#getSink <em>Sink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(Sink value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Source)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getChain_Source()
	 * @model required="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Chain#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

} // Chain
