package com.sd.ch8;

class Circle extends Point {
	protected double r;
	protected double area;

	public Circle(int x, int y, double r) {
		this.r = r;
		super(x,y);
	}

	public double getArea() {
		area = 	r*r*(3.14);
		return area;
	}
}