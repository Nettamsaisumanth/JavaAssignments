package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		ArrayList<Student> studentlist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the following commands to perform the given operations");
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 11 to add details");
			System.out.println("Enter 1 to get full name");
			System.out.println("Enter 2 to get  age");
			System.out.println("Enter 3 to get total marks");
			System.out.println("Enter 4 to get average score");
			System.out.println("Enter 5 to get complete details");
			System.out.println("Enter 6 to search student by name");
			System.out.println("Enter 7 to search student by id");
			System.out.println("Enter 8 to get the studetnts in particulat deptartment");
			// System.out.println("Enter 9 to get details by the major ");
			System.out.println("Enter the input to choose");

			int input = scanner.nextInt();
			com.student.Student student = new Student();

			switch (input) {

			case 11: {
				System.out.println("Enter Number");
				student.setStudentNumber(scanner.nextInt());
				System.out.println("Enter First Name");
				student.setStudentFirstName(scanner.next());
				System.out.println("Enter Last Name");
				student.setStudentLastName(scanner.next());
				System.out.println("Enter Age");
				student.setStudentAge(scanner.nextInt());
				System.out.println("Enter Gender");
				student.setStudentGender(scanner.next().charAt(0));
				System.out.println("Enter Major");
				student.setStudentMajor(scanner.next());
				System.out.println("Enter Language marks");
				student.setStudentLang(scanner.nextFloat());
				System.out.println("Enter English Marks");
				student.setStudentEnglish(scanner.nextFloat());
				studentlist.add(student);
				break;
			}
			case 1: {
				for (Student student1 : studentlist) {
					System.out.println("Your full name is");
					System.out.println(student1.getFullName());
				}
				break;
			}
			case 2: {
				for (Student student1 : studentlist) {
					System.out.println("Your age is");
					System.out.println(student1.getStudentAge());
				}
				break;
			}
			case 3: {
				for (Student student1 : studentlist) {
					System.out.println("Your total marks  are");
					System.out.println(student1.getTotalMarks());
				}
				break;
			}
			case 4: {
				for (Student student1 : studentlist) {
					System.out.println("Your average score is");
					System.out.println(student1.getAverageScore());
				}
				break;
			}
			case 5: {
				for (Student student1 : studentlist) {
					System.out.println("Your complete details are");
					System.out.println(student1);
				}
				break;
			}

			case 6: {
				System.out.println("Enter the name you want to be searched");
				String nameSearched = scanner.next();
				System.out.println("Searching student by name");
				for (Student student1 : studentlist) {

					System.out.println("Your  details are");
					System.out.println(student1.searchStudentByName(nameSearched, student1));
				}
				break;
			}
			case 7: {
				System.out.println("Enter the ID you want to be searched");
				int idSearched = scanner.nextInt();
				System.out.println("Searching student by ID");

				System.out.println("Your  details are");
				for (Student student1 : studentlist) {
					System.out.println(student1.searchStudentById(idSearched, student1));
				}
				break;
			}
			case 8: {
				System.out.println("Enter the dept you want to be searched");
				String majorSearched = scanner.next();
				System.out.println("Searching student by major");

				System.out.println("Your  details are");
				for (Student student1 : studentlist) {
					System.out.println(student1.searchByMajor(majorSearched, student1));
				}
				break;
			}
			default: {
				System.out.println("Enter  a valid statement");
			}
			}

			System.out.println("Do u want to continue if yes enter true else false");
			flag = scanner.nextBoolean();
			if (flag == false)
				break;
		}

		scanner.close();

	}

}
