package test;

public class Program {

	public static void showRecord() {
		for (int count = 0; count < 10; ++count) {
			System.out.println(+count);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void displayRecord() throws InterruptedException {
		for (int count = 0; count < 10; ++count) {
			System.out.println(+count);
			Thread.sleep(500);

		}
	}

	public static void main(String[] args) {
		showRecord();
		try {
			displayRecord();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
 
}
