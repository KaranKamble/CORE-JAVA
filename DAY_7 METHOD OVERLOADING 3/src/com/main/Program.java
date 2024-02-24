package com.main;

public class Program {
	public static void add(int num1, float num2) {
		float result = num1 + num2;
		System.out.println("addition :" + result);
	}

	public static void add(float num1, int num2) {
		float result = num1 + num2;
		System.out.println("addition :" + result);

	}

	public static void main(String[] args) {
		Program.add(10, 20.0f);
		Program.add(30.0f, 40);

	}

}
