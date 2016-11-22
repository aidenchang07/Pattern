package com.jikexueyuan.adapter.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * �T�|�P���N���A�t��
 * @author robinaiden
 *
 */
public class EnumerationIteration implements Iterator<Object> {
	
	private Enumeration enumeration;
	
	public EnumerationIteration(Enumeration enumeration) {
		// TODO Auto-generated constructor stub
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enumeration.nextElement();
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
