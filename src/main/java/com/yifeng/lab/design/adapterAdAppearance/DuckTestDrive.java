package com.yifeng.lab.design.adapterAdAppearance;

public class DuckTestDrive {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Turkey wildTurkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		
		System.out.println("duck says...");
		testDuck(mallardDuck);
		System.out.println("\nturkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		System.out.println("\nturkey adapter says");
		testDuck(turkeyAdapter);
	}
	
	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
