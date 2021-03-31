package com.yifeng.lab.design.complex;

public class MallardDuck implements Quackable {
	
	Observable observable;
	
	public MallardDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObserver();
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
		return "绿头鸭";
	}
	
	

}
