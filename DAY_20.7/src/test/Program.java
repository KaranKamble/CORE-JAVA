package test;

@FunctionalInterface
interface IMath {
	int sum(int num1, int num2); // Functional method /method descriptor
}

public class Program { // Program.class

	public static void main1(String[] args) {
		IMath m = (num1, num2) -> {
			return num1 + num2;

		};
		int result = m.sum(10, 20);
		System.out.println("Result  :  " + result);
	}

	public static void main2(String[] args) {
		IMath m = (num1, num2) -> num1 + num2;
		int result = m.sum(10, 20);
		System.out.println("Result  :  " + result);
	}
}
