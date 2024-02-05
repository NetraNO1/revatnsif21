package com.netra.inhertance;

public class City extends State {
	
	private String cityName;
	private float Area;
	
	
	
	public City(String countryName, String countryCapital, String stateNam,String cityName,float Area,String Launguage) {
		super(countryName, countryCapital, stateNam,Launguage);
		this.cityName = cityName;
		this.Area=Area;
		
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public float getArea() {
		return Area;
	}

	public void setArea(float area) {
		Area = area;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", Area=" + Area + ", toString()=" + super.toString() + "]";
	}

	
	
	
	

	

}
