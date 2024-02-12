package com.netra.nestedmethod;

 class TryCatchExample {

	static void performDivision(int x , int y)
	{
		int z;
		try {
			System.out.println("I am in try block");
			z = x / y;
			
			System.out.println("Result is "+z);
		}
		catch(ArithmeticException e) {
			
			System.out.println("I am in catch block" +e.getMessage());
			
		}
	}
}
public class TryCatchDemo {
	
		public static void main(String[] args) {

			TryCatchExample.performDivision(100, 0);

		}

	}

