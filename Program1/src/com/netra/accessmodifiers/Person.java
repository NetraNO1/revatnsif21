package com.netra.accessmodifiers;

 class PersonDemo{
	 
	 private String Name;
	 private int age;
	 private String Address;
	 
	 public PersonDemo() {
		 
	 }
	 public PersonDemo(String Name,int age,String Address) {
		 this.Name=Name;
		 this.age=age;
		 this.Address=Address;
		 
	 }
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return ("Name=" + Name + ", age=" + age + ", Address=" + Address );
	}
	
	
	 
 }

public class Person {

	public static void main(String[] args) {
		PersonDemo Obj=new PersonDemo();
		Obj.setName("Netra");
		Obj.setAge(23);
		Obj.setAddress("Bengalore");
		
		System.out.println(Obj);

	}

}
