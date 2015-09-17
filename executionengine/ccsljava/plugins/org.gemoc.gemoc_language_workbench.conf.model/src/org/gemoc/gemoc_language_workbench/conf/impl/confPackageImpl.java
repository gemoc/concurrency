/**
 */
package org.gemoc.gemoc_language_workbench.conf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gemoc.executionframework.xdsml_base.Xdsml_basePackage;
import org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition;
import org.gemoc.gemoc_language_workbench.conf.DSAProject;
import org.gemoc.gemoc_language_workbench.conf.DSEProject;
import org.gemoc.gemoc_language_workbench.conf.MoCCProject;
import org.gemoc.gemoc_language_workbench.conf.confFactory;
import org.gemoc.gemoc_language_workbench.conf.confPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class confPackageImpl extends EPackageImpl implements confPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrentLanguageDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsaProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animatorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusAnimatorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusEditorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTextEditorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEditorProjectEClass = null;

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
	 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private confPackageImpl() {
		super(eNS_URI, confFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link confPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static confPackage init() {
		if (isInited) return (confPackage)EPackage.Registry.INSTANCE.getEPackage(confPackage.eNS_URI);

		// Obtain or create and register package
		confPackageImpl theconfPackage = (confPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof confPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new confPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Xdsml_basePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theconfPackage.createPackageContents();

		// Initialize created meta-data
		theconfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theconfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(confPackage.eNS_URI, theconfPackage);
		return theconfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrentLanguageDefinition() {
		return concurrentLanguageDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentLanguageDefinition_DsaProject() {
		return (EReference)concurrentLanguageDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentLanguageDefinition_MoCCProject() {
		return (EReference)concurrentLanguageDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentLanguageDefinition_DSEProject() {
		return (EReference)concurrentLanguageDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSAProject() {
		return dsaProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAProject_CodeExecutorClass() {
		return (EAttribute)dsaProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAProject_EntryPoint() {
		return (EAttribute)dsaProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModelProject() {
		return domainModelProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModelProject_DefaultRootEObjectQualifiedName() {
		return (EAttribute)domainModelProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModelProject_Genmodeluri() {
		return (EAttribute)domainModelProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModelProject_ModelLoaderClass() {
		return (EAttribute)domainModelProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCProject() {
		return moCCProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimatorProject() {
		return animatorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusAnimatorProject() {
		return siriusAnimatorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEProject() {
		return dseProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSEProject_QvtoURI() {
		return (EAttribute)dseProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSEProject_SolverClass() {
		return (EAttribute)dseProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusEditorProject() {
		return siriusEditorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTextEditorProject() {
		return xTextEditorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTextEditorProject_GrammarName() {
		return (EAttribute)xTextEditorProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeEditorProject() {
		return treeEditorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public confFactory getconfFactory() {
		return (confFactory)getEFactoryInstance();
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
		concurrentLanguageDefinitionEClass = createEClass(CONCURRENT_LANGUAGE_DEFINITION);
		createEReference(concurrentLanguageDefinitionEClass, CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT);
		createEReference(concurrentLanguageDefinitionEClass, CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT);
		createEReference(concurrentLanguageDefinitionEClass, CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT);

		dsaProjectEClass = createEClass(DSA_PROJECT);
		createEAttribute(dsaProjectEClass, DSA_PROJECT__CODE_EXECUTOR_CLASS);
		createEAttribute(dsaProjectEClass, DSA_PROJECT__ENTRY_POINT);

		domainModelProjectEClass = createEClass(DOMAIN_MODEL_PROJECT);
		createEAttribute(domainModelProjectEClass, DOMAIN_MODEL_PROJECT__DEFAULT_ROOT_EOBJECT_QUALIFIED_NAME);
		createEAttribute(domainModelProjectEClass, DOMAIN_MODEL_PROJECT__GENMODELURI);
		createEAttribute(domainModelProjectEClass, DOMAIN_MODEL_PROJECT__MODEL_LOADER_CLASS);

		moCCProjectEClass = createEClass(MO_CC_PROJECT);

		animatorProjectEClass = createEClass(ANIMATOR_PROJECT);

		dseProjectEClass = createEClass(DSE_PROJECT);
		createEAttribute(dseProjectEClass, DSE_PROJECT__QVTO_URI);
		createEAttribute(dseProjectEClass, DSE_PROJECT__SOLVER_CLASS);

		siriusEditorProjectEClass = createEClass(SIRIUS_EDITOR_PROJECT);

		siriusAnimatorProjectEClass = createEClass(SIRIUS_ANIMATOR_PROJECT);

		xTextEditorProjectEClass = createEClass(XTEXT_EDITOR_PROJECT);
		createEAttribute(xTextEditorProjectEClass, XTEXT_EDITOR_PROJECT__GRAMMAR_NAME);

		treeEditorProjectEClass = createEClass(TREE_EDITOR_PROJECT);
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
		Xdsml_basePackage theXdsml_basePackage = (Xdsml_basePackage)EPackage.Registry.INSTANCE.getEPackage(Xdsml_basePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		concurrentLanguageDefinitionEClass.getESuperTypes().add(theXdsml_basePackage.getLanguageDefinition());
		dsaProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());
		domainModelProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());
		moCCProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());
		animatorProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());
		dseProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());
		siriusEditorProjectEClass.getESuperTypes().add(theXdsml_basePackage.getEditorProject());
		siriusAnimatorProjectEClass.getESuperTypes().add(this.getAnimatorProject());
		xTextEditorProjectEClass.getESuperTypes().add(theXdsml_basePackage.getEditorProject());
		treeEditorProjectEClass.getESuperTypes().add(theXdsml_basePackage.getEditorProject());

		// Initialize classes and features; add operations and parameters
		initEClass(concurrentLanguageDefinitionEClass, ConcurrentLanguageDefinition.class, "ConcurrentLanguageDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcurrentLanguageDefinition_DsaProject(), this.getDSAProject(), null, "dsaProject", null, 0, 1, ConcurrentLanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcurrentLanguageDefinition_MoCCProject(), this.getMoCCProject(), null, "moCCProject", null, 0, 1, ConcurrentLanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcurrentLanguageDefinition_DSEProject(), this.getDSEProject(), null, "dSEProject", null, 0, 1, ConcurrentLanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsaProjectEClass, DSAProject.class, "DSAProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSAProject_CodeExecutorClass(), ecorePackage.getEString(), "codeExecutorClass", null, 0, 1, DSAProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAProject_EntryPoint(), ecorePackage.getEString(), "entryPoint", null, 0, 1, DSAProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moCCProjectEClass, MoCCProject.class, "MoCCProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseProjectEClass, DSEProject.class, "DSEProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSEProject_QvtoURI(), ecorePackage.getEString(), "qvtoURI", null, 0, 1, DSEProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSEProject_SolverClass(), ecorePackage.getEString(), "solverClass", null, 0, 1, DSEProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //confPackageImpl
