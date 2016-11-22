package com.aiden.brige;

/**
 * 電腦類型
 * 
 * @author robinaiden
 *
 */
public abstract class Computer {

	/* 具備品牌、子類會用到所以設定protected */
	protected Brand brand;

	public Computer(Brand b) {
		this.brand = b;
	}

	public abstract void sale();

}
