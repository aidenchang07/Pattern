package com.aiden.command;

public class Invoke {

	/**
	 * 也可使用List<Command>來容納許多命令，而這邊只使用一個命令
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
