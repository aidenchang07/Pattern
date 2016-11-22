package com.aiden.command;

public class Client {

	public static void main(String[] args) {
		/* 看你要選擇哪個命令(ConcreteCommand) */
		Command c = new ConcreteCommand(new Receiver());

		/* 儲存命令用 */
		Invoke i = new Invoke(c);

		/* 上面已選擇哪個命令後，這裡就開始執行！ */
		i.call();
	}

}
