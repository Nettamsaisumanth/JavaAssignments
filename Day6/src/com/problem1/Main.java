package com.problem1;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadExample threadexample = new ThreadExample();
		System.out.println("Default Thread name ");
		System.out.println(threadexample.getName());

		threadexample.setName("MyThread");
		System.out.println("New Thread name ");
		System.out.println(threadexample.getName());

		threadexample.start();

	}

}
