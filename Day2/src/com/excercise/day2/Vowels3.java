package com.excercise.day2;

public class Vowels3 {
	private char character;
	private String input;
	private int vowelCount = 0;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int vowelCount(String input) {
		for (int temp = 0; temp < input.length(); temp++) {
			character = input.charAt(temp);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
					|| character == 'A' || character == 'E' || character == 'I' || character == 'O'
					|| character == 'U') {
				vowelCount = vowelCount + 1;
			}
		}
		return vowelCount;
	}
}
