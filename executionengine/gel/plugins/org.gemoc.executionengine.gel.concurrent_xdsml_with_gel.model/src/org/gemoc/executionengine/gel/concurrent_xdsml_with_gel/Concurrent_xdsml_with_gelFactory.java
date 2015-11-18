/**
 */
package org.gemoc.executionengine.gel.concurrent_xdsml_with_gel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.Concurrent_xdsml_with_gelPackage
 * @generated
 */
public interface Concurrent_xdsml_with_gelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Concurrent_xdsml_with_gelFactory eINSTANCE = org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.Concurrent_xdsml_with_gelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concurrent Language With Gel Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrent Language With Gel Definition</em>'.
	 * @generated
	 */
	ConcurrentLanguageWithGelDefinition createConcurrentLanguageWithGelDefinition();

	/**
	 * Returns a new object of class '<em>Gel Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gel Project</em>'.
	 * @generated
	 */
	GelProject createGelProject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Concurrent_xdsml_with_gelPackage getConcurrent_xdsml_with_gelPackage();

} //Concurrent_xdsml_with_gelFactory
