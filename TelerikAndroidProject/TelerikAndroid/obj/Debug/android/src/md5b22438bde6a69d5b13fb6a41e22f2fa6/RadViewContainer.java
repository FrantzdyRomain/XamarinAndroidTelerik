package md5b22438bde6a69d5b13fb6a41e22f2fa6;


public class RadViewContainer
	extends md5b22438bde6a69d5b13fb6a41e22f2fa6.RadViewContainerBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.Common.Android.RadViewContainer, Telerik.XamarinForms.Common.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", RadViewContainer.class, __md_methods);
	}


	public RadViewContainer (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == RadViewContainer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.Common.Android.RadViewContainer, Telerik.XamarinForms.Common.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public RadViewContainer (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == RadViewContainer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.Common.Android.RadViewContainer, Telerik.XamarinForms.Common.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public RadViewContainer (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == RadViewContainer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.Common.Android.RadViewContainer, Telerik.XamarinForms.Common.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
