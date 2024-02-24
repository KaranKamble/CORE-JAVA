package test;

//The class from which we can create only one instance is called is called Singleton class
class Singleton {
	private int number;
	private static Singleton instance;

	static {
		instance = new Singleton();
	}

	public Singleton() {}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber(){
		return this.number;
	}

	public static Singleton getInstance() {
		return instance;
	}
}

public class Program {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.setNumber(10);
		System.out.println("Number : " + s1.getNumber());
	}
}
