package com.yifeng.lab.design.decorator;

import java.util.ArrayList;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		descripton = new ArrayList<String>();
		descripton.add("DarkRoast");
	}
	
	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public double cost() {
		return 0.99;
	}

}
