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
	/*	arr[ 0 ] = new Complex();
		arr[ 1 ] = new Complex();
		arr[ 2 ] = new Complex();
		
	*/	//OR
		for( int index = 0; index < arr.length; ++index)
			arr[ index ] = new Complex();
		
		for( int index = 0; index < arr.length; ++index)
			arr[ index ].print();  	 		
	}
	 
	
}
