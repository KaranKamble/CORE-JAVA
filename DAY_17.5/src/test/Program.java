package test;

import java.time.LocalDate;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		LocalDate ldt = LocalDate.now();
		this.day = ldt.getDayOfMonth();
		this.day = ldt.getDayOfMonth();
		this.day = ldt.getYear();
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
		
}
public class Program {
	public static void main(String[] args) {
		Date dt1 = new Date( 23, 7, 1985);
		Date dt2 = dt1;			//Shallow copy of references.
		
		dt1.setYear(1984);
		dt1.setYear(1983);
		
		System.out.println(dt1.toString());
		System.out.println(dt2.toString());
	}
}
