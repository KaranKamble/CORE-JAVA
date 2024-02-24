package test;

abstract class A {
	public abstract void print();
}

class B extends A {

	@Override
	public void print()throws RuntimeException  {
		try {
			for (int count = 0; count < 11; ++count) {
				System.out.println("Count : " + count);
				Thread.sleep(500);
			}
		} catch (InterruptedException ex) {
				throw new RuntimeException();
		}

	}
}

public class Program {
	public static void main(String[] args) {
			A a = new B();
			try {
				a.print();
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			
	}

}
