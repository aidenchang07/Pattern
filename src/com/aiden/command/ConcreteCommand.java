package com.aiden.command;

public class ConcreteCommand implements Command {

	/**
	 * 真正的命令執行者 Command與Receiver(接收器)綁定
	 */
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		/* 真正執行命令前，可以做一些處理 */
		receiver.action();
	}

}
