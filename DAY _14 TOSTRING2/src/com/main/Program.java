package com.main;

class Employee {
	private String name;
	private int empid;
	private String department;
	private String designation;
	private float salary;

	public Employee(String name, int empid, String department, String designation, float salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public void printRecord() {
		System.out.println("Name         :" + name);
		System.out.println("Empid        :" + empid);
		System.out.println("Department   :" + department);
		System.out.println("Designation  :" + designation);
		System.out.println("Salary       :" + salary);
	}

	/*
	 * @Override public String toString() { return "Employee [name=" + name +
	 * ", department=" + department + ", designation=" + designation + "]"; }
	 */

	@Override
	public String toString() {
		// return this.name+" "+this.empid+" "+this.department+" "+this.designation+"
		// "+this.salary ;
		// OR
		return String.format("%-10s%-15s%-15s", name, department, designation);
	}

}

public class Program {

	public static Employee[] getEmployee() {
		Employee[] arr = new Employee[3];
		arr[0] = new Employee("Karan", 32, "Mechanical", "Student", 80000);
		arr[1] = new Employee("Tanmay", 77, "Civil", "Student", 90000);
		arr[2] = new Employee("Rushi", 59, "Mechanical", "Student", 85000);
		return arr;
	}

	private static void printRecord(Employee[] employees) {
		if (employees != null) {
			for (Employee employee : employees) {
				System.out.println(employee.toString());
			}
		}

	}

	public static void main(String[] args) {
		Employee[] employees = Program.getEmployee();
		Program.printRecord(employees);

	}

}
