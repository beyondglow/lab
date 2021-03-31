package com.yifeng.lab.design.decorator;

import java.util.ArrayList;

public class Mocha extends Beverage {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public int getSize() {
		return beverage.getSize();
	}
	
	@Override
	public ArrayList<String> getDescription() {
		ArrayList<String> description = beverage.getDescription();
		description.add("mocha");
		return description;
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.2;
	}

}
