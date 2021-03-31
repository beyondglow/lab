package com.yifeng.lab.design.decorator;

public class BeverageTest {

	public static void main(String[] args) {
		Beverage darkRoast = new DarkRoast();
		darkRoast.setSize(Beverage.TALL);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		darkRoast = new CondimentPrettyPrint(darkRoast);
		System.out.println(darkRoast.getDescription()
				+" $"+darkRoast.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend.setSize(Beverage.VENTI);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Milk(houseBlend);
		houseBlend = new Milk(houseBlend);
		houseBlend = new Soy(houseBlend);
		houseBlend = new CondimentPrettyPrint(houseBlend);
		System.out.println(houseBlend.getDescription()
				+" $"+houseBlend.cost());
	}

}
