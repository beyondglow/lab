package com.yifeng.lab.design.template;

public abstract class CaffeineBeverage {
	
	
	final void prepareRecipe () {
		boilWater();
		brew();
		pourInCup();
		addCondiment();
	}
	
	abstract void brew();
	
	abstract void addCondiment();
	
	final void boilWater(){
		System.out.println("Boiling water");
	}
	
	final public void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
}
