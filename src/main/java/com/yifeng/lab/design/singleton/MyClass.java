package com.yifeng.lab.design.singleton;

public class MyClass {

	/*private MyClass(){//私有化构造只有本类中可以实例化，但任然可以被多次实例化
		
	}*/
	public static MyClass getInstance(){
		return new MyClass();
	}
}
