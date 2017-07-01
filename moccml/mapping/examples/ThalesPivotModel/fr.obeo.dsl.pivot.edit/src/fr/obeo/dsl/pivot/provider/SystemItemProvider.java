/**
 */
package fr.obeo.dsl.pivot.provider;


import fr.obeo.dsl.pivot.PivotFactory;
import fr.obeo.dsl.pivot.PivotPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.obeo.dsl.pivot.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider
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
	public SystemItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PivotPackage.Literals.SYSTEM__HW_RESOURCES);
			childrenFeatures.add(PivotPackage.Literals.SYSTEM__BUS);
			childrenFeatures.add(PivotPackage.Literals.SYSTEM__SOURCES);
			childrenFeatures.add(PivotPackage.Literals.SYSTEM__SINKS);
			childrenFeatures.add(PivotPackage.Literals.SYSTEM__FRAGMENTS);
			childrenFeatures.add(PivotPackage.Literals.SYSTEM__CHAINS);
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
	 * This returns System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((fr.obeo.dsl.pivot.System)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_System_type") :
			getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(fr.obeo.dsl.pivot.System.class)) {
			case PivotPackage.SYSTEM__HW_RESOURCES:
			case PivotPackage.SYSTEM__BUS:
			case PivotPackage.SYSTEM__SOURCES:
			case PivotPackage.SYSTEM__SINKS:
			case PivotPackage.SYSTEM__FRAGMENTS:
			case PivotPackage.SYSTEM__CHAINS:
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
				(PivotPackage.Literals.SYSTEM__HW_RESOURCES,
				 PivotFactory.eINSTANCE.createHwResource()));

		newChildDescriptors.add
			(createChildParameter
				(PivotPackage.Literals.SYSTEM__BUS,
				 PivotFactory.eINSTANCE.createBusComm()));

		newChildDescriptors.add
			(createChildParameter
				(PivotPackage.Literals.SYSTEM__SOURCES,
				 PivotFactory.eINSTANCE.createSource()));

		newChildDescriptors.add
			(createChildParameter
				(PivotPackage.Literals.SYSTEM__SINKS,
				 PivotFactory.eINSTANCE.createSink()));

		newChildDescriptors.add
			(createChildParameter
				(PivotPackage.Literals.SYSTEM__FRAGMENTS,
				 PivotFactory.eINSTANCE.createFragment()));

		newChildDescriptors.add
			(createChildParameter
				(PivotPackage.Literals.SYSTEM__CHAINS,
				 PivotFactory.eINSTANCE.createChain()));
	}

}
