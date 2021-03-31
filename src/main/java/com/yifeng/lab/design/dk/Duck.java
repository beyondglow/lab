package com.yifeng.lab.design.dk;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuarkBehavior quarkBehavior;
	
	
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuarkBehavior(QuarkBehavior quarkBehavior) {
		this.quarkBehavior = quarkBehavior;
	}

	abstract void display();
	
	public void FlyPerformance(){
		flyBehavior.fly();
	};

	public void QuarkPerformance(){
		quarkBehavior.quark();
	}
	
	void swim() {
		System.out.println("All duck float, event decoys!");
	}
}
