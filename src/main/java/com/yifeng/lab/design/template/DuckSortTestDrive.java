package com.yifeng.lab.design.template;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("ming", 8),
				new Duck("hong", 2),
				new Duck("huang",7),
				new Duck("lan", 2),
				new Duck("lv", 10),
				new Duck("hei", 2),
		};
		
		System.out.println("before sorting:");
		
		display(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("\nAfter sorting:");
		display(ducks);
	}

	private static void display(Duck[] ducks) {
		for (int i=0; i< ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
