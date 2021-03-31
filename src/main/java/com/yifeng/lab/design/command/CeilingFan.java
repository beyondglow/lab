package com.yifeng.lab.design.command;

public class CeilingFan {
	
	public static final int HIGH = 3;
	
	public static final int MEDIUM = 2;
	
	public static final int LOW = 1;
	
	public static final int OFF = 0;
	
	private String where;
	
	int speed;
	
	public CeilingFan(String where){
		this.where = where;
	}
	
	public void on(){
		System.out.println(where + "吊扇开了");
	}
	
	public void off(){
		System.out.println(where + "吊扇关了");
	}
	
	public void high(){
		System.out.println(where + "吊扇高速运行");
		speed = HIGH;
	}
	
	public void medium(){
		System.out.println(where + "吊扇中速运行");
		speed = MEDIUM;
	}
	
	public void low() {
		System.out.println(where + "吊扇低速运行");
		speed = LOW;
	}
	
	public int getSpeed(){
		return speed;
	}
}
