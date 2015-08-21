/**
 */
package org.gemoc.gemoc_language_workbench.conf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSE Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gemoc_language_workbench.conf.DSEProject#getQvtoURI <em>Qvto URI</em>}</li>
 *   <li>{@link org.gemoc.gemoc_language_workbench.conf.DSEProject#getSolverClass <em>Solver Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#getDSEProject()
 * @model
 * @generated
 */
public interface DSEProject extends ProjectResource {

	/**
	 * Returns the value of the '<em><b>Qvto URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qvto URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qvto URI</em>' attribute.
	 * @see #setQvtoURI(String)
	 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#getDSEProject_QvtoURI()
	 * @model
	 * @generated
	 */
	String getQvtoURI();

	/**
	 * Sets the value of the '{@link org.gemoc.gemoc_language_workbench.conf.DSEProject#getQvtoURI <em>Qvto URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qvto URI</em>' attribute.
	 * @see #getQvtoURI()
	 * @generated
	 */
	void setQvtoURI(String value);

	/**
	 * Returns the value of the '<em><b>Solver Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Class</em>' attribute.
	 * @see #setSolverClass(String)
	 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#getDSEProject_SolverClass()
	 * @model
	 * @generated
	 */
	String getSolverClass();

	/**
	 * Sets the value of the '{@link org.gemoc.gemoc_language_workbench.conf.DSEProject#getSolverClass <em>Solver Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Class</em>' attribute.
	 * @see #getSolverClass()
	 * @generated
	 */
	void setSolverClass(String value);
} // DSEProject
