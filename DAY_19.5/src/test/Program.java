package test;

import java.util.HashSet;
import java.util.Set;

class Program {
	
	public static void main3(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(101);
		set.add(467);
		set.add(215);
		set.add(900);
		set.add(350);
		
		set.add(101);
		set.add(467);
		set.add(215);
		set.add(900);
		set.add(350);

		for (Integer element : set)
			System.out.println(element);
	}
	public static void main2(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(101);
		set.add(467);
		set.add(215);
		set.add(900);
		set.add(350);

		for (Integer element : set)
			System.out.println(element);
	}

	public static void main1(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(null);
		set.add(null);

		for (Integer element : set)
			System.out.println(element);
	}
}
