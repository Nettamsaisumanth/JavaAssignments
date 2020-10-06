package com.excercise.day2;

public class Smallest {

	private String string1;

	private int number1;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	private int number2;
	private int number3;

	public String smallestOfNumbers(int num1, int num2, int num3) {
		if ((num1 <= num2) && (num1 < num3)) {
			string1 = num1 + " is smallest";
		} else if ((num2 < num1) && (num2 <= num3)) {
			string1 = num2 + " is smallest";
		} else if ((num3 <= num1) && (num3 < num2)) {
			string1 = num3 + " is smallest";
		} else if ((num1 == num2) == (num2 == num3)) {
			string1 = "All are equal";
		}

		return string1;

	}

}
