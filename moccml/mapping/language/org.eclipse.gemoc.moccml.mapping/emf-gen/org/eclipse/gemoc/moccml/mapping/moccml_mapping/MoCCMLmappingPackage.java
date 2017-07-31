/**
 * Copyright (c) 2010, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.gemoc.moccml.mapping.moccml_mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.ocl.xtext.basecs.BaseCSPackage;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;

import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingFactory
 * @model kind="package"
 * @generated
 */
public interface MoCCMLmappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moccml_mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.gemoc.moccml.mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.gemoc.moccml.mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoCCMLmappingPackage eINSTANCE = org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventTypeImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__CSI = BaseCSPackage.TYPED_REF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__PARENT = BaseCSPackage.TYPED_REF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__PIVOT = BaseCSPackage.TYPED_REF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__OWNED_MULTIPLICITY = BaseCSPackage.TYPED_REF_CS__OWNED_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__NAME = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refered Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__REFERED_ELEMENT = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl <em>DSA Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getDSAFeedback()
	 * @generated
	 */
	int DSA_FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__CSI = CompleteOCLCSPackage.DEF_PROPERTY_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__PARENT = CompleteOCLCSPackage.DEF_PROPERTY_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__PIVOT = CompleteOCLCSPackage.DEF_PROPERTY_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__ORIGINAL_XMI_ID = CompleteOCLCSPackage.DEF_PROPERTY_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__OWNED_ANNOTATIONS = CompleteOCLCSPackage.DEF_PROPERTY_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__NAME = CompleteOCLCSPackage.DEF_PROPERTY_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__IS_OPTIONAL = CompleteOCLCSPackage.DEF_PROPERTY_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__OWNED_TYPE = CompleteOCLCSPackage.DEF_PROPERTY_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__QUALIFIERS = CompleteOCLCSPackage.DEF_PROPERTY_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__IS_STATIC = CompleteOCLCSPackage.DEF_PROPERTY_CS__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Owned Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__OWNED_SPECIFICATION = CompleteOCLCSPackage.DEF_PROPERTY_CS__OWNED_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owning Classifier Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__OWNING_CLASSIFIER_CONTEXT_DECL = CompleteOCLCSPackage.DEF_PROPERTY_CS__OWNING_CLASSIFIER_CONTEXT_DECL;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__CASES = CompleteOCLCSPackage.DEF_PROPERTY_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK__OWNER = CompleteOCLCSPackage.DEF_PROPERTY_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DSA Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSA_FEEDBACK_FEATURE_COUNT = CompleteOCLCSPackage.DEF_PROPERTY_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CONDITION = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event To Force</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__EVENT_TO_FORCE = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ON = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind Of Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__KIND_OF_FEEDBACK = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLDocumentImpl <em>ECL Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLDocumentImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLDocument()
	 * @generated
	 */
	int ECL_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__CSI = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__PARENT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__PIVOT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__ORIGINAL_XMI_ID = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__OWNED_ANNOTATIONS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__NAME = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__OWNED_IMPORTS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORTS;

	/**
	 * The feature id for the '<em><b>Owned Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__OWNED_CONTEXTS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__OWNED_PACKAGES = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT__IMPORTS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ECL Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOCUMENT_FEATURE_COUNT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventLiteralExpImpl <em>Event Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventLiteralExpImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventLiteralExp()
	 * @generated
	 */
	int EVENT_LITERAL_EXP = 4;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__CSI = EssentialOCLCSPackage.LITERAL_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__PARENT = EssentialOCLCSPackage.LITERAL_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__PIVOT = EssentialOCLCSPackage.LITERAL_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__ORIGINAL_XMI_ID = EssentialOCLCSPackage.LITERAL_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__OWNED_ANNOTATIONS = EssentialOCLCSPackage.LITERAL_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__HAS_ERROR = EssentialOCLCSPackage.LITERAL_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__LOCAL_LEFT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__LOCAL_PARENT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__LOCAL_RIGHT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__PRECEDENCE = EssentialOCLCSPackage.LITERAL_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP__VALUE = EssentialOCLCSPackage.LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LITERAL_EXP_FEATURE_COUNT = EssentialOCLCSPackage.LITERAL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLRelationImpl <em>ECL Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLRelationImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLRelation()
	 * @generated
	 */
	int ECL_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__TYPE = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__PARAMETERS = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is An Assertion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION__IS_AN_ASSERTION = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ECL Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_RELATION_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ImportStatementImpl <em>Import Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ImportStatementImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getImportStatement()
	 * @generated
	 */
	int IMPORT_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__CSI = BaseCSPackage.IMPORT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__PARENT = BaseCSPackage.IMPORT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__PIVOT = BaseCSPackage.IMPORT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__ORIGINAL_XMI_ID = BaseCSPackage.IMPORT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__OWNED_ANNOTATIONS = BaseCSPackage.IMPORT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__NAME = BaseCSPackage.IMPORT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__IS_ALL = BaseCSPackage.IMPORT_CS__IS_ALL;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__OWNED_PATH_NAME = BaseCSPackage.IMPORT_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Referred Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__REFERRED_NAMESPACE = BaseCSPackage.IMPORT_CS__REFERRED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__IMPORT_URI = BaseCSPackage.IMPORT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_FEATURE_COUNT = BaseCSPackage.IMPORT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLExpressionImpl <em>ECL Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLExpressionImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLExpression()
	 * @generated
	 */
	int ECL_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__TYPE = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION__PARAMETERS = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EXPRESSION_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLDefCSImpl <em>ECL Def CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLDefCSImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLDefCS()
	 * @generated
	 */
	int ECL_DEF_CS = 8;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__CSI = CompleteOCLCSPackage.DEF_PROPERTY_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__PARENT = CompleteOCLCSPackage.DEF_PROPERTY_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__PIVOT = CompleteOCLCSPackage.DEF_PROPERTY_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__ORIGINAL_XMI_ID = CompleteOCLCSPackage.DEF_PROPERTY_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__OWNED_ANNOTATIONS = CompleteOCLCSPackage.DEF_PROPERTY_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__NAME = CompleteOCLCSPackage.DEF_PROPERTY_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__IS_OPTIONAL = CompleteOCLCSPackage.DEF_PROPERTY_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__OWNED_TYPE = CompleteOCLCSPackage.DEF_PROPERTY_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__QUALIFIERS = CompleteOCLCSPackage.DEF_PROPERTY_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__IS_STATIC = CompleteOCLCSPackage.DEF_PROPERTY_CS__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Owned Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__OWNED_SPECIFICATION = CompleteOCLCSPackage.DEF_PROPERTY_CS__OWNED_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owning Classifier Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__OWNING_CLASSIFIER_CONTEXT_DECL = CompleteOCLCSPackage.DEF_PROPERTY_CS__OWNING_CLASSIFIER_CONTEXT_DECL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__CONDITION = CompleteOCLCSPackage.DEF_PROPERTY_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS__VISIBILITY = CompleteOCLCSPackage.DEF_PROPERTY_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECL Def CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DEF_CS_FEATURE_COUNT = CompleteOCLCSPackage.DEF_PROPERTY_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor <em>Base CS Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getBaseCSVisitor()
	 * @generated
	 */
	int BASE_CS_VISITOR = 9;

	/**
	 * The number of structural features of the '<em>Base CS Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CS_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.BlockTypeImpl <em>Block Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.BlockTypeImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getBlockType()
	 * @generated
	 */
	int BLOCK_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__CSI = BaseCSPackage.TYPED_REF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__PARENT = BaseCSPackage.TYPED_REF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__PIVOT = BaseCSPackage.TYPED_REF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__OWNED_MULTIPLICITY = BaseCSPackage.TYPED_REF_CS__OWNED_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__NAME = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE_FEATURE_COUNT = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLEventDefCSImpl <em>ECL Event Def CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLEventDefCSImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLEventDefCS()
	 * @generated
	 */
	int ECL_EVENT_DEF_CS = 11;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__CSI = ECL_DEF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__PARENT = ECL_DEF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__PIVOT = ECL_DEF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__ORIGINAL_XMI_ID = ECL_DEF_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__OWNED_ANNOTATIONS = ECL_DEF_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__NAME = ECL_DEF_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__IS_OPTIONAL = ECL_DEF_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__OWNED_TYPE = ECL_DEF_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__QUALIFIERS = ECL_DEF_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__IS_STATIC = ECL_DEF_CS__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Owned Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__OWNED_SPECIFICATION = ECL_DEF_CS__OWNED_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owning Classifier Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__OWNING_CLASSIFIER_CONTEXT_DECL = ECL_DEF_CS__OWNING_CLASSIFIER_CONTEXT_DECL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__CONDITION = ECL_DEF_CS__CONDITION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__VISIBILITY = ECL_DEF_CS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__FEEDBACK = ECL_DEF_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Future</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__FUTURE = ECL_DEF_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dsa Result Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS__DSA_RESULT_NAME = ECL_DEF_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ECL Event Def CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_EVENT_DEF_CS_FEATURE_COUNT = ECL_DEF_CS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLBlockDefCSImpl <em>ECL Block Def CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLBlockDefCSImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLBlockDefCS()
	 * @generated
	 */
	int ECL_BLOCK_DEF_CS = 12;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__CSI = ECL_DEF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__PARENT = ECL_DEF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__PIVOT = ECL_DEF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__ORIGINAL_XMI_ID = ECL_DEF_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__OWNED_ANNOTATIONS = ECL_DEF_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__NAME = ECL_DEF_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__IS_OPTIONAL = ECL_DEF_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__OWNED_TYPE = ECL_DEF_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__QUALIFIERS = ECL_DEF_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__IS_STATIC = ECL_DEF_CS__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Owned Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__OWNED_SPECIFICATION = ECL_DEF_CS__OWNED_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owning Classifier Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__OWNING_CLASSIFIER_CONTEXT_DECL = ECL_DEF_CS__OWNING_CLASSIFIER_CONTEXT_DECL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__CONDITION = ECL_DEF_CS__CONDITION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__VISIBILITY = ECL_DEF_CS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Enter When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__ENTER_WHEN = ECL_DEF_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leave When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS__LEAVE_WHEN = ECL_DEF_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECL Block Def CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BLOCK_DEF_CS_FEATURE_COUNT = ECL_DEF_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind <em>Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventKind()
	 * @generated
	 */
	int EVENT_KIND = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind <em>Feed Back Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getFeedBackKind()
	 * @generated
	 */
	int FEED_BACK_KIND = 15;

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType#getName()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType#getReferedElement <em>Refered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refered Element</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType#getReferedElement()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_ReferedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback <em>DSA Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSA Feedback</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback
	 * @generated
	 */
	EClass getDSAFeedback();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getCases()
	 * @see #getDSAFeedback()
	 * @generated
	 */
	EReference getDSAFeedback_Cases();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getOwner()
	 * @see #getDSAFeedback()
	 * @generated
	 */
	EReference getDSAFeedback_Owner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getCondition()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getEventToForce <em>Event To Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Force</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getEventToForce()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_EventToForce();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getOn()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_On();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getKindOfFeedback <em>Kind Of Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Feedback</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getKindOfFeedback()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_KindOfFeedback();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument <em>ECL Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECL Document</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument
	 * @generated
	 */
	EClass getECLDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument#getImports()
	 * @see #getECLDocument()
	 * @generated
	 */
	EReference getECLDocument_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp <em>Event Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Literal Exp</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp
	 * @generated
	 */
	EClass getEventLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventLiteralExp#getValue()
	 * @see #getEventLiteralExp()
	 * @generated
	 */
	EAttribute getEventLiteralExp_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation <em>ECL Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECL Relation</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation
	 * @generated
	 */
	EClass getECLRelation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#getType()
	 * @see #getECLRelation()
	 * @generated
	 */
	EReference getECLRelation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#getParameters()
	 * @see #getECLRelation()
	 * @generated
	 */
	EReference getECLRelation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#isIsAnAssertion <em>Is An Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is An Assertion</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation#isIsAnAssertion()
	 * @see #getECLRelation()
	 * @generated
	 */
	EAttribute getECLRelation_IsAnAssertion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statement</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement#getImportURI()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression <em>ECL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECL Expression</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression
	 * @generated
	 */
	EClass getECLExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression#getType()
	 * @see #getECLExpression()
	 * @generated
	 */
	EReference getECLExpression_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression#getParameters()
	 * @see #getECLExpression()
	 * @generated
	 */
	EReference getECLExpression_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS <em>ECL Def CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECL Def CS</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS
	 * @generated
	 */
	EClass getECLDefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS#getCondition()
	 * @see #getECLDefCS()
	 * @generated
	 */
	EReference getECLDefCS_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDefCS#getVisibility()
	 * @see #getECLDefCS()
	 * @generated
	 */
	EAttribute getECLDefCS_Visibility();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor <em>Base CS Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base CS Visitor</em>'.
	 * @see org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor
	 * @model instanceClass="org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor" typeParameters="R"
	 * @generated
	 */
	EClass getBaseCSVisitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Type</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType
	 * @generated
	 */
	EClass getBlockType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType#getName()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS <em>ECL Event Def CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECL Event Def CS</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS
	 * @generated
	 */
	EClass getECLEventDefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getFeedback()
	 * @see #getECLEventDefCS()
	 * @generated
	 */
	EReference getECLEventDefCS_Feedback();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getFuture <em>Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Future</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getFuture()
	 * @see #getECLEventDefCS()
	 * @generated
	 */
	EReference getECLEventDefCS_Future();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getDsaResultName <em>Dsa Result Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dsa Result Name</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLEventDefCS#getDsaResultName()
	 * @see #getECLEventDefCS()
	 * @generated
	 */
	EAttribute getECLEventDefCS_DsaResultName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS <em>ECL Block Def CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECL Block Def CS</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS
	 * @generated
	 */
	EClass getECLBlockDefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS#getEnterWhen <em>Enter When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enter When</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS#getEnterWhen()
	 * @see #getECLBlockDefCS()
	 * @generated
	 */
	EReference getECLBlockDefCS_EnterWhen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS#getLeaveWhen <em>Leave When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leave When</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLBlockDefCS#getLeaveWhen()
	 * @see #getECLBlockDefCS()
	 * @generated
	 */
	EReference getECLBlockDefCS_LeaveWhen();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Kind</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind
	 * @generated
	 */
	EEnum getEventKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind <em>Feed Back Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feed Back Kind</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind
	 * @generated
	 */
	EEnum getFeedBackKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MoCCMLmappingFactory getMoCCMLmappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventTypeImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__NAME = eINSTANCE.getEventType_Name();

		/**
		 * The meta object literal for the '<em><b>Refered Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__REFERED_ELEMENT = eINSTANCE.getEventType_ReferedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl <em>DSA Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getDSAFeedback()
		 * @generated
		 */
		EClass DSA_FEEDBACK = eINSTANCE.getDSAFeedback();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSA_FEEDBACK__CASES = eINSTANCE.getDSAFeedback_Cases();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSA_FEEDBACK__OWNER = eINSTANCE.getDSAFeedback_Owner();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CONDITION = eINSTANCE.getCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Event To Force</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__EVENT_TO_FORCE = eINSTANCE.getCase_EventToForce();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ON = eINSTANCE.getCase_On();

		/**
		 * The meta object literal for the '<em><b>Kind Of Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__KIND_OF_FEEDBACK = eINSTANCE.getCase_KindOfFeedback();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLDocumentImpl <em>ECL Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLDocumentImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLDocument()
		 * @generated
		 */
		EClass ECL_DOCUMENT = eINSTANCE.getECLDocument();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_DOCUMENT__IMPORTS = eINSTANCE.getECLDocument_Imports();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventLiteralExpImpl <em>Event Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventLiteralExpImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventLiteralExp()
		 * @generated
		 */
		EClass EVENT_LITERAL_EXP = eINSTANCE.getEventLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LITERAL_EXP__VALUE = eINSTANCE.getEventLiteralExp_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLRelationImpl <em>ECL Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLRelationImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLRelation()
		 * @generated
		 */
		EClass ECL_RELATION = eINSTANCE.getECLRelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_RELATION__TYPE = eINSTANCE.getECLRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_RELATION__PARAMETERS = eINSTANCE.getECLRelation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is An Assertion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_RELATION__IS_AN_ASSERTION = eINSTANCE.getECLRelation_IsAnAssertion();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ImportStatementImpl <em>Import Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ImportStatementImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getImportStatement()
		 * @generated
		 */
		EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__IMPORT_URI = eINSTANCE.getImportStatement_ImportURI();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLExpressionImpl <em>ECL Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLExpressionImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLExpression()
		 * @generated
		 */
		EClass ECL_EXPRESSION = eINSTANCE.getECLExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_EXPRESSION__TYPE = eINSTANCE.getECLExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_EXPRESSION__PARAMETERS = eINSTANCE.getECLExpression_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLDefCSImpl <em>ECL Def CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLDefCSImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLDefCS()
		 * @generated
		 */
		EClass ECL_DEF_CS = eINSTANCE.getECLDefCS();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_DEF_CS__CONDITION = eINSTANCE.getECLDefCS_Condition();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_DEF_CS__VISIBILITY = eINSTANCE.getECLDefCS_Visibility();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor <em>Base CS Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getBaseCSVisitor()
		 * @generated
		 */
		EClass BASE_CS_VISITOR = eINSTANCE.getBaseCSVisitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.BlockTypeImpl <em>Block Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.BlockTypeImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getBlockType()
		 * @generated
		 */
		EClass BLOCK_TYPE = eINSTANCE.getBlockType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_TYPE__NAME = eINSTANCE.getBlockType_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLEventDefCSImpl <em>ECL Event Def CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLEventDefCSImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLEventDefCS()
		 * @generated
		 */
		EClass ECL_EVENT_DEF_CS = eINSTANCE.getECLEventDefCS();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_EVENT_DEF_CS__FEEDBACK = eINSTANCE.getECLEventDefCS_Feedback();

		/**
		 * The meta object literal for the '<em><b>Future</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_EVENT_DEF_CS__FUTURE = eINSTANCE.getECLEventDefCS_Future();

		/**
		 * The meta object literal for the '<em><b>Dsa Result Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_EVENT_DEF_CS__DSA_RESULT_NAME = eINSTANCE.getECLEventDefCS_DsaResultName();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLBlockDefCSImpl <em>ECL Block Def CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ECLBlockDefCSImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getECLBlockDefCS()
		 * @generated
		 */
		EClass ECL_BLOCK_DEF_CS = eINSTANCE.getECLBlockDefCS();

		/**
		 * The meta object literal for the '<em><b>Enter When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_BLOCK_DEF_CS__ENTER_WHEN = eINSTANCE.getECLBlockDefCS_EnterWhen();

		/**
		 * The meta object literal for the '<em><b>Leave When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECL_BLOCK_DEF_CS__LEAVE_WHEN = eINSTANCE.getECLBlockDefCS_LeaveWhen();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind <em>Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventKind()
		 * @generated
		 */
		EEnum EVENT_KIND = eINSTANCE.getEventKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind <em>Feed Back Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getFeedBackKind()
		 * @generated
		 */
		EEnum FEED_BACK_KIND = eINSTANCE.getFeedBackKind();

	}

} //MoCCMLmappingPackage
