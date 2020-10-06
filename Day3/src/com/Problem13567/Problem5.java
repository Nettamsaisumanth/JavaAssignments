package com.Problem13567;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		System.out.println(
				"5.	Accept a string, and two indices(integers), and print the substring consisting of all characters inclusive range from ..to . ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scanner.nextLine();
		System.out.println("Enter the range");
		int first = scanner.nextInt();
		int last = scanner.nextInt();
		if (first < input.length() && last < input.length() + 1 && first < last)
			System.out.println("output string is" + input.substring(first, last));
		scanner.close();

	}
}
