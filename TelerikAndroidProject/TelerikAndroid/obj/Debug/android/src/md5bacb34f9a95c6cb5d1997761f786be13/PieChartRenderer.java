package md5bacb34f9a95c6cb5d1997761f786be13;


public class PieChartRenderer
	extends md5bacb34f9a95c6cb5d1997761f786be13.BaseChartRenderer_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.ChartRenderer.Android.PieChartRenderer, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", PieChartRenderer.class, __md_methods);
	}


	public PieChartRenderer (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == PieChartRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.ChartRenderer.Android.PieChartRenderer, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public PieChartRenderer (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == PieChartRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.ChartRenderer.Android.PieChartRenderer, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public PieChartRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == PieChartRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.ChartRenderer.Android.PieChartRenderer, Telerik.XamarinForms.ChartRenderer.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
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
