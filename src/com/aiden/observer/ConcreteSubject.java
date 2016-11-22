package com.aiden.observer;

public class ConcreteSubject extends Subject {

	private int state;

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(int state) {
		this.state = state;
		// �ڪ����A���ܤƤF�A�гq���Ҧ��[���
		this.notifyAllObserver();
	}

}
