package com.main;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int arr[][]) {
		if(arr!=null) {
			for(int row=0;row<4;++row) {
				for(int column=0;column<3;++column) {
					System.out.println("Enter Number : ");
					arr[row][column]=sc.nextInt();
					
				}
			}
		}
}
	private static void printRecord(int arr[][]) {
		if(arr!=null) {
			for(int row=0;row<4;++row) {
				for(int column=0;column<3;++column) {
					System.out.print(" "+arr[row][column]);
				}
				System.out.println();
			}
		}	
	}
	

	public static void main(String[] args) {
		int arr[][] = new int [4][3];
		Program.acceptRecord(arr);
		Program.printRecord(arr);
	}
}
