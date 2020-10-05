package com.day1.operations1;

public class Operations10 {

	static int temp;

	public static String getLargestWord(String string) {
		String[] stringArray = string.split("\\s+");
		for (temp = 0; temp < stringArray.length; temp++) {
			System.out.println(stringArray[temp]);

		}
		int length = stringArray[0].length();
		int heighest = 0;
		for (temp = 1; temp < stringArray.length; temp++) {
			System.out.println(stringArray[temp]);
			if (stringArray[temp].length() > length) {
				length = stringArray[temp].length();
				heighest = temp;
			}
		}
		return stringArray[heighest];

	}
}
