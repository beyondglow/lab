package com.yifeng.lab.design.iteratorsAdCombinations.finalversion;

import java.util.Iterator;

public class Waitress {
	
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if (menuComponent.isVagetarian()) {
					menuComponent.print();
				}
			} catch (Exception e) {}
		}
	}
}
