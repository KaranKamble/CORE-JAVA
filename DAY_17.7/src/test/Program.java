package test;

import java.util.ArrayList;

public class Program {
	private static void print(ArrayList<Integer> list) {
		if (list != null) {
			if (!list.isEmpty()) {
				for (Integer element : list) {
					System.out.print(element + " ");
				}
				System.out.println();
			} else
				System.out.println("ArrayList is empty");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();

		list1.clear();
		Program.print(list1);

		Program.print(list2);
	}

}
