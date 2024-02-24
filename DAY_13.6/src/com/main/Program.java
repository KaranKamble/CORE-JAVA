package com.main;

import java.util.Scanner;

abstract class Shape {
	protected double area;

	public abstract void calculateArea();

	public final double getArea() {
		return this.area;
	}

}

class Rectangle extends Shape {
	private double length;
	private double breadth;

	public void setLength(double length) {
		this.length = length;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		area = Math.PI * Math.pow(radius, 2);
	}
}

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void acceptRecord(Shape shape) {
		if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			System.out.println("Enter Length : ");
			rectangle.setLength(sc.nextFloat());
			System.out.println("Enter Breadth : ");
			rectangle.setBreadth(sc.nextFloat());
		} else {
			Circle circle = (Circle) shape;
			System.out.println("Enter Radius : ");
			circle.setRadius(sc.nextFloat());
		}
	}

	public static void printRecord(Shape shape) {
		System.out.println("Area : "+shape.getArea());
	}

	public static int menuList() {
		System.out.println("0.Exit ");
		System.out.println("1.Rectangle ");
		System.out.println("2.Circle ");
		System.out.println("Enter your chice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice = 0;

		while ((choice = Program.menuList()) != 0) {
			Shape shape = null;
			switch (choice) {
			case 1:
				shape = new Rectangle();
				
				break;
			case 2:
				shape = new Circle();
				break;

			}
			
			if( shape != null ) {
				Program.acceptRecord(shape);
				shape.calculateArea();
				Program.printRecord(shape);
			}
		}

	}

}
