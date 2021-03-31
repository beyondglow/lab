package com.yifeng.lab.design.template;

public class Coffee extends CaffeineBeverage{
	

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiment() {
		System.out.println("Adding Sugar and Milk");
	}
	
	
}
