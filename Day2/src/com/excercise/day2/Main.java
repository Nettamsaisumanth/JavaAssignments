package com.excercise.day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Smallest smallest = new Smallest();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program for smallest of the numbers");
		System.out.println("Enter the threee numbers");
		smallest.setNumber1(scanner.nextInt());
		smallest.setNumber2(scanner.nextInt());
		smallest.setNumber3(scanner.nextInt());
		System.out.println(
				smallest.smallestOfNumbers(smallest.getNumber1(), smallest.getNumber2(), smallest.getNumber3()));

		System.out.println("Find the middle characters");

		System.out.println("Enter the string");
		String str = scanner.next();
		System.out.println("Middle string is");
		System.out.println(Length2.returnMiddle(str));

		System.out.println("Counting the number of vowels");
		Vowels3 vowels3 = new Vowels3();
		System.out.println("Enter the string");
		vowels3.setInput(scanner.next());
		System.out.println("Vowel count is");
		System.out.println(vowels3.vowelCount(vowels3.getInput()));

		System.out.println("Room type");
		Room room = new Room();
		System.out.println("Enter room no");
		room.setRoomNo(scanner.nextInt());
		System.out.println("Enter room type");
		room.setRoomType(scanner.next());
		System.out.println("Enter room float");
		room.setRoomArea(scanner.nextFloat());
		System.out.println("Enter Ac machine");
		room.setAcMachine(scanner.next());
		room.setData(room.getRoomNo(), room.getRoomType(), room.getRoomArea(), room.getAcMachine());
		room.displayData();

		System.out.println("Addition");
		System.out.println("Enter six numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		int num6 = scanner.nextInt();

		// Addition6.addition(num1, num2);
		System.out.println("Sum of two numbers passing two arguments " + new Addition6(num1, num2));
		System.out.println("Passing 3 args" + new Addition6(num1, num2, num3));
		System.out.println("Passing 5 args" + new Addition6(num1, num2, num3, num4, num5));
		System.out.println("Passing 6 args" + new Addition6(num1, num2, num3, num4, num5, num6));

		scanner.close();

	}

}
