package com.main;

enum Day{
	SUN("Sunday"),MON(1), TUES("Tuesday",2);
	
	private String dayName;
	private int dayNumber;
	
	private Day(String dayName) {
		this.dayName=dayName;
	}
	
	private Day(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	
	private Day(String dayName,int dayNumber) {
		this.dayName = dayName;
		this.dayNumber = dayNumber;
	}
	
	

	public String getDayName() {
		return dayName;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	
	
}
public class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for(Day day : days) {
			
			System.out.printf("%-10s%-5d%-10s%-5d\n",day.name(),day.ordinal(),day.getDayName(),day.getDayNumber());
			
		/*	System.out.println(day.name());
			System.out.println(day.ordinal());
			System.out.println(day.getDayName());
			System.out.println(day.getDayNumber());
			System.out.println();
			
		*/
		}
	}
	public static void main2(String[] args) {
		Day day = Day.MON;
		System.out.println(day.name());
		System.out.println(day.ordinal());
		System.out.println(day.getDayNumber());
	}
	public static void main1(String[] args) {
		Day day=Day.SUN;
		System.out.println(day.name());
		System.out.println(day.ordinal());
		System.out.println(day.getDayName());
	}
	
	
}
