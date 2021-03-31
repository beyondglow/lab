package com.yifeng.lab.design.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough CreateDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new Marinarasauce();
	}

	@Override
	public Cheese CreateCheese() {
		return new Reggianocheese();
	}

	@Override
	public Veggies[] CreateVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni CreatePepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClam();
	}

}
