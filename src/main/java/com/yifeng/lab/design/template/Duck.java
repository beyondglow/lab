package com.yifeng.lab.design.template;

public class Duck implements Comparable {
	
	private String name;
	
	private int weight;
	

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	


	@Override
	public String toString() {
		return "xiao " + this.name + " 体重：" + this.weight;
	}




	@Override
	public int compareTo(Object o) {
		Duck duck = (Duck)o;
		if (this.weight>duck.weight) {
			return 1;
		} else if(this.weight == duck.weight){
			return 0;
		} else {
			return -1;
		}
	}

}
