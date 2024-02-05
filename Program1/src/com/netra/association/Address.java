package com.netra.association;

public class Address {
	
	private String city;
	private String State;
	private String street;
	
	public Address() {
		
	}
	public Address(String city,String State,String street) {
		this.city=city;
		this.State=State;
		this.street=street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return ("city=" + city + ", State=" + State + ", street=" + street);
	}
	

}
  