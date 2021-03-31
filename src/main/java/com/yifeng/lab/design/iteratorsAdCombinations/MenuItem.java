package com.yifeng.lab.design.iteratorsAdCombinations;

import java.util.List;

public class MenuItem {
	
	String name;
	String description;
	boolean vegetarian;
	double price;
	List<Menu> submenu;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	
	public boolean isVegetarian(){
		return vegetarian;
	}
}
