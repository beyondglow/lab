package com.yifeng.lab.design.iteratorsAdCombinations;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	List<Menu> menus;
	
	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void printMenu(){
		for (Menu menu:menus) {
			Iterator iterator = menu.createIterator();
			printMenu(iterator);
			System.out.println("==============================");
		}
	}
	
	public void printMenu(List<Menu> menus){
		for (Menu menu:menus) {
			Iterator iterator = menu.createIterator();
			printMenu(iterator);
		}
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName()+", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
			if (menuItem.submenu != null) {
				System.out.println("-----------I'm " + menuItem.getName() + " children-------------");
				printMenu(menuItem.submenu);
			}
		}
		
	}
}
