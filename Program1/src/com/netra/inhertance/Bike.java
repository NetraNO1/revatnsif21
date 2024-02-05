package com.netra.inhertance;

 class Bike extends Bicycle {

	public int setHeight;

	public Bike(int speed, int gear, int setHeight) {
		super(speed, gear);
		this.setHeight = setHeight;
	
	}
	public void setHeight(int newValue ) {
		setHeight = newValue;
	}
	@Override
	public String toString() {
		return  (super.toString() +"\nseat height is "+ setHeight  );
	}
	
}
 