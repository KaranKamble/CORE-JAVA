package com.main;

class Employee {
	private String name;
	private int age;
	private int empId;
	private float salary;
	
	public Employee() {
		this.name = " ";
		this.age = 0;
		this.empId = 0;
		this.salary = 0;
	}

	public Employee(String name, int age, int empId, float salary) {
		this.name = name;
		this.age = age;
		this.empId = empId;
		this.salary = salary;
	}

	public void displayRecord() {
		System.out.println("Name  : " + this.name);
		System.out.println("AGE   : " + this.age);
		System.out.println("empid  : " + this.empId);
		System.out.println("Salary   : " + this.salary);
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayRecord();
	}
}
