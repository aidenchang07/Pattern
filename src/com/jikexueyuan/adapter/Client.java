package com.jikexueyuan.adapter;

import com.jikexueyuan.adapter.adapter.TurkeyAdapter;
import com.jikexueyuan.adapter.duck.Duck;
import com.jikexueyuan.adapter.duck.GreenHeadDuck;
import com.jikexueyuan.adapter.turkey.WildTurkey;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenHeadDuck duck = new GreenHeadDuck();
		WildTurkey turkey = new WildTurkey();
		
		/* ��H�A�t�����g�k */
		Duck duck2turkeyAdapter = new TurkeyAdapter(turkey);
		
		/* ���A�t�����g�k */
		//Duck duck2turkeyAdapter = new TurkeyAdapter2();
		
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();
	}

}
