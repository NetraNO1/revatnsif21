package com.tnsif.assignment2;

import java.util.*;

class Customer {
    private String name;
    private int numOfAdults;
    private int numOfChildren;
    private int numOfDays;

    public Customer(String name, int numOfAdults, int numOfChildren, int numOfDays) {
        this.name = name;
        this.numOfAdults = numOfAdults;
        this.numOfChildren = numOfChildren;
        this.numOfDays = numOfDays;
    }

    public String getName() {
        return name;
    }

    public int getNumOfAdults() {
        return numOfAdults;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public int getNumOfDays() {
        return numOfDays;
    }
}

class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details");
        String input = scanner.nextLine();

        String[] inputArray = input.split(":");
        if (inputArray.length != 4) {
            System.out.println("Invalid input format");
            return;
        }

        String name = inputArray[0];
        int numOfAdults = Integer.parseInt(inputArray[1]);
        int numOfChildren = Integer.parseInt(inputArray[2]);
        int numOfDays = Integer.parseInt(inputArray[3]);

        if (numOfAdults < 0) {
            System.out.println("Invalid input for number of adults");
            return;
        }

        if (numOfChildren < 0) {
            System.out.println("Invalid input for number of children");
            return;
        }

        if (numOfDays <= 0) {
            System.out.println("Invalid input for number of days");
            return;
        }

        Customer customer = new Customer(name, numOfAdults, numOfChildren, numOfDays);
        BookingSystem.calculateTotalCost(customer);
    }

    private static void calculateTotalCost(Customer customer) {
        int adultCost = 1000 * customer.getNumOfAdults();
        int childCost = 650 * customer.getNumOfChildren();
        int totalCost = adultCost + childCost;

        System.out.println(customer.getName() + " your booking is confirmed and the total cost is " + totalCost);
    }
}
