package com.yifeng.lab.design.proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		PersonProxy proxy = new PersonProxy();
		
		PersonBean joe = new PersonBeanImpl();
		joe.setName("小明");
		joe.setInterests("打篮球");
		joe.setGender("男");
		
		PersonBean ownerJoe = proxy.getOwnerProxy(joe);
		System.out.println("姓名："+ownerJoe.getName());
		ownerJoe.setInterests("打人");
		System.out.println("兴趣已经设置成打人了");
		try {
			ownerJoe.setHotOrNotRating(8);
		} catch (Exception e) {
			System.out.println("不要自己给自己打分，你这是作弊");
		}
		
		PersonBean nonOwnerJoe = proxy.getNonOwnerProxy(joe);
		System.out.println("姓名：" + nonOwnerJoe.getName());
		nonOwnerJoe.setHotOrNotRating(8);
		
		nonOwnerJoe.setHotOrNotRating(10);
		System.out.println("Joe的最终评分是：" + nonOwnerJoe.getHotOrNotRating());
		try {
			nonOwnerJoe.setInterests("打手枪");
		} catch (Exception e) {
			System.out.println("你怎么能去改joe的兴趣呢");
		}
	}

}
