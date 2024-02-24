package com.main;

public class Program {

	public static void sum(int... arguments) {
		int result = 0;
		for (int element : arguments)
			result = result + element;
		System.out.println("SUM IS :" + result);
	}

	public static void main(String[] args) {
		Program.sum();
		Program.sum(10, 20, 30);
		Program.sum(10, 20, 30, 50, 60);
		Program.sum(10, 20, 30, 50, 60, 70, 80, 90, 100);
	}
}
