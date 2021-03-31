package com.yifeng.lab.design.command;

public interface Command {
	
	public void execute();
	
	public void undo();
}
