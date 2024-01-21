package javatnsif.com;


import java.util.Scanner;

public class Person {

	public static void main(String[] args) {

		//creation of object
		 SetGetProgram person= new SetGetProgram();
		
		//scanner class to read the input
		Scanner sc = new Scanner(System.in);
		
		String name,gender;
		int age,income;
		System.out.println("enter name");
		name = sc.nextLine();
		System.out.println("Enter gender");
		gender = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter income");
		income = sc.nextInt();
		
		
		//setter
		
		person.setName(name);
		person.setGender(gender);
		person.setIncome(income);;
		person.setAge(age);
		
		//display
		System.out.println(person);
		
		

	}

}