package com.main;

public class Program {
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("addition :" + result);
	}

	public static void add(int num1, double num2) {
		double result = num1 + num2;
		System.out.println("addition :" + result);

	}

	public static void main(String[] args) {
		Program.add(10, 20);
		Program.add(30, 40.5);

	}

}
