package test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	// private ArrayList<Integer> list = new ArrayList<>();
	private List<Integer> list;

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public void add(Integer element) {
		if (this.list != null) {
			this.list.add(element);
		}
	}

	public Integer find(int element) {
		if (this.list != null) {
			Integer key = new Integer(element);
			if (list.contains(key)) {
				int index = this.list.indexOf(key);
				return index;
			}
		}
		return null;
	}
	/*
	 * public boolean remove( int element ) { 
	 * Integer index = this.find(element);
	 * if( index != null ) { 
	 * this.list.remove(index); //Method of List return true;
	 * } 
	 * return false; 
	 * }
	 */

	public boolean remove(int element) {
		if (this.list != null) {
			Integer key = new Integer(element);
			if (list.contains(key)) {
				this.list.remove(key); // Method of Collection
				return true;
			}
		}
		return false;
	}
	
	public void print( ) {
		if( this.list != null ) {
			//Collections.sort(this.list);
			this.list.sort(null);
			for(Integer element : list )
				System.out.println(element+"  ");
			System.out.println();
		}else {
			System.out.println("List is empty");
		}
	}

}
