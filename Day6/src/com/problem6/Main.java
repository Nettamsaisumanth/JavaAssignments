package com.problem6;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Number number1 = new Number(2);
		Thread thread1 = new Thread(number1);

		Number number2 = new Number(5);
		Thread thread2 = new Thread(number2);

		Number number3 = new Number(8);
		Thread thread3 = new Thread(number3);

		thread1.start();
		thread1.join();

		thread2.start();
		thread2.join();

		thread3.start();
		thread3.join();

	}

}
