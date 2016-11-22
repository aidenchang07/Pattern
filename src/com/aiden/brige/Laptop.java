package com.aiden.brige;

public class Laptop extends Computer {

	public Laptop(Brand b) {
		super(b);
	}

	@Override
	public void sale() {
		System.out.println("筆記型電腦！");
		brand.sale();
	}

}
