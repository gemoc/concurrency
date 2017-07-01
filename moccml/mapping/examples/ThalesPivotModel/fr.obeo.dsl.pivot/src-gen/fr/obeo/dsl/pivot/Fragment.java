/**
 */
package fr.obeo.dsl.pivot;

import fr.obeo.dsl.pivot.datatype.Interval;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a part of an operation withour any message sending
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.Fragment#getTime <em>Time</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Fragment#getIndex <em>Index</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Fragment#isCriticalSection <em>Critical Section</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Fragment#getSink <em>Sink</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Fragment#getSource <em>Source</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Fragment#getPreviousFragment <em>Previous Fragment</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Fragment#getNextFragments <em>Next Fragments</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.Fragment#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment()
 * @model
 * @generated
 */
public interface Fragment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Interval)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment_Time()
	 * @model dataType="fr.obeo.dsl.pivot.Interval" required="true"
	 * @generated
	 */
	Interval getTime();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Fragment#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Interval value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment_Index()
	 * @model required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Fragment#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Critical Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical Section</em>' attribute.
	 * @see #setCriticalSection(boolean)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment_CriticalSection()
	 * @model
	 * @generated
	 */
	boolean isCriticalSection();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Fragment#isCriticalSection <em>Critical Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Section</em>' attribute.
	 * @see #isCriticalSection()
	 * @generated
	 */
	void setCriticalSection(boolean value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Sink#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' reference.
	 * @see #setSink(Sink)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment_Sink()
	 * @see fr.obeo.dsl.pivot.Sink#getFragment
	 * @model opposite="fragment"
	 * @generated
	 */
	Sink getSink();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Fragment#getSink <em>Sink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(Sink value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Source#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Source)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment_Source()
	 * @see fr.obeo.dsl.pivot.Source#getFragment
	 * @model opposite="fragment"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Fragment#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Previous Fragment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Fragment#getNextFragments <em>Next Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Fragment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Fragment</em>' reference.
	 * @see #setPreviousFragment(Fragment)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment_PreviousFragment()
	 * @see fr.obeo.dsl.pivot.Fragment#getNextFragments
	 * @model opposite="nextFragments"
	 * @generated
	 */
	Fragment getPreviousFragment();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Fragment#getPreviousFragment <em>Previous Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Fragment</em>' reference.
	 * @see #getPreviousFragment()
	 * @generated
	 */
	void setPreviousFragment(Fragment value);

	/**
	 * Returns the value of the '<em><b>Next Fragments</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.pivot.Fragment}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Fragment#getPreviousFragment <em>Previous Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Fragments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Fragments</em>' reference list.
	 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment_NextFragments()
	 * @see fr.obeo.dsl.pivot.Fragment#getPreviousFragment
	 * @model opposite="previousFragment"
	 * @generated
	 */
	EList<Fragment> getNextFragments();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.pivot.Task#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see fr.obeo.dsl.pivot.PivotPackage#getFragment_Task()
	 * @see fr.obeo.dsl.pivot.Task#getFragments
	 * @model opposite="fragments" required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.pivot.Fragment#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // Fragment
