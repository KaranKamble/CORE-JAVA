package test;

import java.util.Date;

public class Program {
	
	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static <T>void print2(T obj) {
		System.out.println(obj);
	}
	
	public static < T extends Number >void print3(T obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Program.print(true);
		Program.print('A');
		Program.print(123);
		Program.print(456.78);
		Program.print("Java");
		Program.print(new Date());
	}

}
