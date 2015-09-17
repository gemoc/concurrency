/**
 */
package org.gemoc.gemoc_language_workbench.conf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.gemoc_language_workbench.conf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class confFactoryImpl extends EFactoryImpl implements confFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static confFactory init() {
		try {
			confFactory theconfFactory = (confFactory)EPackage.Registry.INSTANCE.getEFactory(confPackage.eNS_URI);
			if (theconfFactory != null) {
				return theconfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new confFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public confFactoryImpl() {
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
			case confPackage.CONCURRENT_LANGUAGE_DEFINITION: return createConcurrentLanguageDefinition();
			case confPackage.DSA_PROJECT: return createDSAProject();
			case confPackage.MO_CC_PROJECT: return createMoCCProject();
			case confPackage.DSE_PROJECT: return createDSEProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentLanguageDefinition createConcurrentLanguageDefinition() {
		ConcurrentLanguageDefinitionImpl concurrentLanguageDefinition = new ConcurrentLanguageDefinitionImpl();
		return concurrentLanguageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAProject createDSAProject() {
		DSAProjectImpl dsaProject = new DSAProjectImpl();
		return dsaProject;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCProject createMoCCProject() {
		MoCCProjectImpl moCCProject = new MoCCProjectImpl();
		return moCCProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSEProject createDSEProject() {
		DSEProjectImpl dseProject = new DSEProjectImpl();
		return dseProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public confPackage getconfPackage() {
		return (confPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static confPackage getPackage() {
		return confPackage.eINSTANCE;
	}

} //confFactoryImpl
