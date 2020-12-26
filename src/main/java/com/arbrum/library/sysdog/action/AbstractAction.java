package com.arbrum.library.sysdog.action;

import com.arbrum.library.sysdog.Hoster;

public abstract class AbstractAction implements Action
{
	protected Hoster hoster;
	
	public AbstractAction()
	{
		this.hoster = new Hoster();
	}
}
