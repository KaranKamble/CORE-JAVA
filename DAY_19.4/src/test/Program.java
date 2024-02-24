package test;

import java.util.Objects;

class Test {
	private int number;

	public Test(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Test other = (Test) obj;
			if (this.number == other.number)
				return true;
			return false;
		}
		return true;
	}

}

public class Program {
	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(10);

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

	public static int getHashCode(int number) { // Hash function /method
		final int PRIME = 31;
		int result = 1;
		result = result * number + PRIME * number;
		return result;
	}

	public static void main4(String[] args) {
		for (int count = 1; count <= 100; ++count) {
			int a = count;
			int hashCode = Program.getHashCode(a);
			int slot = hashCode % 5;
			System.out.println(a + "  " + hashCode + "  " + slot);
		}
	}

	public static void main3(String[] args) {
		int a = 10;
		int hashCode = Program.getHashCode(a);
		int slot = hashCode % 5;
		System.out.println(a + "  " + hashCode + "  " + slot);
	}

	public static void main2(String[] args) {
		int a = 10;
		System.out.println(Program.getHashCode(a));

		int b = 15;
		System.out.println(Program.getHashCode(b));
	}

	public static void main1(String[] args) {
		int a = 10;
		System.out.println(Program.getHashCode(a));

		int b = 10;
		System.out.println(Program.getHashCode(b));
	}
}
