package com.main;

class Person {
	private String name;
	private int age;

	public Person() {
		this(" ", 0);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showRecord() {
		System.out.println("Name  : " + this.name);
		System.out.println("AGE   : " + this.age);
	}
}

class Employee extends Person {
	private int empId;
	private float salary;

	public Employee() {
		this.empId = 0;
		this.salary = 0;
	}

	public Employee( String name, int age, int empId, float salary) {
		super(name,age);
		this.empId = empId;
		this.salary = salary;
	}

	public void displayRecord() {
		this.showRecord();
		System.out.println("EMPID    : " + this.empId);
		System.out.println("SALARY   : " + this.salary);
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayRecord();
	}
}
