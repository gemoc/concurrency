/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Dimension;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimeBase;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Unit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseImpl#getPrecisionUnit <em>Precision Unit</em>}</li>
 *   <li>{@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.impl.TimeBaseImpl#getPrecisionFactor <em>Precision Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeBaseImpl extends NamedElementImpl implements TimeBase {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Dimension type;

	/**
	 * The cached value of the '{@link #getPrecisionUnit() <em>Precision Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit precisionUnit;

	/**
	 * The default value of the '{@link #getPrecisionFactor() <em>Precision Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECISION_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecisionFactor() <em>Precision Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionFactor()
	 * @generated
	 * @ordered
	 */
	protected double precisionFactor = PRECISION_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingExpressionsPackage.Literals.TIME_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Dimension)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingExpressionsPackage.TIME_BASE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Dimension newType) {
		Dimension oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.TIME_BASE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getPrecisionUnit() {
		if (precisionUnit != null && precisionUnit.eIsProxy()) {
			InternalEObject oldPrecisionUnit = (InternalEObject)precisionUnit;
			precisionUnit = (Unit)eResolveProxy(oldPrecisionUnit);
			if (precisionUnit != oldPrecisionUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingExpressionsPackage.TIME_BASE__PRECISION_UNIT, oldPrecisionUnit, precisionUnit));
			}
		}
		return precisionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetPrecisionUnit() {
		return precisionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionUnit(Unit newPrecisionUnit) {
		Unit oldPrecisionUnit = precisionUnit;
		precisionUnit = newPrecisionUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.TIME_BASE__PRECISION_UNIT, oldPrecisionUnit, precisionUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecisionFactor() {
		return precisionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionFactor(double newPrecisionFactor) {
		double oldPrecisionFactor = precisionFactor;
		precisionFactor = newPrecisionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingExpressionsPackage.TIME_BASE__PRECISION_FACTOR, oldPrecisionFactor, precisionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingExpressionsPackage.TIME_BASE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TimingExpressionsPackage.TIME_BASE__PRECISION_UNIT:
				if (resolve) return getPrecisionUnit();
				return basicGetPrecisionUnit();
			case TimingExpressionsPackage.TIME_BASE__PRECISION_FACTOR:
				return getPrecisionFactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingExpressionsPackage.TIME_BASE__TYPE:
				setType((Dimension)newValue);
				return;
			case TimingExpressionsPackage.TIME_BASE__PRECISION_UNIT:
				setPrecisionUnit((Unit)newValue);
				return;
			case TimingExpressionsPackage.TIME_BASE__PRECISION_FACTOR:
				setPrecisionFactor((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimingExpressionsPackage.TIME_BASE__TYPE:
				setType((Dimension)null);
				return;
			case TimingExpressionsPackage.TIME_BASE__PRECISION_UNIT:
				setPrecisionUnit((Unit)null);
				return;
			case TimingExpressionsPackage.TIME_BASE__PRECISION_FACTOR:
				setPrecisionFactor(PRECISION_FACTOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimingExpressionsPackage.TIME_BASE__TYPE:
				return type != null;
			case TimingExpressionsPackage.TIME_BASE__PRECISION_UNIT:
				return precisionUnit != null;
			case TimingExpressionsPackage.TIME_BASE__PRECISION_FACTOR:
				return precisionFactor != PRECISION_FACTOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (precisionFactor: ");
		result.append(precisionFactor);
		result.append(')');
		return result.toString();
	}

} //TimeBaseImpl
