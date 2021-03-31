package com.yifeng.lab.design.factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore ckgPizzaStore = new ChicagoPizzaStore();
		PizzaStore nyPizzaStore = new NYPizzaStore();
		
		Pizza ckgPizza = ckgPizzaStore.orderPizza("cheese");
		System.out.println("Ethan order a "+ckgPizza.getName()+"\n");
		
		Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Joel order a "+nyPizza.getName());
	}
}
