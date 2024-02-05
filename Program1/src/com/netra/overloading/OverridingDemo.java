package com.netra.overloading;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI rbi;
		rbi =new SBI();
		
		System.out.println(rbi. getRateOfInterst());
		
		rbi =new HDFC();
		System.out.println(rbi. getRateOfInterst());
		
		rbi=new ICICI();
		System.out.println(rbi. getRateOfInterst());
		
		rbi=new RBI();
		System.out.println(rbi. getRateOfInterst());
		

	}

}
