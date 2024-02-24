package test;

public class Program {

	public static void f3(String str) {
		int number = Integer.parseInt(str);
		System.out.println("Number : "+number);
	}
	
	public static void f2(String str) {//calling method
		Program.f3(str);				//called method
	}
	
	public static void f1(String str) {
		Program.f2(str);
	}
	
	
	
	public static void main(String[] args) {
		try {
		//String str = "1a2b5";
		String str = "125";
		Program.f1(str);
		}catch(NumberFormatException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	
}
