package com.arbrum.library.sysdog.action;

public final class RefreshAction extends AbstractAction
{
	@Override
	public Object performAction(byte[] token)
	{
		long datetime = System.currentTimeMillis() / 1000;
		
		return this.hoster.refresh(token, datetime);
	}
}
