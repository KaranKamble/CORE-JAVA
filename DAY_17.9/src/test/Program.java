package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Program {
	public static void main1(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		System.out.println(list.getClass().getName());
	}
	
	public static void main2(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		for( int index = 0; index < list.size(); ++index ) {
			int element = list.get(index);
			System.out.println(element);
		}
	}
	
	public static void main3(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			int element = itr.next();
			System.out.println(element);
		}
	}
	
	public static void main4(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		for( int element : list )
			System.out.println(element);
	}
	
	public static void main5(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		//Consumer<Integer> c = ( Integer element ) -> System.out.println(element);
		//Consumer<Integer> c = ( element ) -> System.out.println(element);
		Consumer<Integer> c = element -> System.out.println(element);
		list.forEach(c);
	}
	
	public static void main6(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		Consumer<Integer> c = System.out::println;
		list.forEach(c);
	}
	
	public static void main7(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		list.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		ListIterator<Integer> itr = list.listIterator();
		
		while( itr.hasNext()) {
			int element = itr.next();
			System.out.print(element+" ");
		}
		
		System.out.println();
		
		while( itr.hasPrevious()) {
			int element = itr.previous();
			System.out.print(element+" ");
		}
	}
}
