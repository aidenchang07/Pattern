package com.jikexueyuan.interpreter.expresstion;

import java.util.HashMap;

public class VarExpresstion extends AbstractExpresstion {
	
	private String key;
	
	public VarExpresstion(String _key) {
		// TODO Auto-generated constructor stub
		this.key = _key;
	}
	
	@Override
	public Float interpreter(HashMap<String, Float> var) {
		// TODO Auto-generated method stub
		return var.get(this.key);
	}

}
