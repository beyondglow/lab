package com.yifeng.lab.design.decorator;

import java.util.ArrayList;

public class Soy extends CondimentDecorator {
	
	private Beverage beverage; 

	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public int getSize() {
		return beverage.getSize();
	}



	@Override
	public ArrayList<String> getDescription() {
		ArrayList<String> description = beverage.getDescription();
		description.add("soy");
		return description;
	}

	@Override
	public double cost() {
		return beverage.cost()+0.15;
	}

}
