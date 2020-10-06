package com.problem5;

public class Main {

	public static void main(String[] args) {
		
		Multiples multiples = new Multiples();
		MultiplesThread thread1 = new MultiplesThread(multiples,2);
		MultiplesThread thread2 = new MultiplesThread(multiples,5);
		MultiplesThread thread3 = new MultiplesThread(multiples,8);
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
