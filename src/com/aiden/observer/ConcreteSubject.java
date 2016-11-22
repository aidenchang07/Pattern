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
		// 我的狀態有變化了，請通知所有觀察者
		this.notifyAllObserver();
	}

}
