package com.yifeng.lab.design.command;

public class Stereo {
	
	private String where;
	
	public Stereo(String where){
		this.where = where;
	}

	public void on(){
		System.out.println("打开音箱");
	}
	
	public void off(){
		System.out.println("关闭音箱");
	}
	
	public void setCd(){
		System.out.println("cd已经放入音箱");
	}
	
	public void setRadio(){
		System.out.println("");	
	}
	
	public void setVolume(int v){
		System.out.println("音量已经设置为：" + v);
	}
}
