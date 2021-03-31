package com.yifeng.lab.design.status;

public interface State {

	void insertQuarter();
	
	void ejectQuarter();
	
	void turnCrank();
	
	void dispense();
}
