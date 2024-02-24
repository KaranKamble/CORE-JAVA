package com.main;

import java.util.Scanner;

class Book {
	private String title;
	private float price;
	private int pageCount;

	public Book() {

	}

	public Book(String title, float price, int pageCount) {
		this.title = title;
		this.price = price;
		this.pageCount = pageCount;
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title      : ");
		this.title = sc.nextLine();
		System.out.println("Enter Price      : ");
		this.price = sc.nextFloat();
		System.out.println("Enter Page Count : ");
		this.pageCount = sc.nextInt();
	}

	public void printRecord() {
		System.out.println("Title      : " + this.title);
		System.out.println("Price      : " + this.price);
		System.out.println("Page Count : " + this.pageCount);

	}

}

public class Program {
	public static void main(String[] args) {
		Book book = new Book();
		book.acceptRecord();
		book.printRecord();
	}

}
