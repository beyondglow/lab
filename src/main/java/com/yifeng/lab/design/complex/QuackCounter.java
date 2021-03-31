package com.yifeng.lab.design.complex;

public class QuackCounter implements Quackable {
	
	Observable observable;
	
	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		observable = new Observable(duck);
		this.duck = duck;
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void quack() {
		duck.quack();
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

	
}
