package test;

public class Program {
	private static int count;

	public static void print() {
		count = count + 1;
		System.out.println("Count : "+count);
	}

	public static void main(String[] args) {
		Program.print();
		Program.print();
		Program.print();
		

	}

}
