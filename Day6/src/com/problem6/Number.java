package com.problem6;

public class Number implements Runnable {
	int number;
	int temp;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public void run() {

		System.out.println("thread started");
		for (temp = 0; temp < 10; temp++) {
			System.out.println(number + " * " + temp + " =" + number * temp);
		}
		System.out.println("Threda ended");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
