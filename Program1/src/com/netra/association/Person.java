package com.netra.association;

public class Person {

	private String Name;
	private String city;
	private int age;
	
	public Person() {
		
	}
	public Person(String Name,String city,int age) {
		this.Name=Name;
		this.city=city;
		this.age=age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return ("Name=" + Name + ", city=" + city + ", age=" + age );
	}
	
}
