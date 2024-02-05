package com.netra.overloading;

public class AbstractionDemo {

	public static void main(String[] args) {
		
  Shape shape;
  shape=new Rectangle(6.0f,2.2f);
 shape.calArea();
  shape.show();
  
  shape=new Square(6.0f);
  shape.calArea();
   shape.show();
	
	}
}
