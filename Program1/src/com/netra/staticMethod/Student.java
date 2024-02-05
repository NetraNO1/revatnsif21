package com.netra.staticMethod;

public class Student {

	int rollno;
	String name;
	String college="reva";
	Student(int r,String n){
		rollno=2;
		name=n;
	}
		void display() {
	
		System.out.println(rollno + " " + name + " "+ college);
	}
	public static void main(String[] args) {
		Student s1=new Student(2,"netra");
		s1.display();
		Student s2=new Student(3,"darshan");
		s2.display();
	}

}

