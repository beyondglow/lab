package com.yifeng.lab.design.dk;

public class DecoyDuck extends Duck {

	DecoyDuck(){
		flyBehavior = new FlyNoWay();
		quarkBehavior = new WontQuark();
	}

	
	@Override
	void display() {
		System.out.println("我是木头的颜色！");
	}

}
