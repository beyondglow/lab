package com.yifeng.lab.design.template;

public abstract class CaffeineBeverageWithHook {

	
		
	final void prepareRecipe () {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()){
			addCondiment();
		}
	}
	
	abstract void brew();
		
	abstract void addCondiment();

	final void boilWater() {
		System.out.println("Boiling water");
	}

	final public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	boolean customerWantsCondiments() {
		return true;
	}

}
