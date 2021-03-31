package com.yifeng.lab.design.singleton;

public class Singleton {
	
	private static Singleton singletonUniqueInstance;
	
//	private static Singleton singletonUniqueInstance = new Singleton();//急切创建实例，这段代码保证了线程安全

	private Singleton() {};
	
	/**
	 * 加synchronized是解决了多线程下的问题，但是会影响性能
	 * 确实不好，问题比想象中要严重，只有第一次执行这个方法时才真正需要同步。换句话说，一旦设置了uniqueInstance变量，就不需要再同步这个方法了
	 * 之后再次调用同步就是一种累赘
	 * 
	 * 
	 * @return
	 */
//	public static synchronized Singleton getInstance(){//确保在多线程环境下，并发竞争创建对象导致重复。保证只能一个线程进入该方法
//		if (singletonUniqueInstance == null) {
//			singletonUniqueInstance =  new Singleton();
//		}
//		return singletonUniqueInstance;
//	}
	
	/**
	 * 急切创建实例
	 * @return
	 */
	public static synchronized Singleton getInstance(){//确保在多线程环境下，并发竞争创建对象导致重复。保证只能一个线程进入该方法
		return singletonUniqueInstance;
	}
	
	/**
	 * 双重检查加锁
	 * 首先判断对象创建了没，如果没创建就加锁创建。已经创建就不会继续进行加锁判断了
	 * 限java1.5以后
	 * @return
	 */
//	public static synchronized Singleton getInstance(){//确保在多线程环境下，并发竞争创建对象导致重复。保证只能一个线程进入该方法
//		if (singletonUniqueInstance == null) {
//			synchronized(Singleton.class) {
//				if (singletonUniqueInstance == null) {
//					singletonUniqueInstance =  new Singleton();
//				}
//			}
//		}
//		return singletonUniqueInstance;
//	}
	
	
	
}
