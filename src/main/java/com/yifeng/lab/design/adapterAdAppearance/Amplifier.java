package com.yifeng.lab.design.adapterAdAppearance;

public class Amplifier {
	
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	
	
	
	public void on(){
		System.out.println("开启功放...");
	}
	
	public void off(){
		System.out.println("关闭功放...");
	}
	
	public void setCd(CdPlayer cdPlayer){
		this.cdPlayer = cdPlayer;
	}
	
	public void setDvd(DvdPlayer dvdPlayer){
		System.out.println("功放设置为top-o-line dvd播放模式");
		this.dvdPlayer = dvdPlayer;
	}
	
	public void setStereoSound(){
		
	}
	
	public void setSurroundSound(){
		System.out.println("功放设置环绕立体声(5个喇叭，一个低音炮)");
	}
	
	public void setTuner(Tuner tuner){
		this.tuner = tuner;
	}
	
	public void setVolume(int v){
		System.out.println("功放设置音量为"+v);
	}
	
}
