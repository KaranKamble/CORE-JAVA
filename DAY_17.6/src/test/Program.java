package test;

import java.time.LocalDate;

class Date implements Cloneable {
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
	public Date clone() throws CloneNotSupportedException {
		// TODO : Create shallow copy of current instance
		// Date other = new date(this.day,this.month,this.year )
		Date other = (Date) super.clone();
		return other;

	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}

public class Program {
	public static void main(String[] args) {
		try {
			Date dt1 = new Date(23, 7, 1985);
			Date dt2 = dt1.clone();

			System.out.println(dt1.toString());
			System.out.println(dt2.toString());
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}
}
