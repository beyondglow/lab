package com.yifeng.lab.design.factory;

public class PepperoniPizza extends Pizza {
	
	public PizzaIngredientFactory pizzaIngredientFactory;

	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("preparing...."+name);
		dough = pizzaIngredientFactory.CreateDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.CreateCheese();
		pepperoni = pizzaIngredientFactory.CreatePepperoni();
	}

	
}
