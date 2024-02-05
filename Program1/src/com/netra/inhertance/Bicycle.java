package com.netra.inhertance;

public class Bicycle {
	
	public int speed;
	public int gear;
	public Bicycle(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}
	
	public void applyBreake(int increament) {
		speed += increament;
	}
	public void speedUp(int decreament) {
		speed -= decreament;
	}

	@Override
	public String toString() {
		return  ("Speed of bicycle is " +  speed  + "\n" + "No of gears are "  + gear );
	}
	
	

}
  