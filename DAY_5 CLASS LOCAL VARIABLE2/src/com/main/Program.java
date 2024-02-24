package com.main;

class Test {
	private int a;
	private int b;
	private static int c;

	public Test() {
		this(10, 20);
		Test.c = 500;
	}

	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void printRecord() {
		System.out.println("First Number :" + this.a);
		System.out.println("Second Number :" + this.b);
		System.out.println("Third Number :" + Test.c);
	}
}

public class Program {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.printRecord();
		System.out.println();
		t1.printRecord();

	}

}