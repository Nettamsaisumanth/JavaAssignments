package com.student;

public class Student {
	private int studentNumber;
	private String studentFirstName;
	private String studentLastName;
	private int studentAge;
	private char studentGender;
	private String studentMajor;
	private float studentLang;
	private float studentEnglish;

	
	
	
	
	




	




	public int getStudentNumber() {
		return studentNumber;
	}



	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}



	public String getStudentFirstName() {
		return studentFirstName;
	}



	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}



	public String getStudentLastName() {
		return studentLastName;
	}



	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}



	public int getStudentAge() {
		return studentAge;
	}



	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}



	public char getStudentGender() {
		return studentGender;
	}



	public void setStudentGender(char studentGender) {
		this.studentGender = studentGender;
	}



	public String getStudentMajor() {
		return studentMajor;
	}



	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}



	public float getStudentLang() {
		return studentLang;
	}



	public void setStudentLang(float studentLang) {
		this.studentLang = studentLang;
	}



	public float getStudentEnglish() {
		return studentEnglish;
	}



	public void setStudentEnglish(float studentEnglish) {
		this.studentEnglish = studentEnglish;
	}



	public String getFullName()
	{
		return this.studentFirstName+" "+this.studentLastName;
	}
	public float getTotalMarks()
	{
		return this.studentLang+this.studentEnglish;
	}
	public float getAverageScore()
	{
		return (this.studentLang+this.studentEnglish)/2;
	}
	
	public String searchStudentByName(String name,Student student)
	{
		if(name.equals(student.getFullName()))
		{
			return student.toString();
		}
		//return student;
		else{
			return  "Not Found";
		}
	}
	
	public String searchStudentById(int id,Student student)
	{
		if(id == student.getStudentNumber())
		{
			return student.toString();
		}
		//return student;
		else{
			return  "Not Found";
		}
	}
	
	
	public String searchByMajor(String major,Student student)
	{
		if(student.getStudentMajor().equals(major))
		{
			return student.toString();
		}
		else
		{
			return "Not Found";
		}
	}



	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentFirstName=" + studentFirstName
				+ ", studentLastName=" + studentLastName + ", studentAge=" + studentAge + ", studentGender="
				+ studentGender + ", studentMajor=" + studentMajor + ", studentLang=" + studentLang
				+ ", studentEnglish=" + studentEnglish + "]";
	}
	
	}
