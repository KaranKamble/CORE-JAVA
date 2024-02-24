package test;

class Outer {
	private int num1 = 10;

	public class Inner {
		private int num1 = 20;

		public void print() {
			int num1 = 30;
			System.out.println("Num1  :  " + Outer.this.num1);
			System.out.println("Num2  :  " + this.num1);
			System.out.println("Num3  :  " + num1);
		}
	}

}

class Program {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.print();

	}
}
