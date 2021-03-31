package com.yifeng.lab.design.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza creatPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("ny style cheese pizza");
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("ny style pepperoni pizza");
		} else if(type.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("ny style clam pizza");
		} else if(type.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("ny style veggie pizza");
		} else {
			pizza = null;
		}
		return pizza;
	}

}
