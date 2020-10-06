package com.sortingCalculator;

public class SortArray {

	public int[] sortArrayAscending(int[] array) {
		int temp, temp1;
		for (temp1 = 0; temp1 < array.length - 1; temp1++) {
			if (array[temp1] > array[temp1 + 1]) {
				temp = array[temp1];
				array[temp1] = array[temp1 + 1];
				array[temp1 + 1] = temp;
			}
		}

		return array;
	}

}
