package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {
		Deque<Integer> que = new ArrayDeque<Integer>();
		que.addFirst(10);
		que.addFirst(20);
		que.addFirst(30);
		que.addFirst(40);
		que.addFirst(50);
		
		Integer element = null;
		while (!que.isEmpty()) {
			element = que.getFirst();
			System.out.println("Removed element is : " + element);
			que.removeFirst();
		}
	}
	public static void main3(String[] args) {
		Deque<Integer> que = new ArrayDeque<Integer>();
		que.addLast(20);
		que.addLast(30);
		que.addFirst(10);
		que.addLast(40);
		que.addLast(50);
		que.addFirst(5);
		que.addLast(60);
		
		que.removeFirst();
		que.removeLast();
		
		Integer element = null;
		while (!que.isEmpty()) {
			element = que.getFirst();
			System.out.println("Removed element is : " + element);
			que.removeFirst();
		}
	}

	public static void main2(String[] args) {
		// ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		Integer element = null;
		while (!que.isEmpty()) {
			element = que.peek();
			System.out.println("Removed element is : " + element);
			que.poll();
		}
	}

	public static void main1(String[] args) {
		// ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.add(10);
		que.add(20);
		que.add(30);
		Integer element = null;
		while (!que.isEmpty()) {
			element = que.element();
			System.out.println("Removed element is : " + element);
			que.remove();
		}
	}
}
