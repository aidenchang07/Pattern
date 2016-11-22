package com.aiden.state;

/**
 * 房間對象
 * 
 * @author robinaiden
 *
 */
public class HomeContext {
	/**
	 * 如果是銀行系統，這個Context類就是帳號。根據金額不同，切換不同狀態。
	 */
	private State state;

	public void setState(State s) {
		System.out.println("修改狀態！");
		this.state = s;
		this.state.handle();
	}

}
