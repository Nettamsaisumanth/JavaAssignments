package com.age;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date of birth in dd/mm/yyyy format");
		String dob = scanner.next();
		String[] dob1 = dob.split("/");
		int day = Integer.parseInt(dob1[0]);
		int month = Integer.parseInt(dob1[1]);
		int year = Integer.parseInt(dob1[2]);
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date);
		Period period = Period.between(date, LocalDate.now());
		System.out.printf("age is " + period.getYears() + " years " + " months is " + period.getMonths() + "  days "
				+ period.getDays());

		scanner.close();

	}

}
