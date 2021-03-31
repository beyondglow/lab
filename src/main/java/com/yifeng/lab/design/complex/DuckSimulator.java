package com.yifeng.lab.design.complex;

public class DuckSimulator {

	public static void main(String[] args) {
		
		
		DuckSimulator simulate = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulate.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
//		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Goose goose = new Goose();
		Quackable gooseAdaper = new QuackCounter(new GooseAdapter(goose));
		
		System.out.println("\nDuck Simulator");
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.addDuck(redheadDuck);
		flockOfDucks.addDuck(gooseAdaper);
		flockOfDucks.addDuck(duckCall);
		flockOfDucks.addDuck(rubberDuck);
		
		Flock flockOfMallards = new Flock();
		Quackable mallardDuckOne = duckFactory.createMallardDuck();
		Quackable mallardDuckTwo = duckFactory.createMallardDuck();
		Quackable mallardDuckThr = duckFactory.createMallardDuck();
		Quackable mallardDuckFour = duckFactory.createMallardDuck();
		
		flockOfMallards.addDuck(mallardDuckOne);
		flockOfMallards.addDuck(mallardDuckTwo);
		flockOfMallards.addDuck(mallardDuckThr);
		flockOfMallards.addDuck(mallardDuckFour);
		
		System.out.println("\nDuck simulator: with observer");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);
	
		flockOfMallards.registerObserver(quackologist);
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);
		
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + "times");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}

}
