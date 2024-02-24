package test;

class Node {
	int element;
	Node next;

	public Node(int element) {
		this.element = element;
	}
}

class LinkedList {
	private Node head;
	private Node tail;

	public boolean empty() {
		return this.head == null;
	}

	public void addLast(int element) {
		Node newNode = new Node(element);
		if (this.empty()) {
			this.head = newNode;
			// this.tail = newNode;
		} else {
			this.tail.next = newNode;
			// this.tail = newNode;
		}
		this.tail = newNode;
	}

	public void printList() {
		Node trav = this.head;
		while (trav != null) {
			System.out.print(trav.element + " ");
			trav = trav.next;
		}
		System.out.println();

	}

}

public class Program {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.printList();

	}
}
