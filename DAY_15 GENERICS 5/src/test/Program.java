 package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Box<T extends Number>{       
	private T object;
	
	public void setObject(T object) {
		this.object = object;
	}
	public T getObject() {
		return object;
	}
}
public class Program {
	
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();	//OK	
		Box<Integer> box1 = new Box<>();		//OK
		Box<Number> box2 = new Box<Number>();	//OK
		Box<Number> box3 = new Box<>();			//OK
	//	Box<Number> box4 = new Box<Integer>();  //Not OK
		List<Integer> list = new ArrayList<Integer>();  //OK
	}
	public static void main1(String[] args) {
		Box<Number> b1 = new Box<>();		//OK
		Box<Integer> b2 = new Box<>();		//OK
		Box<Double> b3 = new Box<>();		//OK
		
	//	Box<Boolean> b4 = new Box<>();		//Not OK
	//	Box<String> b5 = new Box<>();		//Not OK
	//	Box<Date> b6 = new Box<>();			//Not OK
	}

}
