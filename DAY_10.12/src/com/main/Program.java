package com.main;

public class Program {

	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		Program.swap(a, b);
		
		System.out.println(" A : " + a);
		System.out.println(" B : " + b);
	}

	public static void main1(String[] args) {
		int a = 10;
		int b = 20;

		int temp = a;
		a = b;
		b = temp;

		System.out.println(" A : " + a);
		System.out.println(" B : " + b);
	}
}
