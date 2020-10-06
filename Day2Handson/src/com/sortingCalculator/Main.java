package com.sortingCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int temp;

		System.out.println("Enter the number of numbers you want to be inserted");
		int noOfNumbers = scanner.nextInt();
		int sampleArray[] = new int[noOfNumbers];

		for (temp = 0; temp < noOfNumbers; temp++) {
			System.out.println("Enter a number");
			sampleArray[temp] = scanner.nextInt();
		}
		SortArray sortarray = new SortArray();
		Operations operations = new Operations();
		System.out.println(
				"Enter 1 for largest number\nEnter 2 for ascending order\nEnter 3 for descending order\nEnter 4 for student marks");
		int input = scanner.nextInt();
		switch (input) {

		case 1: {
			System.out.println("The largest numbers in the array is");
			System.out.println(sortarray.sortArrayAscending(sampleArray)[noOfNumbers - 1]);
			break;
		}

		case 2: {
			System.out.println("Ascending order of array is");
			for (temp = 0; temp < sortarray.sortArrayAscending(sampleArray).length; temp++)
				System.out.println(sortarray.sortArrayAscending(sampleArray)[temp]);
			break;
		}

		case 3: {
			System.out.println("decending order of array is");
			for (temp = sortarray.sortArrayAscending(sampleArray).length - 1; temp >= 0; temp--)
				System.out.println(sortarray.sortArrayAscending(sampleArray)[temp]);
			break;
		}

		case 4: {
			System.out.println("Enter the marks of students");
			System.out.println("Enter subject 1 mark");
			operations.setMarks1(scanner.nextInt());
			System.out.println("Enter subject 2 mark");
			operations.setMarks2(scanner.nextInt());

			System.out.println("Enter 1 for comapring\n 2 for Modulo \n 3 for division \n 4 for average");
			int input1 = scanner.nextInt();

			switch (input1) {

			case 1: {
				if (operations.equals(operations.getMarks1(), operations.getMarks2()))
					System.out.println("Equal");
				else
					System.out.println("Not Equal");
				break;
			}

			case 2: {
				System.out.println("Modulo of marks is");
				System.out.println(operations.modulo(operations.getMarks1(), operations.getMarks2()));
				break;
			}

			case 3: {
				System.out.println("Division of marks is");
				System.out.println(operations.division(operations.getMarks1(), operations.getMarks2()));
				break;
			}

			case 4: {
				System.out.println("Average of marks is");
				System.out.println(operations.average(operations.getMarks1(), operations.getMarks2()));
				break;
			}
			default: {
				System.out.println("Enter a valid input");
				break;
			}
			}
		}
			break;
		default: {
			System.out.println("Eter a valid input");
			break;
		}

		}
		scanner.close();

	}
}
