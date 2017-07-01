/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.inria.aoste.timmo2use.tadl2.TimingExpressions.provider;


import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.timmo2use.tadl2.TimingExpressions.Timing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingItemProvider
	extends NamedElementItemProvider
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
	public TimingItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(TimingExpressionsPackage.Literals.TIMING__TIMING_EXPRESSIONS);
			childrenFeatures.add(TimingExpressionsPackage.Literals.TIMING__TIME_BASES);
			childrenFeatures.add(TimingExpressionsPackage.Literals.TIMING__DIMENSIONS);
			childrenFeatures.add(TimingExpressionsPackage.Literals.TIMING__TIME_BASE_RELATIONS);
			childrenFeatures.add(TimingExpressionsPackage.Literals.TIMING__EVENTS);
			childrenFeatures.add(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS);
			childrenFeatures.add(TimingExpressionsPackage.Literals.TIMING__EVENT_CHAINS);
			childrenFeatures.add(TimingExpressionsPackage.Literals.TIMING__IMPORT_STATEMENTS);
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
	 * This returns Timing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Timing"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Timing)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Timing_type") :
			getString("_UI_Timing_type") + " " + label;
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

		switch (notification.getFeatureID(Timing.class)) {
			case TimingExpressionsPackage.TIMING__TIMING_EXPRESSIONS:
			case TimingExpressionsPackage.TIMING__TIME_BASES:
			case TimingExpressionsPackage.TIMING__DIMENSIONS:
			case TimingExpressionsPackage.TIMING__TIME_BASE_RELATIONS:
			case TimingExpressionsPackage.TIMING__EVENTS:
			case TimingExpressionsPackage.TIMING__CONSTRAINTS:
			case TimingExpressionsPackage.TIMING__EVENT_CHAINS:
			case TimingExpressionsPackage.TIMING__IMPORT_STATEMENTS:
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
				(TimingExpressionsPackage.Literals.TIMING__TIMING_EXPRESSIONS,
				 TimingExpressionsFactory.eINSTANCE.createSymbolicTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__TIMING_EXPRESSIONS,
				 TimingExpressionsFactory.eINSTANCE.createVariableTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__TIMING_EXPRESSIONS,
				 TimingExpressionsFactory.eINSTANCE.createValueTimingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__TIME_BASES,
				 TimingExpressionsFactory.eINSTANCE.createTimeBase()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__DIMENSIONS,
				 TimingExpressionsFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__TIME_BASE_RELATIONS,
				 TimingExpressionsFactory.eINSTANCE.createTimeBaseRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__EVENTS,
				 TimingExpressionsFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createDelayConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createRepetitionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createSynchronizationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createOrderConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createPatternConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createSporadicConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createPeriodicConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createArbitraryConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createBurstConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createReactionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__CONSTRAINTS,
				 TimingExpressionsFactory.eINSTANCE.createAgeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__EVENT_CHAINS,
				 TimingExpressionsFactory.eINSTANCE.createEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(TimingExpressionsPackage.Literals.TIMING__IMPORT_STATEMENTS,
				 TimingExpressionsFactory.eINSTANCE.createImportStatement()));
	}

}
