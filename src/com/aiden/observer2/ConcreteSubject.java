package com.aiden.observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable{
	private int state;
	
	public void set(int s){
		this.state = s;
		setChanged();
		notifyObservers(state);
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getState() {
		return this.state;
	}

}
