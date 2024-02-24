package test;

class Calculator {

	public static double power(double base, int index) {
		double result = 1;
		for (int count = 1; count <= index; ++count) {
			result = result * base;
		}
		return result;
	}
}

public class Program {
	public static void main(String[] args) {
		double cal = Calculator.power(0.5,2);
		System.out.println(cal);
	}
}
