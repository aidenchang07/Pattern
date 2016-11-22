package com.aiden.brige;

public class Desktop extends Computer {

	public Desktop(Brand b) {
		super(b);
	}

	@Override
	public void sale() {
		System.out.println("桌上型電腦！");
		brand.sale();
	}

}
