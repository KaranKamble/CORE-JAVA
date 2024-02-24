package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void print( List<Integer> list ) {
		if( list != null ) {
			for( Integer element : list )
				System.out.println(element);
		}

	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(400);
		list.add(50);
		list.add(null);
		list.set(2,40);
		list.add(2,30);
		
		Program.print(list);
	}
	
	
	
	
	public static List<Integer> getList( ) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(70);
		list.add(90);
		return list;
	}
	public static void main2(String[] args) {
		List<Integer> newList = Arrays.asList(40,60,80,100);
		List<Integer> list = Program.getList();
		list.addAll(newList);
		Program.print(list);
	}
	    
	
	public static void main3(String[] args) {
		List<Integer> newList = Arrays.asList(40,60,80,100);
		List<Integer> list = Program.getList();
		list.addAll(3,newList);
		Program.print(list);
	}
	
	
	public static void main(String[] args) {
		List<Integer> newList = Arrays.asList(40,60,80,100);
		List<Integer> list = Program.getList();
		list.addAll(3,newList);
	//	Collections.sort(list);
		list.sort(null);
		Program.print(list);
	}
}
