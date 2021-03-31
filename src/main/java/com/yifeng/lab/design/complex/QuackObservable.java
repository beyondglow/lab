package com.yifeng.lab.design.complex;


public interface QuackObservable {

	public void registerObserver(Observer observer);
	
	public void notifyObserver();
}
