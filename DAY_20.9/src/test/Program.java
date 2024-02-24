package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program { 
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
/*		for(int index = 0; index < list.size(); ++ index) {
			Integer element = list.get(index);
			System.out.println(element);
		}
		System.out.println();
		
		for(Integer element : list)
			System.out.println(element);
*/
		
	//	Consumer<Integer> action = (Integer number)-> System.out.println(number);
	//	list.forEach(action);
		
		list.forEach((Integer number)-> System.out.println(number));
	}
}
