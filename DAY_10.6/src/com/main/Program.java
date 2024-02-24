package com.main;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	private static void printRecord(int arr[][]) {
		if(arr!=null) {
			for(int row=0;row<4;++row) {
				for(int column=0;column<3;++column) {
					System.out.print(arr[row][column]+"   ");
				}
				System.out.println();
			}
		}	
	}
	

	public static void main(String[] args) {
		//int arr[][] = new int [][] { {1,2,3},{4,5,6},{7,8,9},{10,11,12}};//OK
		int arr[][] = { {1,2,3},{4,5,6},{7,8,9},{10,11,12}};			  //OK
		Program.printRecord(arr);
	}
	
	
}
