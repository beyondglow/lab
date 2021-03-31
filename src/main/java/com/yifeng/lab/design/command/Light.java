package com.yifeng.lab.design.command;

public class Light {
	
	private String where;
	
	public Light(String where){
		this.where = where;
	}
	
	public void on(){
		System.out.println(where + "灯开了！");
	};
	
	public void off() {
		System.out.println(where + "灯关了！");
	}
}
