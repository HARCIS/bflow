/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bflow.toolbox.bflow.util;

import org.bflow.toolbox.bflow.Bflow;
import org.bflow.toolbox.bflow.BflowPackage;
import org.bflow.toolbox.bflow.BflowSymbol;
import org.bflow.toolbox.bflow.Connection;
import org.bflow.toolbox.bflow.Element;
import org.bflow.toolbox.bflow.IBflowElement;
import org.bflow.toolbox.bflow.IConnector;
import org.bflow.toolbox.bflow.IEBflowElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bflow.toolbox.bflow.BflowPackage
 * @generated
 */
public class BflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BflowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BflowSwitch<Adapter> modelSwitch =
		new BflowSwitch<Adapter>() {
			@Override
			public Adapter caseBflowSymbol(BflowSymbol object) {
				return createBflowSymbolAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIConnector(IConnector object) {
				return createIConnectorAdapter();
			}
			@Override
			public Adapter caseIBflowElement(IBflowElement object) {
				return createIBflowElementAdapter();
			}
			@Override
			public Adapter caseIEBflowElement(IEBflowElement object) {
				return createIEBflowElementAdapter();
			}
			@Override
			public Adapter caseBflow(Bflow object) {
				return createBflowAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.bflow.toolbox.bflow.BflowSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bflow.toolbox.bflow.BflowSymbol
	 * @generated
	 */
	public Adapter createBflowSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bflow.toolbox.bflow.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bflow.toolbox.bflow.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bflow.toolbox.bflow.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bflow.toolbox.bflow.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bflow.toolbox.bflow.IConnector <em>IConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bflow.toolbox.bflow.IConnector
	 * @generated
	 */
	public Adapter createIConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bflow.toolbox.bflow.IBflowElement <em>IBflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bflow.toolbox.bflow.IBflowElement
	 * @generated
	 */
	public Adapter createIBflowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bflow.toolbox.bflow.IEBflowElement <em>IE Bflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bflow.toolbox.bflow.IEBflowElement
	 * @generated
	 */
	public Adapter createIEBflowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bflow.toolbox.bflow.Bflow <em>Bflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bflow.toolbox.bflow.Bflow
	 * @generated
	 */
	public Adapter createBflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BflowAdapterFactory
