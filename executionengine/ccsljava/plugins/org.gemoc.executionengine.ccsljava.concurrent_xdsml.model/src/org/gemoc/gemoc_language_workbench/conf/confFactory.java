/**
 */
package org.gemoc.gemoc_language_workbench.conf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.gemoc_language_workbench.conf.confPackage
 * @generated
 */
public interface confFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	confFactory eINSTANCE = org.gemoc.gemoc_language_workbench.conf.impl.confFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concurrent Language Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrent Language Definition</em>'.
	 * @generated
	 */
	ConcurrentLanguageDefinition createConcurrentLanguageDefinition();

	/**
	 * Returns a new object of class '<em>DSA Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSA Project</em>'.
	 * @generated
	 */
	DSAProject createDSAProject();

	/**
	 * Returns a new object of class '<em>Mo CC Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CC Project</em>'.
	 * @generated
	 */
	MoCCProject createMoCCProject();

	/**
	 * Returns a new object of class '<em>DSE Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSE Project</em>'.
	 * @generated
	 */
	DSEProject createDSEProject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	confPackage getconfPackage();

} //confFactory
