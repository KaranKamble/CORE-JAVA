package test;


public class Program { 
	
	public static void main(String[] args) {
		String str = "DAC";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(str.length())); //StringIndexOutOfBoundsException
	}
	public static void main4(String[] args) {
		String s1 = "Sunbeam";
	//	int number = 37;
		Integer number = new Integer(37);
		s1 = s1 + number;
		System.out.println(s1);
	}
	public static void main3(String[] args) {
		String s1 = "Sunbeam";
		String s2 = "Pune";
		s1 = s1 + s2;
		System.out.println(s1);
	}
	public static void main2(String[] args) {
		String s1 = "Sunbeam";
		String s2 = "Pune";
		s1 = s1.concat(s2);
		System.out.println(s1);
	}
	public static void main1(String[] args) {
		String str = "Sunbeam";
		str = str + "Pune";
		System.out.println(str);
	}
}
