package test;

class CThread extends Thread {
	public CThread(String name) {
		this.setName(name);
		// this.start();
	}

	@Override
	public void run() throws RuntimeException {
		try {
			for (int count = 1; count <= 10; ++count) {
				System.out.println("Count : " + count);
				Thread.sleep(250); // TIMED_WAITING
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause);
		}
	}
}

public class Program {
	// Blocking calls : sleep/suspend/join/wait/Input method call(Scanner)
	public static void main(String[] args) {

		try {
			Thread th = new CThread("User Thread");
			System.out.println(th.getName() + "  :  " + th.getState());
			th.start();
			while (true) {
				System.out.println(th.getName() + "  :   " + th.getState());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
