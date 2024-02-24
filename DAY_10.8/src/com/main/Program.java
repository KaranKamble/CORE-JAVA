package com.main;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(int arr[][]) {
		if (arr != null) {
			for (int row = 0; row < arr.length; ++row) {
				for (int column = 0; column < arr[row].length; ++column) {
					System.out.print("Enter Number : ");
					arr[row][column] = sc.nextInt();

				}
			}
		}
	}

	private static void printRecord(int arr[][]) {
		if (arr != null) {
			for (int row = 0; row < arr.length; ++row) {
				for (int column = 0; column < arr[row].length; ++column) {
					System.out.print(" " + arr[row][column]);
				}
				System.out.println();
			}
		}
	}

	public static void displayRecord(int[][] arr) {
		if( arr != null) {
			for( int[] i : arr ) {
				for( int j : i )
					System.out.print(j+"  ");
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int arr[][] = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		arr[3] = new int[3];

		Program.acceptRecord(arr);
		Program.printRecord(arr);
		System.out.println();
		Program.displayRecord(arr);
	}

}
