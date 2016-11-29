package com.sd.ch8;

public class Point {
	protected int x;
	protected int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args){
		Circle c1 = new Circle(30,40,3.0);
		System.out.println("area : " + c1.getArea());
	}

s}