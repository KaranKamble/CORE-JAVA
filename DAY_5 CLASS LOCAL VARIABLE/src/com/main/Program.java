package com.main;

class Test {
	private int num1;
	private int num2;
	private static int num3;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public static void setNum3(int num3) {
		Test.num3 = num3;
	}

	public int getNum1() {
		return this.num1;
	}

	public int getNum2() {
		return this.num2;
	}

	public static int getNum3() {
		return Test.num3;
	}

	public void printRecord() {
		System.out.println("First Number  :" + this.num1);
		System.out.println("Second Number :" + this.num2);
		System.out.println("Third Number :" + Test.num3);
	}
}

public class Program {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.setNum1(10);
		t1.setNum2(20);
		Test.setNum3(500);
		t1.printRecord();

	}

}
