package com.main;

class Employee {
	private String name;
	private int empid;
	private float salary;

	public Employee(String name, int empid, float salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public void printRecord() {
		System.out.println("Name         :" + name);
		System.out.println("Empid        :" + empid);
		System.out.println("Salary       :" + salary);
	}

	// Employee this = emp1;
	// Object obj = emp2; //upcasting
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Employee other = (Employee) obj;
			if (this.empid == other.empid)
				return true;
			//else 
			//	return false;
		}
		return false;

	}
}

public class Program {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Karan", 32, 80000);
		Employee emp2 = new Employee("Karan", 32, 80000);
		
		if (emp1.equals(emp2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}

}
