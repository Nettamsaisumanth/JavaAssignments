package com.employeepojo;

public class Employee {
	private int employeeId;
	private long emploeeNumber;
	private String employeeName;
	private byte employeeAge;
	private float salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public Employee(int employeeId, long emploeeNumber, String employeeName, byte employeeAge, float salary) {
		super();
		this.employeeId = employeeId;
		this.emploeeNumber = emploeeNumber;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", emploeeNumber=" + emploeeNumber + ", employeeName="
				+ employeeName + ", employeeAge=" + employeeAge + ", salary=" + salary + "]";
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public long getEmploeeNumber() {
		return emploeeNumber;
	}

	public void setEmploeeNumber(long emploeeNumber) {
		this.emploeeNumber = emploeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public byte getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(byte employeeAge) {
		this.employeeAge = employeeAge;
	}

}
