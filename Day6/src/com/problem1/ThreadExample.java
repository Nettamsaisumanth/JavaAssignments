package com.problem1;

public class ThreadExample extends Thread {

	public void run() {
		System.out.println("Current time is" + java.time.LocalDateTime.now());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current time is" + java.time.LocalDateTime.now());

	}

}
