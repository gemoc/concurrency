/**
 */
package glml.impl;

import glml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlmlFactoryImpl extends EFactoryImpl implements GlmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GlmlFactory init() {
		try {
			GlmlFactory theGlmlFactory = (GlmlFactory)EPackage.Registry.INSTANCE.getEFactory(GlmlPackage.eNS_URI);
			if (theGlmlFactory != null) {
				return theGlmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GlmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlmlFactoryImpl() {
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
			case GlmlPackage.DOMAIN_SPECIFIC_EVENT_FILE: return createDomainSpecificEventFile();
			case GlmlPackage.LANGUAGE_SPECIFIC_EVENT: return createLanguageSpecificEvent();
			case GlmlPackage.IMPORT_STATEMENT: return createImportStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificEventFile createDomainSpecificEventFile() {
		DomainSpecificEventFileImpl domainSpecificEventFile = new DomainSpecificEventFileImpl();
		return domainSpecificEventFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageSpecificEvent createLanguageSpecificEvent() {
		LanguageSpecificEventImpl languageSpecificEvent = new LanguageSpecificEventImpl();
		return languageSpecificEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportStatement createImportStatement() {
		ImportStatementImpl importStatement = new ImportStatementImpl();
		return importStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlmlPackage getGlmlPackage() {
		return (GlmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GlmlPackage getPackage() {
		return GlmlPackage.eINSTANCE;
	}

} //GlmlFactoryImpl