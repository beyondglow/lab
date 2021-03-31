package com.yifeng.lab.design.factory;

public class VeggiePizza extends Pizza {

	public PizzaIngredientFactory pizzaIngredientFactory;

	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("preparing...."+name);
		dough = pizzaIngredientFactory.CreateDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.CreateCheese();
		veggies = pizzaIngredientFactory.CreateVeggies();
	}
	

}
