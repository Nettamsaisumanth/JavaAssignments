package com.Problem34;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		int array[] = { 10, 9, 6, 85, 34, 85, 36 };
		System.out.println("ARRAY IS");
		System.out.println("Array is " + Arrays.toString(array));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = scanner.nextInt();

		for (int temp1 = 0; temp1 < array.length; temp1++) {
			if (input == array[temp1]) {
				System.out.println(" Found");
				break;
			}
		}
		scanner.close();
	}
}
