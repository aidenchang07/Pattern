package com.aiden.observer2;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		ObserveA obs1 = new ObserveA();
		ObserveA obs2 = new ObserveA();
		ObserveA obs3 = new ObserveA();
		
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		subject.set(3000);
		System.out.println("-----狀態已修改-----");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		subject.set(1000);
		System.out.println("-----狀態已修改-----");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
	}
}
