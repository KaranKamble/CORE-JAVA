package test;

public class Program {

	public static void main1(String[] args) {
		Thread thread = Thread.currentThread();
		
		String name = thread.getName();
		System.out.println("Name     : "+name);
		
		int priority = thread.getPriority();
		System.out.println("Priority : "+priority);
		
		ThreadGroup group = thread.getThreadGroup();
		System.out.println("Group    : "+group);
		
		String state =  thread.getState().name();
		System.out.println("State    : "+state);
		
		String type = thread.isDaemon() ?  "Deamon Thrad" : "User Thread";
		System.out.println("Type     : "+type);
		
		String status = thread.isAlive()? "Alive" : "Dead";
		System.out.println("Status   : "+status);
	}
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.toString());
	}

}
