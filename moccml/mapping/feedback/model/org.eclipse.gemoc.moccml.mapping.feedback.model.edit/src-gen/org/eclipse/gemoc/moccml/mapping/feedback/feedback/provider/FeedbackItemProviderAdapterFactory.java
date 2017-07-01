/**
 */
package org.eclipse.gemoc.moccml.mapping.feedback.feedback.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.util.FeedbackAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackItemProviderAdapterFactory extends FeedbackAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.When} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenItemProvider whenItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhenAdapter() {
		if (whenItemProvider == null) {
			whenItemProvider = new WhenItemProvider(this);
		}

		return whenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForceItemProvider forceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.Force}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForceAdapter() {
		if (forceItemProvider == null) {
			forceItemProvider = new ForceItemProvider(this);
		}

		return forceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionFinishedCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionFinishedConditionItemProvider actionFinishedConditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionFinishedCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionFinishedConditionAdapter() {
		if (actionFinishedConditionItemProvider == null) {
			actionFinishedConditionItemProvider = new ActionFinishedConditionItemProvider(this);
		}

		return actionFinishedConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportStatementItemProvider importStatementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportStatementAdapter() {
		if (importStatementItemProvider == null) {
			importStatementItemProvider = new ImportStatementItemProvider(this);
		}

		return importStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSpecificEventItemProvider modelSpecificEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelSpecificEventAdapter() {
		if (modelSpecificEventItemProvider == null) {
			modelSpecificEventItemProvider = new ModelSpecificEventItemProvider(this);
		}

		return modelSpecificEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionResultConditionItemProvider actionResultConditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionResultCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionResultConditionAdapter() {
		if (actionResultConditionItemProvider == null) {
			actionResultConditionItemProvider = new ActionResultConditionItemProvider(this);
		}

		return actionResultConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionModelItemProvider actionModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionModelAdapter() {
		if (actionModelItemProvider == null) {
			actionModelItemProvider = new ActionModelItemProvider(this);
		}

		return actionModelItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (whenItemProvider != null) whenItemProvider.dispose();
		if (forceItemProvider != null) forceItemProvider.dispose();
		if (actionFinishedConditionItemProvider != null) actionFinishedConditionItemProvider.dispose();
		if (importStatementItemProvider != null) importStatementItemProvider.dispose();
		if (modelSpecificEventItemProvider != null) modelSpecificEventItemProvider.dispose();
		if (actionResultConditionItemProvider != null) actionResultConditionItemProvider.dispose();
		if (actionModelItemProvider != null) actionModelItemProvider.dispose();
	}

}
