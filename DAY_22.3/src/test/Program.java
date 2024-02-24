package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void writeRecord(String pathName) throws Exception {
		// try with resources
		// try(FileOutputStream outputStream = new FileOutputStream(new
		// File(pathName));){
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(new File(pathName));
			for (char ch = 'A'; ch <= 'Z'; ++ch)
				outputStream.write(ch);
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public static void readRecord(String pathName) throws Exception {
		// try with resources
		// try(FileInputStream inputStream = new FileInputStream(new File(pathName));){
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File(pathName));
			int data;
			while ((data = inputStream.read()) != -1) {
				System.out.print( (char)data + " ");
			}
			System.out.println();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {

				e.printStackTrace();
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
