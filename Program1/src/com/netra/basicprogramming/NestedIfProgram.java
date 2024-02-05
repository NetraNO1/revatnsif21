package com.netra.basicprogramming;

public class NestedIfProgram {

		public static void main(String[] args) {
			int a=10, b=30, c=10;
			System.out.println("The largest number is");
			if (a > b) {
				if (a > c)
					System.out.println(a);
				else
					System.out.println(c);
			} else {
				if (c > b)
					System.out.println(c);
				else
					System.out.println(b);
			}


	}

}
