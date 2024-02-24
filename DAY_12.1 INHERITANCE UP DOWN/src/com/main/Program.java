package com.main;

class Base{
	int num1;
	int num2;
	
	public Base() {
		this(0,0);
	}
	public Base(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}


class Derived extends Base{
	int num3;
	
	public Derived() {
		this.num3=0;
	}
	public Derived(int num3) {
		this.num3=num3;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	
}
public class Program {

	public static void main(String[] args) {
		Base base = new Derived();				//upcasting
		
		base.setNum1(10);
		base.setNum2(20);
	//	base.setNum3(30);
		
		Derived derived=(Derived)base;			//downcasting
		derived.setNum3(30);
		
		System.out.println("Num1 : "+base.getNum1());
		System.out.println("Num2 : "+base.getNum2());
		System.out.println("Num3 : "+derived.getNum3());

	}

}
