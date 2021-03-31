package com.yifeng.lab.design.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	
	private float temperature;
	
	private float himudity;
	
	private Subject weatherData;
	
	CurrentConditionDisplay(Subject wd){
		this.weatherData = wd;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("当前温度："+temperature+"F  湿度："+himudity+"%");
	}

	@Override
	public void update(float temperature, float himudity, float pressure) {
		this.temperature = temperature;
		this.himudity = himudity;
		display();
	}

}
