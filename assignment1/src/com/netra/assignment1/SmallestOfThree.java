package com.netra.assignment1;

import java.util.Scanner;

class SmallestOfThree {
	public static void main(String[] args) {
		 int a,b,c;
	     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        a = scanner.nextInt();

        System.out.println("Enter the second number");
        b = scanner.nextInt();

        System.out.println("Enter the third number");
        c = scanner.nextInt();
   
        int smallest = (a < b) ? (a < c ? a : c) : (b < c? b : c);

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallest);
        }
    }
}

