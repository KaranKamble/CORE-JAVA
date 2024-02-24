package test;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(null);
	}
	public static void main2(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);

		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);

		for (Integer element : set) {
			System.out.println(element);
		}
	}

	public static void main1(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);

		for (Integer element : set) {
			System.out.println(element);
		}
	}
}
