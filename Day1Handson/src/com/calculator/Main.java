package com.calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		float floatNum1;
		float floatNum2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for addition with 2 arguments");
		System.out.println("Enter 2 for addition with 3 arguments");
		System.out.println("Enter 3 for subtraction with 2 arguments");
		System.out.println("Enter 4 for multiplication with 2 arguments");
		System.out.println("Enter 5 for division with 2 arguments");
		System.out.println("Enter the input value");
		int option;
		option = scanner.nextInt();
		Calaculator calculator = new Calaculator();
		switch (option) {
		case 1: {
			System.out.println("Enter two numbers");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();

			System.out.println("Addition of three numbers is " + calculator.add(num1, num2));
			break;
		}
		case 2: {
			System.out.println("Enter three numbers");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			num3 = scanner.nextInt();
			System.out.println("Addition of three numbers is " + calculator.add(num1, num2, num3));
			break;
		}
		case 3: {
			System.out.println("Enter two numbers");
			floatNum1 = scanner.nextFloat();
			floatNum2 = scanner.nextFloat();
			System.out.println("Subtraction of two numbers is" + calculator.sub(floatNum1, floatNum2));
			break;
		}
		case 4: {
			System.out.println("Enter two numbers");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			System.out.println("multiplication of two numbers is " + calculator.mul(num1, num2));
			break;
		}
		case 5: {
			System.out.println("Enter two numbers");
			floatNum1 = scanner.nextFloat();
			floatNum2 = scanner.nextFloat();
			System.out.println("Multiplication of two numbers is" + calculator.div(floatNum1, floatNum2));
			break;
		}
		default: {
			System.out.println("Please Enter a valid number");
			break;
		}

		}
		scanner.close();

	}
}
