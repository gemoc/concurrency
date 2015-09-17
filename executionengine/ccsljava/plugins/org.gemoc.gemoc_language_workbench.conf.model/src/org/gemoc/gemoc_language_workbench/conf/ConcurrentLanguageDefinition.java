/**
 */
package org.gemoc.gemoc_language_workbench.conf;

import org.gemoc.executionframework.xdsml_base.LanguageDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrent Language Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition#getDsaProject <em>Dsa Project</em>}</li>
 *   <li>{@link org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition#getMoCCProject <em>Mo CC Project</em>}</li>
 *   <li>{@link org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition#getDSEProject <em>DSE Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#getConcurrentLanguageDefinition()
 * @model
 * @generated
 */
public interface ConcurrentLanguageDefinition extends LanguageDefinition {
	/**
	 * Returns the value of the '<em><b>Dsa Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsa Project</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsa Project</em>' containment reference.
	 * @see #setDsaProject(DSAProject)
	 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#getConcurrentLanguageDefinition_DsaProject()
	 * @model containment="true"
	 * @generated
	 */
	DSAProject getDsaProject();

	/**
	 * Sets the value of the '{@link org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition#getDsaProject <em>Dsa Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsa Project</em>' containment reference.
	 * @see #getDsaProject()
	 * @generated
	 */
	void setDsaProject(DSAProject value);

	/**
	 * Returns the value of the '<em><b>Mo CC Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mo CC Project</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mo CC Project</em>' containment reference.
	 * @see #setMoCCProject(MoCCProject)
	 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#getConcurrentLanguageDefinition_MoCCProject()
	 * @model containment="true"
	 * @generated
	 */
	MoCCProject getMoCCProject();

	/**
	 * Sets the value of the '{@link org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition#getMoCCProject <em>Mo CC Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mo CC Project</em>' containment reference.
	 * @see #getMoCCProject()
	 * @generated
	 */
	void setMoCCProject(MoCCProject value);

	/**
	 * Returns the value of the '<em><b>DSE Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSE Project</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSE Project</em>' containment reference.
	 * @see #setDSEProject(DSEProject)
	 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#getConcurrentLanguageDefinition_DSEProject()
	 * @model containment="true"
	 * @generated
	 */
	DSEProject getDSEProject();

	/**
	 * Sets the value of the '{@link org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition#getDSEProject <em>DSE Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSE Project</em>' containment reference.
	 * @see #getDSEProject()
	 * @generated
	 */
	void setDSEProject(DSEProject value);

} // ConcurrentLanguageDefinition
