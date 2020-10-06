package com.stringoperations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RepitionOfLetter repitionofletter = new RepitionOfLetter();

		int flag = 1;
		while (flag == 1) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the string in which you want to be searched");
			repitionofletter.setSearchString(scanner.next());

			System.out.println("Enter the charecter you want to be searched");
			repitionofletter.setSearchChar(scanner.next().charAt(0));

			System.out.println("Enter 1 for case insensitive and 2 for case sensitive");
			repitionofletter.setInputVar(scanner.nextInt());

			System.out.println("Enter 1 to check whether you want a charecter is repeated or not");
			System.out.println("Enter 2 to check how many timea a charecter is repeated");
			int input;
			input = scanner.nextInt();
			if (input == 1) {
				System.out.println(repitionofletter.checkRepetion(repitionofletter.getSearchString(),
						repitionofletter.getSearchChar(), repitionofletter.getInputVar()));
			}
			if (input == 2) {
				System.out.println(repitionofletter.checkNoOfTimesToBeRepeated(repitionofletter.getSearchString(),
						repitionofletter.getSearchChar(), repitionofletter.getInputVar()));
			} else {
				System.out.println("Enter a valid char");
			}
			System.out.println("Do u want to continue if yes enter 1 else enter 0");
			flag = scanner.nextInt();
			if (flag == 0) {
				scanner.close();
				break;
			}
			scanner.close();
		}

	}

}
