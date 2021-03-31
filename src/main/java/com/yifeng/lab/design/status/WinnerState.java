package com.yifeng.lab.design.status;

public class WinnerState implements State {
	
	private GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("错误");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("错误");
	}

	@Override
	public void turnCrank() {
		System.out.println("错误");

	}

	@Override
	public void dispense() {
		System.out.println("YOU'RA A WINNER! You get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
