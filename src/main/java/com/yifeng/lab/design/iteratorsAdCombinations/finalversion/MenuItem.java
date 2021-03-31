package com.yifeng.lab.design.iteratorsAdCombinations.finalversion;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

	String name;
	String description;
	boolean vegetarian;
	double price;
	

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}
	

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public boolean isVagetarian() {
		return vegetarian;
	}

	@Override
	public void print() {
		System.out.print("  " + getName());
		if (isVagetarian()) {
			System.out.print("(V)");
		}
		System.out.println(", " + getPrice());
		System.out.println("   --- " + getDescription());
	}

	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
	
}
