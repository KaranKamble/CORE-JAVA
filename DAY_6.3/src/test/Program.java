package test;


class Test{
	
	private Test() {
		System.out.println("Inside ctor");
	}
	
	public static Test getInstance() {
		Test test = new Test();
		return test;
	}
}
public class Program {
	public static void main(String[] args) {
			Test.getInstance();
			Test.getInstance();
			Test.getInstance();
			
	}
}
