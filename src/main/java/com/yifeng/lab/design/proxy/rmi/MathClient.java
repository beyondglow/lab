package com.yifeng.lab.design.proxy.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.yifeng.lab.design.proxy.rmi.IRemoteMath;

public class MathClient {
	public static void main(String[] args) {
		
		try { 
			Registry registry = LocateRegistry.getRegistry("localhost"); 
			IRemoteMath remoteMath = (IRemoteMath)registry.lookup("Compute");
			double addResult = remoteMath.add(5.0, 3.0);
			System.out.println("5.0 + 3.0 = " + addResult);
			double subResult = remoteMath.subtract(5.0, 3.0);
			System.out.println("5.0 - 3.0 = " + subResult);			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}		
}
