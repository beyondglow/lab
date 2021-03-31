package com.yifeng.lab.design.dk;

public class TestDuck {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Duck redHeadDuck = new RedHeadDuck();
		Duck rubberDuck = new RubberDuck();
		Duck decoyDuck = new DecoyDuck();
		
		System.out.println("=========这是一只绿头鸭========");
		mallardDuck.display();
		mallardDuck.FlyPerformance();
		mallardDuck.QuarkPerformance();
		mallardDuck.swim();
		
		System.out.println("=========这是一只红头鸭========");
		redHeadDuck.display();
		redHeadDuck.FlyPerformance();
		redHeadDuck.QuarkPerformance();
		redHeadDuck.swim();
		
		System.out.println("=========这是一只橡皮鸭========");
		rubberDuck.display();
		rubberDuck.FlyPerformance();
		rubberDuck.QuarkPerformance();
		rubberDuck.swim();
		
		System.out.println("=========这是一只诱饵鸭========");
		decoyDuck.display();
		decoyDuck.FlyPerformance();
		decoyDuck.QuarkPerformance();
		decoyDuck.swim();
		
	}

}
