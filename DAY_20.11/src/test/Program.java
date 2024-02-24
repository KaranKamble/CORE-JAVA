package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Program { 
	
	public static void main4(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.forEach(System.out :: println);
	}
	public static void main3(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.forEach(number -> System.out.println(number));
	}
	public static void main2(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Consumer<Integer> action = number -> System.out.println(number);
		list.forEach(action);
	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(Integer element : list)
			System.out.println(element);
	}
}
