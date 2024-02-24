package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("F.Q.Class Name  "  );
			String className = sc.nextLine();	//java.lang.Enum
			Class<?> c = Class.forName(className);
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		Class<?> c = Number.class;
	}
	public static void main1(String[] args) {
		Integer number = new Integer(0);
		Class<?> c = number.getClass();
	}
}
