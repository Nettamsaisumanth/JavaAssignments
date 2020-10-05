package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import com.pojo.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emplist = new ArrayList<>();
		Employee employee1 = new Employee(1, 12345, "Sai", (byte) 22, 3000.12f);
		Employee employee2 = new Employee(2, 123456, "Sai Sumanth", (byte) 23, 40000.34f);
		Employee employee3 = new Employee(3, 123452, "Sura", (byte) 24, 5000.90f);
		Employee employee4 = new Employee(4, 123454, "Varun", (byte) 26, 6777.89f);
		Employee employee5 = new Employee(5, 123457, "Naveen", (byte) 28, 6778.56f);
		Employee employee6 = new Employee(6, 123459, "Vishnu", (byte) 22, 7788.65f);
	    Employee employee7 = new Employee(7, 123450, "Monesh", (byte) 35, 8888.88f);

		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		emplist.add(employee4);
		emplist.add(employee5);
		emplist.add(employee6);
		emplist.add(employee7);
		
		//print all employee names
		emplist.stream().forEach(employee->System.out.println(employee.getEmployeeName()));
		
		//count number of employees
		System.out.println(emplist.stream().count());
		
		//filter accept predicate to filter  // to print details whose age > 24
		emplist.stream().filter((Employee emp)->emp.getEmployeeAge() > 24).forEach(System.out::println);
		
		
		//distinct to get distinct values
		emplist.stream().filter((Employee emp)->emp.getEmployeeAge() > 24).distinct().forEach(System.out::println);
		
		//to get first n number of values
		emplist.stream().filter((Employee emp)->emp.getEmployeeAge() > 24).distinct().limit(2).forEach(System.out::println);
		
		//to skip first n values
		emplist.stream().filter((Employee emp)->emp.getEmployeeAge() > 24).distinct().skip(2).forEach(System.out::println);
		
		//map to take input and produce output   //to print numbers of employees
		emplist.stream().map((Employee emp)->emp.getEmploeeNumber()).forEach(System.out::println);
		
		//sort employee names
		emplist.stream().map((Employee emp1)->emp1.getEmployeeName()).sorted().forEach(System.out::println);
		
		//sort employee names by length
		emplist.stream().sorted((Employee emp1,Employee emp2)->emp1.getEmployeeName().length()-emp2.getEmployeeName().length()).forEach(System.out::println);
		
		
		//return sum of all ids using reduce
		int sum1 = emplist.stream().map((Employee emp1)->emp1.getEmployeeId()).sorted().reduce(0,(a,b)->a+b);
		System.out.println(sum1);
		
		//OptionalInt max1 = emplist.stream().map((Employee emp1)->emp1.getEmployeeId()).max();
		
		//OptionalInt min1 = emplist.stream().map((Employee emp1)->emp1.getEmployeeId()).min();
		
		long count1 = emplist.stream().map((Employee emp1)->emp1.getEmployeeId()).count();
		System.out.println(count1);
		
		
		
		         //any match if one true is got it will break i.e., stop
		if(emplist.stream().anyMatch((Employee emp) -> emp.getEmployeeName().length() == 5))
		{
		    System.out.println("Yes... There is a name exist with 5 letters");
		}
		
		//it will execute until false comes if false comes it stops
		if(emplist.stream().allMatch((Employee emp) -> emp.getEmployeeName().length() == 5))
		{
		    System.out.println("Yes... There is a name exist with 5 letters");
		}
		
		//it will print that is not matched
		if(emplist.stream().noneMatch((Employee emp) -> emp.getEmployeeName().length() == 5))
		{
		    System.out.println("Yes... There is a name exist with 5 letters");
		}
		
		//return first element 
		Optional<String> firstElement = emplist.stream().map((Employee emp1)->emp1.getEmployeeName()).findFirst();
		System.out.println(firstElement);
		
		
		//return random element
		Optional<String> findAny = emplist.stream().map((Employee emp1)->emp1.getEmployeeName()).findAny();
		System.out.println(findAny);
		
		
		//if u want to seee elements passed in pipeline
		emplist.stream().map((Employee emp1)->emp1.getEmployeeId()).peek(emplist1->System.out.println(emplist1));
		
		
		
		
		
	}
	

}
