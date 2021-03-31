package com.yifeng.lab.design.factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough CreateDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese CreateCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] CreateVeggies() {
		Veggies veggies[] = { new Eggplant(), new Spinash(), new BlackOlives() };
		return veggies;
	}

	@Override
	public Pepperoni CreatePepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClam();
	}


}
