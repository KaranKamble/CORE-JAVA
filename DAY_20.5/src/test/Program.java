package test;

@FunctionalInterface
interface Printable {
	void print(); // Functional method descriptor
}

class Test implements Printable {

	@Override
	public void print() {
		System.out.println("Inside print");
	}

}

public class Program { // Program.class
	public static void main1(String[] args) {
		Printable p = new Test();
		p.print();
	}

	public static void main2(String[] args) {
		class Test implements Printable {

			@Override
			public void print() {
				System.out.println("Inside print");
			}

		}
		Printable p = new Test();
		p.print();
	}

	public static void main3(String[] args) {
		Printable p = new Printable() {
			
			@Override
			public void print() {
				System.out.println("Inside print");
			}
		};
		p.print();
	}
	public static void main(String[] args) {
		Printable p = () -> System.out.println("Inside Lambda Expression");
		p.print();
	}
}
