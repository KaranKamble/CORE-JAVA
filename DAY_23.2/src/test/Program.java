package test;

class Test {

	public Test() {
		System.out.println("Inside Constructor");
	}

	public void print() {
		System.out.println("Inside print");
	}

	@Override
	protected void finalize() throws Throwable {
		
		Thread thread = Thread.currentThread();

		String name = thread.getName();
		System.out.println("Name     : " + name);

		int priority = thread.getPriority();
		System.out.println("Priority : " + priority);

		ThreadGroup group = thread.getThreadGroup();
		System.out.println("Group    : " + group);

		String state = thread.getState().name();
		System.out.println("State    : " + state);

		String type = thread.isDaemon() ? "Deamon Thrad" : "User Thread";
		System.out.println("Type     : " + type);

		String status = thread.isAlive() ? "Alive" : "Dead";
		System.out.println("Status   : " + status);
	}
}  

public class Program {

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		t = null;
		System.gc(); // to request garbage collector
	}

}
