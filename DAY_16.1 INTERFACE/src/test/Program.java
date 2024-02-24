package test;


interface A{
	int number = 10;
  //public static final int number = 10;
	
	void print();
  //public abstract void print();
}

class B implements A{
	
	public void print() {
		System.out.println("Number : "+A.number);
	}
}
public class Program {
public static void main(String[] args) {
	A a = new B();
	a.print();
	
}
}
