package com.yifeng.lab.design.dk;

public class RedHeadDuck extends Duck {

	RedHeadDuck(){
		flyBehavior = new FlyWithWings();
		quarkBehavior = new Quark();
	}

	@Override
	void display() {
		System.out.println("我的外表是红色的！");
	}

}
