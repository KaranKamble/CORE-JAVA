package com.main;

class Person{
	private String name;
	private int age;
	
	
	public Person() {
		this(" ",0);
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void showRecord() {
		System.out.println("Name  : "+this.name);
		System.out.println("AGE   : "+this.age);
	}	
}


public class Program {
	public static void main(String[] args) {
		Person person = new Person();
		person.showRecord();
	}
}
