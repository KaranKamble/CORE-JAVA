package test;

public class Employee implements Comparable<Employee>{
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

	@Override
	public int compareTo(Employee other) {
		return this.empId - other.empId;
	}
	
	public boolean equals(Object obj) {
		if (obj != null) {
			Employee other = (Employee) obj;
			if (this.empId == other.empId)
				return true;
			return false;
		}
		return false;
	}

	public String toString() {
		return String.format("%-10d%-15s%-15s%-15s%-10.2f%-15s", this.empId, this.name, this.job, this.hireDate,
				this.Salary, this.department);
	}

	
}
