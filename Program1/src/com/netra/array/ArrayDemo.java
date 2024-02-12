package com.netra.array;
import java.util.Arrays;
 class Student {

	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
 }
 

public class ArrayDemo {
		
		public static void main(String[] args) {


			
			Student arr[] = new Student[5];
			
			arr[0]= new Student(101,"punith");
			arr[1] = new Student (102,"raj");
			arr[2] = new Student (103,"raj");
			arr[3] = new Student (104,"raj");
			arr[4] = new Student (105,"raj");
			
			System.out.println("Student details " +Arrays.toString(arr));
			
			

		

	}
}
