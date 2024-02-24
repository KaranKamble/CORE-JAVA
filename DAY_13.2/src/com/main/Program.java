package com.main;

import java.util.Scanner;

class Tape {
	private String title;
	private float price;
	private int playTime;

	public Tape() {

	}

	public Tape(String title, float price, int playTime) {
		this.title = title;
		this.price = price;
		this.playTime = playTime;
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title      : ");
		this.title = sc.nextLine();
		System.out.println("Enter Price      : ");
		this.price = sc.nextFloat();
		System.out.println("Enter Page Count : ");
		this.playTime = sc.nextInt();
	}

	public void printRecord() {
		System.out.println("Title      : " + this.title);
		System.out.println("Price      : " + this.price);
		System.out.println("Page Count : " + this.playTime);

	}

}

public class Program {
	public static void main(String[] args) {
		Tape tape = new Tape();
		tape.acceptRecord();
		tape.printRecord();
	}

}
