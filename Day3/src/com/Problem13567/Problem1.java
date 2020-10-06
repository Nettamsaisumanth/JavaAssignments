package com.Problem13567;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		System.out.println("Java program to convert all the characters in a string to lowercase");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println("After converting \n" + input.toLowerCase());
		scanner.close();

	}

}
