package test;

@FunctionalInterface
interface Printable {
	void print(String message); // Functional method /method descriptor
}

public class Program { // Program.class

	public static void main(String[] args) {
	//	Printable p = (String msg) -> System.out.println(msg);
	//	Printable p = (String message) -> System.out.println(message);
	//	Printable p = (message) -> System.out.println(message);
		Printable p = message -> System.out.println(message);
		p.print("Have a nice day");
	}
}
