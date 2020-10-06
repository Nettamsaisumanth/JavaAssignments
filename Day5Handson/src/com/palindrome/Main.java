package com.palindrome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome");
		input = scanner.next();
		StringBuffer stringbuffer = new StringBuffer(input);
		if (stringbuffer.equals(stringbuffer.reverse())) {
			System.out.println("is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

		scanner.close();
	}

}
