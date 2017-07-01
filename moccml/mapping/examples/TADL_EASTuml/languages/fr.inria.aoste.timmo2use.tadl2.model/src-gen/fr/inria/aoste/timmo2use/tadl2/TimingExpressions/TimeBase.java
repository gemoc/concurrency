/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getPrecisionUnit <em>Precision Unit</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getPrecisionFactor <em>Precision Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTimeBase()
 * @model extendedMetaData="name='units'"
 * @generated
 */
public interface TimeBase extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Dimension)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTimeBase_Type()
	 * @model required="true"
	 *        extendedMetaData="name='units'"
	 * @generated
	 */
	Dimension getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Dimension value);

	/**
	 * Returns the value of the '<em><b>Precision Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Unit</em>' reference.
	 * @see #setPrecisionUnit(Unit)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTimeBase_PrecisionUnit()
	 * @model extendedMetaData="name='units'"
	 * @generated
	 */
	Unit getPrecisionUnit();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getPrecisionUnit <em>Precision Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Unit</em>' reference.
	 * @see #getPrecisionUnit()
	 * @generated
	 */
	void setPrecisionUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Precision Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Factor</em>' attribute.
	 * @see #setPrecisionFactor(double)
	 * @see fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage#getTimeBase_PrecisionFactor()
	 * @model extendedMetaData="name='units'"
	 * @generated
	 */
	double getPrecisionFactor();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase#getPrecisionFactor <em>Precision Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Factor</em>' attribute.
	 * @see #getPrecisionFactor()
	 * @generated
	 */
	void setPrecisionFactor(double value);

} // TimeBase
