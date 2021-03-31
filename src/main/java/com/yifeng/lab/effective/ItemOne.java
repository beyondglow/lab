package com.yifeng.lab.effective;

/**
 * <p>Title: effective<／p>
 * <p>Description: Consider static factory methods instead of constructors<／p>
 * @author yh
 * @date 2020年12月7日 上午10:29:45
 */
public class ItemOne {
	
	//This method translates a boolean primitive value into a Boolean object reference
	//advantage1：One advantage of static factory methods is that, unlike constructors, they have names.
	//advantage2:A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they’re invoked
	//advantage3:A third advantage of static factory methods is that, unlike constructors,they can return an object of any subtype of their return type
	//advantage4:A fourth advantage of static factories is that the class of the returned object can vary from call to call as a function of the input parameters
	public static Boolean valueOf(boolean b){
		return b ? Boolean.TRUE : Boolean.FALSE;
	}
	
}
