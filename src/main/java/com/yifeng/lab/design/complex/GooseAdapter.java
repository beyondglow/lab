package com.yifeng.lab.design.complex;

public class GooseAdapter implements Quackable {
	
	Observable observable;
	
	private Goose goose;
	
	public GooseAdapter(Goose goose) {
		observable = new Observable(this);
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
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
		return "鹅";
	}
	

}
