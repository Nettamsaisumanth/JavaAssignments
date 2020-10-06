package com.Problem34;

public class Problem3 {

	public static void main(String[] args) {
		int temp;
		System.out.println("3.	write a Java program to sort an integer array of 10 elements in ascending");
		int array[] = { 10, 9, 6, 85, 34, 85, 36 };
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}

		System.out.println("After sorting array is ");
		for (int temp1 : array) {
			System.out.println(temp1);
		}

	}
}
