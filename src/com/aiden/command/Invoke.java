package com.aiden.command;

public class Invoke {

	/**
	 * �]�i�ϥ�List<Command>�Ӯe�ǳ\�h�R�O�A�ӳo��u�ϥΤ@�өR�O
	 */
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}

	public void call() {
		command.execute();
	}

}
