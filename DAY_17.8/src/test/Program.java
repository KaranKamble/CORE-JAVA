package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>( );
		c.add(10);
		c.add(20);
		c.add(30);
		
		ArrayList<Integer> list = new ArrayList<Integer>( c );
		//List<Integer> list =  new ArrayList<Integer>( c );
		//Collection<Integer> list = new ArrayList<Integer>( c );
		//System.out.println(list.size());
	}
	public static void main2(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>( 7  );
		List<Integer> list2 = new ArrayList<Integer>( 7 );
		Collection<Integer> list3 = new  ArrayList<Integer>( 7 );
	}
	
	public static void main1(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>( );
		List<Integer> list2 = new ArrayList<Integer>(  );
		Collection<Integer> list3 = new  ArrayList<Integer>( );
	}

}
