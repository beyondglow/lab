package com.yifeng.lab.design.singleton;

public class TestMyClass {

	public static void main(String[] args) {
//		MyClass mc = new MyClass();
		
		/**
		 * 1.私有化参数和构造方法
		 * 2.提供一个对外创建对象的静态方法
		 */
//		Singleton singleton = new Singleton();
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2);
		//两次创建的对象一致
	}

}
