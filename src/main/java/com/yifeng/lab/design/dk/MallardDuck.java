package com.yifeng.lab.design.dk;

public class MallardDuck extends Duck {
	
	MallardDuck(){
		flyBehavior = new FlyWithWings();
		quarkBehavior = new Quark();
	}

	@Override
	void display() {
		System.out.println("我的外表是绿色的！");
	}

}
