package com.sd.ch8.problem6;

public class Example {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(3,4);
		Circle c = new Circle(5);

		if(r instanceof Shape && r instanceof Rectangle) {
			System.out.println(r.toString());
		}

		System.out.println();

		boolean x = r.getClass() == Rectangle.class;
		System.out.println("r.getClass() == Rectangle.class : " + x );

		System.out.println();

		Shape[] s = new Shape[2];
		s[0]=r;
		s[1]=c;
		for(Shape my:s) {
			if(my instanceof Rectangle) {
				System.out.println(my.toString());
			} else if (my instanceof Circle) {
				System.out.println(my.toString());
			}
		}

		System.out.println();
		
		for(Shape my:s)
			System.out.println(my.toString());
	}
}