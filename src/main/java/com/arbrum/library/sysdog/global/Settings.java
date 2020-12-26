package com.arbrum.library.sysdog.global;

public class Settings
{
	/**
	 * Host template is used to store host informations.
	 * 
	 * @author remy
	 */
	public class HostTemplate
	{
		public String type = null;
		public String host = null;
		public String port = null;
		public String user = null;
		public String pass = null;
	}
	
	private static final Object object = new Object();

	private static Settings instance = build();

	private static Settings build()
	{
		return new Settings();
	}

	public static Settings get()
	{
		if (null == instance)
		{
			synchronized (object)
			{
				if (null == instance)
				{
					instance = build();
				}
			}
		}

		return instance;
	}
	
	private HostTemplate host;
	
	private Settings()
	{
		this.host = new HostTemplate();
	}

	public HostTemplate getHost()
	{
		return host;
	}
}
