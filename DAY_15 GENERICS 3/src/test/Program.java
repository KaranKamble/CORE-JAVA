package test;

import java.util.Date;

class Box<T>{      //ANY NAME <KARAN>,<A>
	private T object;
	
	public void setObject(T object) {
		this.object = object;
	}
	public T getObject() {
		return object;
	}
}
public class Program {
	
	public static void main4(String[] args) {
		Box<Integer> b1 = new Box();
		Box<Double> b2 = new Box();
		Box<String> b3 = new Box();
	}
	
	public static void main3(String[] args) {
		Box box = new Box();       // Raw Type
	}
	
	public static void main2(String[] args) {
		Box<Date> box = new Box<>();		//Type Inference
	}
	
	public static void main1(String[] args) {
		Box<Date> box = new Box<Date>();
		box.setObject(new Date());
		Date date = box.getObject();
		System.out.println(date);
	}

}
