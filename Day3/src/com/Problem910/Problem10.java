package com.Problem910;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		com.hcl.Calculator calculator = new com.hcl.Calculator();
		System.out.println("Enter two numbers");
		System.out.println("Adding two numbers sum is " + calculator.add(scanner.nextInt(), scanner.nextInt()));

		System.out.println("Enter the string");
		StringBuilder string = new StringBuilder(scanner.next());
		System.out.println("Enter the special character");
		String input1 = scanner.next();
		StringBuilder string1 = new StringBuilder();
		string.reverse();
		for (int temp = 0; temp < string.length() - 1; temp++) {
			string1.append(string.charAt(temp));
			string1.append(input1);
		}
		string1.append(string.charAt(string.length() - 1));

		System.out.println("output is " + string1);
		scanner.close();
	}

}
