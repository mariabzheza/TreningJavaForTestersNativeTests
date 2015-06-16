package com.example.fw;

import java.io.IOException;

public class ProcessHelper extends HelpersBase{

	private Process process;

	public ProcessHelper(ApplicationManager applicationManager) {
		super(applicationManager);
	}
	
	public void startAppUnderTest () throws IOException {
		String command = manager.getPropety("app.path");
		process = Runtime.getRuntime().exec(command);
	}
	
	public void stopAppUnderTest () {
		process.destroy();
	}

}
