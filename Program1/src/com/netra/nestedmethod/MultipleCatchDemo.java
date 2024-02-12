package com.netra.nestedmethod;

	import java.util.InputMismatchException;
	import java.util.Scanner;

        class Division {
	    public static void divide() {
	        int a, b, c;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter two numbers: ");
	        
	        try {
	            a = sc.nextInt();
	            b = sc.nextInt();
	            
	            c = a / b;
	            System.out.println("Division is " + c);
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter integers only.");
	        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	    }
	}

public class MultipleCatchDemo {
	
		public static void main(String[] args) {

			System.out.println("hello");
			Division.divide();
		}
	}

