package com.main;

import java.util.Scanner;

enum Colour{
	RED,BLUE,GREEN
}

public class Program {
	
	public static void main5(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Colour Name :");
		String colourName= sc.nextLine();
		Colour colour = Colour.valueOf(colourName.toUpperCase());
		System.out.printf("%-10s%-5d",colour.name(),colour.ordinal());
					
	}
	
	public static void main4(String[] args) {
		int number = 125;
		String strnumber = String.valueOf(number);
		System.out.println("Number : "+strnumber);
	}
	
	public static void main3(String[] args) {
		Colour[] colours = Colour.values();
		for(Colour colour : colours) {
			System.out.printf("%-10s%-5d\n",colour.name(),colour.ordinal());
		}
	}

	public static void main2(String[] args) {
		Colour colour=Colour.RED;
		String name=colour.name();
		int ordinal=colour.ordinal();
		System.out.println("NAME :"+name);
		System.out.println("ORDINAL :"+ordinal);
}
	public static void main1(String[] args) {
		String name=Colour.RED.name();
		int ordinal=Colour.RED.ordinal();
		System.out.println("NAME :"+name);
		System.out.println("ORDINAL :"+ordinal);
		
	}
}
