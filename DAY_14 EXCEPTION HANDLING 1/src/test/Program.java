package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Num1:");
			int num1 = sc.nextInt();
			System.out.println("Num2:");
			int num2 = sc.nextInt();
			if (num2 == 0)
				throw new ArithmeticException("Divide By Zero Exception");
			int result = num1 / num2;
			System.out.println("Result:" + result);
			// System.exit(0);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main5(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Inside Try Block");
			System.out.println("Num1:");
			int num1 = sc.nextInt();
			System.out.println("Num2:");
			int num2 = sc.nextInt();
			if (num2 == 0)
				throw new ArithmeticException("Divide By Zero Exception");
			int result = num1 / num2;
			System.out.println("Result:" + result);
			// System.exit(0);
		} catch (Exception ex) {
			System.out.println("Inside Catch Block");
			ex.printStackTrace();
			// System.exit(0);
		} finally {
			System.out.println("Inside Finally Block");
			sc.close();
		}

	}

	public static void main4(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("File Open");
			System.out.println("Num1:");
			int num1 = sc.nextInt();
			System.out.println("Num2:");
			int num2 = sc.nextInt();
			if (num2 == 0)
				throw new ArithmeticException("Divide By Zero Exception");
			int result = num1 / num2;
			System.out.println("Result:" + result);

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		System.out.println("File close");

	}

	public static void main3(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("File Open");
			System.out.println("Num1:");
			int num1 = sc.nextInt();
			System.out.println("Num2:");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				// ArithmeticException ex = new ArithmeticException("Divide By Zero Exception");
				// throw ex;

				throw new ArithmeticException("Divide By Zero Exception");
			} else {
				int result = num1 / num2;
				System.out.println("Result:" + result);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		System.out.println("File close");

	}

	public static void main2(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("File Open");
			System.out.println("Num1:");
			int num1 = sc.nextInt();
			System.out.println("Num2:");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result:" + result);
		} catch (ArithmeticException | InputMismatchException ex) {
			// System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("File close");

	}

	public static void main1(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("File Open");
			System.out.println("Num1:");
			int num1 = sc.nextInt();
			System.out.println("Num2:");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result:" + result);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (InputMismatchException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("File Closed");
	}

}
