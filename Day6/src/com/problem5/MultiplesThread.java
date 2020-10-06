package com.problem5;

public class MultiplesThread extends Thread {

	private Multiples multiples;
	private int number;

	public MultiplesThread(Multiples multiples, int number) {
		this.multiples = multiples;
		this.number = number;
	}

	public void run() {
		System.out.println("Thread has started");
		try {
			multiples.printMultiples(number);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
