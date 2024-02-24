package test;

class CThread extends Thread {
	public CThread(String name) {
		// super( name );
		this.setName(name);
		this.start();
	}

	@Override
	public void run() {
		System.out.println("Inside run");
	}
}

public class Program {
	public static void main(String[] args) {
		Thread th = new CThread("ABC");

	}
}
