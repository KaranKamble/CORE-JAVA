package test;
//The class from which we can create only one instance is called is called Singleton class
class Singleton {
	private int number;
	private static Singleton instance;

	private Singleton() {
		this.number = 10;
	}

	public int getNumber() {
		return this.number;
	}
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}

public class Program {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println("Number : "+s1.getNumber());
	}
}
