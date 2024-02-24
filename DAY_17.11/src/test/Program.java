package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void print(List<Integer> list) {
		if (list != null) {
			for (Integer element : list)
				System.out.println(element);
		}
	}

	public static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		return list;
	}

	public static void main1(String[] args) {
	//	String str = "CDAC";
	//	char ch = str.charAt(str.length())  // StringIndexOutOfBoundException
	//	int[] arr = new int[]{1,2,3};
	//	int element = arr[arr.length];		   // ArrayIndexOutOfBoundException
		List<Integer> list = Program.getList();
		int element = list.get(list.size());// IndexOutOfBoundException

	}

	public static void main2(String[] args) {
		List<Integer> list = Program.getList();
		Integer key = new Integer(60);
		if (list.contains(key)) {
			int index = list.indexOf(key);
			System.out.println(key + " found at index " + index);
		} else {
			System.out.println(key + " not found ");
		}

	}

	public static void main3(String[] args) {
		List<Integer> list = Program.getList();
		List<Integer> keys = Arrays.asList(40, 60, 80);
		if (list.containsAll(keys)) {
			System.out.println("keys found");
		} else {
			System.out.println("keys  not found ");
		}

	}

	public static void main4(String[] args) {
		List<Integer> list = Program.getList();

		Integer key = new Integer(60);

		if (list.contains(key)) {
			int index = list.indexOf(key);
			int element = list.remove(index);// remove method of list
			System.out.println(element + " is found");
		} else {
			System.out.println(key + " not found ");
		}
	}

	public static void main5(String[] args) {
		List<Integer> list = Program.getList();
		Integer key = new Integer(60);
		if (list.contains(key)) {
			Boolean removedStatus = list.remove(key);// remove method of Collection
			System.out.println(key + " is removed : "+removedStatus);
		} else {
			System.out.println(key + " not found ");
		}
	}
	
	
	public static void main6(String[] args) {
		List<Integer> list = Program.getList();
		List<Integer> keys = Arrays.asList(40, 60, 80);
		if(list.containsAll(keys)) {
			list.removeAll(keys);
			Program.print(list);
		}else {
			System.out.println("keys  not found ");
		}
	}
	
	public static void main7(String[] args) {
		List<Integer> list = Program.getList();
		List<Integer> keys = Arrays.asList(40, 60, 80);
		if(list.containsAll(keys)) {
			list.retainAll(keys);
			Program.print(list);
		}else {
			System.out.println("keys  not found ");
		}
		
	}
}
