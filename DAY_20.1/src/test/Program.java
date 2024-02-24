package test;

public class Program {

	public static void main(String[] args) {
		class Complex {
			private int real = 10, imag = 20;

			@Override
			public String toString() {
				return "Complex [real=" + real + ", imag=" + imag + "]";
			}
		}

		Complex c1 = null;
		c1 = new Complex();
		System.out.println(c1.toString());
	}

}
