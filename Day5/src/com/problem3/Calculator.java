package com.problem3;

import com.problem3.Negative;
import com.problem3.BothZero;

public class Calculator {

	public long power(long number, long power) throws BothZero, Negative {
		if (number == 0 && power == 0) {
			throw new BothZero("java.lang.Exception: number and power should not be zero");
		}
		if (number < 0 || power < 0) {
			throw new Negative("java.lang.Exception: number or power should not be negative");
		}
		long output = 1l;
		for (int temp = 1; temp <= power; temp++) {
			output = output * number;
		}
		return output;
	}
}
