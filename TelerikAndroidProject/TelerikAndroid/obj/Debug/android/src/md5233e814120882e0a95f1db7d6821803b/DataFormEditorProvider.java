package md5233e814120882e0a95f1db7d6821803b;


public class DataFormEditorProvider
	extends md5233e814120882e0a95f1db7d6821803b.DataFormViewProviderBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormEditorProvider, Telerik.XamarinForms.InputRenderer.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", DataFormEditorProvider.class, __md_methods);
	}


	public DataFormEditorProvider () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DataFormEditorProvider.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormEditorProvider, Telerik.XamarinForms.InputRenderer.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public DataFormEditorProvider (md526b60f9a41063576ad0c5049fe3a6124.DataFormRenderer p0, com.telerik.widget.dataform.visualization.RadDataForm p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == DataFormEditorProvider.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormEditorProvider, Telerik.XamarinForms.InputRenderer.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null", "Telerik.XamarinForms.InputRenderer.Android.DataFormRenderer, Telerik.XamarinForms.InputRenderer.Android, Version=2016.3.830.231, Culture=neutral, PublicKeyToken=null:Com.Telerik.Widget.Dataform.Visualization.RadDataForm, Telerik.Xamarin.Android.Input, Version=2016.2.830.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0, p1 });
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
