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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

class Book extends Product {
	private int pageCount;

	public Book() {

	}

	public Book(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}

class Tape extends Product {
	private int playTime;

	public Tape() {

	}

	public Tape(int playTime) {
		this.playTime = playTime;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

}

public class Program {

	public static void acceptRecord(Product product) {
		System.out.println("Title :");
		product.setTitle(sc.nextLine());
		System.out.println("Price :");
		product.setPrice(sc.nextFloat());
		if (product instanceof Book) {
			Book book = ( Book )product;
			System.out.println("Page Count :");
			book.setPageCount(sc.nextInt());
		}else {
			Tape tape = ( Tape ) product;
			System.out.println("Play Time  :");
			tape.setPlayTime(sc.nextInt());
		}
	}

	public static void printRecord(Product product) {
		System.out.println("Title :"+product.getTitle());
		System.out.println("Price :"+product.getPrice() );
		if (product instanceof Book) {
			Book book = ( Book )product;
			System.out.println("Page Count : "+book.getPageCount());
		}else {
			Tape tape = ( Tape ) product;
			System.out.println("Play Time  : "+tape.getPlayTime());
		}
	}

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
		while ((choice = Program.menuList()) != 0) {
			Product product = null;
			switch (choice) {
			case 1:
				product = new Book();

				break;

			case 2:
				product = new Tape();

				break;
			}
			if (product != null) {
				sc.nextLine();
				Program.acceptRecord(product);
				Program.printRecord(product);
			}
		}
	}

}
