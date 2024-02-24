package test;

@FunctionalInterface
interface IMath {
	int factorial(int number); // Functional method /method descriptor
}

public class Program { // Program.class
	public static void main(String[] args) {
		IMath m = number -> {
			int fact = 1;
			for (int count = 1; count <= number; ++count) {
				fact = fact * count;
			}
			return fact;
		};
		int result = m.factorial(5);
		System.out.println("Result  :  " + result);
	}
}
