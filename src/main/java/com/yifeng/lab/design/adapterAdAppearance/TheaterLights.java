package com.yifeng.lab.design.adapterAdAppearance;

public class TheaterLights {
	
	public void on(){
		System.out.println("吊顶灯开启");
	}
	
	public void off(){
		System.out.println("吊顶灯关闭");
	}
	
	public void dim(int v){
		System.out.println("吊顶灯亮度调到"+v+"%");
	}
}
