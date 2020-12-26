package com.arbrum.library.sysdog.local;

import com.arbrum.library.sysdog.global.Settings;

public abstract class Script
{
	static
	{
		System.loadLibrary(Settings.LIB_NATIVE_HARDWARE);
	};
	
	protected ConnectionData connectionData;
	
	protected byte[] data;
	
	public Script()
	{
		this(null);
	}
	
	public Script(byte[] data)
	{
		this.connectionData = new ConnectionData();
		this.data = data;
	}
	
	public String extractHostType()
	{
		if (null == this.data || this.data.length == 0)
		{
			return "";
		}
		
		byte[] osType = this.connectionData.fetchHostType(this.data); 
		
		if (null == osType || osType.length == 0)
		{
			return "";
		}

		return new String(osType);
	}
}
