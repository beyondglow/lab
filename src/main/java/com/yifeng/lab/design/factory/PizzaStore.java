package com.yifeng.lab.design.factory;

public abstract class PizzaStore {
	
	
	public Pizza orderPizza(String type){
		Pizza pizza = creatPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza creatPizza(String type);
}
