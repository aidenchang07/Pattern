package com.aiden.brige;

public class Laptop extends Computer {

	public Laptop(Brand b) {
		super(b);
	}

	@Override
	public void sale() {
		System.out.println("���O���q���I");
		brand.sale();
	}

}
