package com.problem1;

public class Square extends Shape {

	private float length;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public Square(String name, float length) {
		super(name);
		this.length = length;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public float calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.length;
	}
}
