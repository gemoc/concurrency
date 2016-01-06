/**
 */
package org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage;
import org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.ConcurrentLanguageWithGelDefinition;
import org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.Concurrent_xdsml_with_gelFactory;
import org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.Concurrent_xdsml_with_gelPackage;
import org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.GelProject;
import org.gemoc.executionframework.xdsml_base.Xdsml_basePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Concurrent_xdsml_with_gelPackageImpl extends EPackageImpl implements Concurrent_xdsml_with_gelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrentLanguageWithGelDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gelProjectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.Concurrent_xdsml_with_gelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Concurrent_xdsml_with_gelPackageImpl() {
		super(eNS_URI, Concurrent_xdsml_with_gelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Concurrent_xdsml_with_gelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Concurrent_xdsml_with_gelPackage init() {
		if (isInited) return (Concurrent_xdsml_with_gelPackage)EPackage.Registry.INSTANCE.getEPackage(Concurrent_xdsml_with_gelPackage.eNS_URI);

		// Obtain or create and register package
		Concurrent_xdsml_with_gelPackageImpl theConcurrent_xdsml_with_gelPackage = (Concurrent_xdsml_with_gelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Concurrent_xdsml_with_gelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Concurrent_xdsml_with_gelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Concurrent_xdsmlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConcurrent_xdsml_with_gelPackage.createPackageContents();

		// Initialize created meta-data
		theConcurrent_xdsml_with_gelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcurrent_xdsml_with_gelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Concurrent_xdsml_with_gelPackage.eNS_URI, theConcurrent_xdsml_with_gelPackage);
		return theConcurrent_xdsml_with_gelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrentLanguageWithGelDefinition() {
		return concurrentLanguageWithGelDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGelProject() {
		return gelProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGelProject_GelSpecificationURI() {
		return (EAttribute)gelProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrent_xdsml_with_gelFactory getConcurrent_xdsml_with_gelFactory() {
		return (Concurrent_xdsml_with_gelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		concurrentLanguageWithGelDefinitionEClass = createEClass(CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION);

		gelProjectEClass = createEClass(GEL_PROJECT);
		createEAttribute(gelProjectEClass, GEL_PROJECT__GEL_SPECIFICATION_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Concurrent_xdsmlPackage theConcurrent_xdsmlPackage = (Concurrent_xdsmlPackage)EPackage.Registry.INSTANCE.getEPackage(Concurrent_xdsmlPackage.eNS_URI);
		Xdsml_basePackage theXdsml_basePackage = (Xdsml_basePackage)EPackage.Registry.INSTANCE.getEPackage(Xdsml_basePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		concurrentLanguageWithGelDefinitionEClass.getESuperTypes().add(theConcurrent_xdsmlPackage.getConcurrentLanguageDefinition());
		gelProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(concurrentLanguageWithGelDefinitionEClass, ConcurrentLanguageWithGelDefinition.class, "ConcurrentLanguageWithGelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gelProjectEClass, GelProject.class, "GelProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGelProject_GelSpecificationURI(), ecorePackage.getEString(), "GelSpecificationURI", null, 0, 1, GelProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Concurrent_xdsml_with_gelPackageImpl
