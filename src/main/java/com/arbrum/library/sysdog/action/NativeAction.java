package com.arbrum.library.sysdog.action;

public final class NativeAction
{

	/**
	 * Initial host information.
	 * 
	 * @param token Manager token.
	 * @param type
	 * @param host
	 * @param port
	 * @param user
	 * @param pass
	 */
	public native void initialize(byte[] token, String type, String host, String port, String user, String pass);

	/**
	 * Update host information.
	 * 
	 * @param token Manager token.
	 * @param type
	 * @param host
	 * @param port
	 * @param user
	 * @param pass
	 */
	public native void update(byte[] token, String type, String host, String port, String user, String pass);

	/**
	 * Refresh time.
	 * 
	 * @param token System token.
	 * @param datetime
	 */
	public native void refresh(byte[] token, long datetime);

	/**
	 * Extract data.
	 * 
	 * @param token User token.
	 * @return
	 */
	public native byte[] extract(byte[] token);
	
}
