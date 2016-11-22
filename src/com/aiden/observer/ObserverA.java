package com.aiden.observer;

public class ObserverA implements Observer {

	// myState �P Subject �� State �ݫO���@�P
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
