package com.stringoperations;

public class RepitionOfLetter {

	private int temp;
	private int count;
	private String searchString;
	private char searchChar;
	private int inputVar;

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public char getSearchChar() {
		return searchChar;
	}

	public void setSearchChar(char searchChar) {
		this.searchChar = searchChar;
	}

	public int getInputVar() {
		return inputVar;
	}

	public void setInputVar(int inputVar) {
		this.inputVar = inputVar;
	}

	public String checkRepetion(String searchString, char searchChar, int inputVar) {
		count = 0;
		String lowerCaseString = searchString.toLowerCase();

		if (inputVar == 1) {
			for (temp = 0; temp < lowerCaseString.length(); temp++) {
				if (lowerCaseString.charAt(temp) == searchChar) {
					count++;
				}
			}
		}
		if (inputVar == 2) {
			for (temp = 0; temp < searchString.length(); temp++) {
				if (searchString.charAt(temp) == searchChar) {
					count++;
				}
			}
		}
		if (count > 1)
			return searchChar + " is repeated";
		if (count == 0) {
			return searchChar + " is not found";
		} else {
			return searchChar + " is not repeated";
		}
	}

	public String checkNoOfTimesToBeRepeated(String searchString, char searchChar, int inputVar) {
		count = 0;
		String lowerCaseString = searchString.toLowerCase();
		if (inputVar == 1) {
			for (temp = 0; temp < lowerCaseString.length(); temp++) {
				if (lowerCaseString.charAt(temp) == searchChar) {
					count++;
				}
			}
		}
		if (inputVar == 2) {
			for (temp = 0; temp < searchString.length(); temp++) {
				if (searchString.charAt(temp) == searchChar) {
					count++;
				}
			}
		}
		if (count > 1)
			return searchChar + " is repeated" + count + " number of times";
		if (count == 0) {
			return searchChar + " is not found";
		} else {
			return searchChar + " is not repeated ";
		}
	}
}
