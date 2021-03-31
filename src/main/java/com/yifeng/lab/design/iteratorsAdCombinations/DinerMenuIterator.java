package com.yifeng.lab.design.iteratorsAdCombinations;

import java.util.Iterator;
import java.util.List;

public class DinerMenuIterator implements Iterator {
	
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
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
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public void remove() {
		if (position <=0) {
			throw new IllegalStateException("you can't remove an item until you've done at least one next()");
		};
		
		if (items[position] != null) {
			for (int i = position-1; i<(items.length-1); i++) {
				items[i] = items[i+1];
			}
			items[items.length - 1] = null;
		}
	}
	
}
