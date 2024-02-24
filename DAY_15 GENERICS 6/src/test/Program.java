 package test;

import java.util.ArrayList;

public class Program {
	
	public static ArrayList<Integer> getIntegerList(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		return list;
	}
	public static void printIntegerList(ArrayList<Integer> integerList) {
		for( Integer element : integerList )
			System.out.println(element);
	}
	
	
	
	public static ArrayList<Double> getDoubleList(){
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(10.1);
		list.add(20.22);
		list.add(30.32);
		return list;
	}
	public static void printDoubleList(ArrayList<Double> doubleList) {
		for( Double element : doubleList )
			System.out.println(element);
	}
	
	
	
	public static ArrayList<String> getStringList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("DAC");
		list.add("DMC");
		list.add("DESD");
		return list;
	}
	public static void printStringList(ArrayList<String> stringList) {
		for( String element : stringList )
			System.out.println(element);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> integerList = Program.getIntegerList();
		Program.printIntegerList(integerList);
		
		ArrayList<Double> doubleList = Program.getDoubleList();
		Program.printDoubleList(doubleList);
		
		ArrayList<String> stringList = Program.getStringList();
		Program.printStringList(stringList);
		
	}
	public static void main1(String[] args) {
		ArrayList<Integer> list = Program.getIntegerList();
		for( Integer element : list )
			System.out.println(element);
	}
}
