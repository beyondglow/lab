package com.yifeng.lab.design.command;

public class GarageDoorCloseCommand implements Command {
	
	private GarageDoor garageDoor; 

	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
	}

	@Override
	public void undo() {
		garageDoor.up();
		
	}

}
