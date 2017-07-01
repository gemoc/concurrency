/**
 */
package simplecomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simplecomponentmodel.Connector#getFrom <em>From</em>}</li>
 *   <li>{@link simplecomponentmodel.Connector#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see simplecomponentmodel.SimplecomponentmodelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(OutputPort)
	 * @see simplecomponentmodel.SimplecomponentmodelPackage#getConnector_From()
	 * @model required="true"
	 * @generated
	 */
	OutputPort getFrom();

	/**
	 * Sets the value of the '{@link simplecomponentmodel.Connector#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(OutputPort value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(InputPort)
	 * @see simplecomponentmodel.SimplecomponentmodelPackage#getConnector_To()
	 * @model required="true"
	 * @generated
	 */
	InputPort getTo();

	/**
	 * Sets the value of the '{@link simplecomponentmodel.Connector#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(InputPort value);

} // Connector
