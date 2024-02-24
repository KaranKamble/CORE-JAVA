package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int year = sc.nextInt();
		if(year%4 == 0)//expression which return true or false, use realtional operator
			System.out.println(year+" is leap Year");
		else
			System.out.println(year+" is not leap Year");
	}

}
