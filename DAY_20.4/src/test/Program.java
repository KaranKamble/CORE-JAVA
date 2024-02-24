package test;


interface Printable{
	void print();
}
public class Program {
	public static void main(String[] args) {
		Printable p = new  Printable() {
			private String message = "Good Morning";
			@Override
			public void print() {
				System.out.println(message);
			}
		};
		p.print();
	}
}
