/**
 */
package fr.obeo.dsl.pivot.impl;

import fr.obeo.dsl.pivot.Fragment;
import fr.obeo.dsl.pivot.PivotPackage;
import fr.obeo.dsl.pivot.Sink;
import fr.obeo.dsl.pivot.Source;
import fr.obeo.dsl.pivot.Task;

import fr.obeo.dsl.pivot.datatype.Interval;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.pivot.impl.FragmentImpl#getTime <em>Time</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.FragmentImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.FragmentImpl#isCriticalSection <em>Critical Section</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.FragmentImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.FragmentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.FragmentImpl#getPreviousFragment <em>Previous Fragment</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.FragmentImpl#getNextFragments <em>Next Fragments</em>}</li>
 *   <li>{@link fr.obeo.dsl.pivot.impl.FragmentImpl#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragmentImpl extends NamedElementImpl implements Fragment {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Interval TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Interval time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isCriticalSection() <em>Critical Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCriticalSection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_SECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCriticalSection() <em>Critical Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCriticalSection()
	 * @generated
	 * @ordered
	 */
	protected boolean criticalSection = CRITICAL_SECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected Sink sink;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * The cached value of the '{@link #getPreviousFragment() <em>Previous Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousFragment()
	 * @generated
	 * @ordered
	 */
	protected Fragment previousFragment;

	/**
	 * The cached value of the '{@link #getNextFragments() <em>Next Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<Fragment> nextFragments;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Interval newTime) {
		Interval oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCriticalSection() {
		return criticalSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalSection(boolean newCriticalSection) {
		boolean oldCriticalSection = criticalSection;
		criticalSection = newCriticalSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__CRITICAL_SECTION, oldCriticalSection, criticalSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink getSink() {
		if (sink != null && sink.eIsProxy()) {
			InternalEObject oldSink = (InternalEObject)sink;
			sink = (Sink)eResolveProxy(oldSink);
			if (sink != oldSink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.FRAGMENT__SINK, oldSink, sink));
			}
		}
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink basicGetSink() {
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSink(Sink newSink, NotificationChain msgs) {
		Sink oldSink = sink;
		sink = newSink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__SINK, oldSink, newSink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSink(Sink newSink) {
		if (newSink != sink) {
			NotificationChain msgs = null;
			if (sink != null)
				msgs = ((InternalEObject)sink).eInverseRemove(this, PivotPackage.SINK__FRAGMENT, Sink.class, msgs);
			if (newSink != null)
				msgs = ((InternalEObject)newSink).eInverseAdd(this, PivotPackage.SINK__FRAGMENT, Sink.class, msgs);
			msgs = basicSetSink(newSink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__SINK, newSink, newSink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Source)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.FRAGMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, PivotPackage.SOURCE__FRAGMENT, Source.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, PivotPackage.SOURCE__FRAGMENT, Source.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getPreviousFragment() {
		if (previousFragment != null && previousFragment.eIsProxy()) {
			InternalEObject oldPreviousFragment = (InternalEObject)previousFragment;
			previousFragment = (Fragment)eResolveProxy(oldPreviousFragment);
			if (previousFragment != oldPreviousFragment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT, oldPreviousFragment, previousFragment));
			}
		}
		return previousFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetPreviousFragment() {
		return previousFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousFragment(Fragment newPreviousFragment, NotificationChain msgs) {
		Fragment oldPreviousFragment = previousFragment;
		previousFragment = newPreviousFragment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT, oldPreviousFragment, newPreviousFragment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousFragment(Fragment newPreviousFragment) {
		if (newPreviousFragment != previousFragment) {
			NotificationChain msgs = null;
			if (previousFragment != null)
				msgs = ((InternalEObject)previousFragment).eInverseRemove(this, PivotPackage.FRAGMENT__NEXT_FRAGMENTS, Fragment.class, msgs);
			if (newPreviousFragment != null)
				msgs = ((InternalEObject)newPreviousFragment).eInverseAdd(this, PivotPackage.FRAGMENT__NEXT_FRAGMENTS, Fragment.class, msgs);
			msgs = basicSetPreviousFragment(newPreviousFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT, newPreviousFragment, newPreviousFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fragment> getNextFragments() {
		if (nextFragments == null) {
			nextFragments = new EObjectWithInverseResolvingEList<Fragment>(Fragment.class, this, PivotPackage.FRAGMENT__NEXT_FRAGMENTS, PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT);
		}
		return nextFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.FRAGMENT__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, PivotPackage.TASK__FRAGMENTS, Task.class, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, PivotPackage.TASK__FRAGMENTS, Task.class, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.FRAGMENT__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PivotPackage.FRAGMENT__SINK:
				if (sink != null)
					msgs = ((InternalEObject)sink).eInverseRemove(this, PivotPackage.SINK__FRAGMENT, Sink.class, msgs);
				return basicSetSink((Sink)otherEnd, msgs);
			case PivotPackage.FRAGMENT__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, PivotPackage.SOURCE__FRAGMENT, Source.class, msgs);
				return basicSetSource((Source)otherEnd, msgs);
			case PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT:
				if (previousFragment != null)
					msgs = ((InternalEObject)previousFragment).eInverseRemove(this, PivotPackage.FRAGMENT__NEXT_FRAGMENTS, Fragment.class, msgs);
				return basicSetPreviousFragment((Fragment)otherEnd, msgs);
			case PivotPackage.FRAGMENT__NEXT_FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextFragments()).basicAdd(otherEnd, msgs);
			case PivotPackage.FRAGMENT__TASK:
				if (task != null)
					msgs = ((InternalEObject)task).eInverseRemove(this, PivotPackage.TASK__FRAGMENTS, Task.class, msgs);
				return basicSetTask((Task)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PivotPackage.FRAGMENT__SINK:
				return basicSetSink(null, msgs);
			case PivotPackage.FRAGMENT__SOURCE:
				return basicSetSource(null, msgs);
			case PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT:
				return basicSetPreviousFragment(null, msgs);
			case PivotPackage.FRAGMENT__NEXT_FRAGMENTS:
				return ((InternalEList<?>)getNextFragments()).basicRemove(otherEnd, msgs);
			case PivotPackage.FRAGMENT__TASK:
				return basicSetTask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotPackage.FRAGMENT__TIME:
				return getTime();
			case PivotPackage.FRAGMENT__INDEX:
				return getIndex();
			case PivotPackage.FRAGMENT__CRITICAL_SECTION:
				return isCriticalSection();
			case PivotPackage.FRAGMENT__SINK:
				if (resolve) return getSink();
				return basicGetSink();
			case PivotPackage.FRAGMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT:
				if (resolve) return getPreviousFragment();
				return basicGetPreviousFragment();
			case PivotPackage.FRAGMENT__NEXT_FRAGMENTS:
				return getNextFragments();
			case PivotPackage.FRAGMENT__TASK:
				if (resolve) return getTask();
				return basicGetTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PivotPackage.FRAGMENT__TIME:
				setTime((Interval)newValue);
				return;
			case PivotPackage.FRAGMENT__INDEX:
				setIndex((Integer)newValue);
				return;
			case PivotPackage.FRAGMENT__CRITICAL_SECTION:
				setCriticalSection((Boolean)newValue);
				return;
			case PivotPackage.FRAGMENT__SINK:
				setSink((Sink)newValue);
				return;
			case PivotPackage.FRAGMENT__SOURCE:
				setSource((Source)newValue);
				return;
			case PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT:
				setPreviousFragment((Fragment)newValue);
				return;
			case PivotPackage.FRAGMENT__NEXT_FRAGMENTS:
				getNextFragments().clear();
				getNextFragments().addAll((Collection<? extends Fragment>)newValue);
				return;
			case PivotPackage.FRAGMENT__TASK:
				setTask((Task)newValue);
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
			case PivotPackage.FRAGMENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case PivotPackage.FRAGMENT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case PivotPackage.FRAGMENT__CRITICAL_SECTION:
				setCriticalSection(CRITICAL_SECTION_EDEFAULT);
				return;
			case PivotPackage.FRAGMENT__SINK:
				setSink((Sink)null);
				return;
			case PivotPackage.FRAGMENT__SOURCE:
				setSource((Source)null);
				return;
			case PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT:
				setPreviousFragment((Fragment)null);
				return;
			case PivotPackage.FRAGMENT__NEXT_FRAGMENTS:
				getNextFragments().clear();
				return;
			case PivotPackage.FRAGMENT__TASK:
				setTask((Task)null);
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
			case PivotPackage.FRAGMENT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case PivotPackage.FRAGMENT__INDEX:
				return index != INDEX_EDEFAULT;
			case PivotPackage.FRAGMENT__CRITICAL_SECTION:
				return criticalSection != CRITICAL_SECTION_EDEFAULT;
			case PivotPackage.FRAGMENT__SINK:
				return sink != null;
			case PivotPackage.FRAGMENT__SOURCE:
				return source != null;
			case PivotPackage.FRAGMENT__PREVIOUS_FRAGMENT:
				return previousFragment != null;
			case PivotPackage.FRAGMENT__NEXT_FRAGMENTS:
				return nextFragments != null && !nextFragments.isEmpty();
			case PivotPackage.FRAGMENT__TASK:
				return task != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", index: ");
		result.append(index);
		result.append(", criticalSection: ");
		result.append(criticalSection);
		result.append(')');
		return result.toString();
	}

} //FragmentImpl
