package com.problem5;

public class Multiples {

	private int temp;

	synchronized public void printMultiples(int number) {
		for (temp = 0; temp < number; temp++) {
			System.out.println(number + " * " + temp + " =" + number * temp);
		}
	}
}
