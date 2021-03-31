package com.yifeng.lab.design.command;

public class HottubOffCommand implements Command {

	
	Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}	
	
	@Override
	public void execute() {
		hottub.off();
	}

	@Override
	public void undo() {
		hottub.on();
	}

}
