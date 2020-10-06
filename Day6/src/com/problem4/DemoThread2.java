package com.problem4;

public class DemoThread2 extends Thread {

	int temp;

	@Override
	public void run() {
		
		System.out.println("running child Thread in loop : ");
		for (temp = 0; temp < 10; temp++) {
			System.out.println(Thread.currentThread() + "  " + temp);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
