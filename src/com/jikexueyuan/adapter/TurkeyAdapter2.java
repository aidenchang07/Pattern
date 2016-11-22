package com.jikexueyuan.adapter;

import com.jikexueyuan.adapter.duck.Duck;
import com.jikexueyuan.adapter.turkey.WildTurkey;

/**
 * ���A�t��
 * @author robinaiden
 *
 */
public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		super.gobble();
	}
	
	@Override
	public void fly() {
		super.fly();
		super.fly();
		super.fly();
	}
	
}
