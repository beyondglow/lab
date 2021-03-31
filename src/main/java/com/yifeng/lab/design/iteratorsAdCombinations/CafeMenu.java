package com.yifeng.lab.design.iteratorsAdCombinations;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class CafeMenu implements Menu {
	
	Hashtable menuItems = new Hashtable();
	
	public CafeMenu() {
		addItem("Veggie Burger and Air Fries", 
				"Veggie burger on a whole wheat buh, lettuce, tomato, and fries", true, 3.99);
		addItem("Soup of the day", 
				"A cup of the soup of the day, with a side salad", 
				false, 3.67);
		addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", 
				true, 
				4.29);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		QianjiMenu qianjiMenu = new QianjiMenu();
		List<Menu> menus = new ArrayList<Menu>();
		if (menuItem.getName().startsWith("B")) {
			menus.add(qianjiMenu);
			menuItem.submenu = menus;
		}
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}


}
