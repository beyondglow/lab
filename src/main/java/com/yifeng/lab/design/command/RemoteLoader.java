package com.yifeng.lab.design.command;

public class RemoteLoader {


	public static void main(String[] args) {
		/*RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("卧室");
		Light chitkenLight = new Light("厨房");
		CeilingFan ceilingFan = new CeilingFan("卧室");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("卧室");
		
		//创建所有的电灯命令对象
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight); 
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight); 
		LightOnCommand kichenLightOn = new LightOnCommand(chitkenLight); 
		LightOffCommand kichenLightOff = new LightOffCommand(chitkenLight); 
		
		//创建吊扇的开关
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		//创建车库门上下命令
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		
		StereoOnWithCDCommand StereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand StereoOffWithCD = new StereoOffWithCDCommand(stereo);
		
		//现在已经有了全部的命令，可以将他们加载到遥控器插槽中了
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kichenLightOn, kichenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, StereoOnWithCD, StereoOffWithCD);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);*/
		
		
		/*======测试测小操作=======*/
		/*RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		Light livingRoomLight = new Light("卧室");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight); 
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight); 
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();*/
		
		
		/*======测试天花板吊扇=======*/
		/*RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		CeilingFan ceilingFan = new CeilingFan("卧室");
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();*/
		
		/*使用宏指令*/
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light("卧室");
		TV tv = new TV("卧室");
		Stereo stereo = new Stereo("卧室");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		
		Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		System.out.println("----Pubshing Macro On----");
		remoteControl.onButtonWasPushed(0);
		System.out.println("----Pubshing Macro off----");
		remoteControl.offButtonWasPushed(0);
	}

}
