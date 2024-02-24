package org.sunbeam.dac.test;

import java.util.Scanner;

import org.sunbeam.dac.lib.Address;
import org.sunbeam.dac.lib.Date;
import org.sunbeam.dac.lib.Person;




public class Program {
	static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(Person person) {
		System.out.println("Enter Name : ");
		person.setName(sc.nextLine());
		Date birthdate = person.getBirthDate();
		Program.acceptRecord(birthdate);
		sc.nextLine();
		Address address = person.getAddress();
		Program.acceptRecord(address);
	}
	private static void printRecord(Person person) {
		if (person != null) {
			System.out.println("Name    : " + person.getName());
			Date birthdate = person.getBirthDate();
			Program.printRecord(birthdate);
			Address address = person.getAddress();
			Program.printRecord(address);
		}
	}

	

	private static void acceptRecord(Address address) {
		if (address != null) {
			System.out.println("Enter cityname : ");
			address.setCityName(sc.nextLine());
			System.out.println("Enter state name :");
			address.setStateName(sc.nextLine());
			System.out.println("Enter pincode : ");
			address.setPinCode(sc.nextInt());
		}
	}
	private static void printRecord(Address address) {
		if (address != null) {
			System.out.println("Address : " + address.getCityName() + " " + address.getStateName() + " " + address.getPinCode());
		}
	}
	
	
	
	private static void acceptRecord(Date date) {
		if(date!=null) {
			System.out.println("Enter date : ");
			date.setDay(sc.nextInt());
			System.out.println("Enter month : ");
			date.setMonth(sc.nextInt());
			System.out.println("Enter year : ");
			date.setYear(sc.nextInt());
		}
	}
	private static void printRecord(Date date) {
		if(date!=null) {
			System.out.println("Date : "+date.getDay()+"/"+date.getMonth()+"/"+date.getYear());	
		}	
	}
	

	public static void main(String[] args) {
		Person person = new Person();
		Program.acceptRecord(person);
		Program.printRecord(person);
	}

	public static void main2(String[] args) {
		Address address = new Address();
		Program.acceptRecord(address);
		Program.printRecord(address);
	}

	public static void main1(String[] args) {
		Date date = new Date();
		Program.acceptRecord(date);
		Program.printRecord(date);

	}

	
}
