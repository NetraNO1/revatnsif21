package com.netra.overloading;

public class Rectangle extends Shape {
	

 float length;
 float width;	
 public Rectangle(float length, float width) {
	this.length=length;
	this.width=width;
 }
	@Override
    void calArea() {
	area= length*width;
 }


}
