package com.netra.statical;


class Studente{
	String name,srn;
	static String collegename="Reva";

	public Studente(String name, String srn) {
		
		this.name = name;
		this.srn = srn;
		
	}

	void display() {
		System.out.println(name+" "+srn+" "+ collegename);
	}
}


public class VariavleStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente s1=new Studente("R20EF021","BUbba");
		s1.display();
		Studente s2=new Studente("R20EF022","Chaithra");
		s2.display();
     
	}

}