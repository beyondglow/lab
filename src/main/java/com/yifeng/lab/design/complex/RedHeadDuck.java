package com.yifeng.lab.design.complex;

public class RedHeadDuck implements Quackable {
	
	Observable observable;
	
	public RedHeadDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
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
		return "红头鸭";
	}
	
}
