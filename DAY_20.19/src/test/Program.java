package test;

import java.lang.reflect.Field;

class Complex {
	private int real;
	private int imag;

	public Complex() {
		this.real = 10;
		this.imag = 20;
	}

	public String toString() {
		return this.real + "  " + this.imag;
	}

}

public class Program {
	public static void main(String[] args) {
		try {
			Complex complex = new Complex();
			System.out.println(complex.toString());

			Class<?> c = complex.getClass();
			Field field = null;

			field = c.getDeclaredField("real");
			field.setAccessible(true);
			field.setInt(complex, 50);

			field = c.getDeclaredField("imag");
			field.setAccessible(true);
			field.setInt(complex, 60);

			System.out.println(complex.toString());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
