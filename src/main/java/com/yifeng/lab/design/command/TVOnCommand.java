package com.yifeng.lab.design.command;

public class TVOnCommand implements Command {
	
	TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}

}
