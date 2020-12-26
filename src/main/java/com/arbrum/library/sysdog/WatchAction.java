package com.arbrum.library.sysdog;

import java.nio.charset.Charset;

import com.arbrum.library.sysdog.action.Action;

public class WatchAction
{
	private static final String LIB_NATIVE_HARDWARE = "libhardw.so";
	
	static {
		System.loadLibrary(LIB_NATIVE_HARDWARE);
	};
	
	private static final Object object = new Object();
	
	private static WatchAction action = buildAction();
	
	private static WatchAction buildAction()
	{
		return new WatchAction();
	}
	
	public static WatchAction get()
	{
		if (null == action)
		{
			synchronized (object)
			{
				if (null == action)
				{
					action = buildAction();
				}
			}
		}
		
		return action;
	}
	
	private Validator validator;
	
	private WatchAction()
	{
		validator = new Validator();
	}
	
	/**
	 * Validate an external key and return an random internal token when succeeded.
	 * 
	 * @param externalKey
	 * @param charset
	 * @return Token
	 */
	public byte[] validateExternalKey(String externalKey, Charset charset)
	{
		return this.validator.validateKey(externalKey.getBytes(charset));
	}
	
	/**
	 * Execute actions.
	 * 
	 * @param token
	 * @param action
	 * @return
	 */
	public Object executeAction(byte[] token, Action action)
	{
		return action.performAction(token);
	}

}
