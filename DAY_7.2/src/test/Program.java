package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int count = 1;
		while (count <= 10) {
			System.out.println("Count : " + count);
			count = count + 1;
		}
	}

	public static void main1(String[] args) {
		for (int count = 1; count <= 10; ++count) {
			System.out.println("Count : " + count);
		}
	}
}
