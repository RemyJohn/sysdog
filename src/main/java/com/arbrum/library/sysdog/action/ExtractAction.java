package com.arbrum.library.sysdog.action;

public final class ExtractAction extends AbstractAction
{
	@Override
	public Object performAction(byte[] token)
	{		
		byte[] data = this.nativeAction.extract(token);
		
		return data;
	}
}
