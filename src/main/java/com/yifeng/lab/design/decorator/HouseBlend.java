package com.yifeng.lab.design.decorator;

import java.util.ArrayList;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		descripton = new ArrayList<String>();
		descripton.add("Hourse blend coffe");
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
