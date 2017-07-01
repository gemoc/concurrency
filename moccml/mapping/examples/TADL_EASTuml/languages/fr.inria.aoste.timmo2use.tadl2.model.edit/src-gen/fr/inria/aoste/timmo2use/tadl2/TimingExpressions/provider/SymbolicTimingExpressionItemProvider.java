/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.provider;


import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsFactory;
import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.TimingExpressionsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.SymbolicTimingExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SymbolicTimingExpressionItemProvider
	extends TimingExpressionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicTimingExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SymbolicTimingExpression_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SymbolicTimingExpression_variable_feature", "_UI_SymbolicTimingExpression_type"),
				 TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SymbolicTimingExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SymbolicTimingExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SymbolicTimingExpression_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SymbolicTimingExpression.class)) {
			case TimingExpressionsPackage.SYMBOLIC_TIMING_EXPRESSION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createGreaterThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.SYMBOLIC_TIMING_EXPRESSION__OPERATOR,
				 TimingExpressionsFactory.eINSTANCE.createLessThanOrEqual()));
	}

}
