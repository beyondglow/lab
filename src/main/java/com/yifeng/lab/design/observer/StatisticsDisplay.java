package com.yifeng.lab.design.observer;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private static ArrayList<Float> TEMPERATUREAR = new ArrayList<Float>();
	
	private float temperature;
	
	private Subject weatherData;
	
	StatisticsDisplay(Subject wd){
		this.weatherData = wd;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		float min=TEMPERATUREAR.get(0),max=TEMPERATUREAR.get(0),avg=TEMPERATUREAR.get(0);
		int sum=0, len = TEMPERATUREAR.size();
		if (len == 0) {
			System.out.println("无温度数据存储，检查！");
			return;
		} 
		for (int i=0; i< TEMPERATUREAR.size(); i++) {
			if (TEMPERATUREAR.get(i)>max) {
				max = TEMPERATUREAR.get(i);
			}
			if (TEMPERATUREAR.get(i)<min) {
				min = TEMPERATUREAR.get(i);
			}
			sum+=TEMPERATUREAR.get(i);
		}
		avg = sum/len;
		System.out.println("最高温度/平均温度/最低温度："+max+"/"+avg+"/"+min);
		
	}

	@Override
	public void update(float temperaturex, float himudity, float pressure) {
		this.temperature = temperaturex;
		TEMPERATUREAR.add(temperaturex);
		display();
	}

}
