package com.main;

public class Program {
//Array of primitive type
	
	public static void main(String[] args) {
		boolean[] arr = new boolean [3];
		for( boolean index : arr )
			System.out.print(index+" ");
	}
	public static void main1(String[] args) {
		int[]arr = new int[3];
		for(int index = 0; index < 3; ++index)
			System.out.print(arr[ index ]+"  ");
	}
}
