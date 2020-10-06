package com.employeemain;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import com.employeepojo.Employee;
import com.employeeservice.EmployeeService;;

public class Main {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<>();
		com.employeepojo.Employee employee1 = new Employee(1, 12345, "Sai", (byte) 22, 3000.12f);
		com.employeepojo.Employee employee2 = new Employee(2, 123456, "Sai Sumanth", (byte) 23, 40000.34f);
		com.employeepojo.Employee employee3 = new Employee(3, 123452, "Sura", (byte) 24, 5000.90f);
		com.employeepojo.Employee employee4 = new Employee(4, 123454, "Varun", (byte) 26, 6777.89f);
		com.employeepojo.Employee employee5 = new Employee(5, 123457, "Naveen", (byte) 28, 6778.56f);
		com.employeepojo.Employee employee6 = new Employee(6, 123459, "Vishnu", (byte) 22, 7788.65f);
		com.employeepojo.Employee employee7 = new Employee(7, 123450, "Monesh", (byte) 35, 8888.88f);

		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		emplist.add(employee4);
		emplist.add(employee5);
		emplist.add(employee6);
		emplist.add(employee7);

		System.out.println("Enter 1 to increment salary of all employees");
		System.out.println("Enter 2 to search employee by name");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		switch (input) {
		case 1: {
			System.out.println("Enter salary you want to increment");
			float salary = scanner.nextFloat();
			EmployeeService.incrementSalaries(salary, emplist);
			System.out.println("Salaries incremented");
			break;

		}
		case 2: {
			System.out.println("Enter the name you want to be searched");
			String searchName = scanner.next();
			System.out.println("Searched results are");
			if (EmployeeService.searchEmployeeByName(searchName, emplist) != null) {
				System.out.println(EmployeeService.searchEmployeeByName(searchName, emplist));
			} else {
				System.out.println("Not Found");
			}
			break;
		}
		default: {
			System.out.println("Enter valid value");

		}

		}
		scanner.close();

	}
}
