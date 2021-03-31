package com.yifeng.lab.design.decorator;

import java.util.ArrayList;
import java.util.List;

public class Milk extends CondimentDecorator {
	
	private Beverage beverage; 

	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	public int getSize() {
		return beverage.getSize();
	}
	
	@Override
	public ArrayList<String> getDescription() {
		ArrayList<String> description = beverage.getDescription();
		description.add("milk");
		return description;
	}
	

	@Override
	public double cost() {
		double cost = beverage.cost();
		switch(beverage.getSize()){
		case Beverage.SMALL:
			cost += 0.1;
		    break;
		case Beverage.TALL:
			cost += 0.15;
		    break;
		case Beverage.VENTI:
			cost += 0.2;
		    break;
		}
		return cost;
	}

}
