package com.yifeng.lab.design.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiment() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}

	

}
