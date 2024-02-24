package com.main;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord(int[]arr) {
		if(arr!=null) {
		for(int index=0;index<arr.length;index++) {
			System.out.println("Enter Element : ");
			arr[index]=sc.nextInt();
		}
	}
}

	public static void showRecord(int[] arr) {
		if(arr!=null) {
			for(int index=0;index<arr.length;index++)
				System.out.println("Element is : "+arr[index]);
		}		
}

	public static void main4(String[] args) {
		int arr[] = new int[3];
		Program.acceptRecord(arr);
		Program.showRecord(arr);
		
		int arr1[] = new int[5];
		Program.acceptRecord(arr1);
		Program.showRecord(arr1);
		                    
	}
	
	
	
	
	
	
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int index=0;index<3;index++) {
			System.out.println("Enter Element : ");
			arr[index]=sc.nextInt();
		}
		for(int index=0;index<3;index++)
			System.out.print(arr[index]+" ");
	}
	
	
	
	
	
	public static void main2(String[] args) {
		int arr[] = new int[3];
		for(int index=0;index<3;index++) {
			System.out.println(arr[index]);
		}
	}
	
	
	
	
	public static void main1(String[] args) {
		int arr[] = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
}
