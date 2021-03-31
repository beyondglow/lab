package com.yifeng.lab.design.adapterAdAppearance;

public class DvdPlayer {

	Amplifier amplifier;
	private String movie;
	
	public void on(){
		System.out.println("dvd 播放器开启");
	}
	
	public void off(){
		System.out.println("dvd 播放器关闭");
	}
	
	public void eject(){
		System.out.println("dvd播放器弹出");
	}
	
	public void pause(){
		
	}
	
	public void paly(){
		
	}
	
	public void paly(String movie){
		this.movie = movie;
		System.out.println("准备播放《"+movie+"》");
	}
	
	public void setSurroundAudio(){
		
	}
	
	public void setTwoChannelAudio(){
		
	}
	
	public void stop(){
		System.out.println("停止播放《"+movie+"》");
	}
}
