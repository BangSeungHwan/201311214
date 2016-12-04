package com.sd.ch8.problem4;

public class Example {
	public static void main(String args[]) {

		Rectangle r = new Rectangle(11.5, 8.5);
		Circle c = new Circle(4.0);
		
		System.out.println("Rectangle Area : " + r.calcArea());
		System.out.println("Rectangle Perimeter : " + r.calcPerimeter());
		System.out.println();
		System.out.println("Circle Area : " + c.calcArea());
		System.out.println("Circle Perimeter : " + c.calcPerimeter());
		
	}
}