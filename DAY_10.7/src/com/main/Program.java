package com.main;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	private static void printRecord(int arr[][]) {
		if(arr!=null) {
			for( int[] i : arr ) {
				for( int element : i ) {
					System.out.print(element+" ");
				}
				System.out.println();
			}
		}	
	}
	

	private static void displayRecord(int arr[][]) {
		if(arr != null) {
			for( int index = 0; index<arr.length; ++index)
				System.out.println(Arrays.toString(arr[index]));
		}
	}
	public static void main(String[] args) {
		//int arr[][] = new int [][] { {1,2,3},{4,5,6},{7,8,9},{10,11,12}};//OK
		int arr[][] = { {1,2,3},{4,5,6},{7,8,9},{10,11,12}};			  //OK
		Program.printRecord(arr);
		System.out.println();
		Program.displayRecord(arr);
	}
	
	
}
