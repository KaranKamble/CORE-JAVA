package org.sunbeam.dac.lib;

public class Person {
	private String name;			//association
	private Date birthDate;			//association
	private Address address;		//association

	public Person() {
		this.name=new String();
		this.birthDate=new Date();
		this.address=new Address();
	}
	public Person(int day,int month,int year ,String cityName,String stateName,int pinCode) {
		this.name=new String();
		this.birthDate=new Date(day,month,year);
		this.address=new Address(cityName,stateName,pinCode);
	}
	public Person(String name,Date birthDate,Address address) {
		this.name=name;
		this.birthDate=birthDate;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
