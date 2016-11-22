package com.aiden.command;

public class ConcreteCommand implements Command {

	/**
	 * �u�����R�O����� Command�PReceiver(������)�j�w
	 */
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		/* �u������R�O�e�A�i�H���@�ǳB�z */
		receiver.action();
	}

}
