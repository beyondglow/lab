package com.yifeng.lab.design.template;

public class Tea extends CaffeineBeverage{
	
	

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiment() {
		System.out.println("Adding Lemon");
	}
}
