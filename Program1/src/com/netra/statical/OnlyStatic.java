package com.netra.statical;
class Test{
	private static int srn;
	private int section;
	static {
		System.out.println("static variable");
		srn=1000;
		
	}
	public Test() {
		System.out.println("-------------Default Constructor-----------");
		srn++;
		section++;
	}
	@Override
	public String toString() {
		return ("section=" + section + ", srn=" + srn);
	}
	static void display() {
		System.out.println("SRN = " + srn);
	}
}
public class OnlyStatic {
	
	public static void main(String[] args) {
		Test ts=new Test();
		System.out.println(ts);
		ts.display();
		
		Test t=new Test();
		System.out.println(t);
		t.display();
	}

}
