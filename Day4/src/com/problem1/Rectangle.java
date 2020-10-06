package com.problem1;

public class Rectangle extends Shape {

	public Rectangle(String name, float length, float breadth) {
		super(name);
		this.name = name;
		this.length = length;
		this.breadth = breadth;
	}

	private String name;
	private float length;
	private float breadth;

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

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}

}
