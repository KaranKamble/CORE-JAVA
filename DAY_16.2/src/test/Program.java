package test;

import java.util.Scanner;

interface Collection{
	void acceptRecord();
	void printRecord();
	int[] toArray();
	
	default void sort() {
		int[]arr = this.toArray();
		
		//Bubble sort
		for( int i = 0; i < arr.length - 1; ++ i ) {
			for( int j = 0; j < arr.length - 1 - i; ++ j ) {
				if( arr[ j ] > arr[ j + 1 ]) {
					int temp = arr[ j ];
					arr[ j ] = arr[ j + 1 ];
					arr[ j + 1 ] = temp;
				}
			}
		}
	}
}

class Array implements Collection{
	private int[] arr;
	
	public Array() {
		arr = new int[5];
	}
	
	@Override
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 5; ++ i) {
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
	}
	
	@Override
	public void printRecord() {
		for(int i = 0; i < 5; ++ i) {
			System.out.print(arr[i]+" ");
		}
	}
	
	@Override
	public int[] toArray() {
		return this.arr;
	}
	
	@Override
	public void sort() {	//Selection sort
		    for( int i = 0; i < this.arr.length - 1; ++ i ) {
		    	for( int j = i + 1; j < arr.length; ++ j ) {
		    		if( arr[ i ] > arr[ j ]) {
						int temp = arr[ i ];
						arr[ i ] = arr[ j ];
						arr[ j ] = temp;
					}
		    	}
		    }
	}
}
public class Program {
public static void main(String[] args) {
	Collection c = new Array();
	c.acceptRecord();
	c.sort();
	c.printRecord();
	
}
}
