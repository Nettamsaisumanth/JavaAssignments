package com.datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter 1 to get the current date\n 2 for current time \n 3 for current date time \n 4 to check whether year is leap year or not");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			System.out.println(java.time.LocalDate.now());
			break;
		}
		case 2: {
			System.out.println(java.time.LocalTime.now());
			break;
		}
		case 3: {
			System.out.println(java.time.LocalDateTime.now());
			break;
		}
		case 4: {
			System.out.println("Enter the year");
			int inputYear = scanner.nextInt();
			LocalDate year = LocalDate.of(inputYear, 1, 1);
			if (year.isLeapYear()) {
				System.out.println("is leap year");
			} else {
				System.out.println("Not a leap year");
			}
			break;
		}
		}
		scanner.close();

	}

}
