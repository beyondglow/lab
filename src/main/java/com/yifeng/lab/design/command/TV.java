package com.yifeng.lab.design.command;

public class TV {
	
	private String where;
	
	public TV(String where){
		this.where = where;
	}
	
	public void on(){
		System.out.println("打开电视");
	}
	
	public void off(){
		System.out.println("关闭电视");
	}
}
