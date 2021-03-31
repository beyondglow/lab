package com.yifeng.lab.design.proxy;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CumballMachineTestDrive {

	public static void main(String[] args) {
		
		GumballMachineRemote gumballMachine = null;
		int count = 0;
		
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		try {
			
			count = Integer.parseInt(args[1]);
			LocateRegistry.createRegistry( 1099 );
			GumballMachine machine = new GumballMachine(args[0], count);
			machine.insertQuarter();
			machine.turnCrank();
			gumballMachine = (GumballMachineRemote) machine;
			Naming.rebind("rmi://" + args[0] + "/gumballmachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
