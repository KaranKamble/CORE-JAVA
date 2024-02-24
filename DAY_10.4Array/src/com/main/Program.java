package com.main;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static void main6(String[] args) {
		int arr[]=new int[] {10,20,30};
		for(int element : arr) {
			System.out.println(element);
		}
	}		//OR
	public static void main5(String[] args) {
		int arr[] = new int[] {10,20,30} ;
		for(int index = 0; index<arr.length;index++ ) {
			System.out.println(arr[index]);
		}
	}
	
	
	
	
	
	
	public static void main4(String[] args) {
		int arr[] = new int[] {40,50,20,10};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	public static void main3(String[] args) {
		int arr[] = new int[] {10,20,30};
		int element = arr[0];
		System.out.println("Element : "+element);
	}
	
	
	
	public static void main2(String[] args) {
		//int[] arr= new int[] {10,20,30};	//OK
		//int arr[] = new int [3] {10,20,30};	//NOT OK
		//int arr[] = new int [3];   				//OK
		int arr[] = {10,20,30};						//OK
		
		System.out.println(Arrays.toString(arr));
				
	}
	
	
	
	public static void main1(String[] args) {
		int arr[] = new int[10];
		//System.out.println(Arrays.toString(arr));
		
		String str= Arrays.toString(arr);
		System.out.println(str);
	}
}
