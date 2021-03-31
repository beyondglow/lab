package com.yifeng.lab.design.iteratorsAdCombinations;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {
	
	MenuItem[] items;
	int position;
	
	public AlternatingDinerMenuIterator (MenuItem[] items) {
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem item = items[position];
		position = position + 1;
		return item;
	}
	
	public void remove(){
		throw new UnsupportedOperationException("Alternation Diner Menu Iterator does not support remove()");
	}

}
