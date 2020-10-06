package com.Problem8;

import java.util.Scanner;

public class Problem8 {

	static StringBuilder getString(StringBuilder string) {
		StringBuilder returnString = new StringBuilder();
		if (string.charAt(0) == 'k' && string.charAt(1) == 'b')
			return string;
		else if (string.charAt(0) == 'k')
			return returnString.append(string.charAt(0)).append(string.substring(2, string.length()));
		else if (string.charAt(1) == 'b')
			return returnString.append(string.charAt(1)).append(string.substring(2, string.length()));
		else
			return returnString.append(string.substring(2, string.length()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringBuilder input1 = new StringBuilder(input);
		System.out.println("output string is " + getString(input1));
		scanner.close();
	}

}
