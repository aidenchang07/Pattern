package com.aiden.brige;

public class Client {

	public static void main(String[] args) {

		/* �P���p�Q�q�� */
		Computer c = new Desktop(new Lenovo());
		c.sale();

		Computer c2 = new Laptop(new Dell());
		c2.sale();

	}

}
