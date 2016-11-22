package com.aiden.state;

/**
 * 已預定狀態
 * 
 * @author robinaiden
 *
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("已預訂房間！");
	}

}
