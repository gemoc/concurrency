/**
 */
package org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.executionengine.gel.concurrent_xdsml_with_gel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Concurrent_xdsml_with_gelFactoryImpl extends EFactoryImpl implements Concurrent_xdsml_with_gelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Concurrent_xdsml_with_gelFactory init() {
		try {
			Concurrent_xdsml_with_gelFactory theConcurrent_xdsml_with_gelFactory = (Concurrent_xdsml_with_gelFactory)EPackage.Registry.INSTANCE.getEFactory(Concurrent_xdsml_with_gelPackage.eNS_URI);
			if (theConcurrent_xdsml_with_gelFactory != null) {
				return theConcurrent_xdsml_with_gelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Concurrent_xdsml_with_gelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrent_xdsml_with_gelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Concurrent_xdsml_with_gelPackage.CONCURRENT_LANGUAGE_WITH_GEL_DEFINITION: return createConcurrentLanguageWithGelDefinition();
			case Concurrent_xdsml_with_gelPackage.GEL_PROJECT: return createGelProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentLanguageWithGelDefinition createConcurrentLanguageWithGelDefinition() {
		ConcurrentLanguageWithGelDefinitionImpl concurrentLanguageWithGelDefinition = new ConcurrentLanguageWithGelDefinitionImpl();
		return concurrentLanguageWithGelDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GelProject createGelProject() {
		GelProjectImpl gelProject = new GelProjectImpl();
		return gelProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrent_xdsml_with_gelPackage getConcurrent_xdsml_with_gelPackage() {
		return (Concurrent_xdsml_with_gelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Concurrent_xdsml_with_gelPackage getPackage() {
		return Concurrent_xdsml_with_gelPackage.eINSTANCE;
	}

} //Concurrent_xdsml_with_gelFactoryImpl
