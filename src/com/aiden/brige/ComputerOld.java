package com.aiden.brige;

public interface ComputerOld {
	void sale();
}

class DesktopOld implements ComputerOld {

	@Override
	public void sale() {
		System.out.println("銷售台式機！");
	}

}

class LaptopOld implements ComputerOld {

	@Override
	public void sale() {
		System.out.println("銷售筆記型電腦！");
	}

}

class PadOld implements ComputerOld {

	@Override
	public void sale() {
		System.out.println("銷售平板電腦！");
	}

}

/* ------------------------------------------------------ */

class LenovoDesktop extends DesktopOld {

	@Override
	public void sale() {
		System.out.println("銷售聯想電腦！");
	}

}

class LenovoLaptop extends LaptopOld {

	@Override
	public void sale() {
		System.out.println("銷售聯想筆記型電腦！");
	}

}

class LenovoPad extends PadOld {

	@Override
	public void sale() {
		System.out.println("銷售聯想平板！");
	}

}

/* ------------------------------------------------------ */

class ShenzhouDesktop extends DesktopOld {

	@Override
	public void sale() {
		System.out.println("銷售神舟電腦！");
	}

}

class ShenzhouLaptop extends LaptopOld {

	@Override
	public void sale() {
		System.out.println("銷售神舟筆記型電腦！");
	}

}

class ShenzhouPad extends PadOld {

	@Override
	public void sale() {
		System.out.println("銷售神舟平板！");
	}

}

/* ------------------------------------------------------ */

class DellDesktop extends DesktopOld {

	@Override
	public void sale() {
		System.out.println("銷售戴爾電腦！");
	}

}

class DellLaptop extends LaptopOld {

	@Override
	public void sale() {
		System.out.println("銷售戴爾筆記型電腦！");
	}

}

class DellPad extends PadOld {

	@Override
	public void sale() {
		System.out.println("銷售戴爾平板！");
	}

}
