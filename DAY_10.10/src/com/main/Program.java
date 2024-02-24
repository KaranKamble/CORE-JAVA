package com.main;

import java.util.Arrays;

//Array of references
class Complex{
	private int real;
	private int imag;
	
	public void print() {
		System.out.println(this.real+" "+this.imag);
	}
}
public class Program {
	public static void main(String[] args) {
		Complex[] arr = new Complex[3];	
		for( int index = 0; index < arr.length; ++index)
			arr[ index ].print();  	 		//NullPointerException
	}
	public static void main1(String[] args) {
		Complex[] arr = new Complex[3];			//Array of references
		System.out.println(Arrays.toString(arr));//[null, null, null]
	}
	
}
