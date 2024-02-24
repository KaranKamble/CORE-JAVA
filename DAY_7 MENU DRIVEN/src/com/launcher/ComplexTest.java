package com.launcher;

import java.util.Scanner;

import com.model.Complex;

public class ComplexTest {

	static Scanner sc = new Scanner(System.in);
	Complex complex = new Complex();

	public void acceptRecord() {
		if (this.complex != null) {
			System.out.println("Real number :");
			complex.setReal(sc.nextInt());
			System.out.println("Imag number :");
			complex.setImag(sc.nextInt());
		}
	}

	public void printRecord() {
		if (this.complex != null) {
			System.out.println("real number :" + this.complex.getReal());
			System.out.println("imag number :" + this.complex.getImag());
		}
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.println("Enter Choice : ");

		return sc.nextInt();
		// int choice=sc.nextInt();
		// return=choice;

	}

}
