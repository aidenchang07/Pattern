package com.aiden.brige;

public interface ComputerOld {
	void sale();
}

class DesktopOld implements ComputerOld {

	@Override
	public void sale() {
		System.out.println("�P��x�����I");
	}

}

class LaptopOld implements ComputerOld {

	@Override
	public void sale() {
		System.out.println("�P�ⵧ�O���q���I");
	}

}

class PadOld implements ComputerOld {

	@Override
	public void sale() {
		System.out.println("�P�⥭�O�q���I");
	}

}

/* ------------------------------------------------------ */

class LenovoDesktop extends DesktopOld {

	@Override
	public void sale() {
		System.out.println("�P���p�Q�q���I");
	}

}

class LenovoLaptop extends LaptopOld {

	@Override
	public void sale() {
		System.out.println("�P���p�Q���O���q���I");
	}

}

class LenovoPad extends PadOld {

	@Override
	public void sale() {
		System.out.println("�P���p�Q���O�I");
	}

}

/* ------------------------------------------------------ */

class ShenzhouDesktop extends DesktopOld {

	@Override
	public void sale() {
		System.out.println("�P�⯫��q���I");
	}

}

class ShenzhouLaptop extends LaptopOld {

	@Override
	public void sale() {
		System.out.println("�P�⯫�൧�O���q���I");
	}

}

class ShenzhouPad extends PadOld {

	@Override
	public void sale() {
		System.out.println("�P�⯫�७�O�I");
	}

}

/* ------------------------------------------------------ */

class DellDesktop extends DesktopOld {

	@Override
	public void sale() {
		System.out.println("�P�������q���I");
	}

}

class DellLaptop extends LaptopOld {

	@Override
	public void sale() {
		System.out.println("�P���������O���q���I");
	}

}

class DellPad extends PadOld {

	@Override
	public void sale() {
		System.out.println("�P���������O�I");
	}

}
