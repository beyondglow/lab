package com.yifeng.lab.design.factory;

public interface PizzaIngredientFactory {
	
	public Dough CreateDough();
	
	public Sauce createSauce();
	
	public Cheese CreateCheese();
	
	public Veggies[] CreateVeggies();
	
	public Pepperoni CreatePepperoni();
	
	public Clams createClam();
}
