package com.problem1;

public class Circle extends Shape {

	private final float PI = 3.14f;
	private float radius;
	@SuppressWarnings("unused")
	private String name;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle(String name, float radius) {
		super(name);
		this.name = name;
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return PI * this.radius * this.radius;
	}

}
