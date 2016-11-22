package com.aiden.observer;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeHost;

/**
 * 
 * @author robinaiden
 *
 */
public class Subject {

	protected List<Observer> observerList = new ArrayList<Observer>();

	public void registerObserver(Observer obs) {
		observerList.add(obs);
	}

	public void removeObserver(Observer obs) {
		observerList.remove(obs);
	}

	/**
	 * 通知所有觀察者更新自己的狀態
	 */
	public void notifyAllObserver() {
		for (Observer observer : observerList) {
			observer.update(this);
		}
	}

}
