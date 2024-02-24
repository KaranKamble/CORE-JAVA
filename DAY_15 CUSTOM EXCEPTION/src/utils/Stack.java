package utils;

import exception.StackOverflowException;
import exception.StackUnderflowException;

public class Stack {
	private int top;
	private int[] arr;

	public Stack() {
		this(5);
	}

	public Stack(int size) {
		this.top = -1;
		this.arr = new int[size];
	}

	private boolean empty() {
		return this.top == -1;
	}

	private boolean full() {
		return this.top == this.arr.length - 1;
	}

	public void push( int element ) throws StackOverflowException {
		if ( this.full())
			throw new StackOverflowException("Stack is full ");
		this.arr[ ++ this.top ] = element;
	}

	public int peek() throws StackUnderflowException {
		if ( this.empty())
			throw new StackUnderflowException("Stack is empty ");
		return this.arr[ this.top ];
	}

	public void pop() throws StackUnderflowException {
		if ( this.empty())
			throw new StackUnderflowException("Stack is empty ");
		    -- this.top ;
		
	}

}
