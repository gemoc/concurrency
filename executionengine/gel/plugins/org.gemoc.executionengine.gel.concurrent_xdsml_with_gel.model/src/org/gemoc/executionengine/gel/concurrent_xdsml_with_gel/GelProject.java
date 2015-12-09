/**
 */
package org.gemoc.executionengine.gel.concurrent_xdsml_with_gel;

import org.gemoc.executionframework.xdsml_base.ProjectResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gel Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.GelProject#getGelSpecificationURI <em>Gel Specification URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.Concurrent_xdsml_with_gelPackage#getGelProject()
 * @model
 * @generated
 */
public interface GelProject extends ProjectResource {
	/**
	 * Returns the value of the '<em><b>Gel Specification URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gel Specification URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gel Specification URI</em>' attribute.
	 * @see #setGelSpecificationURI(String)
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.Concurrent_xdsml_with_gelPackage#getGelProject_GelSpecificationURI()
	 * @model
	 * @generated
	 */
	String getGelSpecificationURI();

	/**
	 * Sets the value of the '{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.GelProject#getGelSpecificationURI <em>Gel Specification URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gel Specification URI</em>' attribute.
	 * @see #getGelSpecificationURI()
	 * @generated
	 */
	void setGelSpecificationURI(String value);

} // GelProject
