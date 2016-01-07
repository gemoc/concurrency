/**
 */
package org.gemoc.execution.ccsljava.concurrent_mse;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.gemoc.executionframework.engine.mse.Engine_msePackage;

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
 * @see org.gemoc.execution.ccsljava.concurrent_mse.Concurrent_mseFactory
 * @model kind="package"
 * @generated
 */
public interface Concurrent_msePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concurrent_mse";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/gemoc_execution_engine_concurrent_mse";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concurrent_mse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Concurrent_msePackage eINSTANCE = org.gemoc.execution.ccsljava.concurrent_mse.impl.Concurrent_msePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.execution.ccsljava.concurrent_mse.impl.FeedbackMSEImpl <em>Feedback MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.execution.ccsljava.concurrent_mse.impl.FeedbackMSEImpl
	 * @see org.gemoc.execution.ccsljava.concurrent_mse.impl.Concurrent_msePackageImpl#getFeedbackMSE()
	 * @generated
	 */
	int FEEDBACK_MSE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MSE__EANNOTATIONS = Engine_msePackage.MSE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MSE__NAME = Engine_msePackage.MSE__NAME;

	/**
	 * The feature id for the '<em><b>Feedback Model Specific Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MSE__FEEDBACK_MODEL_SPECIFIC_EVENT = Engine_msePackage.MSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feedback MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MSE_FEATURE_COUNT = Engine_msePackage.MSE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MSE___GET_EANNOTATION__STRING = Engine_msePackage.MSE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MSE___GET_CALLER = Engine_msePackage.MSE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MSE___GET_ACTION = Engine_msePackage.MSE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feedback MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MSE_OPERATION_COUNT = Engine_msePackage.MSE_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.gemoc.execution.ccsljava.concurrent_mse.FeedbackMSE <em>Feedback MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback MSE</em>'.
	 * @see org.gemoc.execution.ccsljava.concurrent_mse.FeedbackMSE
	 * @generated
	 */
	EClass getFeedbackMSE();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.execution.ccsljava.concurrent_mse.FeedbackMSE#getFeedbackModelSpecificEvent <em>Feedback Model Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feedback Model Specific Event</em>'.
	 * @see org.gemoc.execution.ccsljava.concurrent_mse.FeedbackMSE#getFeedbackModelSpecificEvent()
	 * @see #getFeedbackMSE()
	 * @generated
	 */
	EReference getFeedbackMSE_FeedbackModelSpecificEvent();

	/**
	 * Returns the meta object for the '{@link org.gemoc.execution.ccsljava.concurrent_mse.FeedbackMSE#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see org.gemoc.execution.ccsljava.concurrent_mse.FeedbackMSE#getCaller()
	 * @generated
	 */
	EOperation getFeedbackMSE__GetCaller();

	/**
	 * Returns the meta object for the '{@link org.gemoc.execution.ccsljava.concurrent_mse.FeedbackMSE#getAction() <em>Get Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Action</em>' operation.
	 * @see org.gemoc.execution.ccsljava.concurrent_mse.FeedbackMSE#getAction()
	 * @generated
	 */
	EOperation getFeedbackMSE__GetAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Concurrent_mseFactory getConcurrent_mseFactory();

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
		 * The meta object literal for the '{@link org.gemoc.execution.ccsljava.concurrent_mse.impl.FeedbackMSEImpl <em>Feedback MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.execution.ccsljava.concurrent_mse.impl.FeedbackMSEImpl
		 * @see org.gemoc.execution.ccsljava.concurrent_mse.impl.Concurrent_msePackageImpl#getFeedbackMSE()
		 * @generated
		 */
		EClass FEEDBACK_MSE = eINSTANCE.getFeedbackMSE();

		/**
		 * The meta object literal for the '<em><b>Feedback Model Specific Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_MSE__FEEDBACK_MODEL_SPECIFIC_EVENT = eINSTANCE.getFeedbackMSE_FeedbackModelSpecificEvent();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK_MSE___GET_CALLER = eINSTANCE.getFeedbackMSE__GetCaller();

		/**
		 * The meta object literal for the '<em><b>Get Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK_MSE___GET_ACTION = eINSTANCE.getFeedbackMSE__GetAction();

	}

} //Concurrent_msePackage
