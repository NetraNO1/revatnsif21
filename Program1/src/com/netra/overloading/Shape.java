package com.netra.overloading;

abstract class Shape {

protected float area;
abstract void calArea();
void show() {
	System.out.println("area is"+ area);
}
}
