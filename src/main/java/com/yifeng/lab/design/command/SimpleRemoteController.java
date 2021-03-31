package com.yifeng.lab.design.command;

public class SimpleRemoteController {
	
	private Command solt;

	public void setCommand(Command command){
		this.solt = command;
	}
	
	public void ButtonPress(){
		solt.execute();
	}
}
