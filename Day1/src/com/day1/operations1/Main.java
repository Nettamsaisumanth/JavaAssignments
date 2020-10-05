package com.day1.operations1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Operations operations = new Operations();
		operations.arthematicOperations();
		System.out.println("Result of -5 + 8 * 6 is " + operations.getVar1());
		System.out.println("Result of (55+9) % 9  is " + operations.getVar2());
		System.out.println("Result of . 20 + -3*5 / 8  is " + operations.getVar3());
		System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3  is " + operations.getVar4());

		Operations2 operations2 = new Operations2();
		operations2.setNumber1(20);
		operations2.setNumber2(5);

		System.out.println("Two numbers are 20 and 5");
		System.out.println(
				"Addition of numbers is" + operations2.addition(operations2.getNumber1(), operations2.getNumber2()));
		System.out.println("Subtraction of numbers is"
				+ operations2.subtraction(operations2.getNumber1(), operations2.getNumber2()));
		System.out.println("multiplication of numbers is"
				+ operations2.multiplication(operations2.getNumber1(), operations2.getNumber2()));
		System.out.println(
				"division of numbers is" + operations2.division(operations2.getNumber1(), operations2.getNumber2()));

		Operations345 operations345 = new Operations345();
		System.out.println("Enter 3 numbers");
		operations345.setNumber1(scanner.nextInt());
		operations345.setNumber2(scanner.nextInt());
		operations345.setNumber3(scanner.nextInt());

		System.out.println("Average of three numbers is " + operations345.average(operations345.getNumber1(),
				operations345.getNumber2(), operations345.getNumber3()));
		System.out.println("Swapping 1st number and 2nd number");
		System.out.println("Valiues of number1 and number2 before swapping are" + operations345.getNumber1() + " "
				+ operations345.getNumber2());
		operations345.SwapOfNumbers(operations345.getNumber1(), operations345.getNumber2(), operations345);
		System.out.println("Valiues of number1 and number2 after swapping are" + operations345.getNumber1() + " "
				+ operations345.getNumber2());
		if (operations345.checkPrime(operations345.getNumber3()))
			System.out.println(operations345.getNumber3() + " is a prime number");
		else
			System.out.println(operations345.getNumber3() + " is not a prime number");

		Operation6 operation6 = new Operation6();
		System.out.println("Enter a charecter");
		operation6.setCharecter(scanner.next().charAt(0));
		System.out.println("Ascii value of the charecter " + operation6.getCharecter() + " is" + " "
				+ operation6.asciiValue(operation6.getCharecter()));

		Operation7 operation7 = new Operation7();
		System.out.println("Fizz buzz program output is");

		int temp = 0;
		for (temp = 0; temp < 100; temp++) {

			System.out.println(operation7.fizzBuzz(temp + 1));
		}
		System.out.println("Program to check sum of odd digits is even or odd");
		System.out.println("Enter a number u want to check");
		int input = scanner.nextInt();
		System.out.println(Operation8.checkSum(input));

		System.out.println("Program to check sum of square of even digits");
		System.out.println("Enter a number u want to find");
		int input1 = scanner.nextInt();
		System.out.println(Operation9.sumOfSquaresOfEvenDigits(input1));

		System.out.println("To fing the largest word in the string");
		System.out.println("Enter the string;");
		String string = "";
		string += scanner.nextLine();
		System.out.println(string);
		System.out.println(Operations10.getLargestWord(string));
		scanner.close();

	}
}
