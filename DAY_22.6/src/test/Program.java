package test;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable{
	private static final long serialVersionUID = 8978519417726676166L;	//Exceptional Case
	private String name;
	private int empId;
	private transient float Salary;
	
	public Employee(String name, int empId, float salary) {
		this.name = name;
		this.empId = empId;
		Salary = salary;
	} 

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", Salary=" + Salary + "]";
	}
	
}
public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void writeRecord(String pathName) throws Exception {
		
		 try(ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathName))));){
		 
			 Employee emp = new Employee("Karan",32,80000.00f);
			
			 outputStream.writeObject(emp);
			
		} 

	}

	public static void readRecord(String pathName) throws Exception {
		
		try(ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(pathName))));){
			Employee emp = (Employee)inputStream.readObject();
			System.out.println(emp.toString());
			
			}
			
		} 

	

	public static int menuList() {
		System.out.println("0. Exit : ");
		System.out.println("1. Write Record : ");
		System.out.println("2. Read Record : ");
		System.out.println("3. Enter choice : ");
		return sc.nextInt();

	}

	public static void main(String[] args) {

		int choice;
		while ((choice = Program.menuList()) != 0) {
			try {
				switch (choice) {
				case 1:

					Program.writeRecord("File.dat");

					break;

				case 2:
					Program.readRecord("File.dat");
					break;
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}
