package com.aiden.brige;

/**
 * �q������
 * 
 * @author robinaiden
 *
 */
public abstract class Computer {

	/* ��ƫ~�P�B�l���|�Ψ�ҥH�]�wprotected */
	protected Brand brand;

	public Computer(Brand b) {
		this.brand = b;
	}

	public abstract void sale();

}
