package com.yifeng.lab.design.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteMath extends UnicastRemoteObject implements IRemoteMath {
	
	private int numberOfComputations;

	protected RemoteMath() throws RemoteException {
		numberOfComputations = 0;
	}

	@Override
	public double add(double a, double b) throws RemoteException {
		numberOfComputations ++;
		System.out.println("Number of computations performed so far = " + numberOfComputations);
		return (a + b);
	}

	@Override
	public double subtract(double a, double b) throws RemoteException {
		numberOfComputations ++;
		System.out.println("Number of computations performed so far = "+numberOfComputations);
		return (a-b);
	}

}
