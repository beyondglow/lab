package com.yifeng.lab.design.decorator;

import java.util.ArrayList;

public class Whip extends CondimentDecorator {
	
	private Beverage beverage; 

	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public int getSize() {
		return beverage.getSize();
	}

	@Override
	public ArrayList<String> getDescription() {
		ArrayList<String> description = beverage.getDescription();
		description.add("whip");
		return description;
	}

	@Override
	public double cost() {
		return beverage.cost()+0.1;
	}

}
