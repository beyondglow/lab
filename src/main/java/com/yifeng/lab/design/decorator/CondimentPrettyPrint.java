package com.yifeng.lab.design.decorator;

import java.util.ArrayList;
/**
 * 最外层装饰者，解析最后的数据，就知道是否为双倍摩卡、双倍奶泡了
 * @author yh
 *
 */
public class CondimentPrettyPrint extends CondimentDecorator {
	
	private Beverage beverage; 

	public CondimentPrettyPrint(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public int getSize() {
		return beverage.getSize();
	}


	@Override
	public ArrayList<String> getDescription() {
		ArrayList<String> descriptionList = beverage.getDescription();
		for (int i = 0;i<descriptionList.size();i++) {
			int j = i+1;
			for (;j<descriptionList.size();j++) {
				if (descriptionList.get(i) == descriptionList.get(j)) {
					descriptionList.set(i, "double "+ descriptionList.get(i));
					descriptionList.remove(j);
				}
			}
		}
		descriptionList.set(0, "a cup " +  Beverage.dic.get(beverage.getSize()) + " " + descriptionList.get(0));
		return descriptionList;
	}

	@Override
	public double cost() {
		return beverage.cost();
	}

}
