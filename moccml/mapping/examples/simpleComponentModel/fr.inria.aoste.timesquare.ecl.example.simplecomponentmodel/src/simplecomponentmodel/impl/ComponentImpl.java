/**
 */
package simplecomponentmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplecomponentmodel.Behavior;
import simplecomponentmodel.Component;
import simplecomponentmodel.Connector;
import simplecomponentmodel.Port;
import simplecomponentmodel.SimplecomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simplecomponentmodel.impl.ComponentImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link simplecomponentmodel.impl.ComponentImpl#getInternalComponents <em>Internal Components</em>}</li>
 *   <li>{@link simplecomponentmodel.impl.ComponentImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link simplecomponentmodel.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviors;

	/**
	 * The cached value of the '{@link #getInternalComponents() <em>Internal Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> internalComponents;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplecomponentmodelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<Behavior>(Behavior.class, this, SimplecomponentmodelPackage.COMPONENT__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getInternalComponents() {
		if (internalComponents == null) {
			internalComponents = new EObjectContainmentEList<Component>(Component.class, this, SimplecomponentmodelPackage.COMPONENT__INTERNAL_COMPONENTS);
		}
		return internalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, SimplecomponentmodelPackage.COMPONENT__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, SimplecomponentmodelPackage.COMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplecomponentmodelPackage.COMPONENT__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
			case SimplecomponentmodelPackage.COMPONENT__INTERNAL_COMPONENTS:
				return ((InternalEList<?>)getInternalComponents()).basicRemove(otherEnd, msgs);
			case SimplecomponentmodelPackage.COMPONENT__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case SimplecomponentmodelPackage.COMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplecomponentmodelPackage.COMPONENT__BEHAVIORS:
				return getBehaviors();
			case SimplecomponentmodelPackage.COMPONENT__INTERNAL_COMPONENTS:
				return getInternalComponents();
			case SimplecomponentmodelPackage.COMPONENT__CONNECTORS:
				return getConnectors();
			case SimplecomponentmodelPackage.COMPONENT__PORTS:
				return getPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplecomponentmodelPackage.COMPONENT__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SimplecomponentmodelPackage.COMPONENT__INTERNAL_COMPONENTS:
				getInternalComponents().clear();
				getInternalComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case SimplecomponentmodelPackage.COMPONENT__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case SimplecomponentmodelPackage.COMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplecomponentmodelPackage.COMPONENT__BEHAVIORS:
				getBehaviors().clear();
				return;
			case SimplecomponentmodelPackage.COMPONENT__INTERNAL_COMPONENTS:
				getInternalComponents().clear();
				return;
			case SimplecomponentmodelPackage.COMPONENT__CONNECTORS:
				getConnectors().clear();
				return;
			case SimplecomponentmodelPackage.COMPONENT__PORTS:
				getPorts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplecomponentmodelPackage.COMPONENT__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
			case SimplecomponentmodelPackage.COMPONENT__INTERNAL_COMPONENTS:
				return internalComponents != null && !internalComponents.isEmpty();
			case SimplecomponentmodelPackage.COMPONENT__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case SimplecomponentmodelPackage.COMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
