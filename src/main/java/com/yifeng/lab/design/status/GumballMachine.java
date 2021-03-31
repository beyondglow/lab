package com.yifeng.lab.design.status;

public class GumballMachine {
	
	State hasQuarterState;
	State noQuarterState;
	State soldOutState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberCumballs) {
		this.hasQuarterState = new HasQuarterState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		this.count = numberCumballs;
		if (numberCumballs > 0) {
			state = noQuarterState;
		}
	}
	
	
	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count -1;
		}
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public State getSoldOutState() {
		return soldOutState;
	}
	public State getSoldState() {
		return soldState;
	}
	public int getCount() {
		return count;
	}


	public State getWinnerState() {
		return winnerState;
	}


	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
	
	
}
