package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void writeRecord(String pathName) throws Exception {
		
		 try(DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathName))));){
		 
			outputStream.writeUTF("Karan");
			outputStream.writeInt(32);
			outputStream.writeFloat(45000.00f);
			
		} 

	}

	public static void readRecord(String pathName) throws Exception {
		
		try(DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(pathName))));){
			String name = inputStream.readUTF();
			int empId = inputStream.readInt();
			float salary = inputStream.readFloat();
			System.out.println(name+" "+empId+" "+salary);
			
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
