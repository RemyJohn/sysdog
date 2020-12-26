package com.arbrum.library.sysdog;

import java.nio.charset.Charset;

import com.arbrum.library.sysdog.action.Action;
import com.arbrum.library.sysdog.global.Settings;

public class Watcher
{
	static
	{
		System.loadLibrary(Settings.LIB_NATIVE_HARDWARE);
	};

	private static final Object object = new Object();

	private static Watcher instance = build();

	private static Watcher build()
	{
		return new Watcher();
	}

	public static Watcher get()
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

	private Validator validator;

	private Watcher()
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
	public byte[] validateKey(String externalKey, Charset charset)
	{
		return this.validator.validateKey(externalKey.getBytes(charset));
	}
	
	/**
	 * Execute actions.
	 * 
	 * @param token
	 * @param instance
	 * @return
	 */
	public Object executeAction(byte[] token, Action action)
	{
		return action.performAction(token);
	}
	
	/**
	 * Execute actions.
	 * 
	 * @param externalKey
	 * @param charset
	 * @param instance
	 * @return
	 */
	public Object executeAction(String externalKey, Charset charset, Action action)
	{
		return this.executeAction(this.validateKey(externalKey, charset), action);
	}
	
	/**
	 * Execute actions.
	 * 
	 * @param externalKey
	 * @param instance
	 * @return
	 */
	public Object executeAction(String externalKey, Action action)
	{
		return this.executeAction(this.validateKey(externalKey, Charset.defaultCharset()), action);
	}
}
