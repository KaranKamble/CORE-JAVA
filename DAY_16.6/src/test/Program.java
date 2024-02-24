package test;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	private int empId;
	private String name, job, hireDate, department;
	private float Salary;

	public Employee() {

	}

	public Employee(int empId, String name, String job, String hireDate, float salary, String department) {
		this.empId = empId;
		this.name = name;
		this.job = job;
		this.hireDate = hireDate;
		this.department = department;
		Salary = salary;
	}
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	public String toString() {
		return String.format("%-5d%-15s%-15s%-15s%-10.2f%-15s", this.empId, this.name, this.job, this.hireDate,
				this.Salary, this.department);
	}
}


class SortByEmpid implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpId() - emp2.getEmpId();
	}
}

class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}
}

class SortByJob implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getJob().compareTo(emp2.getJob());
	}
}

class SortByHireDate implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getHireDate().compareTo(emp2.getHireDate());
	}
}

class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return (int)( emp1.getSalary() - emp2.getSalary());
	}
}

class SortByDepartment implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getDepartment().compareTo(emp2.getDepartment());
	}
}
public class Program {

	public static Employee[] getEmployees() {
		Employee[] arr = new Employee[14];
		arr[0] = new Employee(7369, "SMITH", "CLERK", "1980-12-17", 800.00f, "RESEARCH");
		arr[1] = new Employee(7499, "ALLEN", "SALESMAN", "1981-02-20", 1600.00f, "SALES");
		arr[2] = new Employee(7521, "WARD", "SALESMAN", "1981-02-22", 1250.00f, "SALES");
		arr[3] = new Employee(7566, "JONES", "MANAGER", "1981-04-02", 2975.00f, "RESEARCH");
		arr[4] = new Employee(7654, "MARTIN", "SALESMAN", "1981-09-28", 1250.00f, "SALES");
		arr[5] = new Employee(7698, "BLAKE", "MANAGER", "1981-05-01", 2850.00f, "SALES");
		arr[6] = new Employee(7782, "CLARK", "MANAGER", "1981-06-09", 2450.00f, "ACCOUNTING");
		arr[7] = new Employee(7788, "SCOTT", "ANALYST", "1982-12-09", 3000.00f, "RESEARCH");
		arr[8] = new Employee(7839, "KING", "PRESIDENT", "1981-11-17", 5000.00f, "ACCOUNTING");
		arr[9] = new Employee(7844, "TURNER", "SALESMAN", "1981-09-08", 1500.00f, "SALES");
		arr[10] = new Employee(7876, "ADAMS", "CLERK", "1983-01-12", 1100.00f, "RESEARCH");
		arr[11] = new Employee(7900, "JAMES", "CLERK", "1981-12-03", 950.00f, "SALES");
		arr[12] = new Employee(7902, "FORD", "ANALYST", "1981-12-03", 3000.00f, "RESEARCH");
		arr[13] = new Employee(7934, "MILLER", "CLERK", "1982-01-23", 1300.00f, "ACCOUNTING");
		return arr;
	}

	public static void print(Employee[] arr) {
		if (arr != null) {
			for (Employee emp : arr)
				System.out.println(emp.toString());
			System.out.println();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Employee[] arr = Program.getEmployees();
		Program.print(arr);
		
		Comparator<Employee> c = null;
		
		c = new SortByName();
		Arrays.sort(arr,c);  // Arrays.sort(arr,new SortByName()); 
		Program.print(arr);   
		
		c = new SortByEmpid();
		Arrays.sort(arr,c);
		Program.print(arr);   
		
		c = new SortByJob();
		Arrays.sort(arr,c);
		Program.print(arr);  
		
		c = new SortByHireDate();
		Arrays.sort(arr,c);
		Program.print(arr);  
		
		c = new SortBySalary();
		Arrays.sort(arr,c);
		Program.print(arr);  
		
		c = new SortByDepartment();
		Arrays.sort(arr,c);
		Program.print(arr);   
		
		
	}

}
