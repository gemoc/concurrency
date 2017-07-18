/**
 */
package fr.obeo.dsl.pivot.provider;

import fr.obeo.dsl.pivot.util.PivotAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PivotItemProviderAdapterFactory extends PivotAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public PivotItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.Source} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceItemProvider sourceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceAdapter() {
		if (sourceItemProvider == null) {
			sourceItemProvider = new SourceItemProvider(this);
		}

		return sourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.Sink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkItemProvider sinkItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.Sink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinkAdapter() {
		if (sinkItemProvider == null) {
			sinkItemProvider = new SinkItemProvider(this);
		}

		return sinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.HwResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwResourceItemProvider hwResourceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.HwResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHwResourceAdapter() {
		if (hwResourceItemProvider == null) {
			hwResourceItemProvider = new HwResourceItemProvider(this);
		}

		return hwResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.Chain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainItemProvider chainItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.Chain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChainAdapter() {
		if (chainItemProvider == null) {
			chainItemProvider = new ChainItemProvider(this);
		}

		return chainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.Fragment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentItemProvider fragmentItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.Fragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFragmentAdapter() {
		if (fragmentItemProvider == null) {
			fragmentItemProvider = new FragmentItemProvider(this);
		}

		return fragmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.BusComm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusCommItemProvider busCommItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.BusComm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusCommAdapter() {
		if (busCommItemProvider == null) {
			busCommItemProvider = new BusCommItemProvider(this);
		}

		return busCommItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.Jitter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JitterItemProvider jitterItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.Jitter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJitterAdapter() {
		if (jitterItemProvider == null) {
			jitterItemProvider = new JitterItemProvider(this);
		}

		return jitterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.pivot.SwSchedulableResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwSchedulableResourceItemProvider swSchedulableResourceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.pivot.SwSchedulableResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwSchedulableResourceAdapter() {
		if (swSchedulableResourceItemProvider == null) {
			swSchedulableResourceItemProvider = new SwSchedulableResourceItemProvider(this);
		}

		return swSchedulableResourceItemProvider;
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
		if (sourceItemProvider != null) sourceItemProvider.dispose();
		if (sinkItemProvider != null) sinkItemProvider.dispose();
		if (hwResourceItemProvider != null) hwResourceItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (chainItemProvider != null) chainItemProvider.dispose();
		if (fragmentItemProvider != null) fragmentItemProvider.dispose();
		if (busCommItemProvider != null) busCommItemProvider.dispose();
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (jitterItemProvider != null) jitterItemProvider.dispose();
		if (swSchedulableResourceItemProvider != null) swSchedulableResourceItemProvider.dispose();
	}

}