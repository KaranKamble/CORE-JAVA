package test;

@FunctionalInterface
interface Printable{
	void print();
}
public class Program { 
	
	public static void showRecord() {
		System.out.println("Inside showRecord() method");
	}
	
	public void displayRecord() {
		System.out.println("Inside displayRecord() method");
	}
	public static void main(String[] args) {
		Printable p1 = Program:: showRecord;		
		p1.print();
		
		Program prog = new Program();
		Printable p2 = prog :: displayRecord;
		p2.print();
		
		Printable p3 = System.out :: println;//It will print blank 
		p3.print();
	}
	public static void main1(String[] args) {
		Printable p = ( )-> System.out.println("Hello");		
		p.print();
	}
}
