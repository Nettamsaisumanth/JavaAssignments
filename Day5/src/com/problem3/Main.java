/*
3. You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, and , as parameters and finds . If either or is negative, then the method must throw an exception which says "". Also, if both and are zero, then the method must throw an exception which says ""
For example, -4 and -5 would result in .
Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above. 
Sample Input: 
3 5
2 4
0 0
-1 -2
-1 3
Sample Output: 
243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
*/



package com.problem3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
System.out.println("Enter the power");
int power = scanner.nextInt();
Calculator calculator = new Calculator();
try {
	long output = calculator.power(number, power);
	System.out.println("output is "+output);
} catch (BothZero  e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
catch(Negative e)
{
	e.printStackTrace();
}
finally
{
	scanner.close();
}
	}

}
