package test;

import java.util.Iterator;

class Node {
	int element;
	Node next;

	public Node(int element) {
		this.element = element;
	}
}

class LinkedList implements Iterable<Integer> {
	private Node head;
	private Node tail;

	public boolean empty() {
		return this.head == null;
	}

	public void addLast(int element) {
		Node newNode = new Node(element);
		if (this.empty()) {
			this.head = newNode;
		} else
			this.tail.next = newNode;
		this.tail = newNode;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> itr = new LinkedListIterator( this.head );
		return itr;
	}
}


class LinkedListIterator implements Iterator<Integer>{
	private Node trav;
	
	public LinkedListIterator( Node head ) {
		this.trav = head;
	}
	
	@Override
	public boolean hasNext() {
		if(this.trav != null )
			return true;
		return false;
	}
	
	@Override
	public Integer next() {
		int element = this.trav.element;
		this.trav = this.trav.next;
		return element;
	}
}


public class Program {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		for( int element : list )
			System.out.print(element+" ");
	}
	public static void main1(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		Integer element = null;  
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			element = itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
	}
}
