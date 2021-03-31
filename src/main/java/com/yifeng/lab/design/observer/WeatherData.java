package com.yifeng.lab.design.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private float temperature;
	
	private float himudity;
	
	private float pressure;
	
	ArrayList<Observer> observers;
	
	public WeatherData(){
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i>0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for(Observer observer:observers){
			Observer ob = (Observer) observer;
			ob.update(temperature,himudity,pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temperature,float himudity,float pressure){
		this.temperature = temperature;
		this.himudity = himudity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
