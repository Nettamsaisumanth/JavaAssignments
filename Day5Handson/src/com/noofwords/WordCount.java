package com.noofwords;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		System.out.println("Enter the line ");
		Scanner scanner = new Scanner(System.in);
		String[] array = scanner.nextLine().split(" ");
		System.out.println("No of words are  " + array.length);
		scanner.close();

	}

}
