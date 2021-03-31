package com.yifeng.lab.design.singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler SingletonChocolateBoiler;
	
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public static synchronized ChocolateBoiler getInstance(){
		if (SingletonChocolateBoiler == null) {
			SingletonChocolateBoiler = new ChocolateBoiler();
		}
		return SingletonChocolateBoiler;
	}
	
	public void fill(){
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain(){
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil(){
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty(){
		return this.empty;
	}
	
	public boolean isBoiled(){
		return this.boiled;
	}
}
