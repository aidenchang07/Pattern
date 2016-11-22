package com.aiden.state;

/**
 * 空閒狀態
 * 
 * @author robinaiden
 *
 */
public class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("房間空閒！");
	}

}
