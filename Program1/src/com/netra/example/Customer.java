package com.netra.example;

public class Customer extends Employees {
 private String customerName;

public Customer(String employeeName, String customerName) {
	super(employeeName);
	this.customerName = customerName;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

@Override
public String toString() {
	return "Customer [customerName=" + customerName + " ," + super.toString() + "]";
}


 
}
