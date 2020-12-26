package com.arbrum.library.sysdog.local;

public class ConnectionData
{
	/**
	 * Fetch OS type
	 * 
	 * @param data
	 * @return
	 */
	public native byte[] fetchHostType(byte[] data);

	/**
	 * Fetch OS host
	 * 
	 * @param data
	 * @return
	 */
	public native byte[] fetchHostHost(byte[] data);
	
	/**
	 * Fetch OS port
	 * 
	 * @param data
	 * @return
	 */
	public native byte[] fetchHostPort(byte[] data);
	
	/**
	 * Fetch OS user
	 * 
	 * @param data
	 * @return
	 */
	public native byte[] fetchHostUser(byte[] data);

	/**
	 * Fetch OS password
	 * 
	 * @param data
	 * @return
	 */
	public native byte[] fetchHostPass(byte[] data);
}
