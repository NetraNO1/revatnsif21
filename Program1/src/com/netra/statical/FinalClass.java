package com.netra.statical;

final class Student{
	final int a=10;
	
	final static int b=30;
	final static int c;
	static {
		c=40;
	
	
		System.out.println("value of c=" +c);
	}
	final void display() {
		System.out.println("Values of a,b,c " + a + " "+ b);
	}
}

class School{
	Student s=new Student();
}

public class FinalClass {
	
	public static void main(String[] args) {
		Student st=new Student();
		st.display();
	}
	

}
