package com.yifeng.lab.design.factory;

public class CheesePizza extends Pizza {
	
	public PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("preparing...."+name);
		dough = pizzaIngredientFactory.CreateDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.CreateCheese();
	}


}
