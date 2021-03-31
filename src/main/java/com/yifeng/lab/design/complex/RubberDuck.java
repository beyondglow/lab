package com.yifeng.lab.design.complex;

public class RubberDuck implements Quackable {
	
	Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObserver() {
		observable.notifyObserver();
	}
	
	@Override
	public String toString() {
		return "橡皮鸭";
	}
	

}
