package com.aiden.state;

/**
 * �ж���H
 * 
 * @author robinaiden
 *
 */
public class HomeContext {
	/**
	 * �p�G�O�Ȧ�t�ΡA�o��Context���N�O�b���C�ھڪ��B���P�A�������P���A�C
	 */
	private State state;

	public void setState(State s) {
		System.out.println("�ק窱�A�I");
		this.state = s;
		this.state.handle();
	}

}
