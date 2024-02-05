package com.netra.overloading;

public  class Square extends Shape {
	

 float side;
	
	
 
public Square(Float side) {
	this.side=side;
}

  @Override
  public void calArea() {
	  area=side*side;
 }


}
