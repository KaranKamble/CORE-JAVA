package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void writeRecord(String pathName) throws Exception {
		
		 try( BufferedWriter writer = new BufferedWriter( new FileWriter(new File(pathName) ) ) ){
			 writer.write("Karan");
			 writer.newLine();
			 writer.write("Student");
			 writer.newLine();
			 writer.write("Sangli");
			 writer.newLine();
			 writer.write("CDAC");
		 }
	}

	public static void readRecord(String pathName) throws Exception {
		try( BufferedReader reader = new BufferedReader( new FileReader(new File(pathName) ) ) ){
			String line = null;
			while( ( line = reader.readLine() ) != null ) {
				System.out.println(line);
			}
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

					Program.writeRecord("File.txt");

					break;

				case 2:
					Program.readRecord("File.txt");
					break;
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}
