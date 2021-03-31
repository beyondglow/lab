package com.yifeng.lab.design.command;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		Light livingRoomLight = new Light("卧室");
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight); 
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		
		SimpleRemoteController src = new SimpleRemoteController();
		src.setCommand(lightOnCommand);
		src.ButtonPress();
		src.setCommand(garageDoorOpenCommand);
		src.ButtonPress();
	}

}
