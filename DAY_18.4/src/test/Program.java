package test;

import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.add(10);
		stk.add(20);
		stk.add(30);
		stk.add(40);
		stk.add(50);

		Integer element = null;
		while (!stk.isEmpty()) {
			element = stk.peek();
			System.out.println("Popped element is : " + element);
			stk.pop();
		}
	}
}
