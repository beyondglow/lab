package com.yifeng.lab.design.complex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
	
	Observable observable;
	
	public Flock() {
		observable = new Observable(this);
	}
	
	private List<Quackable> ducks = new ArrayList<Quackable>();
	
	public void addDuck(Quackable duck) {
		ducks.add(duck);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while(iterator.hasNext()) {
			Quackable quackable = iterator.next();
			quackable.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while(iterator.hasNext()) {
			iterator.next().registerObserver(observer);
		}
	}
	
	@Override
	public void notifyObserver() {
		observable.notifyObserver();
	}


}
