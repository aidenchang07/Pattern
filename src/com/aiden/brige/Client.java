package com.aiden.brige;

public class Client {

	public static void main(String[] args) {

		/* 銷售聯想電腦 */
		Computer c = new Desktop(new Lenovo());
		c.sale();

		Computer c2 = new Laptop(new Dell());
		c2.sale();

	}

}
