/**
 */
package fr.obeo.dsl.pivot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the system to analyse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.System#getHwResources <em>Hw Resources</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.System#getBus <em>Bus</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.System#getSources <em>Sources</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.System#getSinks <em>Sinks</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.System#getFragments <em>Fragments</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.System#getChains <em>Chains</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hw Resources</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.HwResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw Resources</em>' containment reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSystem_HwResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwResource> getHwResources();

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.BusComm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' containment reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSystem_Bus()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusComm> getBus();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSystem_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSources();

	/**
	 * Returns the value of the '<em><b>Sinks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.Sink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sinks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sinks</em>' containment reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSystem_Sinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sink> getSinks();

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.Fragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSystem_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fragment> getFragments();

	/**
	 * Returns the value of the '<em><b>Chains</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.Chain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chains</em>' containment reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getSystem_Chains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chain> getChains();

} // System
