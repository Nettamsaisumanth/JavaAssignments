package com.problem4;

public class Main {

	public static void main(String[] args) {
		

		DemoThread2 demothread1 = new DemoThread2();
		DemoThread2 demothread2 = new DemoThread2();
		DemoThread2 demothread3 = new DemoThread2();
		
		demothread1.start();
		demothread2.start();
		demothread3.start();
		
	}

}
