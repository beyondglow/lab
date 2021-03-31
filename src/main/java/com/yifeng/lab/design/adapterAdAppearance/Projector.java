package com.yifeng.lab.design.adapterAdAppearance;

public class Projector {
	
	DvdPlayer dvdPlayer;
	
	public void on(){
		System.out.println("开启投影仪");
	}
	
	public void off(){
		System.out.println("关闭投影仪");
	}
	
	public void tvMode(){
		
	}
	
	public void wideScreenMode(){
		System.out.println("投影调至宽屏模式（16 x 9 长宽比）");
	}
	
	
}
