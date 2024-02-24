package test;

public class Program { 
	
	public static void main(String[] args) {
	//	StringBuilder sb1 = new StringBuilder("DAC");
	//	StringBuilder sb2 = new StringBuilder("DAC");
		
		StringBuffer sb1 = new StringBuffer("DAC");
		StringBuffer sb2 = new StringBuffer("DAC");
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
	}
	public static void main6(String[] args) {
		String s1 = new String("DAC");
		String s2 = new String("DAC");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	public static void main5(String[] args) {
		StringBuilder sb1 = new StringBuilder("DAC");
		StringBuilder sb2 = new StringBuilder("DAC");
		if(sb1.equals(sb2)) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	public static void main4(String[] args) {
		StringBuilder sb1 = new StringBuilder("DAC");
		StringBuilder sb2 = new StringBuilder("DAC");
		if(sb1 == sb2) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	public static void main3(String[] args) {
		StringBuffer sb1 = new StringBuffer("DAC");
		StringBuffer sb2 = new StringBuffer("DAC");
		if(sb1.equals(sb2)) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	public static void main2(String[] args) {
		StringBuffer sb1 = new StringBuffer("DAC");
		StringBuffer sb2 = new StringBuffer("DAC");
		if(sb1 == sb2) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	
	public static void main1(String[] args) {
	//	StringBuffer sb = "DAC";	/NOT OK
		StringBuffer sb = new StringBuffer("DAC");	//OK
	}
}
