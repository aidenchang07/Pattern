package com.aiden.observer;

/**
 * 
 * @author robinaiden
 * 日期: 2016/11/13
 */
public class Client {

	public static void main(String[] args) {
		//目標對象
		ConcreteSubject subject = new ConcreteSubject();
		
		//創建多個觀察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//將這3個觀察者，加入到Subject的觀察者隊伍中
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		//改變Subject的State狀態
		subject.setState(3000);
		System.out.println("---------------");
		//我們看看，觀察者的狀態是不是也跟著變化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//改變Subject的State狀態
		subject.setState(1000);
		System.out.println("---------------");
		//我們看看，觀察者的狀態是不是也跟著變化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
	}

}
