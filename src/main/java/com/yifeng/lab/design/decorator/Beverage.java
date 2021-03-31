package com.yifeng.lab.design.decorator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Beverage {
	
	public final static int SMALL = 1;
	public final static int TALL = 2;
	public final static int GRANDE = 3;
	public final static int VENTI = 4;
	
	//初始化一个字典
	public final static Map<Integer, String> dic = new HashMap<Integer, String>() {
		
		private static final long serialVersionUID = 1L;
		{
			put(SMALL, "small");
			put(TALL, "tall");
			put(GRANDE, "grande");
			put(VENTI, "venti");
		}
	};
	
	public int size;
	
	public ArrayList<String> descripton;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public ArrayList<String> getDescription() {
		return descripton;
	}
	
	public abstract double cost();
}
