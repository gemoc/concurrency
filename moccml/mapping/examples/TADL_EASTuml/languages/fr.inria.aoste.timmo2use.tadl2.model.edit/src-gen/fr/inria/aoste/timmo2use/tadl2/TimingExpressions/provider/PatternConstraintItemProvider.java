/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.provider;


import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint;
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
 * This is the item provider adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.PatternConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternConstraintItemProvider
	extends TimingConstraintItemProvider
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
	public PatternConstraintItemProvider(AdapterFactory adapterFactory) {
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

			addRefPropertyDescriptor(object);
			addEventPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PatternConstraint_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PatternConstraint_ref_feature", "_UI_PatternConstraint_type"),
				 TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PatternConstraint_event_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PatternConstraint_event_feature", "_UI_PatternConstraint_type"),
				 TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__EVENT,
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
			childrenFeatures.add(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__OFFSET);
			childrenFeatures.add(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__JITTER);
			childrenFeatures.add(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__MINIMUM);
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
	 * This returns PatternConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PatternConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PatternConstraint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PatternConstraint_type") :
			getString("_UI_PatternConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(PatternConstraint.class)) {
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__OFFSET:
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__JITTER:
			case TimingExpressionsPackage.PATTERN_CONSTRAINT__MINIMUM:
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
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__OFFSET,
				 TimingExpressionsFactory.eINSTANCE.createSymbolicTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__OFFSET,
				 TimingExpressionsFactory.eINSTANCE.createVariableTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__OFFSET,
				 TimingExpressionsFactory.eINSTANCE.createValueTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__JITTER,
				 TimingExpressionsFactory.eINSTANCE.createSymbolicTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__JITTER,
				 TimingExpressionsFactory.eINSTANCE.createVariableTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__JITTER,
				 TimingExpressionsFactory.eINSTANCE.createValueTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__MINIMUM,
				 TimingExpressionsFactory.eINSTANCE.createSymbolicTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__MINIMUM,
				 TimingExpressionsFactory.eINSTANCE.createVariableTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__MINIMUM,
				 TimingExpressionsFactory.eINSTANCE.createValueTimingExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__OFFSET ||
			childFeature == TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__JITTER ||
			childFeature == TimingExpressionsPackage.Literals.PATTERN_CONSTRAINT__MINIMUM;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
