package com.main;

import java.util.Scanner;

class Product {
	private String title;
	private float price;

	public Product() {

	}

	public Product(String title, float price) {
		this.title = title;
		this.price = price;
		
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title      : ");
		this.title = sc.nextLine();
		System.out.println("Enter Price      : ");
		this.price = sc.nextFloat();
		
	}

	public void printRecord() {
		System.out.println("Title      : " + this.title);
		System.out.println("Price      : " + this.price);
		

	}

}
class Book extends Product{
	private int pageCount;

	public Book() {

	}

	public Book(int pageCount) {
		this.pageCount = pageCount;
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		super.acceptRecord();
		System.out.println("Enter Page Count : ");
		this.pageCount = sc.nextInt();
	}

	public void printRecord() {
		super.printRecord();
		System.out.println("Page Count : " + this.pageCount);

	}

}

class Tape extends Product{
	private int playTime;

	public Tape() {

	}

	public Tape(int playTime) {
		this.playTime = playTime;
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		super.acceptRecord();
		System.out.println("Enter Play Time  : ");
		this.playTime = sc.nextInt();
	}

	public void printRecord() {
		super.printRecord();
		System.out.println("Play Time  : " + this.playTime);

	}

}

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Book");
		System.out.println("2.Tape");
		System.out.println("Enter choice : ");
		return sc.nextInt();

	}
	public static void main(String[] args) {
		int choice = 0;
		while(( choice = Program.menuList()) != 0 ) {
			Product product = null;
			switch (choice) {
			case 1:
				product = new Book();
				product.acceptRecord();
				product.printRecord();
				break;

			case 2:
				product = new Tape();
				product.acceptRecord();
				product.printRecord();
				break;
			}
		/*	if( product != null ) {
				product.acceptRecord();
				product.printRecord();
			}*/
		}
	}

}
