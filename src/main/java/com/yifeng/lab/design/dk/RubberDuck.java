package com.yifeng.lab.design.dk;

public class RubberDuck extends Duck {

	RubberDuck(){
		flyBehavior = new FlyNoWay();
		quarkBehavior = new SqueakQuark();
	}
	
	@Override
	void display() {
		System.out.println("我是五彩斑斓色的！");
	}

}
