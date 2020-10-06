package com.reversingnumber;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		String number;

		System.out.println("enter the number");
		number = String.valueOf(scanner.nextInt());
		StringBuffer stringbuffer = new StringBuffer(number);
		System.out.println("by reversing the number is " + Integer.parseInt(stringbuffer.reverse().toString()));
		scanner.close();

	}

}
