package com.yifeng.lab.design.factory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	abstract void prepare();
	
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("place pizza into official pizzastore box");
	}
	
	public String getName(){
		return name;
	}
	
	public String setName(String name){
		return this.name = name;
	}
}
