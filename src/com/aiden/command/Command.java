package com.aiden.command;

public interface Command {
	/**
	 * 命令的執行 在實際項目中，可以根據需求來設計多個不同的方法
	 */
	void execute();
}
