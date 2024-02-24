package test;

class Test{
	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
}
public class Program {
	public static void main(String[] args) {
		Test t1 = new Test();
   //	t1.setNumber("125"); //NOT OK		
	}
	public static void main1(String[] args) {
		Test t1 = new Test();
		t1.setNumber(125);
		System.out.println("Number : "+t1.getNumber());

	}

}
