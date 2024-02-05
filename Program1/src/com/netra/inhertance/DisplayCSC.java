package com.netra.inhertance;

public class DisplayCSC {

	public static void main(String[] args) {
		City c= new City(null, null, null, null, 0, null);
		c.setArea(987.8f);
		c.setCityName("Bengalore");
		c.setStateNam("Karnataka");
		c.setLaunguage("Kannada");
		c.setCountryName("India");
		c.setCountryCapital("Delhi");
		
		
	      
		System.out.println(c);
	}

}
