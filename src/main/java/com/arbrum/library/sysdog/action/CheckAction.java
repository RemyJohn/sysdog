package com.arbrum.library.sysdog.action;

public class CheckAction extends AbstractAction
{
	@Override
	public Object performAction(byte[] token)
	{
		return this.hoster.check();
	}

}
