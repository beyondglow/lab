package com.yifeng.lab.design.observer;

/**
 * 
 * @author yh
 * 简单了解了一下
 * 气温高，气压低，湿度大，一般下雨
 * 气温高，气压高，湿度低，晴天
 */
public class ForecastDisplay implements Observer, DisplayElement {
	
	private float temperature;
	
	private float himudity;
	
	private float pressure;
	
	private Subject weatherData;
	
	ForecastDisplay(Subject wd){
		this.weatherData = wd;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		if (temperature==82) {
			System.out.println("天要下雨，快收衣服啦！");
		}
		if (temperature==80) {
			System.out.println("飓风就要来了，快逃啊！");		
		}
		if (temperature==78) {
			System.out.println("晴空万里，空气好，出门放松放松！");
		}
	}

	@Override
	public void update(float temperature, float himudity, float pressure) {
		this.temperature = temperature;
		this.himudity = himudity;
		this.pressure = pressure;
		display();
	}

}
