// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Orders
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject ordersMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Orders";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OrderNumber("OrderNumber"),
		OrderDetails("OrderDetails"),
		Orders_RandomGenerated("MyFirstModule.Orders_RandomGenerated");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Orders(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Orders"));
	}

	protected Orders(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject ordersMendixObject)
	{
		if (ordersMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Orders", ordersMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Orders");

		this.ordersMendixObject = ordersMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Orders.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Orders initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Orders.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Orders initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Orders(context, mendixObject);
	}

	public static myfirstmodule.proxies.Orders load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Orders.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Orders> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Orders> result = new java.util.ArrayList<myfirstmodule.proxies.Orders>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Orders" + xpathConstraint))
			result.add(myfirstmodule.proxies.Orders.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of OrderNumber
	 */
	public final String getOrderNumber()
	{
		return getOrderNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderNumber
	 */
	public final String getOrderNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.OrderNumber.toString());
	}

	/**
	 * Set value of OrderNumber
	 * @param ordernumber
	 */
	public final void setOrderNumber(String ordernumber)
	{
		setOrderNumber(getContext(), ordernumber);
	}

	/**
	 * Set value of OrderNumber
	 * @param context
	 * @param ordernumber
	 */
	public final void setOrderNumber(com.mendix.systemwideinterfaces.core.IContext context, String ordernumber)
	{
		getMendixObject().setValue(context, MemberNames.OrderNumber.toString(), ordernumber);
	}

	/**
	 * @return value of OrderDetails
	 */
	public final String getOrderDetails()
	{
		return getOrderDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderDetails
	 */
	public final String getOrderDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.OrderDetails.toString());
	}

	/**
	 * Set value of OrderDetails
	 * @param orderdetails
	 */
	public final void setOrderDetails(String orderdetails)
	{
		setOrderDetails(getContext(), orderdetails);
	}

	/**
	 * Set value of OrderDetails
	 * @param context
	 * @param orderdetails
	 */
	public final void setOrderDetails(com.mendix.systemwideinterfaces.core.IContext context, String orderdetails)
	{
		getMendixObject().setValue(context, MemberNames.OrderDetails.toString(), orderdetails);
	}

	/**
	 * @return value of Orders_RandomGenerated
	 */
	public final myfirstmodule.proxies.RandomGenerated getOrders_RandomGenerated() throws com.mendix.core.CoreException
	{
		return getOrders_RandomGenerated(getContext());
	}

	/**
	 * @param context
	 * @return value of Orders_RandomGenerated
	 */
	public final myfirstmodule.proxies.RandomGenerated getOrders_RandomGenerated(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.RandomGenerated result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Orders_RandomGenerated.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.RandomGenerated.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Orders_RandomGenerated
	 * @param orders_randomgenerated
	 */
	public final void setOrders_RandomGenerated(myfirstmodule.proxies.RandomGenerated orders_randomgenerated)
	{
		setOrders_RandomGenerated(getContext(), orders_randomgenerated);
	}

	/**
	 * Set value of Orders_RandomGenerated
	 * @param context
	 * @param orders_randomgenerated
	 */
	public final void setOrders_RandomGenerated(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.RandomGenerated orders_randomgenerated)
	{
		if (orders_randomgenerated == null)
			getMendixObject().setValue(context, MemberNames.Orders_RandomGenerated.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Orders_RandomGenerated.toString(), orders_randomgenerated.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return ordersMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Orders that = (myfirstmodule.proxies.Orders) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Orders";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
