/**
 */
package fr.obeo.dsl.pivot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a task in the system
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Task#getSchedulingIndex <em>Scheduling Index</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Task#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getTask_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Scheduling Index</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Index</em>' attribute.
	 * @see #setSchedulingIndex(int)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getTask_SchedulingIndex()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getSchedulingIndex();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Task#getSchedulingIndex <em>Scheduling Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Index</em>' attribute.
	 * @see #getSchedulingIndex()
	 * @generated
	 */
	void setSchedulingIndex(int value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.Fragment}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Fragment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getTask_Fragments()
	 * @see fr.obeo.dsl.pivot.Fragment#getTask
	 * @model opposite="task"
	 * @generated
	 */
	EList<Fragment> getFragments();

} // Task
