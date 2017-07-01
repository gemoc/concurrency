/**
 */
package simplecomponentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simplecomponentmodel.Component#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link simplecomponentmodel.Component#getInternalComponents <em>Internal Components</em>}</li>
 *   <li>{@link simplecomponentmodel.Component#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link simplecomponentmodel.Component#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see simplecomponentmodel.SimplecomponentmodelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link simplecomponentmodel.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see simplecomponentmodel.SimplecomponentmodelPackage#getComponent_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Internal Components</b></em>' containment reference list.
	 * The list contents are of type {@link simplecomponentmodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Components</em>' containment reference list.
	 * @see simplecomponentmodel.SimplecomponentmodelPackage#getComponent_InternalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getInternalComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link simplecomponentmodel.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see simplecomponentmodel.SimplecomponentmodelPackage#getComponent_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link simplecomponentmodel.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see simplecomponentmodel.SimplecomponentmodelPackage#getComponent_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // Component
