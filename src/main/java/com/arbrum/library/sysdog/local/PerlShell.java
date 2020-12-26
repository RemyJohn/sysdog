package com.arbrum.library.sysdog.local;

public final class PerlShell extends Script
{	
	public PerlShell(byte[] data)
	{
		super(data);
	}

	public String[] extractConnectionString(String script, String ... commands)
	{
		String[] commandArray = new String[10 + commands.length * 2];
		commandArray[0] = "perl";
		commandArray[1] = script;
		commandArray[2] = "--ip";
		commandArray[3] = new String(this.connectionData.fetchHostHost(data));
		commandArray[4] = "--port";
		commandArray[5] = new String(this.connectionData.fetchHostPort(data));
		commandArray[6] = "--user";
		commandArray[7] = new String(this.connectionData.fetchHostUser(data));
		commandArray[8] = "--password";
		commandArray[9] = new String(this.connectionData.fetchHostPass(data));
		
		for (int index = 0, cursor = 1; index < commands.length; index++, cursor += 2)
		{
			commandArray[9 + cursor + 0] = "--cmd";
			commandArray[9 + cursor + 1] = commands[index];
		}
		
		return commandArray;
	}
}
