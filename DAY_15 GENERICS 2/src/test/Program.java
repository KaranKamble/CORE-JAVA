package test;

import java.util.Date;

class Box{
	private Object object;
	
	public void setObject(Object object) {
		this.object = object;
	}
	public Object getObject() {
		return object;
	}
}
public class Program {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject(new Date()); //NOT OK
		System.out.println(box.getObject());
	//	Date date = (Date)box.getObject();
	//	System.out.println(date);
	}
	
	public static void main2(String[] args) {
		Box box = new Box();
		box.setObject(125);
		System.out.println("Number : "+box.getObject());
	}
	
	public static void main1(String[] args) {
		Box box = new Box();
	}

}
