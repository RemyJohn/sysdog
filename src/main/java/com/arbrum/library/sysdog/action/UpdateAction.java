package com.arbrum.library.sysdog.action;

import com.arbrum.library.sysdog.global.Settings;

public final class UpdateAction extends AbstractAction
{
	@Override
	public Object performAction(byte[] token)
	{
		Settings settings = Settings.get();
		
		Settings.HostTemplate hostTemplate = settings.getHost();
		
		if (null == hostTemplate)
		{
			return 0;
		}

		String type = hostTemplate.type;
		String host = hostTemplate.host;
		String port = hostTemplate.port;
		String user = hostTemplate.user;
		String pass = hostTemplate.pass;
		
		if (null == type || "".equals(type.trim()) ||
				null == host || "".equals(host.trim()) ||
				null == port || "".equals(port.trim()) ||
				null == user || "".equals(user.trim()) ||
				null == pass || "".equals(pass.trim()))
		{
			return 0;
		}
		
		this.nativeAction.update(token, type, host, port, user, pass);
		
		return 0;
	}
}
