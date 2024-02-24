package test;

public class Program {		//Program.class
	public static void main(String[] args) {
		Object a = new Object() {		//Program$1.class

	private String message = "Hello";

	@Override
	public String toString() {
		return this.message;
	}
};

	Object b = new Object() {
	private String message = "Hello";

	@Override
	public String toString() {
		return this.message;
	}
};

	Object c = new Object() {
	private String message = "Hello";

	@Override
	public String toString() {
		return this.message;
	}
};
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
}
