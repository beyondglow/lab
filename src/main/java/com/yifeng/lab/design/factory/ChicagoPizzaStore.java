package com.yifeng.lab.design.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza creatPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("chicago style cheese pizza");
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("chicago style pepperoni pizza");
		} else if(type.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("chicago style clam pizza");
		} else if(type.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("chicago style veggie pizza");
		} else {
			return null;
		}
		return pizza;
	}

}
