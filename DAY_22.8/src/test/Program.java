package test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void writeRecord(String pathName) throws Exception {
		 try(FileWriter writer = new FileWriter(new File(pathName))){
			 for(char ch = 'A'; ch <= 'Z';++ch)
				 writer.write(ch);
		 }
	}

	public static void readRecord(String pathName) throws Exception {
		try(FileReader reader = new FileReader(new File(pathName))){
			int data;
			while( ( data = reader.read()) != -1 ) {
				System.out.print((char)data+" ");
			}
			System.out.println();
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
