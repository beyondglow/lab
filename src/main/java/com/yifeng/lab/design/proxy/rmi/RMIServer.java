package com.yifeng.lab.design.proxy.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

	public static void main(String[] args) {
		
		try {
			// 注册远程对象,向客户端提供远程对象服务。
			// 远程对象是在远程服务上创建的，你无法确切地知道远程服务器上的对象的名称，
			// 但是,将远程对象注册到RMI Registry之后,
			// 客户端就可以通过RMI Registry请求到该远程服务对象的stub，
			// 利用stub代理就可以访问远程服务对象了。
			IRemoteMath remoteMath = new RemoteMath();
			LocateRegistry.createRegistry(1099);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Compute", remoteMath);
			System.out.println("Math server ready");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
