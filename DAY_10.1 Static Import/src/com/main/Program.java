package com.main;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Program {
	public static void main(String[] args) {
		double radius = 10.5d;
		double area = PI * pow(radius,2);
		out.println("Radius : "+area);
	}
	public static void main2(String[] args) {
		double radius = 10.5d;
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Radius : "+area);
	}
	
	public static void main1(String[] args) {
		 double radius = 10.5d;
		 double area = 3.14 * radius * radius;
		 System.out.println("Radius : "+area);
	
	}	
}
