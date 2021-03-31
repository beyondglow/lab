package com.yifeng.lab.design.adapterAdAppearance;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
	
	private Enumeration enm;

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enm.hasMoreElements();
	}

	@Override
	public Object next() {
		return enm.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	

}
