package com.netra.inhertance;

public class State extends Country {

	private String stateNam;
	private String Launguage;
	
	
	
	public State(String countryName, String countryCapital, String stateNam,String Launguage) {
		super(countryName, countryCapital);
		this.stateNam = stateNam;
		this.Launguage = Launguage;
	}
	public String getStateNam() {
		return stateNam;
	}
	public void setStateNam(String stateNam) {
		this.stateNam = stateNam;
	}
	public String getLaunguage() {
		return Launguage;
	}
	public void setLaunguage(String launguage) {
		Launguage = launguage;
	}
	@Override
	public String toString() {
		return "State [stateNam=" + stateNam + ", Launguage=" + Launguage + ", getCountryName()=" + getCountryName()
				+ ", getCountryCapital()=" + getCountryCapital() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
}
