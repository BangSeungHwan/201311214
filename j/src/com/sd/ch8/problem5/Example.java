package com.sd.ch8.problem5;

public class Example {
	public static void main(String args[]) {
		Hello[] h = new Hello[5];
		h[0] = new Hello("bsh1");
		h[1] = new Hello("bsh2");
		h[2] = new Hello("bsh3");
		h[3] = new Hello("bsh4");
		h[4] = new Hello("bsh5");
		
		for(Hello e:h)
			e.sayHello();
	}
}