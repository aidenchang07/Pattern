package com.aiden.observer;

/**
 * 
 * @author robinaiden
 * ���: 2016/11/13
 */
public class Client {

	public static void main(String[] args) {
		//�ؼй�H
		ConcreteSubject subject = new ConcreteSubject();
		
		//�Ыئh���[���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//�N�o3���[��̡A�[�J��Subject���[��̶��
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		//����Subject��State���A
		subject.setState(3000);
		System.out.println("---------------");
		//�ڭ̬ݬݡA�[��̪����A�O���O�]����ܤ�
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//����Subject��State���A
		subject.setState(1000);
		System.out.println("---------------");
		//�ڭ̬ݬݡA�[��̪����A�O���O�]����ܤ�
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
	}

}
