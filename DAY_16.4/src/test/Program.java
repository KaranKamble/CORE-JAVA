package test;

import java.util.Arrays;

public class Program {

	public static void print(int[] arr) {
		if( arr != null ) {
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 1, 4, 2, 3 };
		Program.print(arr);
		Arrays.sort(arr);
		Program.print(arr);

	}

}
