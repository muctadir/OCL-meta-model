/**
 */
package ocl.exp.impl;

import ocl.exp.CallExp;
import ocl.exp.ExpPackage;
import ocl.exp.LoopExp;
import ocl.exp.NavigationCallExp;
import ocl.exp.OclExpression;
import ocl.exp.OperationCallExp;
import ocl.exp.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.impl.OclExpressionImpl#getLoopBodyOwner <em>Loop Body Owner</em>}</li>
 *   <li>{@link ocl.exp.impl.OclExpressionImpl#getAppliedElement <em>Applied Element</em>}</li>
 *   <li>{@link ocl.exp.impl.OclExpressionImpl#getInitializedElement <em>Initialized Element</em>}</li>
 *   <li>{@link ocl.exp.impl.OclExpressionImpl#getParentCall <em>Parent Call</em>}</li>
 *   <li>{@link ocl.exp.impl.OclExpressionImpl#getParentNav <em>Parent Nav</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OclExpressionImpl extends MinimalEObjectImpl.Container implements OclExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpPackage.Literals.OCL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopExp getLoopBodyOwner() {
		if (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER) return null;
		return (LoopExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopBodyOwner(LoopExp newLoopBodyOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLoopBodyOwner, ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopBodyOwner(LoopExp newLoopBodyOwner) {
		if (newLoopBodyOwner != eInternalContainer() || (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER && newLoopBodyOwner != null)) {
			if (EcoreUtil.isAncestor(this, newLoopBodyOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLoopBodyOwner != null)
				msgs = ((InternalEObject)newLoopBodyOwner).eInverseAdd(this, ExpPackage.LOOP_EXP__BODY, LoopExp.class, msgs);
			msgs = basicSetLoopBodyOwner(newLoopBodyOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER, newLoopBodyOwner, newLoopBodyOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallExp getAppliedElement() {
		if (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT) return null;
		return (CallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedElement(CallExp newAppliedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAppliedElement, ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppliedElement(CallExp newAppliedElement) {
		if (newAppliedElement != eInternalContainer() || (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT && newAppliedElement != null)) {
			if (EcoreUtil.isAncestor(this, newAppliedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAppliedElement != null)
				msgs = ((InternalEObject)newAppliedElement).eInverseAdd(this, ExpPackage.CALL_EXP__SOURCE, CallExp.class, msgs);
			msgs = basicSetAppliedElement(newAppliedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT, newAppliedElement, newAppliedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getInitializedElement() {
		if (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT) return null;
		return (Variable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializedElement(Variable newInitializedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInitializedElement, ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializedElement(Variable newInitializedElement) {
		if (newInitializedElement != eInternalContainer() || (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT && newInitializedElement != null)) {
			if (EcoreUtil.isAncestor(this, newInitializedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInitializedElement != null)
				msgs = ((InternalEObject)newInitializedElement).eInverseAdd(this, ExpPackage.VARIABLE__INIT_EXPRESSION, Variable.class, msgs);
			msgs = basicSetInitializedElement(newInitializedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT, newInitializedElement, newInitializedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationCallExp getParentCall() {
		if (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__PARENT_CALL) return null;
		return (OperationCallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCall(OperationCallExp newParentCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentCall, ExpPackage.OCL_EXPRESSION__PARENT_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCall(OperationCallExp newParentCall) {
		if (newParentCall != eInternalContainer() || (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__PARENT_CALL && newParentCall != null)) {
			if (EcoreUtil.isAncestor(this, newParentCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentCall != null)
				msgs = ((InternalEObject)newParentCall).eInverseAdd(this, ExpPackage.OPERATION_CALL_EXP__ARGUMENT, OperationCallExp.class, msgs);
			msgs = basicSetParentCall(newParentCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.OCL_EXPRESSION__PARENT_CALL, newParentCall, newParentCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationCallExp getParentNav() {
		if (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__PARENT_NAV) return null;
		return (NavigationCallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNav(NavigationCallExp newParentNav, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNav, ExpPackage.OCL_EXPRESSION__PARENT_NAV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentNav(NavigationCallExp newParentNav) {
		if (newParentNav != eInternalContainer() || (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__PARENT_NAV && newParentNav != null)) {
			if (EcoreUtil.isAncestor(this, newParentNav))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNav != null)
				msgs = ((InternalEObject)newParentNav).eInverseAdd(this, ExpPackage.NAVIGATION_CALL_EXP__QUALIFIER, NavigationCallExp.class, msgs);
			msgs = basicSetParentNav(newParentNav, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.OCL_EXPRESSION__PARENT_NAV, newParentNav, newParentNav));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLoopBodyOwner((LoopExp)otherEnd, msgs);
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAppliedElement((CallExp)otherEnd, msgs);
			case ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInitializedElement((Variable)otherEnd, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentCall((OperationCallExp)otherEnd, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_NAV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNav((NavigationCallExp)otherEnd, msgs);
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
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				return basicSetLoopBodyOwner(null, msgs);
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				return basicSetAppliedElement(null, msgs);
			case ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT:
				return basicSetInitializedElement(null, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				return basicSetParentCall(null, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_NAV:
				return basicSetParentNav(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				return eInternalContainer().eInverseRemove(this, ExpPackage.LOOP_EXP__BODY, LoopExp.class, msgs);
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ExpPackage.CALL_EXP__SOURCE, CallExp.class, msgs);
			case ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ExpPackage.VARIABLE__INIT_EXPRESSION, Variable.class, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				return eInternalContainer().eInverseRemove(this, ExpPackage.OPERATION_CALL_EXP__ARGUMENT, OperationCallExp.class, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_NAV:
				return eInternalContainer().eInverseRemove(this, ExpPackage.NAVIGATION_CALL_EXP__QUALIFIER, NavigationCallExp.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				return getLoopBodyOwner();
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				return getAppliedElement();
			case ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT:
				return getInitializedElement();
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				return getParentCall();
			case ExpPackage.OCL_EXPRESSION__PARENT_NAV:
				return getParentNav();
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
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				setLoopBodyOwner((LoopExp)newValue);
				return;
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				setAppliedElement((CallExp)newValue);
				return;
			case ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT:
				setInitializedElement((Variable)newValue);
				return;
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				setParentCall((OperationCallExp)newValue);
				return;
			case ExpPackage.OCL_EXPRESSION__PARENT_NAV:
				setParentNav((NavigationCallExp)newValue);
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
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				setLoopBodyOwner((LoopExp)null);
				return;
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				setAppliedElement((CallExp)null);
				return;
			case ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT:
				setInitializedElement((Variable)null);
				return;
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				setParentCall((OperationCallExp)null);
				return;
			case ExpPackage.OCL_EXPRESSION__PARENT_NAV:
				setParentNav((NavigationCallExp)null);
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
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				return getLoopBodyOwner() != null;
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				return getAppliedElement() != null;
			case ExpPackage.OCL_EXPRESSION__INITIALIZED_ELEMENT:
				return getInitializedElement() != null;
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				return getParentCall() != null;
			case ExpPackage.OCL_EXPRESSION__PARENT_NAV:
				return getParentNav() != null;
		}
		return super.eIsSet(featureID);
	}

} //OclExpressionImpl