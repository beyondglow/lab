package com.yifeng.lab.design.iteratorsAdCombinations.finalversion;

public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent panchkeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "DIner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "ALL menus combined");
		
		allMenus.add(panchkeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		dinerMenu.add(new MenuItem(
				"Pasta", 
				"Spaghetti with Marinara sauce, and a slice of soudough bread", 
				true, 
				3.89));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem(
				"Apple Pie", 
				"Apple pie with a flakey crust topped with vanilla ice cream", 
				false, 
				1.59));
		Waitress waitress = new Waitress(allMenus);
//		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
