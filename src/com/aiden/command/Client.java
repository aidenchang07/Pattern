package com.aiden.command;

public class Client {

	public static void main(String[] args) {
		/* �ݧA�n��ܭ��өR�O(ConcreteCommand) */
		Command c = new ConcreteCommand(new Receiver());

		/* �x�s�R�O�� */
		Invoke i = new Invoke(c);

		/* �W���w��ܭ��өR�O��A�o�̴N�}�l����I */
		i.call();
	}

}
