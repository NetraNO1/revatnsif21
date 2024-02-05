package com.netra.statical;

public class FinalVariable {
	final int d;
	final String name;
	

	public FinalVariable() {
		this.d = 40;
		this.name = "Netra";
		
	}
	
	static final int a;
	static {
	a=20;
	}



	public static void main(String[] args) {
		
		FinalVariable n=new FinalVariable();
		System.out.println(a);
		System.out.println(n.d);
		System.out.println(n.name);
	}

}
