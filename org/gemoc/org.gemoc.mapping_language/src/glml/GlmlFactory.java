/**
 */
package glml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see glml.GlmlPackage
 * @generated
 */
public interface GlmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlmlFactory eINSTANCE = glml.impl.GlmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Specific Event File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Event File</em>'.
	 * @generated
	 */
	DomainSpecificEventFile createDomainSpecificEventFile();

	/**
	 * Returns a new object of class '<em>Language Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Specific Event</em>'.
	 * @generated
	 */
	LanguageSpecificEvent createLanguageSpecificEvent();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GlmlPackage getGlmlPackage();

} //GlmlFactory