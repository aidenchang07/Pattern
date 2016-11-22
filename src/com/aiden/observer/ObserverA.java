package com.aiden.observer;

public class ObserverA implements Observer {

	// myState 與 Subject 的 State 需保持一致
	private int myState;

	@Override
	public void update(Subject subject) {
		this.myState = ((ConcreteSubject)subject).getState();
	}

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

}
