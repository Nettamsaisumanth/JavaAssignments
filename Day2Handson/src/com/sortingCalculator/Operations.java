package com.sortingCalculator;

public class Operations {
	private int marks1;

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	private int marks2;

	public boolean equals(int mark1, int mark2) {
		if (mark1 == mark2) {
			return true;
		}
		return false;
	}

	public int modulo(int mark1, int mark2) {
		return mark1 % mark2;
	}

	public float division(int mark1, int mark2) {
		return mark1 / mark2;
	}

	public float average(int mark1, int mark2) {
		return (mark1 + mark2) / 2;
	}

}
