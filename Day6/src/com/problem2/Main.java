package com.problem2;

public class Main {

	public static void main(String[] args) {

		DemoThread1 demothread1 = new DemoThread1();
		Thread thread1 = new Thread(demothread1);
		thread1.start();

		DemoThread1 demothread2 = new DemoThread1();
		Thread thread2 = new Thread(demothread2);
		thread2.start();

		DemoThread1 demothread3 = new DemoThread1();
		Thread thread3 = new Thread(demothread3);
		thread3.start();

	}

}
