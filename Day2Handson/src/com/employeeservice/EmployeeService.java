package com.employeeservice;

import com.employeepojo.Employee;

import java.util.List;

public class EmployeeService {
	static Employee returnobj = null;

	public static Employee searchEmployeeByName(String name, List<Employee> list) {
		for (Employee employee : list) {
			if (employee.getEmployeeName().equals(name))
				returnobj = employee;
		}
		return returnobj;
	}

	public static void incrementSalaries(float salary, List<Employee> list) {
		for (Employee employee : list) {
			employee.setSalary(employee.getSalary() + salary);
		}
	}

}
