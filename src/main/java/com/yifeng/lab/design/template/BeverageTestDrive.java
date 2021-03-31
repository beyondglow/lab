package com.yifeng.lab.design.template;

public class BeverageTestDrive {

	public static void main(String[] args) {
		
		TeaWithHook teaHook = new TeaWithHook();
		System.out.println("Making tea...");
		teaHook.prepareRecipe();
		
		CoffeWithHook caffeHook = new CoffeWithHook();
		System.out.println("\nMaking coffee...");
		caffeHook.prepareRecipe();
	}

}
