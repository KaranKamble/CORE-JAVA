package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		Date date = new Date();
		String pattern = "dd-MMMM,yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate = sdf.format(date);
		System.out.println(strDate);
	}
	
	public static void main2(String[] args) {
		Date date = new Date();
		System.out.println(date.getDate()+" "+date.getMonth()+" "+date.getYear());
	}
	
	public static void main1(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
	}
}
