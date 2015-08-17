package com.tzr.tij.string;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
	private String name;
	/*
	 * 在Java中，所有的新格式化功能都由java.util.Formatter类处理，可以将
	 * Formatter看做一个翻译器，它将你的格式化字符串与数据翻译成需要的结果
	 */
	private Formatter formatter;

	public Turtle(String name, Formatter formatter) {
		this.name = name;
		this.formatter = formatter;
	}

	public void move(int x, int y) {
		formatter.format("%s The Turtle is at (%d,%d)\n", name, x, y);
	}

	public static void main(String[] args) {
		PrintStream outAlias = System.out;
		Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
		Turtle terry = new Turtle("Terry", new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);

	}

}