package com.main;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		int day=ld.getDayOfMonth();
		int month = ld.getMonthValue();
		int year=ld.getYear();
		
		System.out.println(day+"/"+month+"/"+year);
		
	//	System.out.println(ld.getDayOfMonth()+"/"+ld.getMonthValue()+"/"+ld.getYear());
	}
	
	
	public static void main2(String[] args) {
		Calendar c = Calendar.getInstance();
		int day=c.get(Calendar.DAY_OF_MONTH);
		int month=c.get(Calendar.MONTH)+1;
		int year=c.get(Calendar.YEAR);
		System.out.println(day+"/"+month+"/"+year);
		
	}
	
	
	public static void main1(String[] args) {
		Date date= new Date();
		int day=date.getDate();
		int month=date.getMonth()+1;
		int year=date.getYear()+1900;
		System.out.println(day+"/"+month+"/"+year);
	}
}
