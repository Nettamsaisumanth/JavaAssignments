package com.Problem13567;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("6.	Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise");
		System.out.println("Enter string");
		String input = new String(scanner.next());
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append(input);
		if (stringbuilder1.equals(stringbuilder1.reverse())) {
			System.out.println("Yes palindrome");
		} else
			System.out.println("NO not palindrome");
		scanner.close();

	}

}
