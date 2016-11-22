package com.jikexueyuan.adapter.adapter;

import com.jikexueyuan.adapter.duck.Duck;
import com.jikexueyuan.adapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		// TODO Auto-generated constructor stub
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 6; i++){
			turkey.fly();
		}
	}

}
