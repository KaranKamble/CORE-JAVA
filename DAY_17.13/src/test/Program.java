package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void acceptRecord(int[] element) {
		if (element != null) {
			System.out.println("Enter element : ");
			element[0] = sc.nextInt();
		}
	}

	public static void printRecord(Integer value) {
		if (value != null)
			System.out.println("elemen found at Index " + value);
	}

	public static void printRecord(boolean removedStatus) {
		if (removedStatus)
			System.out.println("element is romoved");
		else
			System.out.println("element is not romoved");
	}

	public static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Add Element");
		System.out.println("2. Find Element");
		System.out.println("3. Remove Element");
		System.out.println("4. Print Element (Sorted)");
		System.out.println("Enter choice  : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		int[] element = new int[1];// To pass by reference
		ListTest test = new ListTest();
		test.setList(new ArrayList<Integer>());
		test.setList(new Vector<Integer>());
		test.setList(new LinkedList<Integer>());
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				Program.acceptRecord(element);
				test.add(element[0]);
				break;
			case 2:
				Program.acceptRecord(element);
				Integer value = test.find(element[0]);
				Program.printRecord(value);
				break;
			case 3:
				Program.acceptRecord(element);
				boolean removedStatus = test.remove(element[0]);
				Program.printRecord(removedStatus);
				break;
			case 4:
				test.print();
				break;
			}
		}
	}
}
