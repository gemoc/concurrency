/**
 */
package org.gemoc.executionengine.gel.concurrent_xdsml_with_gel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.gemoc.executionengine.ccsljava.concurrent_xdsml.Concurrent_xdsmlPackage;

import org.gemoc.executionframework.xdsml_base.Xdsml_basePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.Concurrent_xdsml_with_gelFactory
 * @model kind="package"
 * @generated
 */
public interface Concurrent_xdsml_with_gelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concurrent_xdsml_with_gel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/concurrent_xdsml_with_gel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concurrent_xdsml_with_gel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Concurrent_xdsml_with_gelPackage eINSTANCE = org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.Concurrent_xdsml_with_gelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.ConcurrentLanguageWithGelDefinitionImpl <em>Concurrent Language With Gel Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.ConcurrentLanguageWithGelDefinitionImpl
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.Concurrent_xdsml_with_gelPackageImpl#getConcurrentLanguageWithGelDefinition()
	 * @generated
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Domain Model Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__DOMAIN_MODEL_PROJECT = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__DOMAIN_MODEL_PROJECT;

	/**
	 * The feature id for the '<em><b>Editor Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__EDITOR_PROJECTS = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__EDITOR_PROJECTS;

	/**
	 * The feature id for the '<em><b>Animator Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__ANIMATOR_PROJECTS = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__ANIMATOR_PROJECTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__NAME = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Melange URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__MELANGE_URI = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__MELANGE_URI;

	/**
	 * The feature id for the '<em><b>Need Melange Synchronization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__NEED_MELANGE_SYNCHRONIZATION = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__NEED_MELANGE_SYNCHRONIZATION;

	/**
	 * The feature id for the '<em><b>Dsa Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__DSA_PROJECT = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT;

	/**
	 * The feature id for the '<em><b>Mo CC Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__MO_CC_PROJECT = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT;

	/**
	 * The feature id for the '<em><b>DSE Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION__DSE_PROJECT = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT;

	/**
	 * The number of structural features of the '<em>Concurrent Language With Gel Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION_FEATURE_COUNT = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get File Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION___GET_FILE_EXTENSIONS = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION___GET_FILE_EXTENSIONS;

	/**
	 * The number of operations of the '<em>Concurrent Language With Gel Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION_OPERATION_COUNT = Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.GelProjectImpl <em>Gel Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.GelProjectImpl
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.Concurrent_xdsml_with_gelPackageImpl#getGelProject()
	 * @generated
	 */
	int GEL_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEL_PROJECT__PROJECT_NAME = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Project Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEL_PROJECT__PROJECT_KIND = Xdsml_basePackage.PROJECT_RESOURCE__PROJECT_KIND;

	/**
	 * The feature id for the '<em><b>Gel Specification URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEL_PROJECT__GEL_SPECIFICATION_URI = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gel Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEL_PROJECT_FEATURE_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gel Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEL_PROJECT_OPERATION_COUNT = Xdsml_basePackage.PROJECT_RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.ConcurrentLanguageWithGelDefinition <em>Concurrent Language With Gel Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrent Language With Gel Definition</em>'.
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.ConcurrentLanguageWithGelDefinition
	 * @generated
	 */
	EClass getConcurrentLanguageWithGelDefinition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.GelProject <em>Gel Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gel Project</em>'.
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.GelProject
	 * @generated
	 */
	EClass getGelProject();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.GelProject#getGelSpecificationURI <em>Gel Specification URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gel Specification URI</em>'.
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.GelProject#getGelSpecificationURI()
	 * @see #getGelProject()
	 * @generated
	 */
	EAttribute getGelProject_GelSpecificationURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Concurrent_xdsml_with_gelFactory getConcurrent_xdsml_with_gelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.ConcurrentLanguageWithGelDefinitionImpl <em>Concurrent Language With Gel Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.ConcurrentLanguageWithGelDefinitionImpl
		 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.Concurrent_xdsml_with_gelPackageImpl#getConcurrentLanguageWithGelDefinition()
		 * @generated
		 */
		EClass CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION = eINSTANCE.getConcurrentLanguageWithGelDefinition();

		/**
		 * The meta object literal for the '{@link org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.GelProjectImpl <em>Gel Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.GelProjectImpl
		 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl.Concurrent_xdsml_with_gelPackageImpl#getGelProject()
		 * @generated
		 */
		EClass GEL_PROJECT = eINSTANCE.getGelProject();

		/**
		 * The meta object literal for the '<em><b>Gel Specification URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEL_PROJECT__GEL_SPECIFICATION_URI = eINSTANCE.getGelProject_GelSpecificationURI();

	}

} //Concurrent_xdsml_with_gelPackage
