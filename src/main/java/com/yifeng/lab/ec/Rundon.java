package com.yifeng.lab.ec;

import java.util.Random;

public class Rundon {
	public static void main(String[] args ) { 
		 Random random = new Random();
	     int sjm = random.nextInt(999999)%(999999-100000+1) + 100000;
	     System.out.println(sjm);
	     
	     System.out.println(String.format("%-4s",7).replace(" ", "0")); 
	}
}
