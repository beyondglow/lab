package com.yifeng.lab.design.factory;

public class ClamPizza extends Pizza {
	
	public PizzaIngredientFactory pizzaIngredientFactory;

	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("preparing...."+name);
		dough = pizzaIngredientFactory.CreateDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.CreateCheese();
		clam = pizzaIngredientFactory.createClam();
	}

	
}
