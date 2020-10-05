package com.day1.operations1;

public class Operation9 {

	public static int sumOfSquaresOfEvenDigits(int value) {
		char stringValue[] = String.valueOf(value).toCharArray();
		int valueLength = stringValue.length;
		int temp;
		int evenSquareSum = 0;
		int squareTemp;
		for (temp = 0; temp < valueLength; temp++) {
			int temp1 = Character.getNumericValue((stringValue[temp]));
			// System.out.println(temp1);
			if (temp1 % 2 == 0) {
				squareTemp = temp1 * temp1;
				evenSquareSum = squareTemp + evenSquareSum;
			}
		}
		return evenSquareSum;
	}
}
