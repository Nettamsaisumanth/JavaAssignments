package com.day1.operations1;

public class Operation8 {

	public static String checkSum(int value) {
		char stringValue[] = String.valueOf(value).toCharArray();
		int valueLength = stringValue.length;
		int temp;
		int oddSum = 0;
		for (temp = 0; temp < valueLength; temp++) {
			int temp1 = stringValue[temp];
			if (temp1 % 2 == 1)
				oddSum = oddSum + temp1;
		}
		if (oddSum % 2 == 1)
			return "Sum of odd digits is odd";
		else
			return "Sum of odd digits is Even";
	}
}
