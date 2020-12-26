package com.arbrum.library.sysdog;

public final class Hoster
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
	 * @return 1:SUCCESS 0:FAILURE
	 */
	public native int initialize(byte[] token, String type, String host, String port, String user, String pass);

	/**
	 * Update host information.
	 * 
	 * @param token Manager token.
	 * @param type
	 * @param host
	 * @param port
	 * @param user
	 * @param pass
	 * @return 1:SUCCESS 0:FAILURE
	 */
	public native int update(byte[] token, String type, String host, String port, String user, String pass);

	/**
	 * Refresh time.
	 * 
	 * @param token System token.
	 * @param datetime
	 * @return 1:SUCCESS 0:FAILURE
	 */
	public native int refresh(byte[] token, long datetime);

	/**
	 * Extract data.
	 * 
	 * @param token User token.
	 * @return data
	 */
	public native byte[] extract(byte[] token);

	/**
	 * Check whether the subject is ready.
	 * 
	 * @return
	 */
	public native int check();
	
}
