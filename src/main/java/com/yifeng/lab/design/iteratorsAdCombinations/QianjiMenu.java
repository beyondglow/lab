package com.yifeng.lab.design.iteratorsAdCombinations;

import java.util.ArrayList;
import java.util.Iterator;

public class QianjiMenu implements Menu  {

	ArrayList menuItems;

	public QianjiMenu() {
		this.menuItems = new ArrayList();
		addItem("法式小面包",
				"一种很小的面包", 
				false, 
				2.00);
		addItem("南瓜饼",
				"一种南瓜做的饼", 
				false, 
				2.19);
		addItem("慕斯",
				"甜甜的滑滑的", 
				false, 
				3.12);
	}
	
	public void addItem(String name, String description, 
			boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	/*public ArrayList getMenuItems(){
		return menuItems;
	}*/
	
	public Iterator createIterator(){
		//return new PancakeHouseIterator(menuItems);
		return menuItems.iterator();
	}
}
