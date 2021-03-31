package com.yifeng.lab.design.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiment() {
		System.out.println("Adding Lemon");
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
		System.out.println("Would you like lemon with your tea (y/n)? ");
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
