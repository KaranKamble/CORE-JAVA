package test;

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run");

	}
}

public class Program {

	public static void main(String[] args) {
		Runnable target = new Task();
		Thread th1 = new Thread(target);
		th1.setName("User Thread#1");
		// System.out.println(th1.getState().name()); //NEW
		th1.start(); // RUNNABLE
		th1.start(); // IlligalThreadStateException(because of calling method start() 2 times(again))
	}

}
