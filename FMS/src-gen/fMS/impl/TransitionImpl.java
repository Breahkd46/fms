/**
 */
package fMS.impl;

import fMS.FMSPackage;
import fMS.State;
import fMS.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fMS.impl.TransitionImpl#getStateStart <em>State Start</em>}</li>
 *   <li>{@link fMS.impl.TransitionImpl#getStateEnd <em>State End</em>}</li>
 *   <li>{@link fMS.impl.TransitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getStateStart() <em>State Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateStart()
	 * @generated
	 * @ordered
	 */
	protected State stateStart;

	/**
	 * The cached value of the '{@link #getStateEnd() <em>State End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateEnd()
	 * @generated
	 * @ordered
	 */
	protected State stateEnd;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FMSPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateStart() {
		if (stateStart != null && stateStart.eIsProxy()) {
			InternalEObject oldStateStart = (InternalEObject) stateStart;
			stateStart = (State) eResolveProxy(oldStateStart);
			if (stateStart != oldStateStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMSPackage.TRANSITION__STATE_START,
							oldStateStart, stateStart));
			}
		}
		return stateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateStart() {
		return stateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateStart(State newStateStart) {
		State oldStateStart = stateStart;
		stateStart = newStateStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FMSPackage.TRANSITION__STATE_START, oldStateStart,
					stateStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateEnd() {
		if (stateEnd != null && stateEnd.eIsProxy()) {
			InternalEObject oldStateEnd = (InternalEObject) stateEnd;
			stateEnd = (State) eResolveProxy(oldStateEnd);
			if (stateEnd != oldStateEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMSPackage.TRANSITION__STATE_END,
							oldStateEnd, stateEnd));
			}
		}
		return stateEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateEnd() {
		return stateEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateEnd(State newStateEnd) {
		State oldStateEnd = stateEnd;
		stateEnd = newStateEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FMSPackage.TRANSITION__STATE_END, oldStateEnd,
					stateEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FMSPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FMSPackage.TRANSITION__STATE_START:
			if (resolve)
				return getStateStart();
			return basicGetStateStart();
		case FMSPackage.TRANSITION__STATE_END:
			if (resolve)
				return getStateEnd();
			return basicGetStateEnd();
		case FMSPackage.TRANSITION__NAME:
			return getName();
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
		case FMSPackage.TRANSITION__STATE_START:
			setStateStart((State) newValue);
			return;
		case FMSPackage.TRANSITION__STATE_END:
			setStateEnd((State) newValue);
			return;
		case FMSPackage.TRANSITION__NAME:
			setName((String) newValue);
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
		case FMSPackage.TRANSITION__STATE_START:
			setStateStart((State) null);
			return;
		case FMSPackage.TRANSITION__STATE_END:
			setStateEnd((State) null);
			return;
		case FMSPackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
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
		case FMSPackage.TRANSITION__STATE_START:
			return stateStart != null;
		case FMSPackage.TRANSITION__STATE_END:
			return stateEnd != null;
		case FMSPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
