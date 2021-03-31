package com.yifeng.lab.design.proxy;

import java.lang.reflect.Proxy;

public class PersonProxy {

	
	PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}
	
	
	PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}
}
