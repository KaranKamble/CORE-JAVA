package com.main;

import java.util.Scanner;

class Employee{
	private String name;
	private int empid;
	private float sal;
	
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		this.name=sc.nextLine();
		System.out.println("Enter Employee Id :");
		this.empid=sc.nextInt();
		System.out.println("Enter Employee Salary :");
		this.sal=sc.nextFloat();
	}
	public void printRecord() {
		System.out.println("Name :"+this.name);
		System.out.println("Employee Id :"+this.empid);
		System.out.println("Employee Salary :"+this.sal);

	}
	
}

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.acceptRecord();
		emp.printRecord();
		

	}

}
